public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array = { 7, 9, 0, 6, 3, 6, 5, 0, 6, 6 };
        sort(array);
    }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        System.out.println("Your sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
