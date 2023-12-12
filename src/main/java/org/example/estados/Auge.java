package org.example.estados;
import lombok.Data;
import org.example.music.Cancion;

@Data
public class Auge implements EstadoCancion{

    public void aNormal(Cancion cancion){};
    public void aAuge(Cancion cancion){
        System.out.println("Ya se encuentra en el Estado 'Auge'");
    };
    public void aTendencia(Cancion cancion){};


}
