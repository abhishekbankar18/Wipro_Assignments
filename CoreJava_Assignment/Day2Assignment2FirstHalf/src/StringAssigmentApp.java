// Assignment 2 : java String Operations

import java.util.Scanner;

class StringUtlity
{
	int countVowels(String str)
	{
		int iVowels = 0;
		
		str = str.toLowerCase();
		
		for(int i=0;i < str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				iVowels++;
			}
		}
		
		return iVowels;
	}
	
	int countConsonants(String str)
	{
		int iConsonants = 0;
		
		str = str.toLowerCase();
		
		for(int i=0;i < str.length();i++)
		{
			if((str.charAt(i)>='a'&&str.charAt(i) <='z' ) && (str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u'))
			{
				iConsonants++;
			}
		}
		
		return iConsonants;
	}
	
	boolean isPalindrome(String str)
	{
		boolean bRet = false;
		
		String str1 = str;
		
		char[] cArr = str.toCharArray(); 
		
		int iStart = 0;
		int iEnd = cArr.length-1;
		
		for(int i=0;i<=cArr.length/2; i++)
		{
			char cTemp = cArr[iStart];
			cArr[iStart] = cArr[iEnd];
			cArr[iEnd] = cTemp;
			
			iStart++;
			iEnd--;
		}
		
		String strNew =  new String(cArr);
		
//		System.out.println(strNew);
		
		if(str.equals(strNew))
		{
			bRet = true;
		}
	
		return bRet;
	}
	
	String reverseString(String str)
	{
		
		StringBuilder sRev = new StringBuilder(str);
		
        String sRev1 =  sRev.reverse().toString();
        
		return sRev1;
	}
	
	String toUpperCase(String str)
	{
		
		str = str.toUpperCase();
		
		return str;
	}
	
	String toLowerCase(String str)
	{
		str = str.toLowerCase();
		
		return str;
	}
	
	String replaceWord(String str, String oldWord, String newWord)
	{
		String sReplace = "";
		
		String arr[] = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i].equals(oldWord)) 
			{
				sb.append(newWord).append(" ");
			}
			else {
				sb.append(arr[i]).append(" ");
			}
		}
		
		sReplace = sb.toString();

		return sReplace;
	}
	
}

public class StringAssigmentApp 
{
	public static void main(String[] args) 
	{
		StringUtlity obj = new StringUtlity();
		
		Scanner sobj = new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.println("********MENU*********");
			System.out.println("1. countVowels");
			System.out.println("2. countConsonants");
			System.out.println("3. isPalindrome");
			System.out.println("4. reverseString");
			System.out.println("5. toUpperCase");
			System.out.println("6. toLowerCase");
			System.out.println("7. replaceWord");
			System.out.println("8. Exit");
			System.out.println("*****************");
			
			System.out.println("Enter your choice");
			int iChoice = sobj.nextInt();
			
			sobj.nextLine();
			switch(iChoice)
			{
				case 1:
					System.out.println("Enter string to count vowels");
					String str1 = sobj.next();
					
					int iRet1 = obj.countVowels(str1);
					
					System.out.println(iRet1+" Vowels are present in string");
					break;
				
				case 2:
					System.out.println("Enter string to count Consonants");
					String str2 = sobj.next();
					
					int iRet2 = obj.countConsonants(str2);
					
					System.out.println(iRet2+" Consonants are present in string");
					break;
					
				case 3:
					System.out.println("Enter string to check pallindrome");
					String str3 = sobj.next();
					
					boolean bRet3 = obj.isPalindrome(str3);
					
					if(bRet3 == true)
					{
						System.out.println("String is Pallindrome");
					}
					else
					{
						System.out.println("String is not pallindrome");
					}
					break;
					
				case 4:
					System.out.println("Enter string to reverse");
					String str4 = sobj.next();
					
					String sRet4 = obj.reverseString(str4);
					
					System.out.println("String after reverse is : "+sRet4);
                    break;
                    
				case 5:
					System.out.println("Enter string to make upperCase");
					String str5 = sobj.next();
					
					String sRet5 = obj.toUpperCase(str5);
					
					System.out.println("String after upperCase is : "+sRet5);
					break;
				
				case 6:
					System.out.println("Enter string to make lowerCase");
					String str6 = sobj.next();
					
					String sRet6 = obj.toLowerCase(str6);
					
					System.out.println("String after lowerCase is : "+sRet6);
					break;
				
				case 7:
					System.out.println("Enter string ");
					String str7 = sobj.nextLine();
					
					System.out.println("Enter Old Word");
					String str8 = sobj.nextLine();
					
					System.out.println("Enter New Word");
					String str9 = sobj.nextLine();
					
					String str10 = obj.replaceWord(str7, str8, str9);
					
					System.out.println("New string is : "+str10);
					break;
					
				case 8:
					System.out.println("Exiting");
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
			
			
		}while(ch == 'Y' || ch== 'y');
	}
}
