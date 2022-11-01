import java.io.*;
public class Program {

    public static void main(String[] args) {
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("input.txt"))) {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        if (array != null) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println("Max: " + max);
        }
    }
}