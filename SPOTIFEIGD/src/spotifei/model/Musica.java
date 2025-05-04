/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifei.model;

/**
 *
 * @author garac
 */

public class Musica {
    private int id;
    private String nome;
    private String artista;
    private String genero;
    private int duracaoSegundos;

    public Musica(int id, String nome, String artista, String genero, int duracaoSegundos) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.duracaoSegundos = duracaoSegundos;
    }

    public Musica(String nome, String artista, String genero, int duracaoSegundos) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.duracaoSegundos = duracaoSegundos;
    }

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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    @Override
    public String toString() {
        return nome + " - " + artista + " (" + genero + ")";
    }

    // Pode ser útil para comparação
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Musica)) return false;
        Musica m = (Musica) obj;
        return nome.equalsIgnoreCase(m.nome) && artista.equalsIgnoreCase(m.artista);
    }

    @Override
    public int hashCode() {
        return nome.toLowerCase().hashCode() + artista.toLowerCase().hashCode();
    }
}
