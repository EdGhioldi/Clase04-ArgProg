package org.example.estados;

import org.example.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Normal implements EstadoCancion{

    public Normal(){};
    public void aNormal(Cancion cancion){
        System.out.println("Ya se encuentra en Estado 'Normal'");
        cancion.show();
    };
    public void aAuge(Cancion cancion){
        if((cancion.getLastView() != null && !cancion.getLastView().isBefore(LocalDate.now().minusDays(1)))
                && cancion.getViews()>1000 && cancion.getViews() < 50000 && cancion.getDisLikes() < 5000){
            cancion.setEstado(new Auge());
            cancion.setIcono(Icono.ROCKET);
            cancion.setMensaje(cancion.getArtista() + " - " +  cancion.getNombreCancion()
                    + " - " + cancion.getAlbum() + " - " + cancion.getLanzamiento());
            cancion.show();

        }else{
            System.out.println("Imposible, esta CANCION NO ESTÁ EN AUGE!");
        }
    };
    public void aTendencia(Cancion cancion){
        if((cancion.getLastView() != null && !cancion.getLastView().isBefore(LocalDate.now().minusDays(1))
            && cancion.getViews()>50000 && cancion.getLikes()>20000)){
            cancion.setEstado(new Tendencia());
            cancion.setIcono(Icono.FIRE);
            cancion.setMensaje(cancion.getNombreCancion() + " - " + cancion.getArtista() + " - " +
                    cancion.getAlbum() + " - " + cancion.getLanzamiento());
            cancion.show();
        }else{
            System.out.println("Imposible, esta canción NO ES TENDENCIA!");
        }
    };
}
