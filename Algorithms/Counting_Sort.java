public class Counting_Sort {
    public static void main(String[] args) {
        int[] array = {7,9,0,6,3,6,5,0,6,6};
        sort(array);

    }
    public static void sort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int[] count = new int[largest+1 ];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Your sorted array is :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
