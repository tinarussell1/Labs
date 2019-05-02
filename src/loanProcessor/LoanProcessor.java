package loanProcessor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class LoanProcessor {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		
		Customer customer = new Customer();
		System.out.println("Please enter the first name for this person: ");
		String name = input.next();
		customer.setFirstName(name);
		char ltr1 = name.charAt(0);
		int min = 10;
		int max = 99;
		Random rn = new Random();
		int randomNumber = rn.nextInt(max - min);
		//String id = ltr1 + Integer.toString(randomNumber);
		customer.setCustID(ltr1 + Integer.toString(randomNumber));
		
		customer.setLastName("Russell");
		
		customer.setEmail("tomorrow265@hotmail.com");
		
		System.out.println("Please enter an age for this person: ");
		int ag = input.nextInt();
		customer.setAge(ag);
		
		System.out.println("Please enter a salary for this person: ");
		double sal = input.nextDouble();
		customer.setSalary(sal);
		
		System.out.println("Please enter the amount of the loan: ");
		double amt = input.nextDouble();
		customer.setAmount(amt);
		
		System.out.println("Please enter the interest for the loan: ");
		customer.setInterestRate(input.nextDouble());
		
		System.out.println("Please enter the number of years for the loan: ");
		customer.setDuration(input.nextInt());


		boolean approved = verifyLoan(customer);
		
		if (approved) {
			calcMonthlyPayment(customer);
		}
		
		input.close();
		
	}
	
	public static boolean verifyLoan(Customer customer) {
		boolean approved =false;
		if (customer.getAmount() > (3 * customer.getSalary())) {
			System.out.println("**Loan Denied due to more than 3 time salary.");
		}else 
		
		if (customer.getAmount() >= 60000.00) {
			System.out.println("**Loan Denied due to more than $60,000.");
		} else
		
		if (customer.getAge() < 18) {
			System.out.println("**Loan Denied due to person too young.");
		} else {
			approved = true;
			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now)); //2016/11/16 12:08:43
		
			System.out.println("**Congratulations, your loan is approved for " +customer.getFirstName() 
				+ " " + customer.getLastName() + ", customer ID: "	+ customer.getCustID() 
				+ " for loan amount of $" + customer.getAmount() + " on date " + dtf.format(now) + "." ) ;
		}
		return approved;
	}
	
	public static void calcMonthlyPayment(Customer customer) {
		
	    // The length of the term in months 
	    // is the number of years times 12
		int termInMonths = customer.getDuration() * 12;
		
	    // Convert interest rate into a decimal
	    // eg. 6.5% = 0.065

	     double monthlyInterestRate = (customer.getInterestRate()*.01)/12.0;
		
		double payment = (monthlyInterestRate * (customer.getAmount()/termInMonths))
				+ (customer.getAmount()/termInMonths);
		
		System.out.println("a Non-amortirized Monthly Payment is: " + payment);

		

	}
}
