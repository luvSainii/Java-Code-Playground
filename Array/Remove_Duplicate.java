public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] a = {7,9,0,6,3,6,5,0,6,6};
        duplicate(a);
    }
    public static void duplicate(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==-1){
                    continue;
                }
                else if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
