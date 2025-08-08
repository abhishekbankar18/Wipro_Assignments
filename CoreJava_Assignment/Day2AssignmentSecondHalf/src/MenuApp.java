// Assignment 3 : Java OOP-Based Menu-Driven Math App

import java.util.Scanner;

public class MenuApp 
{
	public static void main(String[] args) 
	{
		MathOperations mobj = new MathOperations();
		
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
					
					mobj.printTable(iNum);
					break;
				
				case 2:
					System.out.println("Enter number to find factorial");
					int iFact = sobj.nextInt();
					
					int iRet = mobj.calculateFactorial(iFact);
					
					System.out.println("Factorial of "+iFact+" is "+iRet);
					break;
					
				case 3:
					System.out.println("Enter number that you want to check where it is prime or not");
					int iPrime = sobj.nextInt();
					
					boolean bRet = mobj.checkPrime(iPrime);
					
					if(bRet == true)
					{
						System.out.println("It is prime number");
					}
					else
					{
						System.out.println("It is not prime number");
					}
					break;
					
				case 4:
					System.out.println("Enter number to print fibonacci");
					
			        int terms = sobj.nextInt();
			        
			        mobj.printFibonacci(terms);
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
