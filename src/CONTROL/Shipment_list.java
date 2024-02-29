package CONTROL;


import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import GUI.*;
import MODEL.*;

	public class Shipment_list {

		
	public Vector<Shipment> list = new Vector<Shipment>();	
	App_init strater;


		public  Shipment_list(App_init strater)
		{
			this.strater=strater;
		}
		
		
		public boolean add_Shipment(Shipment b )
		{
			JOptionPane jop1 = new JOptionPane();
			
		    		 list.addElement(b);
		    	 return true;
		}


		
		
		public Object[][] get_ship_by_cust_id(String id )
		{
			
			Object[][] data = new Object[100][7]; 
			int j=0;
			for(int i=0;i<list.size();i++)
	        {
				Shipment   x =(Shipment) list.get(i);
				if(x.customer_id.indexOf(id)!=-1)
		     	{	
		     	data[j][0]=new String(list.get(i).Shipment_number);
				data[j][1]=new String(list.get(i).customer_id);
				data[j][2]=new String(list.get(i).shipment_type);
				data[j][3]=new String(list.get(i).shipment_size);
				data[j][4]=new String(list.get(i).shipment_weight);
				SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
			    String str = form.format(list.get(i).shipment_date);
			    if(list.get(i).shipment_date==null)
					data[j][5]=new String(""); else data[j][5]=new String(str);
				data[j][6]=new String(list.get(i).shipment_stat);
		     	j++;
		     	     	
		     	}
		   	}
		    
		 	return data;
		     
		     }
		
		

		public Object[][] get_ship_by_number(String number )
		{
			int j=0;
			Object[][] data = new Object[100][7]; 
			for(int i=0;i<list.size();i++)
	        {
				Shipment x =(Shipment) list.get(i);
				if(x.Shipment_number.indexOf(number)!=-1)
		     	{	
					data[j][0]=new String(list.get(i).Shipment_number);
					data[j][1]=new String(list.get(i).customer_id);
					data[j][2]=new String(list.get(i).shipment_type);
					data[j][3]=new String(list.get(i).shipment_size);
					data[j][4]=new String(list.get(i).shipment_weight);
					SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
				    String str = form.format(list.get(i).shipment_date);
				    if(list.get(i).shipment_date==null)
						data[j][5]=new String(""); else data[j][5]=new String(str);
					data[j][6]=new String(list.get(i).shipment_stat);
				j++;
		     	     	
		     	}
		   	}
		    
		 	return data;
		     }
	
		
		public Object[][] get_all_ship( )
		{
			int j=0;
			Object[][] data = new Object[100][7]; 
			for(int i=0;i<list.size();i++)
	        {
				Shipment x =(Shipment) list.get(i);
					
					data[j][0]=new String(list.get(i).Shipment_number);
					data[j][1]=new String(list.get(i).customer_id);
					data[j][2]=new String(list.get(i).shipment_type);
					data[j][3]=new String(list.get(i).shipment_size);
					data[j][4]=new String(list.get(i).shipment_weight);
					SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
				    String str = form.format(list.get(i).shipment_date);
				    if(list.get(i).shipment_date==null)
					data[j][5]=new String(""); else data[j][5]=new String(str);
					data[j][6]=new String(list.get(i).shipment_stat);
				j++;
		     	     	
		     	
		   	}
		    
		 	return data;
		     }
		

		public float calculate_cost(String type, int s, int w ,Destination d )
		{
			if(type==null || d==null)
				return 0;
			if(d.country.equalsIgnoreCase("omen"))
			{
				if(type.equalsIgnoreCase("paper"))
				{return 1;}
				else if(type.equalsIgnoreCase("solid"))
				{return (float) (2+(0.11*w));}
				else if(type.equalsIgnoreCase("lequid"))
				{return (float) (3+(0.21*s));}
				else 
				{return (float) (4+(0.3*s));}
				
			}
			else
			{
				if(type.equalsIgnoreCase("paper"))
				{return 3;}
				else if(type.equalsIgnoreCase("solid"))
				{return (float) (12+(0.4*w));}
				else if(type.equalsIgnoreCase("lequid"))
				{return (float) (13+(0.5*s));}
				else 
				{return (float) (15+(0.7*s));}
			}
		    
		 	//return (float)10;
		     }
		
		
		public Object[][] get_all_ship_by_cust_id(String id )
		{
			
			Object[][] data = new Object[100][7]; 
			int j=0;
			for(int i=0;i<list.size();i++)
	        {
				Shipment   x =(Shipment) list.get(i);
				if(x.customer_id.compareToIgnoreCase(id)==0)
		     	{	
		     	data[j][0]=new String(list.get(i).Shipment_number);
				data[j][1]=new String(list.get(i).customer_id);
				data[j][2]=new String(list.get(i).shipment_type);
				data[j][3]=new String(list.get(i).shipment_size);
				data[j][4]=new String(list.get(i).shipment_weight);
				SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
			    String str = form.format(list.get(i).shipment_date);
			    if(list.get(i).shipment_date==null)
					data[j][5]=new String(""); else data[j][5]=new String(str);
				data[j][6]=new String(list.get(i).shipment_stat);
		     	j++;
		     	     	
		     	}
		   	}
		    
		 	return data;
		     
		     }
		
		public Object[][] get_all_ship_by_dest_cust_id()
		{
		//	Customer s=get_cust_by_id(strater.current_customer.dest_id);
			Object[][] data = new Object[100][7]; 
			int j=0;
			for(int i=0;i<list.size();i++)
	        {
				Shipment   x =(Shipment) list.get(i);
				if(x.dest_id.compareToIgnoreCase(strater.current_customer.dest_id)==0)
		     	{	
		     	data[j][0]=new String(list.get(i).Shipment_number);
				data[j][1]=new String(list.get(i).customer_id);
				data[j][2]=new String(list.get(i).shipment_type);
				data[j][3]=new String(list.get(i).shipment_size);
				data[j][4]=new String(list.get(i).shipment_weight);
				SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
			    String str = form.format(list.get(i).shipment_date);
			    if(list.get(i).shipment_date==null)
					data[j][5]=new String(""); else data[j][5]=new String(str);
				data[j][6]=new String(list.get(i).shipment_stat);
		     	j++;
		     	     	
		     	}
		   	}
		    
		 	return data;
		     
		     }
		
		
		public boolean pay_shipment(String nb)
		{
			for(int i=0;i<list.size();i++)
	        {
				Shipment   x =(Shipment) list.get(i);
				if(x.Shipment_number.compareToIgnoreCase(nb)==0)
		     	{
					String sum = String.valueOf(x.cost) ;
					JOptionPane jop = new JOptionPane();
					Object[] options = {"Yes, please",  "No, thanks"};
					 int option = jop.showConfirmDialog(null, "would you pay "+sum+" ?", "payment", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					 if(option == JOptionPane.OK_OPTION)
					 {
						 x.shipment_stat="payed";
						 return true;
					 }
					 
		     	}
		     	}
		    
		 	return false;
		     
		     }
		
		
		public void calculate_cost()
		{float j=1;
			for(int i=0;i<list.size();i++)
	        {
				Shipment   x =(Shipment) list.get(i);
				x.cost= j++;
				
		     	}
		    
		 	
		     
		     }

	}

