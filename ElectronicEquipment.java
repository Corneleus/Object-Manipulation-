package ObjectManipulation;

public class ElectronicEquipment 
{
	private double weight, cost , usage;
	private String mName;
	
	public ElectronicEquipment(double weight, double cost, double usage, 
			String mName){
				setWeight(weight);
				setCost(cost);
				setUsage(usage);
				setmName(mName);
		
			}
	
	public double getWeight(){
		return weight;
	}
	
	public double getCost(){
		return cost;
	}
	
	public double getUsage(){
		return usage;
	}
	
	public String getmName(){
		return mName;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}

	public void setCost(double cost){
		this.cost = cost;
	}
	
	public void setUsage(double usage){
		this.usage = usage;
	}
	
	public void setmName(String mName){
		this.mName = mName;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Weight: " + weight + "lbs");
		sb.append("\n" + "Cost: " + cost + "$" + "\n" + "Usage in watts: "+ usage);
		sb.append("\nManufacturer Name: "+ mName +"\n");
		return sb.toString();
	}
	
}
