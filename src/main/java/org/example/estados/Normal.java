package org.example.estados;
import org.example.music.*;
import lombok.Data;

@Data
public class Normal implements EstadoCancion{

    public Normal(){};
    public void aNormal(Cancion cancion){
        System.out.println("Ya se encuentra en el Estado 'Normal'");
    };
    public void aAuge(Cancion cancion){};
    public void aTendencia(Cancion cancion){};
}
