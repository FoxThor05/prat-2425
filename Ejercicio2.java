import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de columnas: ");
        int n = sc.nextInt();
        int[][] matriz = new int[5][n];

        System.out.println("Matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int)(Math.random() * 11);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
