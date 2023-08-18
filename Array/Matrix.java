import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] student = new int[3][3];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<student.length;i++){
            for(int j=0;j<student[0].length;j++){
                student[i][j]=sc.nextInt();
            }
        }
        largest_smallest(student);
        sc.close();
    }
    
    public static void largest_smallest(int[][] arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
         }
         System.out.println("Your largest element is : "+largest+" and your smallest element is : "+smallest);
    }
}

