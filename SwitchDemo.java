import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		
		while(true)
		{
			
		System.out.print("Select the Operation to be performed:\r\n"
				+ "1) Add 2 no’s"+"\r\n"
				+ "2) Find average of 2 numbers\r\n"
				+ "3) Check even/odd\r\n"
				+ "4) Check positive or negative number\r\n"
				+ "5) check prime no or not\r\n"
				+ "6) Quit- use exit(0)\r\n"
				+ "\r\n ");
		Scanner sc= new Scanner(System.in);    
		int num=sc.nextInt();
		
		switch(num)
		{
			case 1: System.out.print("Enter first number- ");  
					int a= sc.nextInt();  
					System.out.print("Enter second number- ");  
					int b= sc.nextInt();   
					System.out.println(a+b);
			     
				 break;   
			case 2: System.out.print("Enter first number- ");  
					int c= sc.nextInt();  
					System.out.print("Enter second number- ");  
					int d= sc.nextInt();   
					System.out.println((c+d)/2);   
			     
				 break;
			case 3: System.out.print("Enter number- ");  
					int e= sc.nextInt();
					if(e%2==0)
						System.out.print("Even");
					else
						System.out.print("Odd");
				 break;   
			case 4: System.out.print("Enter number- ");  
					int f= sc.nextInt();
					if(f>0)  
					{  
						System.out.println("The number is positive.");  
					}  
					else if(f<0)  
					{  
						System.out.println("The number is negative.");  
					}    
					else  
					{  
						System.out.println("The number is zero.");  
					}     
				     
				 break; 
			case 5: System.out.print("Enter number- ");  
					int n= sc.nextInt();
					int m, i; int flag=0;
					m=n/2;      
			  		if(n==0||n==1)
			  			{  
			  			System.out.println(n+" is not prime number");      
			  			}
			  		else{  
			  			for(i=2;i<=m;i++)
			  			{      
			  				if(n%i==0)
			  				{      
			  					System.out.println(n+" is not prime number");      
			  					flag=1;      
			  					break;      
			  				}      
			  			}      
				   if(flag==0)  { System.out.println(n+" is prime number"); }  
			  			}    
			  		break;    
			case 6: System.exit(0);   
			default:  System.out.println("Enter Valid Option:");
		}
		}
		
	}
}
