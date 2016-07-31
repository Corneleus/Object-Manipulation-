package ObjectManipulation;

public class Courses{

	// class title description and department
	// class number
	private String title, desc, dep;
	private int num;
	
	public Courses(String title, String desc, String dep, int num){
		
		setTitle(title);
		setDesc(desc);
		setDep(dep);
		setNum(num);
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String setDep(){
		return dep;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	public void setDep(String dep){
		this.dep = dep;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Course Title: " + title + "\n" +"Department: " + dep + "\n");
		sb.append("Discription " + desc);
		sb.append("\n" + "Course Num: " + num + "\n");
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
}
