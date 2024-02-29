package GUI;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import CONTROL.Customers;
import CONTROL.Destination_list;
import CONTROL.Shipment_list;
import MODEL.*;

		public class App_init {
			private JPanel jPane_vide = null;
			public Customers all_Customer;
			public Destination_list all_destination ;
			public Shipment_list all_shipment;
	
			public Customer current_customer;
			public App main_form;
			
			public  App_init(){
				all_Customer =new Customers();
				all_destination =new Destination_list();
				all_shipment=new Shipment_list(this);
				current_customer=null;
				
				all_destination.add_dest(new Destination("OMEN 1","OMEN","Muscat","Jami�at Al-Dowal Al-Arabiya Street","xx",2541));
				all_destination.add_dest(new Destination("OMEN 2","OMEN","Muscat","ali baba Street","Al Khuwair, Diplomatic Area",9541));
				all_destination.add_dest(new Destination("OMEN 3","OMEN","Muscat","souk el sultan Street","Al Khuwair,  Area",7841));
				all_destination.add_dest(new Destination("USE 1","UEA","dubai","new street of user","",9541));
				all_destination.add_dest(new Destination("France 1","France","paris","les champs d'elisee ","au palais de sport",7841));
				
				Customer q =new Customer("1","Mohamed","regular customer","1");
				q.dest_id="OMEN 2";
				all_Customer.add_cust(q);
				all_Customer.add_cust(new Customer("2","Ali","guest","2"));
				all_Customer.add_cust(new Customer("3","Salah","regular customer","3"));
				
				all_shipment.add_Shipment(new Shipment("med 1 2","1",new GregorianCalendar(2016,6,1).getTime( ),"USE 1"));
				all_shipment.add_Shipment(new Shipment("med 23 2","1",new GregorianCalendar(2016,6,2).getTime( ),"OMEN 3"));
				all_shipment.add_Shipment(new Shipment("med 2 5 ","1",new GregorianCalendar(2016,6,4).getTime( ),"OMEN 1"));
				all_shipment.add_Shipment(new Shipment("salah 7 8","2",new GregorianCalendar(2016,6,3).getTime( ),"OMEN 2"));
				all_shipment.add_Shipment(new Shipment("salah 4 9","2",new GregorianCalendar(2016,6,5).getTime( ),"France 1"));
				all_shipment.calculate_cost();
				
				
			
				
			}	
			
			public void verif_user(String id )
			{
				
				current_customer=this.all_Customer.get_cust_by_id(id);
				if(current_customer ==null)
				{
					JOptionPane jop1 = new JOptionPane();
					jop1.showMessageDialog(null, "this user does not exist", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else 
				{
					
					if(current_customer.Cust_type==null) System.out.print("type null");
					if(current_customer.Cust_type.equalsIgnoreCase("regular customer")==true)
					{
						this.main_form.Activate_menu_super_user();
						this.main_form.jFrame.setContentPane(getjpan());
					}
					else
					{
						this.main_form.Activate_menu_normal_user();
						this.main_form.jFrame.setContentPane(getjpan());	
					}
				}
			}
			
			private JPanel getjpan() {
				
					jPane_vide = new JPanel();
					jPane_vide.setSize(600, 500);
					jPane_vide.setLayout(null);
					jPane_vide.add(main_form.jToolBar, BorderLayout.BEFORE_FIRST_LINE);
				
				return jPane_vide;
			}
			
			public void activate() {
				 Authentication form = new Authentication(this,main_form) ;
				 main_form.deactivate_menu();
				 form.add(main_form.jToolBar, BorderLayout.BEFORE_FIRST_LINE);
					main_form.jFrame.setContentPane(form);
					main_form.deactivate_menu();
				
			}

		}
