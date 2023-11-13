public class QuickSort extends SortingAlgorithms {
    public static int iterator =1;
    public static void Sort(int[] array, int low, int high) {
        if (low < high) {
            // Encontra o índice do pivot após particionar o array
            int pivotIndex = partition(array, low, high);

            // Recursivamente ordena os subarrays à esquerda e à direita do pivot
            Sort(array, low, pivotIndex - 1);
            Sort(array, pivotIndex + 1, high);
        }
    }

    // Método para particionar o array e retornar o índice do pivot
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
                System.out.println("Pivot: " + pivot + " - Iteração:" + iterator);
                iterator++;
                printArray(array);
            }
        }

        swap(array, i + 1, high);


        return i + 1;
    }
}
