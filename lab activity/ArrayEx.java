public class ArrayEx 
{
public static void oddEven()
	
	 {
		

		int a[]={1,2,5,6,3,2};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2!=0)
		{  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2==0)
		{  
		System.out.println(a[i]);  
		}  
		} 
	 }
		 public static int removeduplicates(int a[], int n)
		    {
			 
		      if (n == 0 || n == 1)
		      {
	            return n;
	          }
	  
	        int[] temp = new int[n];
	        int j = 0;
	  
	        for (int i = 0; i < n - 1; i++)
	        {
	            if (a[i] != a[i + 1]) 
	            {
	                temp[j++] = a[i];
	            }
	        }
	  
	        temp[j++] = a[n - 1];
	  
	        
	        for (int i = 0; i < j; i++)
	        {
	            a[i] = temp[i];
	        }
	  
	        return j;
	    }
	    public static void main(String[] args)
	    {
	        int a[] = { 1, 1, 2, 2, 2 };
	        int n = a.length;
	  
	        n = removeduplicates(a, n);
	  
	           for (int i = 0; i < n; i++)
	            System.out.println(a[i] + " ");
	           
	           
	           ArrayEx.oddEven();
	    }
	
	}