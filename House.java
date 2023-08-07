package sakankom;

public class House {
	 private String house_id, residenceId, floorId, monthlyRent, availability,location,numberOfRooms,type,OwnerId;
	    //private Integer  bathrooms, bedrooms;

	 /*   public House(String house_id, String residenceId, Integer floor, String monthlyRent,String balcony, Integer bathrooms, Integer bedrooms, String availability,String type) {
	        this.house_id = house_id;
	        this.residenceId = residenceId;
	        this.floorId = floorId;
	        this.monthlyRent = monthlyRent;
	        //this.balcony = balcony;
	      //  this.bathrooms=bathrooms;
	      //  this.bedrooms=bedrooms;
	        this.availability=availability;
	        this.type=type;
	    }*/

	    /*public House() {

	    }*/
	    
	    public House(String house_id, String residenceId, String floorId, String monthlyRent, String availability,String location,String numberOfRooms,String type,String OwnerId) {
	        this.house_id = house_id;
	        this.residenceId = residenceId;
	        this.floorId = floorId;
	        this.monthlyRent = monthlyRent;
	        this.availability=availability;
	        this.location = location;
	        this.numberOfRooms = numberOfRooms;
	        this.type=type;
	        this.OwnerId=OwnerId;
	    }

	    // public House(String number, String number1, String number2, boolean b) {
	    //}

	    public void setnumberOfRooms(String numberOfRooms){
	        this.numberOfRooms=numberOfRooms;
	    }
	    public String getnumberOfRooms(){
	        return numberOfRooms;
	    }
	    public void setType(String type){
	        this.type=type;
	    }
	    public String getType(){
	        return type;
	    }
	    public void setOwnerId(String OwnerId){
	        this.OwnerId=OwnerId;
	    }
	    public String getOwnerId(){
	        return OwnerId;
	    }
	    
	    
	    

	    public void setLocation(String location){
	        this.location=location;
	    }
	    public String getLocation(){
	        return location;
	    }




	    public void setAvailab(String availability){
	        this.availability=availability;
	    }
	    public String getAvailable(){
	        return availability;
	    }

	    public String getHouse_id() {return house_id;}

	    public void setHouseId(String id) {this.house_id = house_id;}

	    public String getResidenceId() {return residenceId;}

	    public void setResidenceId(String residenceId) {this.residenceId = residenceId;}

	    public String getFloorId() {return floorId;}

	    public void setFloorId(String floor) {this.floorId = floorId;}

	   // public String getBalcony() {return balcony;}

	   // public void setBalcony(String balcony) {this.balcony = balcony;}

	    public String getMonthlyRent(){return monthlyRent;}

	    public void setMonthlyRent(String monthlyRent){this.monthlyRent=monthlyRent;}

	  //  public Integer getBathroomNum(){return bathrooms;}
	   // public void setBathroomsNum(Integer bathrooms){this.bathrooms=bathrooms;}
	   //// public Integer getBedroomsNum(){return bedrooms;}
	  //  public void setBedroomsNum(Integer bathrooms){this.bathrooms=bedrooms;}

	    @Override
	    public String toString() {
	        return "Houses{" +
	                "ID " + house_id +
	                ", ResidenceID '" + residenceId + '\'' +
	                ", FloorID '" + floorId + '\'' +
	                ", Monthly Rent '" + monthlyRent + '\'' +
	                //", Balcony " + balcony + '\''+
	              //  ", Bathrooms " + bathrooms + '\''+
	              //  ", Bedrooms " + bedrooms + '\''+
	                '}';
	    }

}
