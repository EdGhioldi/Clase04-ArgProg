package org.example.estados;

import org.example.*;
import lombok.Data;

@Data
public class Normal implements EstadoCancion{

    public Normal(){};
    public void aNormal(Cancion cancion){
        System.out.println("Ya se encuentra en el Estado 'Normal'");
    };
    public void aAuge(Cancion cancion){
        if(cancion.getViews()>1000 && cancion.getDisLikes() < 5000){
            cancion.setEstado(new Auge());
            cancion.setIcono(Icono.ROCKET);
            cancion.setMensaje(cancion.getArtista() +  cancion.getNombreCancion()
            + cancion.getAlbum() + cancion.getLanzamiento());
        }
    };
    public void aTendencia(Cancion cancion){};
}
