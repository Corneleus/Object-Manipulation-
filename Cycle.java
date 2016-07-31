package ObjectManipulation;

public class Cycle 
{
	private double numberOfWheels;
	private double weight;
	
	public String toString()
	{
		return (numberOfWheels + " and " + weight);
	}
	
	public Cycle(int numberOfWheels , int weight)
	{
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	public Cycle()
	{
		this.numberOfWheels = 100;
		this.weight = 1000;
		
	}
	
	public void setWeight(double d) {
		weight = d;
	}
	
	public void setNumberOfWheels(double d) {
		numberOfWheels = d;
	}
	
}
