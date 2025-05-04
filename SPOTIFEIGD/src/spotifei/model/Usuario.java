/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifei.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garac
 */

    // o usuario herda de pessoa
public class Usuario extends Pessoa {

    private int id;
    private String nome;
    private String email;
    private String senha;

    private List<Musica> historicoBuscas;
    private List<Playlist> playlists;
    private List<Musica> curtidas;
    private List<Musica> descurtidas;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.historicoBuscas = new ArrayList<>();
        this.playlists = new ArrayList<>();
        this.curtidas = new ArrayList<>();
        this.descurtidas = new ArrayList<>();
    }

    public Usuario(int id, String nome, String email, String senha) {
        this(nome, email, senha);
        this.id = id;
    }

    // Getters e setters básicos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Listas de uso
    public List<Musica> getHistoricoBuscas() {
        return historicoBuscas;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Musica> getCurtidas() {
        return curtidas;
    }

    public List<Musica> getDescurtidas() {
        return descurtidas;
    }

    // Métodos para manipular as listas
    public void adicionarAoHistorico(Musica musica) {
        if (historicoBuscas.size() >= 10) {
            historicoBuscas.remove(0);
        }
        historicoBuscas.add(musica);
    }

    public void curtirMusica(Musica musica) {
        if (!curtidas.contains(musica)) {
            curtidas.add(musica);
            descurtidas.remove(musica);
        }
    }

    public void descurtirMusica(Musica musica) {
        if (!descurtidas.contains(musica)) {
            descurtidas.add(musica);
            curtidas.remove(musica);
        }
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
}
