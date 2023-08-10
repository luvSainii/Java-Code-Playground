// program to find the maximum sum of the sub array from the given
// array using prefix array

public class Prefix {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        max_sub_array(arr);
    }

// prefix function to calculate the maximum sum of sub array

    public static void max_sub_array(int[] arr){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum>max){
                    max = sum;
                }
            }
            sum = 0;
        }
        System.out.println("so the maximum sum of the sub array is "+max);
    }
}
