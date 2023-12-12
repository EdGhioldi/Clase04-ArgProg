package org.example;
import org.example.music.*;

public class Main {
    public static void main(String[] args) {
        Artista Ramones = new Artista("Ramones");
        Album LeaveHome = new Album("Leave Home", Ramones);
        Cancion Pinhead = new Cancion("Pinhead", Ramones, LeaveHome);


    }
}