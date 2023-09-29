package br.com.lbueno.ifelse;
/**
 * @author lbueno
 */

public class ExemploPTT2 {
    public static void main(String args[]){


        int result = 10;
        if (result > 1 && result < 5) {
               System.out.println("Resultado esta entre 1 e 5");
        } else if (result >= 10 && result < 15){
            System.out.println("Resultado esta entre 10 e 15");
        } else {
            System.out.println("Resultado esta diferente das anteriores");
        }


    }
}
