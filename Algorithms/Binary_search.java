import java.util.Scanner;

public class Binary_search {
    public int binarySearch(int[] arr,int key) {
        int start =0;
        int end = arr.length-1;
        int mid ;
        while(start<=end){
            mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid;
            }
            if(arr[mid]<key){
                start =mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of an array :");
        int size = sc.nextInt();

        // Remember one thing your array should be in sorted order

        System.out.println("Enter your array for searching");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your key element which you want to search :");
        int key = sc.nextInt();
        Binary_search obj = new Binary_search();
        System.out.println("Your element is present at index :"+obj.binarySearch(arr,key));
        sc.close();
    }
}
