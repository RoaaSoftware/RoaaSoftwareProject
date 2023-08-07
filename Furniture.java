package sakankom;

public class Furniture {

	private String treasury,bed,kitchen_utensils,table,bathroom_tools,accessories;
	
	public Furniture() {
		
	}
	
	
	
	public Furniture(String treasury,String bed,String kitchen_utensils,String table,String bathroom_tools,String accessories ) {
		this.treasury=treasury;
		this.bed=bed;
		this.kitchen_utensils=kitchen_utensils;
		this.table=table;
		this.bathroom_tools=bathroom_tools;
		this.accessories=accessories;
		
	}
	
	public void settreasury(String treasury) {
		this.treasury=treasury;
	}
	public String gettreasury() {
		return treasury;
	}
	
	public void setbed(String bed) {
		this.bed=bed;
	}
	public String getbed() {
		return bed;
	}
	
	
	
	public void setkitchen_utensils(String kitchen_utensils) {
		this.kitchen_utensils=kitchen_utensils;
	}
	public String getkitchen_utensils() {
		return kitchen_utensils;
	}
	
	
	public void setbathroom_tools(String bathroom_tools) {
		this.bathroom_tools=bathroom_tools;
	}
	public String getbathroom_tools() {
		return bathroom_tools;
	}
	
	
	
	
	public void setaccessories(String accessories) {
		this.accessories=accessories;
	}
	public String getaccessories() {
		return accessories;
	}
	
	
	
	
	
	
	
	
}
