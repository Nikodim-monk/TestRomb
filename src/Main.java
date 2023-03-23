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
        String[] line = new String[width];
        line[width / 2] = "#";
        print(line);

        for (int y = 1; y < height / 2; y++) {
            line = new String[width];
            int index = (height / 2 - y) * width / height;
            line[index] = "#";
            line[width - index - 1] = "#";
            print(line);
        }

        line = new String[width];
        line[0] = "#";
        line[width - 1] = "#";
        print(line);

        for (int y = height / 2 - 1; y >= 1; y--) {
            line = new String[width];
            int index = (height / 2 - y) * width / height;
            line[index] = "#";
            line[width - index - 1] = "#";
            print(line);
        }

        line = new String[width];
        line[width / 2] = "#";
        print(line);

    }

    static void print(String[] arr) {
        List<String> list = Arrays.asList(arr);
        list.replaceAll(t -> Objects.isNull(t) ? " " : t);
        System.out.println(String.join("", list));
    }

}