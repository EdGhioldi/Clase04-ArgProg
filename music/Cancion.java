package org.example.music;
import org.example.estados.*;
import org.example.Icono;
import lombok.Data;
@Data
public class Cancion {
    private String nombreCancion;
    private Artista artista;
    private Album album;
    private int likes;
    private int disLikes;
    private int views;
    private EstadoCancion estado;
    private Icono icono;


    public Cancion(String nombreCancion, Artista artista, Album album){
        this.nombreCancion = nombreCancion;
        this.artista = artista;
        this.album = album;
        this.estado = new Normal();
        this.icono = icono.MUSICAL_NOTE;
    }

    public String getNombreCancion(){
        return nombreCancion;
    }
    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }
    public Artista getArtista(){
        return artista;
    }
    public void setArtista(Artista artista){
        this.artista = artista;
    }
    public Album getAlbum(){
        return album;
    }
    public void setAlbum(Album album){
        this.album = album;
    }
    public int getLikes(){
        return likes;
    }
    public void setLikes(int likes){
        this.likes = likes;
    }
    public int getDisLikes(){
        return disLikes;
    }
    public void setDisLikes(int disLikes){
        this.disLikes = disLikes;
    }
    public int getViews(){
        return views;
    }
    public void setViews(int views){
        this.views = views;
    }

    //METODOS DE CAMBIO DE ESTADO
    public void aNormal(Cancion cancion){
        this.estado.aNormal(cancion);
    }
    public void aAuge(Cancion cancion){
        this.estado.aAuge(cancion);
    }
    public void aTendencia(Cancion cancion){
        this.estado.aTendencia(cancion);
    }
}
