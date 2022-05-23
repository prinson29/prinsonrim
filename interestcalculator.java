package interestcalculator;

public class interestcalculator {

	public static void main(String[] args) 
	{
		System.out.println("Simple Interest");
		simpleinterest s = new simpleinterest();
		s.setPrincipalamt(100);
		s.setRateofinterest(20);
		s.setYears(10);
		System.out.println("principal amount - "+s.getPrincipalamt() );
		System.out.println("rate of interest - "+s.getRateofinterest() );
		System.out.println("number of years - "+s.getYears() );
		s.SI();
		
		System.out.println("***************************************************************");
		
		System.out.println("Compound Interest");
		compoundinterest c = new compoundinterest();
		c.setPrincipal(100);
		c.setNumberofinterestcompounded(10);
		c.setInterestrate(20);
		c.setTime(10);
		System.out.println("principal - "+c.getPrincipal() );
		System.out.println("number of times interest compounded - "+c.getNumberofinterestcompounded() );
		System.out.println("rate of interest - "+c.getInterestrate() );
		System.out.println("time(in years) - "+c.getTime() );
		c.CI();
		
		System.out.println("***************************************************************");
		
		System.out.println("Average Of 5 Numbers");
		averagenumbers a = new averagenumbers();
		a.setNum1(10);
		a.setNum2(20);
		a.setNum3(30);
		a.setNum4(40);
		a.setNum5(50);
		System.out.println("number 1 -  "+a.getNum1());
		System.out.println("number 2 -  "+a.getNum2());
		System.out.println("number 3 -  "+a.getNum3());
		System.out.println("number 4 -  "+a.getNum4());
		System.out.println("number 5 -  "+a.getNum5());
		a.average();
	}
}
