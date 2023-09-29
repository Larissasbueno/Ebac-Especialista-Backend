package br.com.lbueno.tarefa_cotroleDeFluxo;

public class ControleDeFluxo {
    public static void main (String args[]) {
        double n1 = 5.5;
        double n2 = 9;
        double n3 = 4.5;
        double n4 = 10;

        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println(media);

        double result = media;
         if (result >= 7) {
            System.out.println("Aprovado");
        } else if  (result >= 5){
            System.out.println("Recuperação");
        } else if (result <5){
            System.out.println("Reprovado");
        }

    }
}
