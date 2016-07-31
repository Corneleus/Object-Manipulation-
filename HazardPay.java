package ObjectManipulation;
public class HazardPay extends PayCalculator {
	
	public static double computePay(double payRate, int numHours){
		return payRate * numHours * 1.5;		
	}
}
