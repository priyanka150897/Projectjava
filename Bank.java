package atmiInterfaceproject;

public class Bank 
{
	int amount=1000;
	public void initiate()
	{
		User u=new User();
		try
		{
			u.acceptInput();
			u.verify();
			
		}catch(Exception e)
		{
	try
	{
		u.acceptInput();
		u.verify();
		
	}catch(Exception f)
	{
		
	}
}




}
public int getBalance()
{
	return amount;
}
public void add(int amt)
{
	amount=amount+amt;
	System.out.println("Amount deposited successfully");
	System.out.println("****************************");
	System.out.println("Total Balance:"+amount);
	System.out.println("******************************");
}
public void withdrawl(int amt)
{
	System.out.println("********************");
	if(amount<amt)
	{
		InvalidBankTransaction invalidwithdrawl=new InvalidBankTransaction("Invalid withdrawl amount");
		System.out.println(invalidwithdrawl.getMessage());
		
	}
	else
	{
		amount=(amount-amt);
		System.out.println("Please collect your "+amt+"RS");
		System.out.println("*****************************");
		System.out.println("Total Balance :"+amount);
		System.out.println("**************************");
	}
}
}
