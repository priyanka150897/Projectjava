package atmiInterfaceproject;
import java.lang.Exception;

import java.util.Scanner;

public class User 
{
	int userid=1234;
	int pinno=9999;
	int ui;
	int pn;
	
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user id:");
		ui=sc.nextInt();
		System.out.println("Enter the pin no:");
		pn=sc.nextInt();
	}
	public void verify() throws Exception
	{
		if(ui==userid && pn==pinno)
		{
			System.out.println("Login successful");
			Bank b=new Bank();
			System.out.println("**********YOUR BALANCE***********");
			System.out.println("Your Balance is:"+b.getBalance()+"RS");
			System.out.println("***********************");
			Menu m=new Menu();
			m.showMenu();
			
		}
		else
		{
			InvalidBankTransaction loginfailed=new InvalidBankTransaction("Incorrect login details");
			System.out.println(loginfailed.getMessage());
			
		}
	}

}
