package org.example;

import Catalogo.LibriERiviste;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creazione di un nuovo libro:");
        LibriERiviste libro = LibriERiviste.catturaInput();
        System.out.println("Libro creato: \n" + libro);
    }
}