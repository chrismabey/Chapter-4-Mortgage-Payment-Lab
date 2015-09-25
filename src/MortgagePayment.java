/*Chris Mabey
 *Mr. Kiedes
 *Chapter 4 Lab
 *25 September 2015 */

import java.text.DecimalFormat;

public class MortgagePayment {
	
		public static void main(String[] args)
		{
			System.out.println("Lab04a, Student Version\n");
			DecimalFormat decimal = new DecimalFormat("0.00");
			double principal  = 250000;
			double annualRate = 4.85;
			double monthlyRate = 4.85/1200;
			double numYears   = 30;
			double numMonths = 12*numYears;
			double monthlyPayment = ((monthlyRate * (Math.pow((1 + monthlyRate),numMonths)))/((Math.pow((1 + monthlyRate),numMonths)-1)))*principal;
			double totalPayments = monthlyPayment * numMonths;
			double totalInterest = totalPayments - principal;

			System.out.println("Principal:" + decimal.format(principal));
			System.out.println("Annual Rate:" + annualRate+"%");
			System.out.println("Number of Years:" + numYears);
			System.out.println("Monthly Payment:" + decimal.format(monthlyPayment ));
			System.out.println("Total Payments:" + decimal.format(totalPayments));
			System.out.println("Total Interest:" + decimal.format(totalInterest));
		}

}

