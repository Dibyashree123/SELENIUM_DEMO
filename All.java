package opps;

class Rbi {

	/* Rbi Loan Criteria for Bank Employee */
	int homeloan(int principal) {
		int rate_of_interset = 11;
		int tenure = 5;
		int total_interest = principal * rate_of_interset * tenure / 100;
		System.out.println("Rbi Home Loan for employer is.." + total_interest);
		return total_interest;
	}

	/* Rbi Loan for non-employer */
	double homeloan(int principal, int rate_of_interest) {
		int tenure = 3;
		int total_interest = principal * rate_of_interest * tenure / 100;
		System.out.println("Rbi Home Loan for no-employer is.." + total_interest);
		return total_interest;
	}

	Rbi() {
		System.out.println("Welcome to Rbi Home Loan..");
	}
	
}

class Sbi extends Rbi {

	Sbi() {
		System.out.println("Welcome to Sbi Home Loan..");
	}

	/* Rbi Loan Criteria for Bank Employee */
	int homeloan(int principal) {
		int rate_of_interset = 11;
		int tenure = 5;
		int total_interest = principal * rate_of_interset * tenure / 100;
		int new_sbi_interest = total_interest - 2000;
		System.out.println("Sbi Home Loan for employer is.." + new_sbi_interest);
		return total_interest;
	}
}

public class All {
	public static void main(String[] args) {
		Rbi rbi = new Rbi();
		rbi.homeloan(100000);
		rbi.homeloan(110000, 25);
		System.out.println("*********************************");
		Sbi i = new Sbi();
		i.homeloan(200000);
	}

}
