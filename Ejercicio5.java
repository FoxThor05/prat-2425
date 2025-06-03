import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        int filas = sc.nextInt();
        System.out.print("Columnas: ");
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        int[] conteo = new int[11];

        System.out.println("Ingrese los valores (0-10):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int num;
                do {
                    System.out.print("[" + i + "," + j + "]: ");
                    num = sc.nextInt();
                } while (num < 0 || num > 10);
                matriz[i][j] = num;
                conteo[num]++;
            }
        }

        System.out.println("\nRepeticiones de cada número:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + ": " + conteo[i] + " veces");
        }
    }
}
