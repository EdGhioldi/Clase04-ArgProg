package org.example;

public class Icono {
    public static Icono I_NORMAL = new Icono(new int[]{0xD83C, 0xDFB5});
    public static Icono I_AUGE = new Icono(new int[]{0xD83D, 0xDE80});
    public static Icono I_TENDENCIA = new Icono(new int[]{0xD83D, 0xDD25});
    private int[] internalEncoding;

    Icono(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }
}