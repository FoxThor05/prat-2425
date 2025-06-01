import java.util.Scanner;

public class TriangleNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de filas
        System.out.print("Introduce la cantidad de filas: ");
        int n = scanner.nextInt();

        // Imprimir n filas, cada una con números desde 1 hasta el número de la fila
        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
