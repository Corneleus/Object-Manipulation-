package ObjectManipulation;

public abstract class PayCalculator {

	private double payRate;
	private int numHours;
	
	
	public static double computePay(double payRate, int numHours){
		return payRate * numHours;		
	}

	public double getPayRate(){
		return payRate;
	}

	public int getNumHours(){
		return numHours;
	}

	public void setPayRate(double payRate){
		this.payRate = payRate;
	}

	public void setNumHours(int numHours){
		this.numHours = numHours;
	}
}
