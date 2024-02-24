package task6;
import java.nio.charset.StandardCharsets;
public class task6 {
    public static void main(String[] args) {
        byte[] Arr = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
                32, 103, 114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
        System.out.println(getTextFromBytes(Arr));
    }
    public static String getTextFromBytes(byte[] array) {
        String finalText = new String(array, StandardCharsets.UTF_8);
        return finalText;
    }
}
