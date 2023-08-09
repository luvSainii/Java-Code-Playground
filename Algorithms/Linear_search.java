import java.util.Scanner;

public class Linear_search {
    public int linearSearch(int[] arr,int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter your arrray for searching :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key for searching :");
        int key = sc.nextInt();
        Linear_search obj = new Linear_search();
        System.out.println("Your key element is at position :"+obj.linearSearch(arr,key));
        sc.close();
    }
}
