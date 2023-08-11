public class Trapping_Water {
    public static void main(String[] args) {
        int[] height = {7,9,0,6,3,5};
        trapping(height);
    }
    public static void trapping(int[] arr){
        int n = arr.length;
        int sum = 0;
        int[] right_aux = new int[n];
        right_aux[n-1] = arr[n-1];
        int[] left_aux = new int[n];
        left_aux[0] = arr[0];

        // calculate the max left height for an individual bar
        for(int i=1;i<n;i++){
            left_aux[i] = Math.max(left_aux[i-1], arr[i]);
        }

        // calculate the max right height for an individual bar
        for(int i=n-2;i>=0;i--){
            right_aux[i] = Math.max(right_aux[i+1], arr[i]);
        }

        // now calculate the trapped water
        for(int i=0;i<n;i++){
            sum += Math.min(left_aux[i],right_aux[i]) -arr[i]; 
        }
        System.out.println("The total trapped water is = "+sum);
    }       
}
