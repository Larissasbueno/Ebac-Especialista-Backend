package br.com.lbueno.forwhile;

/**
 * @author lbueno
 */
public class ExemploPPT4 {

    public static void main (String args[]) {
        int count = 0;
        //while vc executa quando não conhece a quantidade de registros, enquanto a condição for verdadeir ele continua executando (loop infinito)
        while(count <2) {
            System.out.println("Repetição nr: " + count);
            count++;
        }
    }

}
/** principal diferença entre for e while
for = para
while= enquanto

 para 1 até 10 imprima hello
 enquanto 10 for menor que 20 imprima hello **/



