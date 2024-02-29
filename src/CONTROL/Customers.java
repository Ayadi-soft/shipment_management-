package CONTROL;

	import java.util.*;

import MODEL.Customer;


	public class Customers {
		
		public Vector<Customer> list = new Vector<Customer>();	
		
		
		public boolean add_cust(Customer b )
		{
			boolean t=false;
		
			for(int i=0;i<list.size();i++)
	        {
				Customer x =(Customer)list.get(i);
			if(x.getID().equalsIgnoreCase(b.getID()))
	     	{	System.out.print( "customer exixt");
	     	t=true;
	     	return false; 
			}}
			
		    
		    
		     if(t==false)
		    	 list.addElement(b);
		     System.out.print( "customer addeed");
		 	return true;
		     
		     }

		
		public boolean remove_cust(String id  )
		{
			boolean t=false;
				
			for(int i=0;i<list.size();i++)
	        {
				Customer x =(Customer)list.get(i);
			if(x.getID().equalsIgnoreCase(id))
	     	{	System.out.print( "user exixt and will be deleted");
	     	t=true;
		     	return list.remove(x);
		     	
		     	}
		     	}
		     if(t==false)
		    	 System.out.print( "user inexixt");
		 	return false;
		     
		     }
		
		public Customer get_cust_by_id(String id )
		{
				
			for(int i=0;i<list.size();i++)
	        {
				Customer x =(Customer)list.get(i);
			if(x.getID().equalsIgnoreCase(id))
	     	{	
		     	return x;
		     	
		     	}
		     	}
		    
		 	return null;
		     
		     }

	}

