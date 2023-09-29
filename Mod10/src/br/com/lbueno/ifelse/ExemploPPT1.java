package br.com.lbueno.ifelse;

/**
 * @author lbueno
 */

public class ExemploPPT1 {

//if, else, else if
    public static void main (String args[]) {
        int result = 0;
        //if significa que a intrução é verdadeira e else que é false
        //se (if) for tal coisa, faça isso, caso contrario (else), faça aquela outra coisa
        if (result > 1 && result <5) {
            System.out.println("Resultado esta entre 1 e 5");
        } else if  (result >= 5 && result < 8){
            System.out.println("Resultado esta entre 5 e 8");
        } else {
            System.out.println("Resultado diferente dos ANTERIORES");
        }

    }
}
