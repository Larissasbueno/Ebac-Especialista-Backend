package br.com.lbueno;

/**
 * @author l.bueno
 */
public class DemoSingletonPropriedade {

        public static void main(String[] args) {
            SingletonPropiedade singleton = SingletonPropiedade.getInstance("Hello");
            System.out.println(singleton.getValue());

            SingletonPropiedade singleton2 = SingletonPropiedade.getInstance("World");
            System.out.println(singleton2.getValue());

        }
}
