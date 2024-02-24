package task7;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class task7 {
    public static void main(String[] args) {
        int level = 5;
        try {
            System.out.println(pascalsTriangle(level));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String pascalsTriangle(int level) throws Exception {
        if (level < 0) throw new Exception("Wrong input parameters");
        int line[] = new int[level + 1];
        String result;
        for(int i = 0; i < level + 1; i++){
            line[i] = factorialRecursive(level)/(factorialRecursive(i)*factorialRecursive((level-i)));
        }
        return Arrays.toString(line);
    }
        static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}
