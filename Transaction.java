package atmiInterfaceproject;

import java.util.Scanner;

public class Transaction 
{
	int amt=0;
	
	public int userInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited :");
		amt=sc.nextInt();
		
		if(amt<=0)
		{
			InvalidBankTransaction depositnegativeError=new InvalidBankTransaction("Invalid Deposit amount");
			System.out.println(depositnegativeError.getMessage());
			userInput();
		}
		else
		{
			return amt;
		}
		return amt;
		
	}

}
