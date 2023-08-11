public class Selection_Sort {
    public static void main(String[] args) {
        int[] array ={7,9,0,6,3,6,5,0,6,6};
        sort(array);
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
        System.out.println("Your sorted array is :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
