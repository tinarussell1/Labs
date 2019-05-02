package loanProcessor;

public class Customer {
	private String custID;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private double salary;
	private double interestRate;
	private double amount;
	private int duration;

	public Customer() {
	}
	
	public Customer(String custID, String firstName, String lastName, int age, 
		String email, double salary, double interestRate, double amount, int duration )  {
		this.custID = custID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.salary = salary;
		this.interestRate = interestRate;
		this.amount = amount;
		this.duration = duration;
	}
	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Customer:" + custID + " " + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", salary=" + salary + ", interestRate=" + interestRate + ", amount=" + amount + duration +"]";
	}
	
}
