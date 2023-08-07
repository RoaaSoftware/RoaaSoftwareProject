package sakankom;

public class Booking {

	
	 private  String OwnerNumber;
	    private  String tenantNumber;
	    private String houseNumber;
	    private String status;

	  public Booking() {
		  
	  }
	    
	    
	    
	    public Booking(String OwnerNumber,String tenantNumber,String houseNumber){
	        this.OwnerNumber=OwnerNumber;
	        this.tenantNumber=tenantNumber;
	        this.houseNumber=houseNumber;
	        this.status=status;
	    }

	    public void setOwnerNumber(String OwnerNumber){
	        this.OwnerNumber=OwnerNumber;
	    }
	    public String getOwnerNumber(){
	        return OwnerNumber;
	    }

	    public void settenantNumber(String tenantNumber){
	        this.tenantNumber=tenantNumber;
	    }
	    public String getOtenantNumber(){
	        return tenantNumber;
	    }

	    public void sethouseNumber(String houseNumber){
	        this.houseNumber=houseNumber;
	    }
	    public String getResiNum(){
	        return houseNumber;
	    }

	   
	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }


}
