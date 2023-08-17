public class Staircase_Searching {
    public static void main(String[] args) {
        int[][] matrix ={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        staricase(matrix);
    }
    public static void staricase(int[][] arr){
        int key = 50;
        int row = arr.length-1;
        int column = 0;
        while(column<arr.length && row>=0){
            if(key== arr[row][column]){
                System.out.println("Your key is present at position ("+row+","+column+")");
                break;
            }
            else if(key>arr[row][column]){
                column++;
            }
            else if(key<arr[row][column]){
                row--;
            }
            else{
                System.out.println("Key not found");
            }
        }
       
    }
}
