package com.pruebaCSV;

public class PruebaCSV {
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();

        miLector.leeCSV("./datos/pokemon.csv");

    }
}
