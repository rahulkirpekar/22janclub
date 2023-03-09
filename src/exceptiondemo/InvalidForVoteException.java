package exceptiondemo;

public class InvalidForVoteException extends RuntimeException
{
	public InvalidForVoteException(String errorMsg) 
	{
		super(errorMsg);
	}
}
