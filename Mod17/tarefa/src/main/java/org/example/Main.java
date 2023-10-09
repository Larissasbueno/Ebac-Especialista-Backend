package org.example;

import modelos.CarroEsportivo;
import modelos.CarroSedan;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarroEsportivo> carrosEsportivos = new ArrayList<>();
        carrosEsportivos.add(new CarroEsportivo("Ferrari F458"));
        carrosEsportivos.add(new CarroEsportivo("Porsche 911"));

        List<CarroSedan> carrosSedan = new ArrayList<>();
        carrosSedan.add(new CarroSedan("Toyota Corolla"));
        carrosSedan.add(new CarroSedan("Honda Civic"));

        for (CarroEsportivo carro : carrosEsportivos) {
            carro.acelerar();
            carro.frear();
        }

        for (CarroSedan carro : carrosSedan) {
            carro.acelerar();
            carro.frear();
        }
    }
}

