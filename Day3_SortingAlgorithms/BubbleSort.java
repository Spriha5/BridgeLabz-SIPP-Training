package Day3_SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] num = {48,41,45,40,35};
        bubbleSort(num);
        for (int asc : num)
            System.out.print(asc + " ");
    }
}
