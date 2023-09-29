package br.com.lbueno;

/**
 * @author lbueno
 */
import java.util.ArrayList;
import java.util.Scanner;

        public class Colecoes {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Definir listas vazias para os grupos masculinos e femininos
                ArrayList<String> grupoMasculino = new ArrayList<>();
                ArrayList<String> grupoFeminino = new ArrayList<>();

                // Loop para pedir informações de várias pessoas
                while (true) {
                    System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
                    String nome = input.nextLine();
                    if (nome.equalsIgnoreCase("fim")) {
                        break;
                    }
                    System.out.print("Digite o sexo da pessoa (M/F): ");
                    String sexo = input.nextLine();
                    if (sexo.equalsIgnoreCase("M")) {
                        grupoMasculino.add(nome);
                    } else if (sexo.equalsIgnoreCase("F")) {
                        grupoFeminino.add(nome);
                    } else {
                        System.out.println("Sexo inválido! Digite 'M' ou 'F'.");
                    }
                }

                // Imprimir os grupos
                System.out.println("Grupo Masculino:");
                for (String nome : grupoMasculino) {
                    System.out.println("- " + nome);
                }
                System.out.println();

                System.out.println("Grupo Feminino:");
                for (String nome : grupoFeminino) {
                    System.out.println("- " + nome);

                }
                System.out.println();
            }
        }
