public class Kadanes_Algo {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(arr);
    }
    public static void Kadanes(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            if(curr_sum<0){
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        System.out.println("Your max subarray sum is "+max_sum);
    }
}
