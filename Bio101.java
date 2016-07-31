package ObjectManipulation;
public class Bio101 extends Courses {

	private int labRoom;
	
	public Bio101(String title, String desc,
			String dep, int num, int labRoom){
		
		super(title, desc, dep, num);
		setLabRoom(labRoom);
		
	}
	
	public int getLabRoom(){
		return labRoom;
	}
	
	public void setLabRoom(int labRoom){
		this.labRoom = labRoom;
						
	}
	
	public String toString() {
		return super.toString() + "Lab Room Number: " + labRoom + "\n" ;
	
	}
}