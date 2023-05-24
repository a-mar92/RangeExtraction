import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {}
    public static String rangeExtraction(int[] arr) {
        List<String> range = new ArrayList<>();
        int start;
        int end;
        int j;

        for (int i = 0; i < arr.length; i++) {
            start = arr[i];
            end = arr[i];

            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[j - 1] == 1) {
                    end = arr[j];
                } else {
                    break;
                }
            }

            String rangeString = (end - start >= 2 && j - i >= 3) ? (start + "-" + end)
                    : (end - start == 1) ? (start + "," + end) : String.valueOf(start);
            range.add(rangeString);

            i = j - 1;
        }

        return String.join(",", range);
    }
}