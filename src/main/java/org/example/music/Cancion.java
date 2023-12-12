package org.example.music;
import lombok.Data;

@Data
public class Cancion {
    private String nombreCancion;
    private Artista artista;
    private Album album;

    public Cancion(String nombreCancion, Artista artista, Album album){
        this.nombreCancion = nombreCancion;
        this.artista = artista;
        this.album = album;
    }


}
