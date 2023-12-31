package SubarraySum;
import java.util.*;
public class SubarraySum {

	 public static long SSum(int arr[], int n)
	 {
		 long result = 0, sum = 0;
	     int[] a = new int[n]; 
	     a[0] = arr[0];	        
	     for (int i = 1; i < n; i++)
	     {
	    	 a[i]=a[i - 1] + arr[i];
	     }
	     for (int i = 0; i < n; i++) 
	     {
	    	 sum = 0;
	    	 for (int j = i; j < n; j++)
	    	 {
	    		 if (i != 0)
	    		 {
	    			 sum = a[j]-a[i - 1];
	                }
	                else
	                    sum = a[j];
	                result += sum;
	            }
	        }
	        return result;
	    }
	    
	    
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        
	        System.out.println( SSum(arr, n));
	    }
	}
