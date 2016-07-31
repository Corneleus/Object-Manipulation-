package ObjectManipulation;

public class ElectronicEquipmentTest {

	public static void main(String [] args){
		
		Computers comp = new Computers(25.64, 1500.33, 750.00, "Asus", "Windows 7", null);
		
		Pager  pag = new Pager(.4, 49.99, 7.00, "Cool Beepers");
		
		DigitalCamera cam = new DigitalCamera(5.00, 1500.00, 6.2, "Nikon", 18);
		
		CellPhone cell = new CellPhone(2.4, 543.23, 4.3, "Motorola", "Verison");
	
		System.out.println(comp.toString() + "\n");
		System.out.println(pag.toString() + "\n");
		System.out.println(cam.toString() + "\n");
		System.out.println(cell.toString() + "\n");
		
	}
	
}
