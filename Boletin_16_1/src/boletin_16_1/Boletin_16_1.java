package boletin_16_1;

/**
 *
 * @author gpietrafesavieitez
 */

public class Boletin_16_1 {

    public static void main(String[] args) {
        IPodeCantar persoa = new Persoa();
        persoa.cantar();
        
        IPodeCantar canario = new Canario();
        canario.cantar();
        
        IPodeCantar galo = new Galo();
        galo.cantar();
    }
}
