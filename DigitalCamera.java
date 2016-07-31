package ObjectManipulation;
public class DigitalCamera extends ElectronicEquipment {
	
	private int zoom;
	
	public DigitalCamera (double weight, double cost, double usage, 
			String mName, int zoom){
			
			super(weight,cost,usage,mName);
			setZoom(zoom);
	}
	
	public int getZoom(){
		return zoom;
	}
	
	
	public void setZoom(int zoom){
		this.zoom = zoom;
	}

	public String toString(){
		return "Zoom is : " + zoom + " times\n" + super.toString();
	}
}
