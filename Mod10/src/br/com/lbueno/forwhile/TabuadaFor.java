package br.com.lbueno.forwhile;

import java.util.Scanner;

/**
 * @author lbueno
 */

public class TabuadaFor {

    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número para gerar a tabuada: ");
        int num = s.nextInt();
        for (int i = 0; i<=10;i++) {
            System.out.println(num + "X" + i + " = " + num*i);
        }
        //1 x 0 = 0
        //1 x 1 = 1
        // o principio do loop for é ser um contador, ele permite executar um conj de sentenças por um nº determinado de vezes
    }

}
