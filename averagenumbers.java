package interestcalculator;

public class averagenumbers 
{
	int num1,num2,num3,num4,num5;

public averagenumbers()
{
	this.num1 = num1;
	this.num2 = num2;
	this.num3 = num3;
	this.num4 = num4;
	this.num5 = num5;
}

public int getNum1() {
	return num1;
}

public void setNum1(int num1) {
	this.num1 = num1;
}

public int getNum2() {
	return num2;
}

public void setNum2(int num2) {
	this.num2 = num2;
}

public int getNum3() {
	return num3;
}

public void setNum3(int num3) {
	this.num3 = num3;
}

public int getNum4() {
	return num4;
}

public void setNum4(int num4) {
	this.num4 = num4;
}

public int getNum5() {
	return num5;
}

public void setNum5(int num5) {
	this.num5 = num5;
}

public double average()
{
	double average;
	average = (num1+num2+num3+num4+num5)/5;
	System.out.println("the average of 5 numbers is "+average);
	return average;
}
}
