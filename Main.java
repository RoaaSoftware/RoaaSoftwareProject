package sakankom;


import java.io.*;
import java.util.*;
public class Main {
    
	 
    	
    	 
    	 
    	 
    	   /* public static boolean search(String enter) {
    	        Tenant t = new Tenant();
    	        Admin a = new Admin();

    	        for (int i = 0; i < TenantFunction.tenants.size(); i++) {

    	            if (enter.equals(TenantFunction.tenants.get(i).getId()))
    	                return true;
    	            else return false;

    	        }//end of for loop for tenants


    	    }
    	    }
    	*/

    	    public static void main(String[] args){
    	        TenantFunction t=new TenantFunction();
    	        AdminFunctions a=new AdminFunctions();
    	        User us=new User();
    	    	 /* Scanner in = new Scanner(System.in);
    	System.out.print("enter id");
    	        us.setId(in.nextLine());
    	        System.out.print("enter passs");
    	        us.setPassword(in.nextLine());
    	        t.searchTenantforLogIn(us.getId(), us.getPassword());
*/				System.out.println("******************************************");
    	        System.out.println("Welcome to SACANKOM :)");
    	        System.out.println("******************************************");
    	        System.out.println("Please choose the number of survice u want :");
    	        System.out.println("1- SignUp");
    	        System.out.println("2- Sign In");
    	        System.out.println("3- exit");
    	        Scanner input1=new Scanner(System.in);
    	        int n=input1.nextInt();

    	if (n==1) {
    	    System.out.println("SignUp as :");
    	    System.out.println("1- Owner");
    	    System.out.println("2- Tenant");
    	    System.out.println("3- Admin");
    	    Scanner input2=new Scanner(System.in);
    	    int n1=input2.nextInt();
    	    if (n1==1)
    	        System.out.println("You are owner");
    	else if (n1==2)
    	    t.addTenant(us.getId());
    	else if (n1==3) {
    		t.printbook();
    	}//end of if sign up statement :)
    	}

    	else if (n==2) {
    		
    		System.out.println("SignIn as :");
    	    System.out.println("1- Owner");
    	    System.out.println("2- Tenant");
    	    System.out.println("3- Admin");
    	    Scanner in = new Scanner(System.in);
    		int h=in.nextInt();
    	    if (h==2) {
    	    	
    	    	        t.searchTenantforLogIn(us.getName(), us.getPassword());
    	    	       t.book();
    	}
    	        else if (n==3)
    	   System.out.println("your out !");










    	    }



    	    }
}
