/* 
 * QA training Assignment
 * Name:Bikash Shrestha
 * Date:8/13/2021
 *
 * */
package test;
public class Account {	
	 
	public static void welcomeMessage()  //Header: non returnable void type method
	 {		 
			System.out.println(" \t Welcome to Bank of America");	// Body of the method.
	 }
	public static void line()  	// non returnable void type method
	 {		 
			System.out.println(" *******************************");	
	 }		
	public static String name()			// returns String type name.
	{
		String name="Bikash Shrestha";		// local String variable
		System.out.println("Name:"+name);
		return name;		
	}
	public static int accountNumber()		// returns account number.
	{
		int accountNumber=123456789;
		System.out.println("Your Account Number is:"+accountNumber);
		return accountNumber;		
	} 
	public static double currentBalance() 		// returns balance
	{		
		double balance = 1000.00;
		System.out.println("Your Total balance:" + balance);
		return  balance;		
	}
	public static double interestEarned()		// return interest earned
	{
		double interest =30.00;
		System.out.println("Interest earned :"+interest);
		return interest;
	}
	public static double totalBalance()			//Returns Total balance
	{
		double sum;
		double balance=1000.00;
		double interest=30.00;
		sum =  balance + interest;
		System.out.println("Your total balance is :"+sum);
		return sum;	
	}
	public static void endaline()  // non returnable void type method
	 {		 
			System.out.println(" *********************************");	
	 }
	public static boolean isNew() 
	 {		 
			System.out.println("Is he a New Customer??:True");
			return true;	
	 }
	public static void end()  // non returnable void type method
	 {		 
			System.out.println("Thank you for Visting BOA !!!!");	
	 }
	
	public static void endline()  // non returnable void type method
	 {		 
			System.out.println("*********************************");	
	 }
		
	public static void main(String[] args) // this is also a method ,a main one,called automatically.
	{
		System.out.println("Creating return and Non-return Methods type");
		welcomeMessage();  // Methods only executes by method call statement.
		line();
		name();
		accountNumber();
		currentBalance();
		interestEarned();
		totalBalance();
		isNew();
		end();
		endline();		
	}	
}



