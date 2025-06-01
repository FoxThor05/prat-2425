import java.util.Scanner;

public class TriangleNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de filas: ");
        int n = scanner.nextInt();
        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
