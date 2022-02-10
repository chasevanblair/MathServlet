/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Feb 9, 2022
 */
package model;

public class AddUp {
	//default to 0 if number is left blank
	private int num1 = 0, num2 = 0, num3 = 0, total = 0;
	private double base = 0, power = 0, expTotal = 0;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getPower() {
		return power;
	}
	public double getExpTotal() {
		return expTotal;
	}
	public void setExpTotal(double expTotal) {
		this.expTotal = expTotal;
	}
	public void setPower(double power) {
		this.power = power;
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
	public int getTotal() {
		return total;
	}
	public AddUp() {
		super();
	}
	public AddUp(String base, String power) {
		//overloaded for the exponent page
		if(!base.isEmpty())
			this.base = Double.parseDouble(base);
		if(!power.isEmpty())
			this.power = Double.parseDouble(power);
		calcPower();
	}
	public AddUp(String num1, String num2, String num3) {
		//overloaded for addition page
		if(!num1.isEmpty())
			this.num1 = Integer.parseInt(num1);
		
		if(!num2.isEmpty())
			this.num2 = Integer.parseInt(num2);
		
		if(!num3.isEmpty())
			this.num3 = Integer.parseInt(num3);
		setTotal();
	}
	
	
	private void setTotal() {
		//for addition
		total = num1 + num2 + num3;
	}
	private void calcPower() {
		expTotal = Math.pow(base, power);
	}
}
