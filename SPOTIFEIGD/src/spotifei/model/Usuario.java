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

    private List<Musica> musicasCurtidas;
    private List<Musica> musicasDescurtidas;
    private List<Musica> historicoBuscas;
    private List<Playlist> playlists;

    // ainda nao tem essas classes 
    public Usuario(int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
        this.musicasCurtidas = new ArrayList<>();
        this.musicasDescurtidas = new ArrayList<>();
        this.historicoBuscas = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    @Override
    public boolean login(String email, String senha) {
        return getEmail().equals(email) && getSenha().equals(senha);
    }

    //curtir e descurtir músicas
    public void curtirMusica(Musica musica) {
        if (!musicasCurtidas.contains(musica)) {
            musicasCurtidas.add(musica);
            musicasDescurtidas.remove(musica); //descurtir
        }
    }

    public void descurtirMusica(Musica musica) {
        if (!musicasDescurtidas.contains(musica)) {
            musicasDescurtidas.add(musica);
            musicasCurtidas.remove(musica); 
        }
    }

    // histórico 
    public void adicionarAoHistorico(Musica musica) {
        historicoBuscas.add(0, musica); // adiciona musica
        if (historicoBuscas.size() > 10) {
            historicoBuscas.remove(historicoBuscas.size() - 1); // remove a mais antiga
        }
    }

    public List<Musica> getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public List<Musica> getMusicasDescurtidas() {
        return musicasDescurtidas;
    }

    public List<Musica> getHistoricoBuscas() {
        return historicoBuscas;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }
}