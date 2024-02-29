package MODEL;


	import java.util.Date;

	public class Shipment {
		
		public String Shipment_number;
		public String shipment_type="";
		public String shipment_size="";
		public String shipment_weight="";
		public String shipment_stat="";
		public String customer_id;
		public String dest_id="";
		public Date shipment_date;
		public Date delivery_date;
		public float cost;
		
		
		public Shipment(String id,String customer_id)
		{
			this.Shipment_number=id;
			this.customer_id=customer_id;
			this.shipment_date= new Date();
			this.delivery_date= null;
		}
		
		public Shipment(String id,String customer_id,Date d)
		{
			this.Shipment_number=id;
			this.customer_id=customer_id;
			this.shipment_date= d;
			this.delivery_date= null;
		}
		
		public Shipment(String id,String customer_id,Date d,String dest_id)
		{
			this.Shipment_number=id;
			this.customer_id=customer_id;
			this.shipment_date= d;
			this.delivery_date= null;
			this.dest_id= dest_id;
		}
		
		public Shipment(String id,String customer_id, String type, String s ,String w ,String stat, String dest_id,float cost)
		{
			this.Shipment_number=id;
			this.customer_id=customer_id;
			this.shipment_type=type;
			this.shipment_size=s;
			this.shipment_weight=w;
			this.shipment_stat=stat;
			this.dest_id =dest_id;
			this.shipment_date= new Date();
			this.delivery_date= null;
			this.cost= cost;
		}
		 
		
		

	}
