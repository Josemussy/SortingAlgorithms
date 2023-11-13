import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while(true){
            int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
            System.out.print("\nMétodos de ordenação \n1-Bubble Sort \n2-Insertion Sort \n3-Quick Sort \nDigite uma opção: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Array antes da ordenação:");
                    BubbleSort.printArray(array);
                    BubbleSort.sort(array, array.length);
                    System.out.println("\nArray após a ordenação:");
                    BubbleSort.printArray(array);
                    break;

                case 2:
                    System.out.println("Array antes da ordenação:");
                    InsertionSort.printArray(array);
                    InsertionSort.sort(array);
                    System.out.println("\nArray após a ordenação:");
                    InsertionSort.printArray(array);
                    break;

                case 3:
                    System.out.println("Array antes da ordenação:");
                    QuickSort.printArray(array);

                    QuickSort.Sort(array, 0, array.length - 1);

                    System.out.println("\nArray após a ordenação:");
                    QuickSort.printArray(array);
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção não encontrada! Digite um valor disponível!!");
                    break;

            }
        }

    }
}