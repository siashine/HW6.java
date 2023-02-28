import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows7", 70000, "Lenovo"));
        set.add(new Notebook("Notebook 2", 16, "Windows8", 85000, "HP"));
        set.add(new Notebook("Notebook 3", 32, "Windows10", 95000, "Samsung"));
        set.add(new Notebook("Notebook 4", 64, "IOS", 190000, "Mac"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}