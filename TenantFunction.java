package sakankom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenantFunction {
    static public ArrayList<Tenant> tenants = new ArrayList<Tenant>();
    static public ArrayList<Booking> bookings =new ArrayList<Booking>();
    
    static public ArrayList<Owner> owners = new ArrayList<Owner>();
    static public ArrayList<House> h=new ArrayList<House>();
    static public ArrayList<Furniture> f=new ArrayList<Furniture>();
   public static void fillingarray(){

       Tenant c= new Tenant();
       c.setId("10");
       c.setName("roaa");
       c.setPassword("1234e");
       c.setUsername("roaaAboLibdeh");
       tenants.add(c);

       Tenant q= new Tenant();
       q.setId("20");
       q.setName("tasbeeh");
       q.setPassword("0012w");
       q.setUsername("TasbeehSalahat");
       tenants.add(q);

       Tenant e= new Tenant();
       e.setId("30");
       e.setName("Shahd");
       e.setPassword("555s");
       e.setUsername("shahdSalahat");

   }
   
   
   
   
   public static void fillingAndPrintingFurnitures() {
	   Furniture v=new Furniture();
	   v.setaccessories("tvs and chairs");
	   v.setbathroom_tools("wc");
	   v.setbed("2  beds");
	   v.setkitchen_utensils("knifes only");
	   v.settreasury("three black ones for kitchen");
	   f.add(v);
	   
	   
	   Furniture v1=new Furniture();
	   v1.setaccessories("tvs and flowes");
	   v1.setbathroom_tools("wc");
	   v1.setbed("3  beds");
	   v1.setkitchen_utensils("knifes and tables and chairs");
	   v1.settreasury("white and black ones for rooms");
	   f.add(v1);
	   
	   
	   System.out.println("There are the available Furnitures :");
	   System.out.println("******************************************");
       for ( Furniture e : f)
            {
    	   System.out.println("******************************************");
    	   System.out.println("***");
               System.out.println("Accessories : " + e.getaccessories());
               System.out.println("Bathroom Tools : " + e.getbathroom_tools());
               System.out.println("Beds : " + e.getbed());
               System.out.println("Kitchen utensils : " + e.getkitchen_utensils());
               System.out.println("Treasury : " + e.gettreasury());
              

               System.out.println("******************************************");
	   
   }
       
   }
   
   static public void addFurniture() {
	   Furniture t=new Furniture();
        	boolean flag=true;
            Scanner scan=new Scanner(System.in);
            
            System.out.println("Enter Accessories :");
            Scanner acc=new Scanner(System.in); 
            String acc1=acc.nextLine();
            System.out.println("Enter Bathroom Tools :");
            Scanner Bathroom_Tools=new Scanner(System.in);
            String Bathroom_Tools1=Bathroom_Tools.nextLine();
            System.out.println("Enter Beds :");
            Scanner Beds=new Scanner(System.in);
            String Beds1=Beds.nextLine();
            System.out.println("Enter Kitchen utensils :");
            Scanner Kitchen_utensils=new Scanner(System.in);
            String  Kitchen_utensils1=Kitchen_utensils.nextLine();
            
            System.out.println("Enter Treasury :");
            Scanner Treasury=new Scanner(System.in);
            String  Treasury1=Treasury.nextLine();
            
            
            t.setaccessories(acc1);
            t.setbathroom_tools(Bathroom_Tools1);
            t.setbed(Beds1);
            t.setkitchen_utensils(Kitchen_utensils1);
            t.settreasury(Treasury1);
            
            f.add(t);
            
            
            
            System.out.println("Added Successfully !!!");
            
        }

       static public boolean addTenant(String id){
       /* addT1();
        for (int i=0;i<tenants.size();i++){
            if (tenants.get(i).getUsername().equalsIgnoreCase(St))
                return "Tenant already exists";
        }
            return "Tenant added successfully";
*/
       //  ArrayList<Tenant> tenantArray=new ArrayList<Tenant>();
        	fillingarray();
        	
        	
        	Tenant t=new Tenant();
        	boolean flag=true;
            Scanner scan=new Scanner(System.in);
            
            System.out.println("Enter your id :");
             id=scan.nextLine();
            System.out.println("Enter your name :");
            String name=scan.nextLine();
            System.out.println("Enter the name you want to appear to others (Username) :");
            String username=scan.nextLine();
            System.out.println("Enter your Password :");
            String  password=scan.nextLine();
            
            for (int i=0;i<tenants.size();i++) {
            	
            	if (id.equals(tenants.get(i).getId()))
            		//System.out.println("cannot add "); 
            		flag=false;
            	else {
            		continue;
            	}
            
          /*  if (i==tenants.size() - 1 && !(id.equals(tenants.get(i).getId()))){
            	flag=1;}
            }*/	
            
            
            	if(flag==false) { 
            		System.out.println("not added, there is user who already hs this id, please try again");
            	addTenant(id);
            	}
            	else {
            		  t.setId(id);
                      t.setName(name);
                      t.setPassword(password);
                      t.setUsername(username);
                    //  Tenant t=new Tenant(id, name, username, password);
                      tenants.add(t);	
                      System.out.println("added successfully !");
            	}
            		
            }

            
            return flag;
        }

        public static boolean searchTenantforLogIn(String name, String password) {
            fillingarray();
           // fillingAdminArray();
            
            Scanner in1 = new Scanner(System.in);
            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter your name :");
             name = in1.nextLine();
            System.out.println("Enter your Password :");
             password = in2.nextLine();
             		boolean flag=false;
            for (int i = 0; i < tenants.size(); i++) {
                if (name.equals(tenants.get(i).getName()) && password.equals(tenants.get(i).getPassword())) {
                	flag=true;
                }
                	else
                		{
                		flag =false;
                		}
            
                	if (flag==true) {
                	System.out.println(" Logged in SUCCESSFULLY :) ");
                	System.out.println("Here are the available housing");
                	System.out.println("******************************************************************");
                	viewAvailableHousingWithInformations();
                	//System.out.println("Please choose the number of house you want to book :");
                	//TeanantBooking (name, password);
                	break;
                	}
                	
                	else if (flag==false){
                		System.out.println("didn't log in, please try again");
                		//searchTenantforLogIn(name,password);
                }
            }
            	//System.out.println(" Didn't Logged in SUCCESSFULLY :( , please try again !");

                
               /* for (int i = 0; i < tenants.size(); i++) {
                 *///   if (name.equals(tenants.get(i).getName()) && password.equals(tenants.get(i).getPassword())) {
                    //	System.out.println(" Logged in SUCCESSFULLY :) ");
                    //	System.out.println("Here are the available housing");
                    //	System.out.println("---------------------------------------------------");
                    	return flag;

                    
                }

            
        public static void viewAvailableHousingWithInformations(){
        ArrayList<House> h=new ArrayList<House>();
        
         h.add(new House("12","10","2","2000$","1","nablus","5","studentHousing","11"));
        h.add(new House("10","11","3","2500$","0","nablus","6","familyHousing","12"));
        h.add(new House("3","13","4","3000$","1","nablus","6","familyHousing","13"));
        h.add(new House("5","8","2","2500$","0","nablus","5","studentHousing","11"));
        h.add(new House("14","7","5","2000$","1","nablus","6","familyHousing","14"));
        
            System.out.println("there are the available houses :");
        for (House house : h){
            if(house.getAvailable()=="1") {
            	
                System.out.println("house id : " + house.getHouse_id());
                System.out.println("Residance id : " + house.getResidenceId());
                System.out.println("floor id : " + house.getFloorId());
                System.out.println("Monthly Rent : " + house.getMonthlyRent());
                System.out.println("city : " + house.getLocation());
                System.out.println("number of rooms : " + house.getnumberOfRooms());
                System.out.println("Owner's id : " + house.getOwnerId());
                System.out.println("Type of Housing : " + house.getType());
                //System.out.println("Type of Housing : " + house.getType());

                System.out.println("******************************************************************");


            }
            else
                System.out.println("no");
            System.out.println("******************************************************************");
        }



        }
        
        public static void book() {
        	System.out.println("Enter the number of house you want to book :");
        	Scanner intr=new Scanner(System.in);
        	String vv=intr.nextLine();
        	boolean flag=false;
        	//int thenum = 0;
        	for (int i=0;i<bookings.size();i++) {
        	if (vv.equals(bookings.get(i).getResiNum())) {
        		//if (vv.equals("12") || vv.equals("3") || vv.equals("14"))
        			
        		flag=true;
        		//thenum=i;
        	break;
        	}
        	else
        		flag=false;
        
        	}
        	if (flag==true) {
        		
        		bookings.add(new Booking("11","12","10"));
        		bookings.add(new Booking("13","3","20"));
        		bookings.add(new Booking("14","14","30"));
        		System.out.println("Booked Successfully !");
        	//break;
        		/*for (int i=0;i<bookings.size();i++) {
        			System.out.println("Owner number" + bookings.get(i).getOwnerNumber());
        			System.out.println("house number" + bookings.get(i).getOtenantNumber());
        			System.out.println("Tenant number" + bookings.get(i).getResiNum());
        			
        		}*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        	}
        
        		
        		
        		
        	
        		
        		if (vv.equals("12")) {
        			System.out.println("******************************************************************");
        			System.out.println("The house u choosed is a Student Housing, you should fill some data fo it :");
        			System.out.println("enter yous age and your university major :");
        			System.out.println("Age :");
        			Scanner age=new Scanner(System.in);
        			String age1=age.nextLine();
        			System.out.println("University Major");
        			Scanner Major=new Scanner(System.in);
        			String Major1=Major.nextLine();
        			System.out.println("Data Stored Successfully !!!");
        		}
        		if (vv.equals("12") || vv.equals("3") || vv.equals("14") ) {
        			System.out.println("******************************************************************");
        			System.out.println("You have booked house now, welcome your new house !!! COGRATES !!!");
        			System.out.println("******************************************************************");
            		System.out.println("Chosoe the number of the survice you want :");
            		System.out.println("1- Furniture services.");
            		System.out.println("2- View your personal informations.");
            		System.out.println("3- View Owner informations.");
            		System.out.println("******************************************************************");
        			Scanner ser=new Scanner(System.in);
        			String ser1=ser.nextLine();
        			if (ser1.equals("1")) {
        			System.out.println("Choose the number of the survice u want :");
        			System.out.println("1- View the advertised Furniture.");
        			System.out.println("2-Advertise your own Furniture.");
        			
        			Scanner fu=new Scanner(System.in);
        			String fu1=fu.nextLine();
        			if (fu1.equals("1")) {
        				
        				fillingAndPrintingFurnitures();
        			}
        			System.out.println("Do you want to add your own Furnitures ??? if yes enter yes else enter no ");
        			Scanner yon=new Scanner(System.in);
        			String yon1=yon.nextLine();
        			if (yon1.equals("yes"))
        				addFurniture();
        			
        			if (fu1.equals("2")) {
        				
        				addFurniture();
        				
        			}
        			
        			System.out.println("******************************************************************");
        		}
        			
        		if (ser1.equals("2")) {	
        		
        //	Scanner p=new Scanner(System.in);
			//String p1=p.nextLine();
			System.out.println("There are teh personal informations for tenant who had th entered id :");
        	//if (p.equals("10")) {
        		//for (Tenant tt:tenants) {
        			System.out.println("id : 10");
        			System.out.println("name : roaa");
        			System.out.println("Username : roaaAboLibdeh");
        			System.out.println("Birth of date : 3-12-2022");
        			System.out.println("Age : 20");
        	
        		
        		/*
        		 * c.setId("10");
       c.setName("roaa");
       c.setPassword("1234e");
       c.setUsername("roaaAboLibdeh");
       tenants.add(c);*/
        		
        		/*
        		 * 
        		 *  for (House house : h){
            if(house.getAvailable()=="1") {
            	
                System.out.println("house id : " + house.getHouse_id());
                System.out.println("Residance id : " + house.getResidenceId());
                System.out.println("floor id : " + house.getFloorId());
                System.out.println("Monthly Rent : " + house.getMonthlyRent());
                System.out.println("city : " + house.getLocation());
                System.out.println("number of rooms : " + house.getnumberOfRooms());
                System.out.println("Owner's id : " + house.getOwnerId());
                System.out.println("Type of Housing : " + house.getType());
                //System.out.println("Type of Housing : " + house.getType());

                System.out.println("******************************************");

        		 * */	
        	
        		
        	}
        	
        	
        	
}
        
     
        	}
        /*public static void removeBooking(String ownername, String tenantname, int residnum, int departnum){
        int index = search (tenantname);
        List<Booking> a;
        a=tenants.get(index).getBooks();
        for (int i=0;i<a.size();i++){
            if ((ownername.equals(a.get(i).getOwnerName())) && (tenantname.equals(a.get(i).getOTenantName())) && (residnum == (a.get(i).getResiNum())) && (departnum ==(a.get(i).getApNum())))
            {
                tenants.get(index).removeBooking(i);
                System.out.println(" Booking removed successfully !");
                    break;


            }
        }
        }*/
        
        public static void printbook() {
        	bookings.add(new Booking("11","12","10"));
    		bookings.add(new Booking("13","3","20"));
    		bookings.add(new Booking("14","14","30"));
        for (int i=0;i<bookings.size();i++) {
			System.out.println("Owner number" + bookings.get(i).getOwnerNumber());
			System.out.println("house number" + bookings.get(i).getOtenantNumber());
			System.out.println("Tenant number" + bookings.get(i).getResiNum());
        
        }
        
        }

        public static void viewOwnerNameAndContactInformation(String OwnerName){
        for (int i=0;i<owners.size();i++){
           if (owners.get(i).getName().equals(OwnerName)){
               System.out.println("The Owner's Name and his Contact Informations are :");
               System.out.println("Name :" + "");
               System.out.println("Phone :" + "");
               System.out.println("Address :" + "");
               System.out.println("Id :" + "");
           }
        }
    }


}
