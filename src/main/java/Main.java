
import java.util.Scanner;
import java.util.Random;

public class recorsia2 {
	public static Scanner reader = new Scanner (System.in);

	/*14*/
	public static int a(int[] arr, int i,int num) {

		if(num==i) {
			return 0;
		}
		return arr[num]+a(arr,i,num+1);
	}


	/*15*/
	public static int b(int[] arr, int i,int num) {

		if(num==i) {
			return 0;
		}
		if(arr[num]<0)
		return 1+b(arr,i,num+1);
		
		else
			return 0+b(arr,i,num+1);
	}

/*16*/
	
	public static int c(int[] arr, int i,int num) {
		if(arr.length==num) {
			return-1;
		}

		if(i==arr[num]) {
			return num;
		}
	
		return 0+ c(arr,i,num+1);

	}
	
	/*17*/
	public static boolean d(int[] arr, int i) {
		if(i==arr.length-1) {
			return true;
		}

		if(arr[i]>arr[i+1]) {
			return false;
		}
		return d(arr,i+1);

	}
	
	/*18*/

	    public static boolean e1(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static boolean e(int[] arr, int index) {
	        if (index >= arr.length) {
	            return true;
	        }
	        
	        if (e1(arr[index])) {
	            return false;
	        }
	        
	        return e(arr, index + 1);
	    }
	    
	    /*19*/
	    public static int f(int [][]arr,int num,int i) {
	    	if(i<0) {
	    		return 0;
	    	}
	    	for(int k=0;k<arr[i].length;k++) {
	    		if(arr[i][k]==num) {
	    			return 1+f(arr,num,i-1);
	    		}
	    	}
	    	return 0+f(arr,num,i-1);
	    	}

	/*20*/
	    public static boolean isPalindrome(int[] arr, int start, int end) {
	        if (start >= end) {
	            return true;
	        }
	        if (arr[start] != arr[end]) {
	            return false;
	        }
	        return isPalindrome(arr, start + 1, end - 1);
	    }
	
	public static void main(String[] args) {
		int [] a= {1,2,1,4,2,2,4,5,6,5};
		int [][] b = {{1,2,3},{4,5,0},{7,8,9}};
		System.out.println(a(a,3,0));
		System.out.println(b(a,3,0));
		System.out.println(c(a,3,0));
		System.out.println(d(a,0));
		System.out.println(e(a,0));
		System.out.println(f(b,3,2));
        Random random = new Random();

		int s=random.nextInt(a.length);
		int e=random.nextInt(a.length);
        if (s > e) {
            int temp = s;
            s = e;
            e = temp;
        }

		System.out.println(isPalindrome(a,s,e));



	}
}
