package org.example;

import carros.Carro;
import modelos.CarroEsportivo;
import modelos.CarroSedan;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        // Adicionar carros à lista
        carros.add(new CarroEsportivo("Ferrari F458"));
        carros.add(new CarroSedan("Toyota Corolla"));
        carros.add(new CarroEsportivo("Porsche 911"));

        // Listar os nomes dos carros e acelerar/frear cada um
        for (Carro carro : carros) {
            System.out.println("Nome: " + carro.getNome());
            carro.acelerar();
            carro.frear();
            System.out.println();
        }
    }
}
