package GUI;
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
	import javax.swing.JRadioButton;
	import javax.swing.JTable;
	import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

	
	public class Payment extends JPanel {

		private static final long serialVersionUID = 1L;
		private JLabel Label_title = null;
		private JScrollPane jScrollPane = null;
		private JTable Table_fines = null;
		App_init strater;
		private JLabel jLabel = null;
		 
		/**
		 * This is the default constructor
		 */
		public Payment(App_init strater) {
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
			
			 
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(44, 408, 420, 25));
			jLabel.setText("**use contextual menu to pay selected shipment");
			Label_title = new JLabel();
			Label_title.setText("Payment");
			Label_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
			Label_title.setBounds(new Rectangle(258, 106, 132, 42));
			this.setSize(650, 500);
			this.setLayout(null);
			this.add(Label_title, null);
			this.add(getJScrollPane(), null);
			this.add(jLabel, null);
			
		}

		/**
		 * This method initializes jScrollPane	
		 * 	
		 * @return javax.swing.JScrollPane	
		 */
		private JScrollPane getJScrollPane() {
			if (jScrollPane == null) {
				jScrollPane = new JScrollPane();
				jScrollPane.setBounds(new Rectangle(45, 170, 550, 220));
				jScrollPane.setViewportView(getTable_fines());
			}
			return jScrollPane;
		}

		
		
		/**
		 * This method initializes Table_fines	
		 * 	
		 * @return javax.swing.JTable	
		 */
		private JTable getTable_fines() {
			if (Table_fines == null) {
				String[] columnNames = {"ship number","customer ID"," type","size","weight","ship date","ship state"};
				
				//Create the JTable using the data array and column name array. 
				DefaultTableModel defTableModel = new DefaultTableModel(strater.all_shipment.get_all_ship_by_cust_id(strater.current_customer.getID()),columnNames);
				Table_fines =  new JTable(defTableModel);
				Table_fines.addMouseListener(new java.awt.event.MouseAdapter() {
		        	public void mouseClicked(java.awt.event.MouseEvent event) {
		        		if(event.getButton() == event.BUTTON3){
		        			if(Table_fines.getSelectedRow()>=0){
								JMenuItem ajouter = new JMenuItem("pay this shipment");
								ajouter.addActionListener(new java.awt.event.ActionListener() {
									public void actionPerformed(java.awt.event.ActionEvent e) {
										int ligne = Table_fines.getSelectedRow();
										String cellule =(String) Table_fines.getValueAt(ligne,0);
										
										JOptionPane jop1 = new JOptionPane();
										
										if(strater.all_shipment.pay_shipment(cellule)){
											jop1.showMessageDialog(null, "successful operation", "information", JOptionPane.INFORMATION_MESSAGE);
											Table_fines = null;
											jScrollPane.setViewportView(getTable_fines());
											
										}	}
								});	
									
								
								
								
								
								
								JPopupMenu menu = new JPopupMenu();
								menu.add(ajouter);
								
								
								menu.show(Table_fines, event.getX(), event.getY());
		        			}}
						
		        	}
		        });
				
				 
			}
			return Table_fines;
		}

	}  

