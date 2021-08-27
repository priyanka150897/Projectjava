package atmiInterfaceproject;

public class InvalidBankTransaction 
{
	String errorMessage;
	public InvalidBankTransaction(String message)
	{
		errorMessage=message;
	}
	public String getMessage()
	{
		return errorMessage;
	}

}
