package cuadradomagicosinrepeticion;

import java.util.ArrayList;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Prueba {

    public static void main(String[] args) {

        ArrayList<CuadradoMagico> listaCuadrados = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            listaCuadrados.add(new CuadradoMagico());
        }
        
        for(CuadradoMagico cuadrado : listaCuadrados){
            System.out.println(cuadrado.toString());
            System.out.println("Es magico? " + cuadrado.esMagico());
            System.out.println("-----------------------------------");
        }
    }

}
