import java.util.Random;

public class Tablero {
    int[][] tablero = new int[4][4];
    Random random = new Random();

    public Tablero() {
        //to do a  0
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }
        añadir2();
        añadir2();
    }

    public void añadir2() {
        int fila, columna;
        do {
            fila = random.nextInt(4);
            columna = random.nextInt(4);
        } while (tablero[fila][columna] != 0);// comprobar vacío antes de poner el 2
        tablero[fila][columna] = 2;
    }

    public void mostrartablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("【" + tablero[i][j] + "】  ");
            }
            System.out.println();
        }
    }

    public void arriba() {
        for (int j = 0; j < 4; j++) {
            //arriba
            int[] columna = new int[4];
            int index = 0;
            for (int i = 0; i < 4; i++) {
                if (tablero[i][j] != 0) {
                    columna[index++] = tablero[i][j];
                }
            }
            // sumar
            for (int i = 0; i < 3; i++) {
                if (columna[i] == columna[i + 1] && columna[i] != 0) {
                    columna[i] *= 2;
                    columna[i + 1] = 0;
                }
            }
            // Volver a colocar los valores en el tablero
            index = 0;
            for (int i = 0; i < 4; i++) {
                if (columna[index] != 0) {
                    tablero[i][j] = columna[index++];
                } else {
                    tablero[i][j] = 0;
                }
            }
        }
    }

    public void abajo() {
        for (int j = 0; j < 4; j++) {
            //abajo
            int[] columna = new int[4];
            int index = 3;
            for (int i = 3; i >= 0; i--) {
                if (tablero[i][j] != 0) {
                    columna[index--] = tablero[i][j];
                }
            }
            // suma
            for (int i = 3; i > 0; i--) {
                if (columna[i] == columna[i - 1] && columna[i] != 0) {
                    columna[i] *= 2;
                    columna[i - 1] = 0;
                }
            }
            // Volver a colocar los valores en el tablero
            index = 3;
            for (int i = 3; i >= 0; i--) {
                if (columna[index] != 0) {
                    tablero[i][j] = columna[index--];
                } else {
                    tablero[i][j] = 0;
                }
            }
        }
    }

    public void izquierda() {
        for (int i = 0; i < 4; i++) {
            // izquierda
            int[] fila = new int[4];
            int index = 0;
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j] != 0) {
                    fila[index++] = tablero[i][j];
                }
            }
            // suma
            for (int j = 0; j < 3; j++) {
                if (fila[j] == fila[j + 1] && fila[j] != 0) {
                    fila[j] *= 2;
                    fila[j + 1] = 0;
                }
            }
            // Volver a colocar los valores en el tablero
            index = 0;
            for (int j = 0; j < 4; j++) {
                if (fila[index] != 0) {
                    tablero[i][j] = fila[index++];
                } else {
                    tablero[i][j] = 0;
                }
            }
        }
    }

    public void derecha() {
        for (int i = 0; i < 4; i++) {
            //derecha
            int[] fila = new int[4];
            int index = 3;
            for (int j = 3; j >= 0; j--) {
                if (tablero[i][j] != 0) {
                    fila[index--] = tablero[i][j];
                }
            }
            // suma
            for (int j = 3; j > 0; j--) {
                if (fila[j] == fila[j - 1] && fila[j] != 0) {
                    fila[j] *= 2;
                    fila[j - 1] = 0;
                }
            }
            // Volver a colocar los valores en el tablero
            index = 3;
            for (int j = 3; j >= 0; j--) {
                if (fila[index] != 0) {
                    tablero[i][j] = fila[index--];
                } else {
                    tablero[i][j] = 0;
                }
            }
        }
    }

    public void terminado() {
        boolean continuar = true;

        // comprobar si hay  2048
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 2048) {
                    continuar = false;
                    System.out.println("¡Has ganado! Encontraste 2048.");
                    break;
                }
            }
            if (!continuar) break;
        }

        // comprobar espacios y movimientos disponibles
        if (continuar) {
            boolean hayEspacio = false;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] == 0) {
                        hayEspacio = true;
                        break;
                    }
                }
                if (hayEspacio) break;
            }

            if (!hayEspacio) {
                System.out.println("¡El juego ha terminado! No hay más movimientos posibles.");
                continuar = false;
            }
        }
    }
}
