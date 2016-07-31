package ObjectManipulation;

public class Mth174  extends Courses{

	private String preReq; 
	private String reqCalc;
	
	public Mth174(String title, String desc,
			String dep, int num, String preReq, String reqCalc){
		
		super(title, desc, dep, num);
		setPreReq(preReq);
		setReqCalc(reqCalc);
		
	}
	
	public String getPreReq(){
		return preReq;
	}
	
	public String getReqCalc(){
		return reqCalc;
	}
	
	public void setPreReq(String preReq){
		this.preReq = preReq;
		
	}
	
	public void setReqCalc(String reqCalc){
		this.reqCalc = reqCalc;
	}
	
	public String toString() {
		return super.toString() +"Pre-Req Mth 173: " + preReq + "\n" + 
	"Required Calc: " + reqCalc;
	}
		
}
