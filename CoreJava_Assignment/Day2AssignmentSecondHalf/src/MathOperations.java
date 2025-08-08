import java.util.Scanner;

public class MathOperations 
{
	Scanner sobj = new Scanner(System.in);
	
	void printTable(int number)
	{
		System.out.println("table of "+number+" is :");
		for(int i=1;i<=10;i++)
		{
			System.out.println(number +"*" +i +"=" +number*i);
		}
	}
	
	int calculateFactorial(int number)
	{
		int iAns = 1;
		
		for(int i = number; i>=1;i--)
		{
			iAns = iAns * i;
		}
		
//		System.out.println("Factorial of "+number+" is "+iAns);
		return iAns;
	}
	
	boolean checkPrime(int number)
	{
		boolean bRet = false;
		int iCount = 0;
		
		for(int i = 2; i < number;i++)
		{
			if(number%i==0)
			{
				iCount++;
			}
			
			
			if(iCount > 0)
			{
				bRet = false;
				break;
			}
		}
		if(iCount == 0)
		{
			bRet = true;
		}
		
		return bRet;
	}
	
	void printFibonacci(int terms)
	{
        
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
	}
}
