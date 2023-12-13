package org.example;

public class Main {
    public static void main(String[] args) {

        Cancion Pinhead = new Cancion("Pinhead", "Ramones", "LeaveHome");

        Pinhead.setLikes(50000);
        Pinhead.setDisLikes(5);
        Pinhead.setViews(500000);
        Pinhead.setLanzamiento(1977);

        Pinhead.aAuge(Pinhead);
        Pinhead.show();


    }
}
