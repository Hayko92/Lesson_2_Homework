package task2;

public class SortingAlgoritmUtil {
    private SortingAlgoritmUtil() {
    }

    public static void insertionSort(char[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            char currentNumber = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > currentNumber) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = currentNumber;
        }
    }

    public static int partition(char[] numbers, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (numbers[i] < numbers[pivot]) {
                swap(numbers, counter, i);
                counter++;
            }
        }
        swap(numbers, pivot, counter);
        return counter;
    }

    private static void swap(char[] numbers, int a, int b) {
        char temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }

    public static void quickSort(char[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    public static void selectionSort(char[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minId = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minId = j;
                }
                swap(numbers, i, minId);
            }
        }
    }
}
