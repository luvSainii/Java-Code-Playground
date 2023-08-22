public class Diagonal {
    public static void diagonal(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if((i==j)|| (i+j==arr.length-1)){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("So your sum of the both diagonal is "+sum);
    }
    public static void main(String[] args) {
        int [][] b = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        diagonal(b);
    }
}
