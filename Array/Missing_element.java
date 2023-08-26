public class Missing_element {
    static void missing_ele(int[] arr){
        int sum1=0;
        int sum2=0;
        int missing;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            sum1=sum1+arr[i];
        }
        for(int i=1;i<=n;i++){
            sum2=sum2+i;
        }
         missing = sum2-sum1;
        System.out.println("Your missing element is :"+missing);
    }
    public static void main(String[] args) {
       int[] arr = {1,2,4,5,6,7,8,9};
        missing_ele(arr);

    }
}
