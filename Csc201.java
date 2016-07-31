package ObjectManipulation;

public class Csc201 extends Courses {

	private boolean usesBb;
	private double labFees;
	
	public Csc201(String title, String desc, String dep, int num, boolean usesBb, 
			double labFees){
		
		super(title, desc, dep, num);
		setUsesBb(usesBb);
		setLabFees(labFees);
		
	}
	
	public boolean getUsesBb(){
		return usesBb;
	}
	
	public double getLabFees(){
		return labFees;
	}
	
	public void setUsesBb(boolean usesBb){
		this.usesBb = usesBb;
		
	}
	
	public void setLabFees(double labFees){
		this.labFees = labFees;
	}
	
	public String toString() {
		return super.toString() +"Uses Black Board: " + usesBb + "\n" + 
	"Lab Fees: " + labFees	+"$";
	}
	
	
	
}
