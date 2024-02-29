package GUI;

	import java.awt.GridBagLayout;
	import javax.swing.JPanel;
	import java.awt.Dimension;
	import javax.swing.JLabel;
	import java.awt.GridBagConstraints;
	import java.awt.Font;
	import java.awt.Rectangle;

	import javax.swing.JOptionPane;
	import javax.swing.SwingConstants;
	import javax.swing.JTextField;
	import java.awt.Label;
	import java.awt.Panel;
	import javax.swing.JButton;
	import java.awt.ComponentOrientation;
	import javax.swing.JSlider;
	import javax.swing.JComboBox;


	import javax.swing.ImageIcon;
	import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import MODEL.Destination;
import MODEL.Shipment;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

	public class Book_ship extends JPanel {

		private static final long serialVersionUID = 1L;
		private Panel panel = null;
		private JLabel title = null;
		private JLabel Label_ship_number = null;
		private JTextField ship_number = null;
		private JButton Button_validate = null;
		private JButton Button_reset = null;
		private JButton Button_close = null;
		private JLabel Label_type = null;
		private JComboBox ComboBox_type = null;
		App_init strater;
		private JLabel Label_size = null;
		private JTextField f_size = null;
		private JLabel lab_weight = null;
		private JTextField f_weight = null;
		private JLabel lab_shipment_stat = null;
		private JLabel shipment_stat = null;
		private JLabel lab_dest = null;
		private JComboBox ComboBox_des = null;
		private JLabel jLabeladr = null;
		private JLabel adrr = null;
		private JLabel lab_cout = null;
		private JLabel cost = null;
		/**
		 * This is the default constructor
		 */
		public Book_ship(App_init strater) {
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
			
			
			
			
			
			cost = new JLabel();
			cost.setBounds(new Rectangle(116, 392, 126, 24));
			cost.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
			cost.setForeground(new Color(255, 0, 51));
			cost.setText(" not yet calculeted ");
			lab_cout = new JLabel();
			lab_cout.setBounds(new Rectangle(68, 390, 47, 25));
			lab_cout.setText("Cost :");
			adrr = new JLabel();
			adrr.setBounds(new Rectangle(213, 357, 339, 26));
			adrr.setText(" ");
			jLabeladr = new JLabel();
			jLabeladr.setBounds(new Rectangle(68, 356, 135, 24));
			jLabeladr.setText("Destination adress :");
			lab_dest = new JLabel();
			lab_dest.setBounds(new Rectangle(68, 322, 92, 25));
			lab_dest.setText("Destination :");
			shipment_stat = new JLabel();
			shipment_stat.setBounds(new Rectangle(175, 285, 113, 22));
			shipment_stat.setText("Non payed");
			lab_shipment_stat = new JLabel();
			lab_shipment_stat.setBounds(new Rectangle(67, 283, 95, 25));
			lab_shipment_stat.setText("Shipment stat :");
			lab_weight = new JLabel();
			lab_weight.setBounds(new Rectangle(228, 246, 58, 20));
			lab_weight.setText("Weight :");
			Label_size = new JLabel();
			Label_size.setBounds(new Rectangle(67, 244, 44, 24));
			Label_size.setText("size :");
			Label_type = new JLabel();
			Label_type.setBounds(new Rectangle(65, 206, 98, 22));
			Label_type.setText("Shipment Type : ");
			Label_ship_number = new JLabel();
			Label_ship_number.setBounds(new Rectangle(64, 162, 111, 24));
			Label_ship_number.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			Label_ship_number.setFont(new Font("Times New Roman", Font.BOLD, 12));
			Label_ship_number.setText("Shipment Number :");
			title = new JLabel();
			title.setBounds(new Rectangle(196, 99, 247, 38));
			title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
			title.setText("Booking shipement");
			this.setSize(650, 500);
			this.setLayout(null);
			this.add(title, null);
			this.add(Label_ship_number, null);
			this.add(getship_number(), null);
			this.add(getButton_validate(), null);
			this.add(getButton_reset(), null);
			this.add(Label_type, null);
			this.add(getComboBox_type(), null);
			this.add(Label_size, null);
			this.add(getF_size(), null);
			this.add(lab_weight, null);
			this.add(getF_weight(), null);
			this.add(lab_shipment_stat, null);
			this.add(shipment_stat, null);
			this.add(lab_dest, null);
			this.add(getComboBox_des(), null);
			this.add(jLabeladr, null);
			this.add(adrr, null);
			this.add(lab_cout, null);
			this.add(cost, null);
			
		}

		/**
		 * This method initializes panel	
		 * 	
		 * @return java.awt.Panel	
		 */
		private Panel getPanel() {
			if (panel == null) {
				panel = new Panel();
				panel.setLayout(null);
			}
			return panel;
		}

		/**
		 * This method initializes ship_number	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getship_number() {
			if (ship_number == null) {
				ship_number = new JTextField();
				ship_number.setBounds(new Rectangle(180, 165, 184, 23));
				DateFormat dateFormat = new SimpleDateFormat("yyyy/dd ss");
				 Date date = new Date();
				String x= strater.current_customer.getName()+" "+ dateFormat.format(date);
				ship_number.setText(x);
				ship_number.enable(false);
			}
			return ship_number;
		}

		/**
		 * This method initializes Button_validate	
		 * 	
		 * @return javax.swing.JButton	
		 */
		private JButton getButton_validate() {
			if (Button_validate == null) {
				Button_validate = new JButton();
				Button_validate.setBounds(new Rectangle(442, 397, 68, 56));
				Button_validate.setIcon(new ImageIcon(getClass().getResource("/Img/val.png")));
				Button_validate.setText("");
				Button_validate.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						System.out.print(ComboBox_type.getSelectedItem().toString());
						JOptionPane jop1 = new JOptionPane();	
						float w=0;
						if(cost.getText().compareToIgnoreCase(" not yet calculeted ")!=0)
							w= Float.parseFloat(cost.getText());
						
						if(	strater.all_shipment.add_Shipment(new Shipment(ship_number.getText(),strater.current_customer.getID(), ComboBox_type.getSelectedItem().toString(), f_size.getText() ,f_weight.getText() ,shipment_stat.getText(), ComboBox_des.getSelectedItem().toString(),w)) )
						{
						jop1.showMessageDialog(null,"shipment inserted ","Information", JOptionPane.INFORMATION_MESSAGE);
						DateFormat dateFormat = new SimpleDateFormat("yyyy/dd ss");
						 Date date = new Date();
						String x= strater.current_customer.getName()+" "+ dateFormat.format(date);
						ship_number.setText(x);
						f_size.setText("0");
						f_weight.setText("0");
						adrr.setText("");
						cost.setText(" not yet calculeted ");
						}
						else
						{JOptionPane jop2 = new JOptionPane();	
							jop2.showMessageDialog(null,"shipment cant be inserted ","Alert", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
			}
			return Button_validate;
		}

		/**
		 * This method initializes Button_reset	
		 * 	
		 * @return javax.swing.JButton	
		 */
		private JButton getButton_reset() {
			if (Button_reset == null) {
				Button_reset = new JButton();
				Button_reset.setBounds(new Rectangle(522, 398, 71, 54));
				Button_reset.setIcon(new ImageIcon(getClass().getResource("/Img/reset.png")));
				Button_reset.setText("");
				Button_reset.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						DateFormat dateFormat = new SimpleDateFormat("yyyy/dd ss");
						 Date date = new Date();
						String x= strater.current_customer.getName()+" "+ dateFormat.format(date);
						ship_number.setText(x);
						f_size.setText("0");
						f_weight.setText("0");
						adrr.setText("");
						cost.setText(" not yet calculeted ");
						
					}
				});
			}
			return Button_reset;
		}

		/**
		 * This method initializes ComboBox_type	
		 * 	
		 * @return javax.swing.JComboBox	
		 */
		private JComboBox getComboBox_type() {
			if (ComboBox_type == null) {
				ComboBox_type = new JComboBox();
				ComboBox_type.setBounds(new Rectangle(169, 206, 119, 23));
				
				ComboBox_type.addItem("papares");
				ComboBox_type.addItem("solid");
				ComboBox_type.addItem("lequid");
				ComboBox_type.addItem("gaz");
				
			}
			ComboBox_type.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					float x =strater.all_shipment.calculate_cost(ComboBox_type.getSelectedItem().toString(), Integer.parseInt(f_size.getText()), Integer.parseInt(f_weight.getText()), strater.all_destination.get_destin_by_id(ComboBox_des.getSelectedItem().toString()));
					cost.setText(String.valueOf(x));
					}
			});
			return ComboBox_type;
		}

		/**
		 * This method initializes f_size	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getF_size() {
			if (f_size == null) {
				f_size = new JTextField();
				f_size.setBounds(new Rectangle(119, 244, 98, 25));
				f_size.setText("0");
				f_size.addKeyListener(new java.awt.event.KeyAdapter() {
					public void keyTyped(java.awt.event.KeyEvent e) {
						float x =strater.all_shipment.calculate_cost(ComboBox_type.getSelectedItem().toString(), Integer.parseInt(f_size.getText()), Integer.parseInt(f_weight.getText()), strater.all_destination.get_destin_by_id(ComboBox_des.getSelectedItem().toString()));
						cost.setText(String.valueOf(x));
					}
				});
			}
			return f_size;
		}

		/**
		 * This method initializes f_weight	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getF_weight() {
			if (f_weight == null) {
				f_weight = new JTextField();
				f_weight.setText("0");
				f_weight.setBounds(new Rectangle(296, 248, 94, 22));
				f_weight.addKeyListener(new java.awt.event.KeyAdapter() {
					public void keyTyped(java.awt.event.KeyEvent e) {
						float x =strater.all_shipment.calculate_cost(ComboBox_type.getSelectedItem().toString(), Integer.parseInt(f_size.getText()), Integer.parseInt(f_weight.getText()), strater.all_destination.get_destin_by_id(ComboBox_des.getSelectedItem().toString()));
						cost.setText(String.valueOf(x));
						
					}
				});
			}
			return f_weight;
		}

		/**
		 * This method initializes ComboBox_des	
		 * 	
		 * @return javax.swing.JComboBox	
		 */
		private JComboBox getComboBox_des() {
			if (ComboBox_des == null) {
				ComboBox_des = new JComboBox();
				ComboBox_des.setBounds(new Rectangle(178, 324, 106, 24));
						
				
				for(int i=0;i<strater.all_destination.list.size();i++)
		        {

			         Destination x =(Destination)strater.all_destination.list.get(i);
			         ComboBox_des.addItem(x.dest_ID);
		        }
			}
			ComboBox_des.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					adrr.setText(strater.all_destination.get_desc(ComboBox_des.getSelectedItem().toString())); 
					float x =strater.all_shipment.calculate_cost(ComboBox_type.getSelectedItem().toString(), Integer.parseInt(f_size.getText()), Integer.parseInt(f_weight.getText()), strater.all_destination.get_destin_by_id(ComboBox_des.getSelectedItem().toString()));
					cost.setText(String.valueOf(x));
				}
			});
			adrr.setText(strater.all_destination.get_desc(ComboBox_des.getSelectedItem().toString()));
			return ComboBox_des;
		}

		

	}  //  @jve:decl-index=0:visual-constraint="9,13"

