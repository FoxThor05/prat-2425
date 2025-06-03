import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int repeticionesMayor = 0;
        List<Integer> primos = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        // Llenar y mostrar matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
                int num = matriz[i][j];
                System.out.print(num + "\t");

                suma += num;

                if (num > mayor) {
                    mayor = num;
                    repeticionesMayor = 1;
                } else if (num == mayor) {
                    repeticionesMayor++;
                }

                if (esPrimo(num)) primos.add(num);
                if (num % 2 == 0) pares.add(num);
                if (i == j) sumaDiagonalPrincipal += num;
                if (i + j == 4) sumaDiagonalSecundaria += num;
            }
            System.out.println();
        }

        System.out.println("\nPromedio: " + (suma / 25.0));
        System.out.println("Número mayor: " + mayor + " (Repetido " + repeticionesMayor + " veces)");
        System.out.println("Números primos: " + primos);
        System.out.println("Números pares: " + pares);
        System.out.println("Suma diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaDiagonalSecundaria);

        int sumaUltimaFila = 0;
        for (int j = 0; j < 5; j++) {
            sumaUltimaFila += matriz[4][j];
        }
        System.out.println("Suma de la última fila: " + sumaUltimaFila);
    }

    static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
