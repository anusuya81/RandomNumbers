package Ran_Num;
import java.util.*;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int n,temp;
		       
		        Scanner input =new Scanner(System.in);
		        System.out.println("how many random number want to generate");
		        n=input.nextInt();
		        int arr[]=new int[n];
		        Random objGenerator = new Random();
		              for (int iCount = 0; iCount<n; iCount++)
		               {
		                int randomNumber = objGenerator.nextInt();
		            	arr[iCount]=randomNumber;		             
		                System.out.println( " Random No : " + arr[iCount]); 
		            
		             }
		             System.out.println("===========================");
		             System.out.println("asscending order");
		             for(int i=0;i<n;i++)
		             {
		            	for(int j=i+1;j<n;j++) 
		            	{
		            		if(arr[i]>arr[j])
		            		{
		            			temp=arr[i];
		            			arr[i]=arr[j];
		            			arr[j]=temp;
		            		}
		            	}
		            	System.out.println(arr[i]);
		             }
		             
		             boolean completed=false;
		             Scanner inp=new Scanner(System.in);
		          do
		          {
		        	  
			             System.out.println(" which nth smallest number you want to print");
			             int k=inp.nextInt();
		        	  if(k<n)
		        	  {
		             for(int i=0;i<n;i++)
		             {
		            	
		            	 if(i==k)
		            	 {
		            		 System.out.println(k+" "+arr[i]);
		            		 completed=true;
		            	 }
		            	 
		            	 
		             }
		        	  }
		          
		          else
		          {
		        	  System.out.println("please enter the position less than " + n);
		          }
				}
		          while(!completed);
		           
		             
		             
	}

}
