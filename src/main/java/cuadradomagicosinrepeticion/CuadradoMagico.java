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

    //usado para comprobar esMagico()
    public void setCuadradoMagico(int[][] cuadradoMagico) {
        this.cuadradoMagico = cuadradoMagico;
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

    private int sumaDiagonalSecundaria() {
        int acumulador = 0;
        for (int i = cuadradoMagico.length - 1; i >= 0; i--) {
            acumulador += cuadradoMagico[i][cuadradoMagico.length - 1 - i];
        }
        return acumulador;
    }

    //devuelve true si la suma de cada fila, columna y diagonal vela lo mismo
    public boolean esMagico() {
        int numeroMagico = this.sumaDiagonalSecundaria();
        for (int k = 0; k < cuadradoMagico.length; k++) {
            if (numeroMagico != this.sumaFila(k) || numeroMagico != this.sumaColumna(k)) {
                return false;
            }
        }

        if (numeroMagico != this.sumaDiagonalPrincipal()) {
            return false;
        }
        return true;
    }
}
