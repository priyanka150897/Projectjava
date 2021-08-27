package atmiInterfaceproject;

import java.util.Scanner;

public class Menu 
{
	int selectedOption;
	Bank b=new Bank();
	
	public void showMenu()
	{
		System.out.println("**********************");
		System.out.println("Please selection a option from below");
		System.out.println("Press 1 to Deposit Amount");
		System.out.println("Press 2 to withdrawl Amount");
		System.out.println("Press 3 to View Balance");
		System.out.println("Press any key to exit");
		System.out.println("************************");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press any key :");
		selectedOption=sc.nextInt();
		
		switch(selectedOption)
		{
		case 1 :
			System.out.println("****TRANSACTION****");
			System.out.println();
			Transaction t=new Transaction();
			int tramt=t.userInput();
			b.add(tramt);
			System.out.println();
			showMenu();
			break;
			
		case 2:
			System.out.println("*****WITHDRAWL*****");
			System.out.println();
			System.out.println("Enter amount to withdrawl :");
			int withamt=sc.nextInt();
			b.withdrawl(withamt);
			System.out.println();
		
			showMenu();
			break;
			
		case 3:
			System.out.println("****TOTAL BALANCE****");
			System.out.println();
			System.out.println("Account Balance is :"+b.getBalance()+"RS");
			System.out.println();
			System.out.println("**********************");
			showMenu();
			break;
			
		case 4:
			System.out.println("Thnk u Your Transaction is Done");
			System.out.println();
			System.exit(0);
			break;
			
		
		}
	}

}
