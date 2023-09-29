package br.com.lbueno.ifelse;

import java.util.Scanner;

/**
 * @author lbueno
 */

public class ExemplosAnimal {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = exampleOfIF(texto);
        System.out.println(animal);
    }

    private static String exampleOfIF(String animal) {
        String result;
            if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}
