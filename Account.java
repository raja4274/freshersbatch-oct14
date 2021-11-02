import java.util.Scanner;
public class Account
{
	public static void main(String[] args)
{
	long id;
	double balance;
	double withdraw;
	double deposit;
	double amount;
	Account SavingAccount=new Account();
	id=2134L;
	balance=0d;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter amount deposit");
	deposit=sc.nextDouble();
	balance+=deposit;
	
	System.out.println("enter amount to withdraw");
	withdraw=sc.nextDouble();
	try {
		
		if (balance==0.00||balance<withdraw)
			throw new InsufficientBalanceException();
}
catch (InsufficientBalanceException e)
{
System.out.println("InsufficientBalance");
}
	
try {
		
		if (withdraw<0)
			throw new IllegalBankTransactionException();
}
catch (IllegalBankTransactionException e)
{
System.out.println("IllegalBankTransaction");
}
amount=balance-withdraw;
if (balance>withdraw&&withdraw>0)
System.out.println("withdrawn successfull\nBalance is:"+amount);
}

	
}
	