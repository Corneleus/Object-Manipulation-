package ObjectManipulation;
public class CellPhone extends ElectronicEquipment
{
	private String service;
	
	public CellPhone (double weight, double cost, double usage, 
			String mName, String service){
			
			super(weight,cost,usage,mName);
			setService(service);
	}
	
	public String getService(){
		return service;
	}
			
	public void setService(String service){
		this.service = service;
	}
		
	public String toString(String service){
		return "Service provided by: " + service + super.toString();
	}
			
}
