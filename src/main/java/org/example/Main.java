package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head");
        cancion.setLanzamiento(2002);

        // 1) CANCION RECIEN SE LANZA, TIENE POPULARIDAD NORMAL
        System.out.println(1);
        cancion.show();

        //2) ESTA EN AUGE OR SUPERAR EL MINIMO DE REPRODUCCIONES ESPERADAS
        System.out.println(2);
        cancion.setViews(2500);
        cancion.aAuge(cancion);

        //3) BAJA DE AUGE POR TENER MUCHOS DISLIKES
        System.out.println(3);
        cancion.setDisLikes(5001);
        cancion.aNormal(cancion);

        //4) ES TENDENCIA POR RECORD DE REPRODUCCIONES Y CANTIDAD DE LIKES
        System.out.println(4);
        cancion.setLikes(60000);
        cancion.setViews(600000);
        cancion.aTendencia(cancion);

        //5) VUELVE A NORMAL POR NO SER ESCUCHADA EN LAS ULTIMAS 24 HORAS
        System.out.println(5);
        cancion.setLastView(LocalDate.of(2023, 5, 25));
        cancion.aNormal(cancion);

    }
}
