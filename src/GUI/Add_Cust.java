package GUI;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;

import java.awt.BorderLayout;
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

import MODEL.Customer;
import MODEL.Destination;

public class Add_Cust extends JPanel {

	private static final long serialVersionUID = 1L;
	private Panel panel = null;
	private JLabel title = null;
	private JLabel Label_ID_card_nb = null;
	private JTextField ID_card_nb = null;
	private JLabel Label_title = null;
	private JTextField cust_name = null;
	private JLabel Label_email = null;
	private JTextField email = null;
	private JButton Button_validate = null;
	private JButton Button_reset = null;
	private JButton Button_close = null;
	private JLabel Label_tel = null;
	private JLabel Label_adr = null;
	private JLabel Label_dep = null;
	private JLabel Label_type = null;
	private JTextField TextField_phone = null;
	private JTextField TextField_dep = null;
	private JComboBox ComboBox_type = null;
	App_init strater;
	private JLabel lab_dest = null;
	private JComboBox ComboBox_dest = null;
	private JLabel adrr = null;
	private JButton Button_add_dest = null;
	/**
	 * This is the default constructor
	 */
	public Add_Cust(App_init strater) {
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
		
		
		
		
		
		adrr = new JLabel();
		adrr.setBounds(new Rectangle(160, 339, 444, 22));
		adrr.setText("");
		lab_dest = new JLabel();
		lab_dest.setBounds(new Rectangle(95, 308, 85, 24));
		lab_dest.setText("destination :");
		Label_type = new JLabel();
		Label_type.setBounds(new Rectangle(94, 212, 64, 22));
		Label_type.setText("Type : ");
		Label_dep = new JLabel();
		Label_dep.setBounds(new Rectangle(99, 367, 85, 24));
		Label_dep.setText("Departement :");
		Label_adr = new JLabel();
		Label_adr.setBounds(new Rectangle(100, 336, 58, 25));
		Label_adr.setText("Adress : ");
		Label_tel = new JLabel();
		Label_tel.setBounds(new Rectangle(94, 275, 102, 27));
		Label_tel.setText("Phone Number : ");
		Label_email = new JLabel();
		Label_email.setBounds(new Rectangle(94, 244, 52, 25));
		Label_email.setText("Email : ");
		Label_title = new JLabel();
		Label_title.setBounds(new Rectangle(94, 173, 44, 26));
		Label_title.setText("Name : ");
		Label_ID_card_nb = new JLabel();
		Label_ID_card_nb.setBounds(new Rectangle(94, 141, 96, 24));
		Label_ID_card_nb.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Label_ID_card_nb.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Label_ID_card_nb.setText("ID card number :");
		title = new JLabel();
		title.setBounds(new Rectangle(225, 93, 182, 38));
		title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		title.setText("Add Customer");
		this.setSize(650, 500);
		this.setLayout(null);
		this.add(title, null);
		this.add(Label_ID_card_nb, null);
		this.add(getID_card_nb(), null);
		this.add(Label_title, null);
		this.add(getcust_name(), null);
		this.add(Label_email, null);
		this.add(getemail(), null);
		this.add(getButton_validate(), null);
		this.add(getButton_reset(), null);
		this.add(Label_tel, null);
		this.add(Label_adr, null);
		this.add(Label_dep, null);
		this.add(Label_type, null);
		this.add(getTextField_phone(), null);
		this.add(getTextField_dep(), null);
		this.add(getComboBox_type(), null);
		this.add(lab_dest, null);
		this.add(getComboBox_dest(), null);
		this.add(adrr, null);
		this.add(getButton_add_dest(), null);
		
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
	 * This method initializes ID_card_nb	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getID_card_nb() {
		if (ID_card_nb == null) {
			ID_card_nb = new JTextField();
			ID_card_nb.setBounds(new Rectangle(195, 143, 93, 23));
		}
		return ID_card_nb;
	}

	/**
	 * This method initializes cust_name	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getcust_name() {
		if (cust_name == null) {
			cust_name = new JTextField();
			cust_name.setBounds(new Rectangle(164, 175, 111, 26));
		}
		return cust_name;
	}

	/**
	 * This method initializes email	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getemail() {
		if (email == null) {
			email = new JTextField();
			email.setBounds(new Rectangle(165, 247, 127, 25));
		}
		return email;
	}

	/**
	 * This method initializes Button_validate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_validate() {
		if (Button_validate == null) {
			Button_validate = new JButton();
			Button_validate.setBounds(new Rectangle(401, 386, 68, 56));
			Button_validate.setIcon(new ImageIcon(getClass().getResource("/Img/val.png")));
			Button_validate.setText("");
			Button_validate.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.print(ComboBox_type.getSelectedItem().toString());
					JOptionPane jop1 = new JOptionPane();	
					if(	strater.all_Customer.add_cust(new Customer(ID_card_nb.getText(),cust_name.getText(),TextField_phone.getText(),email.getText(),adrr.getText(),TextField_dep.getText(),ComboBox_type.getSelectedItem().toString(),ComboBox_dest.getSelectedItem().toString())))
					{
					jop1.showMessageDialog(null,"customer inserted ","Information", JOptionPane.INFORMATION_MESSAGE);
					ID_card_nb.setText("");
					cust_name.setText("");
					email.setText("");
					adrr.setText("");
					TextField_dep.setText("");
					TextField_phone.setText("");
					}
					else
					{jop1.showMessageDialog(null,"customer exist ","Alert", JOptionPane.ERROR_MESSAGE);
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
			Button_reset.setBounds(new Rectangle(481, 387, 71, 54));
			Button_reset.setIcon(new ImageIcon(getClass().getResource("/Img/reset.png")));
			Button_reset.setText("");
			Button_reset.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ID_card_nb.setText("");
					cust_name.setText("");
					email.setText("");
					adrr.setText("");
					TextField_dep.setText("");
					TextField_phone.setText("");
				}
			});
		}
		return Button_reset;
	}

	/**
	 * This method initializes TextField_phone	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextField_phone() {
		if (TextField_phone == null) {
			TextField_phone = new JTextField();
			TextField_phone.setBounds(new Rectangle(200, 276, 103, 23));
		}
		return TextField_phone;
	}

	/**
	 * This method initializes TextField_dep	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTextField_dep() {
		if (TextField_dep == null) {
			TextField_dep = new JTextField();
			TextField_dep.setBounds(new Rectangle(187, 367, 149, 26));
		}
		return TextField_dep;
	}

	/**
	 * This method initializes ComboBox_type	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_type() {
		if (ComboBox_type == null) {
			ComboBox_type = new JComboBox();
			ComboBox_type.setBounds(new Rectangle(165, 213, 119, 23));
			ComboBox_type.addItem("Gest");
			ComboBox_type.addItem("Regular Customer");
			
		}
		return ComboBox_type;
	}

	/**
	 * This method initializes ComboBox_dest	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_dest() {
		if (ComboBox_dest == null) {
			ComboBox_dest = new JComboBox();
			ComboBox_dest.setBounds(new Rectangle(187, 307, 184, 24));
			for(int i=0;i<strater.all_destination.list.size();i++)
	        {

		         Destination x =(Destination)strater.all_destination.list.get(i);
		         ComboBox_dest.addItem(x.dest_ID);
	        }
		}
		ComboBox_dest.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent e) {
				adrr.setText(strater.all_destination.get_desc(ComboBox_dest.getSelectedItem().toString())); 
				
			}
		});
		adrr.setText(strater.all_destination.get_desc(ComboBox_dest.getSelectedItem().toString()));
		return ComboBox_dest;
	}

	/**
	 * This method initializes Button_add_dest	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_add_dest() {
		if (Button_add_dest == null) {
			Button_add_dest = new JButton();
			Button_add_dest.setBounds(new Rectangle(380, 308, 203, 22));
			Button_add_dest.setText("Add destination");
			Button_add_dest.setIcon(new ImageIcon(getClass().getResource("/Img/add.png")));
			Button_add_dest.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 
					Add_destination form = new Add_destination(strater) ;
					form.add(strater.main_form.jToolBar, BorderLayout.BEFORE_FIRST_LINE);
					strater.main_form.jFrame.setContentPane(form);
				}
			});
		}
		return Button_add_dest;
	}

	

} 
