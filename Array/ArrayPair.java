// Program for printing the pairs of an element of a given array

public class ArrayPair{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
		pair(arr);
  }
  static void pair(int[] a){
	 	for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				System.out.print("("+a[i]+","+a[j]+")");
			}
			System.out.println();
    } 
  }
}