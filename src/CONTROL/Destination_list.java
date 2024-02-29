package CONTROL;

import java.util.Vector;

import MODEL.Customer;
import MODEL.Destination;

public class Destination_list {
	public Vector<Destination> list = new Vector<Destination>();	
	
	
	public boolean add_dest(Destination b )
	{
		boolean t=false;
	
		for(int i=0;i<list.size();i++)
        {
			Destination x =(Destination)list.get(i);
		if(x.dest_ID.equalsIgnoreCase(b.dest_ID))
     	{	System.out.print( "desttination exixt");
     	t=true;
     	return false; 
		}}
		
	    
	    
	     if(t==false)
	    	 list.addElement(b);
	     System.out.print( "user addeed");
	 	return true;
	     
	     }
	
	
	public String get_desc(String y )
	{
			
		for(int i=0;i<list.size();i++)
        {
			Destination x =(Destination)list.get(i);
		if(x.dest_ID.equalsIgnoreCase(y))
     	{	
     	return x.country+" , "+x.town+" , "+x.street+" , " +String.valueOf(x.zip_code) +" \n "+x.desc ; 
		}}

	 	return "";
	     
	     }
	
	public Destination get_destin_by_id(String y )
	{
			
		for(int i=0;i<list.size();i++)
        {
			Destination x =(Destination)list.get(i);
		if(x.dest_ID.equalsIgnoreCase(y))
     	{	
     	return x ; 
		}}

	 	return null;
	     
	     }

}
