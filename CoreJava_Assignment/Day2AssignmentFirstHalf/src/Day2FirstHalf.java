// Menu driven Math Operations

import java.util.Scanner;

public class Day2FirstHalf 
{

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.println("********** MENU **********");
			System.out.println("1. Print Table of a Number");
			System.out.println("2. Calculate Factorial");
			System.out.println("3 .Check Prime Number");
			System.out.println("4. Print Fibonacci Series");
			System.out.println("5. Exit");
			System.out.println("*************************");
			
			System.out.println("Enter your choice");
			int iChoice = sobj.nextInt();
			
			
			switch(iChoice)
			{
				case 1:
					System.out.println("Enter number which you table");
					int iNum = sobj.nextInt();
					System.out.println("table of "+iNum+" is :");
					for(int i=1;i<=10;i++)
					{
						System.out.println(iNum +"*" +i +"=" +iNum*i);
					}
					break;
				
				case 2:
					System.out.println("Enter number to find factorial");
					int iFact = sobj.nextInt();
					
					int iAns = 1;
					
					for(int i = iFact; i>=1;i--)
					{
						iAns = iAns * i;
					}
					
					System.out.println("Factorial of "+iFact+" is "+iAns);
					break;
					
				case 3:
					System.out.println("Enter number that you want to check where it is prime or not");
					int iPrime = sobj.nextInt();
					
					int iCount = 0;
					
					for(int i = 2; i < iPrime;i++)
					{
						if(iPrime%i==0)
						{
							iCount++;
						}
						
						
						if(iCount > 0)
						{
							System.out.println(iPrime +" is not prime number");
							break;
						}
					}
					if(iCount == 0)
					{
						System.out.println(iPrime +" is prime number");
					}
					break;
					
				case 4:
					System.out.println("Enter number to print fibonacci");
					
                    int terms = sobj.nextInt();
                    
                    int first = 0, second = 1;
                    
                    System.out.print("Fibonacci Series: " + first + " " + second);
                    
                    for (int i = 3; i <= terms; i++) 
                    {
                        int third = first + second;
                        System.out.print(" " + third);
                        first = second;
                        second = third;
                    }
                    System.out.println();
                    break;
                    
				case 5:
					System.out.println("Exiting program");
					return;
					
				default:
					System.out.println("Enter valid choice");
					break;
					
			}
			
			System.out.println("Back to Menu? (Y/N)");
			ch = sobj.next().charAt(0);
			
			if(ch=='n'||ch=='N')
			{
				System.out.println("Your program is terminated");
				break;
			}
			
		}while(ch == 'Y' || ch=='y');
		
		
	}

	

}
