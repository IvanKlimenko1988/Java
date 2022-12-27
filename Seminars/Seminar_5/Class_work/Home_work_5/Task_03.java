package Class_work.Home_work_5;

//Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class Task_03 {
    public static void heapSort(int[] array) {
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, i, size);
        for (int i = size - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapify(array, 0, i);
        }
    }

    private static void heapify(int[] array, int i, int size) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int max = i;
        if (left < size && array[left] > array[max])
            max = left;
        if (right < size && array[right] > array[max])
            max = right;
        if (i != max) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            heapify(array, max, size);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {100, 5, 23, -6, 229, 12, 98, 29};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
        System.out.println("Sort:");
        heapSort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}