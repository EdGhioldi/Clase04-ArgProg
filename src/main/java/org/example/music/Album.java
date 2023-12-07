package org.example.music;
import lombok.Data;

@Data
public class Album {
    private String nombreAlbum;
    private Artista artista;
    private int cantidadCanciones;
    private int lanzamiento;

    public Album(String nombreAlbum, Artista artista){
        this.nombreAlbum = nombreAlbum;
        this.artista = artista;
    }
}
