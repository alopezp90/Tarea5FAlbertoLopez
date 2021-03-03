package cuadradomagico;

import java.util.Random;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class CuadradoMagico {

    private int[][] cuadradoMagico;
    private static Random rd = new Random();

    public CuadradoMagico() {
        cuadradoMagico = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadradoMagico[i][j] = rd.nextInt(9) + 1;
            }
        }
    }

}
