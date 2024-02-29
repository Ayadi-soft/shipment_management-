package MODEL;

public class Customer {


	private String ID;
	private String name;
	private String phone_number;
	private String email;
	private String address;
	private String department;
	public String Cust_type="";
	public String dest_id="";

	
	
	public  Customer(String id)
	{ this.ID = id;} 
	
	public  Customer(String id,String name,String dest_id)
	{ this.ID = id;
	this.name = name;
	this.dest_id=dest_id;} 
	
	public  Customer(String id,String name,String type,String dest_id)
	{ this.ID = id;
	this.name = name;
	this.Cust_type=type;
	this.dest_id=dest_id;} 
	
	
	public  Customer(String id,String name, String phone ,String email ,String adr,String dep,String type ,String dest_id)
	{ this.ID = id;
	this.name = name;
	this.phone_number = phone;
	this.email = email;
	this.address = adr;
	this.department = dep;
	this.Cust_type=type;
	this.dest_id=dest_id;} 
	
	
	
	 public void setID(String ID)
     {
       this.ID = ID;
     }
	 public void setName_ID(String name)
     {
       this.name = name;
     }
	 public void setPhone_number(String phonenumber)
     {
       this.phone_number = phonenumber;
     }
	 public void setEmail(String email)
     {
       this.email = email;
     }
	 public void setAddress(String address)
     {
       this.address = address;
     }
	 public void setDepartment(String department)
     {
       this.department = department;
     }
	 
	 public String getDepartment()
     {
       return department;
     }    
	 
	 public String getAddress()
     {
       return address;
     } 
	 public String getEmail()
     {
       return email;
     } 
	 public String getPhone_number()
     {
       return phone_number;
     } 
	 public String getName()
     {
       return name;
     } 

	 public String getID()
     {
       return ID;
     } 
	 
	 
	 
}