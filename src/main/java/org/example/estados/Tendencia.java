package org.example.estados;

import lombok.Data;
import org.example.*;
import java.time.LocalDate;

@Data
public class Tendencia implements  EstadoCancion{
    public void aNormal(Cancion cancion){
        if (cancion.getLastView() != null && cancion.getLastView().isEqual(LocalDate.now())) {
            cancion.setEstado(new Normal());
            cancion.setIcono(Icono.MUSICAL_NOTE);
            System.out.println(cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getNombreCancion());
        }
    };
    public void aAuge(Cancion cancion){
        System.out.println("No permitido.");
    };
    public void aTendencia(Cancion cancion){
        System.out.println("Ya se encuentra en el Estado 'Tendencia'");
    };
}
