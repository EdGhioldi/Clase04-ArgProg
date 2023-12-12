package org.example.estados;
import org.example.music.Cancion;
public interface EstadoCancion {
    void aNormal(Cancion cancion);
    void aAuge(Cancion cancion);
    void aTendencia(Cancion cancion);
}
