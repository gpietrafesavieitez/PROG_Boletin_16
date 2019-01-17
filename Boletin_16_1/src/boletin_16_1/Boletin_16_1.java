package boletin_16_1;

/**
 *
 * @author gpietrafesavieitez
 */

public class Boletin_16_1 {

    public static void main(String[] args) {
        Persoa Pepe = new Persoa();
        System.out.println("Persoa canta: " + Pepe.cantar());
        
        Tenor Pavarotti = new Tenor();
        System.out.println("Tenor canta: " + Pavarotti.cantar());
        
        Canario Kiwi = new Canario();
        System.out.println("Canario canta: " + Kiwi.cantar());
       
        Galo Claudio = new Galo();
        System.out.println("Galo canta: " + Claudio.cantar());
    }
}
