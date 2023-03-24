import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте высоту ромба (1-80)");
        int height = scanner.nextInt();
        System.out.println("Задайте ширину ромба (1-80)");
        int width = scanner.nextInt();
        printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {

        for (int y = 0; y < height; y++) {
            String[] line = new String[width];
            int index;
            if (y < height / 2) {
                index = (height / 2 - y) * width / height;
                line[index] = "#";
                line[width - index - 1] = "#";
            } else if (y == height / 2) {
                line[0] = "#";
                line[width - 1] = "#";
            } else {
                index = (y - height / 2) * width / height;
                line[index] = "#";
                line[width - index - 1] = "#";
            }
            List<String> list = Arrays.asList(line);
            list.replaceAll(t -> Objects.isNull(t) ? " " : t);
            System.out.println(String.join("", list));
        }
    }
}