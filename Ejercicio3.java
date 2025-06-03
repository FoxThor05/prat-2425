import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la dimensión n de las matrices: ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] suma = new int[n][n];

        // Llenar matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = (int)(Math.random() * 100);
                B[i][j] = (int)(Math.random() * 100);
                suma[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz A:");
        mostrarMatriz(A);
        System.out.println("Matriz B:");
        mostrarMatriz(B);
        System.out.println("Matriz Suma:");
        mostrarMatriz(suma);
    }

    static void mostrarMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
