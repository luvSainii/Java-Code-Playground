public class Second_Largest {
    // method to find the second largest element in the array
    public static void sec_lar(int[] arr) {
        int first_lar = Integer.MIN_VALUE;
        int sec_lar = Integer.MIN_VALUE;
        // in this loop we will search and store the first largest element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first_lar){
                first_lar = arr[i];
            }
        }
        // now here we search and store the second largest element of the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sec_lar && arr[i]!=first_lar){
                sec_lar = arr[i];
            }
        }
        System.out.println("Your second largest number is "+sec_lar);
    }
    public static void main(String[] args) {
        int[] a = {7,9,0,6,3,6,5,0,6,6};
        sec_lar(a);
    }
}
