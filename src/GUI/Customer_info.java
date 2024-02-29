package GUI;
import CONTROL.*;
import MODEL.*;
	import java.awt.GridBagLayout;
	import javax.swing.JPanel;
	import java.awt.Dimension;
	import javax.swing.JLabel;
	import java.awt.GridBagConstraints;
	import java.awt.Rectangle;
	import java.awt.Font;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import javax.swing.JMenuItem;
	import javax.swing.JOptionPane;
	import javax.swing.JPopupMenu;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

	
	public class Customer_info  extends JPanel {

		private static final long serialVersionUID = 1L;
		private JLabel Label_title = null;
		private JLabel Label_isbn = null;
		private JTextField ISBN = null;
		private JButton Button_reset = null;
		private JButton Button_remove = null;
		App_init strater;
		private JLabel jLabel = null;
		private JLabel lab_id = null;
		private JLabel jLabel1 = null;
		private JLabel lab_name = null;
		private JLabel jLabel2 = null;
		private JScrollPane jScrollPane = null;
		private JTable Table_borrows = null;
		private JLabel jLabel3 = null;
		private JScrollPane jScrollPane1 = null;
		private JTable Table_reserv = null;
		private JLabel jLabel4 = null;
		private JLabel lab_fines = null;
		private JLabel jLabel5 = null;
		/**
		 * This is the default constructor
		 */
		public Customer_info (App_init strater) {
			super();
			this.strater=strater;
			initialize();
		}

		/**
		 * This method initializes this
		 * 
		 * @return void
		 */
		private void initialize() {
			
			
						
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(47, 308, 171, 26));
			jLabel3.setText("list of reseved shipment");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(48, 165, 142, 30));
			jLabel2.setText("list of sended shipment");
			lab_name = new JLabel();
			lab_name.setBounds(new Rectangle(352, 140, 168, 28));
			lab_name.setText(strater.current_customer.getName());
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(287, 140, 53, 24));
			jLabel1.setText("Name : ");
			lab_id = new JLabel();
			lab_id.setBounds(new Rectangle(141, 141, 106, 25));
			lab_id.setText(strater.current_customer.getID());
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(48, 142, 90, 19));
			jLabel.setText("customer ID : ");
			Label_title = new JLabel();
			Label_title.setText("Customer Informations");
			Label_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
			Label_title.setBounds(new Rectangle(164, 88, 299, 39));
			this.setSize(600, 500);
			this.setLayout(null);
			this.add(Label_title, null);
			this.add(jLabel, null);
			this.add(lab_id, null);
			this.add(jLabel1, null);
			this.add(lab_name, null);
			this.add(jLabel2, null);
			this.add(getJScrollPane(), null);
			this.add(jLabel3, null);
			this.add(getJScrollPane1(), null);
			
			
			
		
		
		}

		/**
		 * This method initializes jScrollPane	
		 * 	
		 * @return javax.swing.JScrollPane	
		 */
		private JScrollPane getJScrollPane() {
			if (jScrollPane == null) {
				jScrollPane = new JScrollPane();
				jScrollPane.setBounds(new Rectangle(45, 195, 550, 95));
				jScrollPane.setViewportView(getTable_borrows());
			}
			return jScrollPane;
		}

		/**
		 * This method initializes Table_borrows	
		 * 	
		 * @return javax.swing.JTable	
		 */
		private JTable getTable_borrows() {
			if (Table_borrows == null) {
			 
				//A string array containing the column names for the JTable. 
				String[] columnNames = {"ship number","customer ID"," type","size","weight","ship date","ship state"};
				
				//Create the JTable using the data array and column name array. 
				DefaultTableModel defTableModel = new DefaultTableModel(strater.all_shipment.get_all_ship_by_cust_id(strater.current_customer.getID()),columnNames);
				Table_borrows =  new JTable(defTableModel);
				 
				
			}
			return Table_borrows;
		}

		/**
		 * This method initializes jScrollPane1	
		 * 	
		 * @return javax.swing.JScrollPane	
		 */
		private JScrollPane getJScrollPane1() {
			if (jScrollPane1 == null) {
				jScrollPane1 = new JScrollPane();
				jScrollPane1.setBounds(new Rectangle(45, 333, 550, 95));
				jScrollPane1.setViewportView(getTable_reserv());
			}
			return jScrollPane1;
		}

		
		  /**
			 * This method initializes Table_reserv	
			 * 	
			 * @return javax.swing.JTable	
			 */
		private JTable getTable_reserv() {
			if (Table_reserv == null) {
				//A string array containing the column names for the JTable. 
				String[] columnNames = {"ship number","customer ID"," type","size","weight","ship date","ship state"};
				
				//Create the JTable using the data array and column name array. 
				DefaultTableModel defTableModel = new DefaultTableModel(strater.all_shipment.get_all_ship_by_dest_cust_id(),columnNames);
				Table_reserv =  new JTable(defTableModel);
			}
			return Table_reserv;
		}

		public void remplir_reservation(){
			
			Table_reserv=null;
			Table_reserv = getTable_reserv();

			jScrollPane1.setViewportView(getTable_reserv());
			
		}
		
		public void remplir_borrowed(){
			Table_borrows=null;
			Table_borrows = getTable_borrows();
			
			jScrollPane.setViewportView(getTable_borrows());
			
		}
		public void reload() {
			
		//	this=new Info_user(strater);
		}


	}  //  @jve:decl-index=0:visual-constraint="22,12"  

