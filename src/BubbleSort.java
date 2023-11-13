public class BubbleSort  extends SortingAlgorithms{
  public static int iterator =1;

    public static void sort(int[] array, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                System.out.println("Iteração " + iterator + ":");
                iterator++;
                printArray(array);
            }
        }
        sort(array, n - 1);
    }

}