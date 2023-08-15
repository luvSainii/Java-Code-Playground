public class Spiral_Demo {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12}}; 
    spiral(matrix);
    }
    public static void spiral(int[][] arr) {
        int start_row =0,start_column =0;
        int end_row = arr.length-1,end_column=arr[0].length-1;
        while(start_row<=end_row && start_column<=end_column){
            //top
            for(int j=start_column;j<=end_column;j++){
                System.out.print(arr[start_row][j]+" ");
            }
            //right
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(arr[i][end_column]+" ");
            }
            //bottom
            for(int j=end_column-1;j>=start_column;j--){
                if(start_row==end_row){
                    break;           
                }
                System.out.print(arr[end_row][j]+" ");
            }
            //left
            for(int i=end_row-1;i>start_row;i--){
                if(start_column==end_column){
                    break;
                }
                System.out.print(arr[i][start_column]+" ");
            }
            start_column++;
            start_row++;
            end_column--;
            end_row--;
            System.out.println();
        }
        
    }
}
