package org.example.estados;

import lombok.Data;
import org.example.*;
import java.time.LocalDate;

@Data
public class Tendencia implements  EstadoCancion{

    public Tendencia(){};
    public void aNormal(Cancion cancion){
        if (cancion.getViews()<1000 && cancion.getLikes()<20000 ||
            cancion.getDisLikes()>5000){
            cancion.setEstado(new Normal());
            cancion.setIcono(Icono.MUSICAL_NOTE);
            cancion.setMensaje(cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getNombreCancion());
            cancion.show();
        }else{
            System.out.println("Imposible, está CANCION NO ESTÁ EN EL ESTADO SELECCIONADO");
        }
    };
    public void aAuge(Cancion cancion){
        System.out.println("Imposible, esta CANCION NO ESTÁ EN AUGE!");
    };
    public void aTendencia(Cancion cancion){
            System.out.println("Ya se encuentra en el Estado 'Tendencia'");
    };
}
