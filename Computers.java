package ObjectManipulation;
public class Computers extends ElectronicEquipment{

	private String companyName;
	private String OpSystem;
	
	public Computers(double weight, double cost, 
			double usage, String mName, String OpSystem, String companyName){
	
		super(weight, cost, usage, mName);
		setCompanyName(companyName);
		setOpSystem(OpSystem);
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public String getOpSystem(){
		return OpSystem;
	}
	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	
	public void setOpSystem(String OpSystem){
		this.OpSystem = OpSystem;
	}

	public String toString(){
		return "Operating System: " + OpSystem + "\n" + super.toString();
	}


}


