import java.util.*;
public class Rotate_array {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of an array :-");  
      int size = sc.nextInt();
      int[] array = new int[size];
      System.out.println("Enter the element  of array ");
      for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
      }
      System.out.println("Enter the index value from which you want to rotate the array");
      int index = sc.nextInt();
      rotate(array,index);
      sc.close();
    }
    static void rotate(int[] arr,int n){
        for(int i=n;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
