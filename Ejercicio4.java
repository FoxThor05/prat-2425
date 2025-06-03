import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] vector = {5, 2, 9, 1, 7, 1};
        Set<Integer> set = new TreeSet<>();
        for (int n : vector) set.add(n);

        if (set.size() < 2) {
            System.out.println("No hay segundo mínimo.");
        } else {
            Iterator<Integer> it = set.iterator();
            it.next(); // primer menor
            System.out.println("Segundo elemento más pequeño: " + it.next());
        }
    }
}
