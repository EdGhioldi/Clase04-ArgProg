package org.example.estados;

import lombok.Data;
import org.example.music.Cancion;

@Data
public class Tendencia implements  EstadoCancion{


    public void aNormal(Cancion cancion){};
    public void aAuge(Cancion cancion){};
    public void aTendencia(Cancion cancion){
        System.out.println("Ya se encuentra en el Estado 'Tendencia'");
    };
}
