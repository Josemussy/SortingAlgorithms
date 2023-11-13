public class InsertionSort extends SortingAlgorithms {
    public static void sort(int[] array) {
        int n = array.length;
        int iterator =1;
        for (int i = 1; i < n; i++) {
            int value = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > value) {
                swap(array, j, j+1);
                System.out.println("Iteração " + iterator + ":");
                iterator++;
                printArray(array);
                j = j - 1;
            }
            array[j + 1] = value;


        }
    }
}
