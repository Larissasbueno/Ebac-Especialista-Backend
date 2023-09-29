package br.com.lbueno.forwhile;

/**
 * @author lbueno
 */
public class ExemploPPT2 {

    public static void main (String args[]) {
        for (int contador=1; contador<=1000; contador++){
            System.out.println("Esta é a repetição nr: "+contador);
            if(contador==10)
                break;

            //break ele para a execução do código, ele vai ate 10 e nao ate 1000
        }

    }

}
