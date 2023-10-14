package basiclabs;
import java.util.*;

class WithInput {
    int c;

    int add(int x, int y) {
        c = x + y;
        return c;
    }
}

public class Methodi {
    public static void main(String[] args) {
        WithInput ref = new WithInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println(ref.add(a, b));
    }
}
