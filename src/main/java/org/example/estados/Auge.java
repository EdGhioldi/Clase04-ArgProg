package org.example.estados;

import lombok.Data;
import org.example.Cancion;
import org.example.Icono;

import java.time.LocalDate;

@Data
public class Auge implements EstadoCancion{

    public Auge(){};

    public void aNormal(Cancion cancion){
        if      (cancion.getViews() < 1000
                || cancion.getLikes() < 20000
                || cancion.getDisLikes() > 5000) {
            cancion.setEstado(new Normal());
            cancion.setIcono(Icono.MUSICAL_NOTE);
            cancion.setMensaje(cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getNombreCancion());
            cancion.show();
        }else{
            System.out.println("Imposible, está CANCION NO ESTÁ EN EL ESTADO SELECCIONADO");
        }
    };    public void aAuge(Cancion cancion){
        System.out.println("Ya se encuentra en el Estado 'Auge'");
    };
    public void aTendencia(Cancion cancion){
        if((cancion.getLastView() != null || !cancion.getLastView().isBefore(LocalDate.now().minusDays(1)))
        && cancion.getViews()>50000 && cancion.getLikes()>20000 && cancion.getDisLikes()<5000){
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
