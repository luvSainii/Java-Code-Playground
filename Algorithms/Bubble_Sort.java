public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {6,3,9,6,6,7,4,2,8,3};
        sort(array);
    }
    static void sort(int[] arr){
        int swap1=0,swap2=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                continue;
            }
            swap1++;
            for(int j=0;j<arr.length-1-i;j++){
                swap2++;
                if(arr[j]>arr[j+1]){
                   
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Your sorted array is :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(swap1+" "+swap2);
    }
}
