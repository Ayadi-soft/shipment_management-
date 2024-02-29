package MODEL;

public class Destination {

	public String dest_ID;
	public String country;
	public String town;
	public String street;
	public String desc;
	public int 	zip_code;

	

	public  Destination(String ID,String country,String town,String street,String desc,int zip_code)
	{
		this.dest_ID=ID;
		this.country=country;
		this.town= town;
		this.street= street;
		this.desc= desc;
		this.zip_code= zip_code;
		
		
		
	}
}
