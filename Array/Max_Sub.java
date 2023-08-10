// Program for printing the Sub Array of an element of a given array

public class Max_Sub{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
		Sub(arr);
  }
  static void Sub(int[] a){
		int curr_max=0;
    int max_sub=Integer.MIN_VALUE;
	 	for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				for(int k=i;k<=j;k++){
					curr_max +=a[k];
				}
				if(max_sub<curr_max){
					max_sub=curr_max;
				}
				curr_max=0;
			}
		}
	System.out.println(max_sub);
	}
}
