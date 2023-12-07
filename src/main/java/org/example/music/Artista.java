package org.example.music;
import lombok.Data;

@Data
public class Artista {
    private String nombreArtista;

    public Artista(String nombreArtista){this.nombreArtista = nombreArtista;}

}
