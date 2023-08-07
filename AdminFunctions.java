package sakankom;
import java.util.ArrayList;
public class AdminFunctions {
	
	public static ArrayList <Booking> bn=new ArrayList<Booking>();
	static public ArrayList<Admin> admins=new ArrayList<Admin>();
	
	public static void fillingAdminArray() {
		   Admin m=new Admin();
		   m.setEmail("AdminggRoAh@gmail.com");
		   m.setId("123432");
		   m.setName("Ahmad");
		   m.setPass("1196");
		   admins.add(m);
		   
	   }
	
	public static void addingbook() {
		System.out.println("******************************************************************");
	    System.out.println("Here are the bookings vis the System :");
		bn.add(new Booking("11","12","10"));
		bn.add(new Booking("13","3","20"));
		bn.add(new Booking("14","14","30"));
		
		for (Booking b1 : bn) {
			System.out.println("******************************************************************");
			 System.out.println("house id : " + b1.getOtenantNumber());
             System.out.println("owner id : " + b1.getOwnerNumber());
             System.out.println("tenant id : " + b1.getResiNum());
             System.out.println("******************************************************************");
		}
		
	}
	
	
	public static void printbook()
	{
		addingbook();
		for (Booking b1 : bn) {
			System.out.println("******************************************************************");
			 System.out.println("house id : " + b1.getOtenantNumber());
             System.out.println("owner id : " + b1.getOwnerNumber());
             System.out.println("tenant id : " + b1.getResiNum());
             System.out.println("******************************************************************");
		
		
	}
}
}