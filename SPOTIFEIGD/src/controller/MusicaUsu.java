/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import spotifei.model.Conexao;
import spotifei.model.Musica;

/**
 *
 * @author garac
 */

public class MusicaUsu {

    public boolean cadastrar(Musica m) {
        String sql = "INSERT INTO musica (nome, artista, genero, duracao) VALUES (?, ?, ?, ?)";

        try (Connection con = Conexao.getConexao();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getArtista());
            stmt.setString(3, m.getGenero());
            stmt.setInt(4, m.getDuracaoSegundos());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar música: " + e.getMessage());
            return false;
        }
    }

    public List<Musica> listar() {
        List<Musica> lista = new ArrayList<>();
        String sql = "SELECT * FROM musica";

        try (Connection con = Conexao.getConexao();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Musica m = new Musica(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("artista"),
                    rs.getString("genero"),
                    rs.getInt("duracao")
                );
                lista.add(m);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar músicas: " + e.getMessage());
        }

        return lista;
    }

    public List<Musica> buscarPorNome(String nome) {
        List<Musica> lista = new ArrayList<>();
        String sql = "SELECT * FROM musica WHERE LOWER(nome) LIKE ?";

        try (Connection con = Conexao.getConexao();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome.toLowerCase() + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Musica m = new Musica(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("artista"),
                    rs.getString("genero"),
                    rs.getInt("duracao")
                );
                lista.add(m);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar música: " + e.getMessage());
        }

        return lista;
    }
}