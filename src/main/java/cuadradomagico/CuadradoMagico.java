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

    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                texto += cuadradoMagico[i][j] + "\t";
            }
            texto += "\n";
        }
        return texto;
    }

    private int sumaFila(int i) {
        int acumulador = 0;
        for (int j = 0; j < cuadradoMagico[i].length; j++) {
            acumulador += cuadradoMagico[i][j];
        }
        return acumulador;
    }

    private int sumaColumna(int j) {
        int acumulador = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            acumulador += cuadradoMagico[i][j];
        }
        return acumulador;
    }

    private int sumaDiagonalPrincipal() {
        int acumulador = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            acumulador += cuadradoMagico[i][i];
        }
        return acumulador;
    }

    public static void main(String[] args) {
        CuadradoMagico cuadrado = new CuadradoMagico();
        System.out.println(cuadrado.toString());
        System.out.println("suma de la diagonal principal: " + cuadrado.sumaDiagonalPrincipal());
    }

}
