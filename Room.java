package ObjectManipulation;

public class Room
{	
	
	private int windows;
	private String floorType;
	private String wallColor;
	
	
	public Room()
	{
		windows = 3;
		floorType = "Hardwood";
		wallColor = "Blurpleberry";
	}
	
	public Room( int windows, String floorType , String wallColor)
	{
		this.windows = windows;
		this.floorType = floorType;
		this.wallColor = wallColor;
	}
		
		
	public int getWindows()
	{
		return windows;
	}
	
	public String getFloorType()
	{
		return floorType;
	}
	
	public String getWallColor()
	{
		return wallColor;
	}
	
	
	public void setWindows(int windows)
	{
		 this.windows = windows;
	}
	
	public void setFloorType(String floorType)
	{
		 this.floorType = floorType;
	}
	
	
	public void setWallColor(String wallColor)
	{
		this.wallColor = wallColor;
	}
	
}
