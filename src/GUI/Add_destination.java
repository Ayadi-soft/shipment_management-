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

import MODEL.Destination;
	
	public class Add_destination extends JPanel {

		private static final long serialVersionUID = 1L;
		private Panel panel = null;
		private JLabel title = null;
		private JLabel Label_id_dest = null;
		private JTextField id_dest = null;
		private JLabel Label_title = null;
		private JTextField county = null;
		private JLabel Label_street = null;
		private JTextField street = null;
		private JButton Button_validate = null;
		private JButton Button_reset = null;
		private JButton Button_close = null;
		private JLabel Label_tel = null;
		private JLabel Label_adr = null;
		private JLabel Label_dep = null;
		private JTextField town = null;
		private JTextField descc = null;
		private JTextField zip_code = null;
		App_init strater;
		/**
		 * This is the default constructor
		 */
		public Add_destination(App_init strater) {
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
			
			
			
			
			
			Label_dep = new JLabel();
			Label_dep.setBounds(new Rectangle(106, 283, 63, 24));
			Label_dep.setText("zip_code :");
			Label_adr = new JLabel();
			Label_adr.setBounds(new Rectangle(105, 315, 80, 25));
			Label_adr.setText("Description : ");
			Label_tel = new JLabel();
			Label_tel.setBounds(new Rectangle(107, 222, 51, 23));
			Label_tel.setText("Town : ");
			Label_street = new JLabel();
			Label_street.setBounds(new Rectangle(107, 250, 52, 25));
			Label_street.setText("street : ");
			Label_title = new JLabel();
			Label_title.setBounds(new Rectangle(107, 192, 63, 26));
			Label_title.setText("Country : ");
			Label_id_dest = new JLabel();
			Label_id_dest.setBounds(new Rectangle(107, 160, 94, 24));
			Label_id_dest.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			Label_id_dest.setFont(new Font("Times New Roman", Font.BOLD, 12));
			Label_id_dest.setText("Destination ID :");
			title = new JLabel();
			title.setBounds(new Rectangle(209, 99, 211, 38));
			title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
			title.setText("Add Destination");
			this.setSize(650, 500);
			this.setLayout(null);
			this.add(title, null);
			this.add(Label_id_dest, null);
			this.add(getid_dest(), null);
			this.add(Label_title, null);
			this.add(getcounty(), null);
			this.add(Label_street, null);
			this.add(getstreet(), null);
			this.add(getButton_validate(), null);
			this.add(getButton_reset(), null);
			this.add(Label_tel, null);
			this.add(Label_adr, null);
			this.add(Label_dep, null);
			this.add(gettown(), null);
			this.add(getdescc(), null);
			this.add(getzip_code(), null);
			
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
		 * This method initializes id_dest	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getid_dest() {
			if (id_dest == null) {
				id_dest = new JTextField();
				id_dest.setBounds(new Rectangle(202, 162, 93, 23));
			}
			return id_dest;
		}

		/**
		 * This method initializes county	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getcounty() {
			if (county == null) {
				county = new JTextField();
				county.setBounds(new Rectangle(177, 194, 174, 26));
			}
			return county;
		}

		/**
		 * This method initializes street	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getstreet() {
			if (street == null) {
				street = new JTextField();
				street.setBounds(new Rectangle(178, 253, 187, 25));
			}
			return street;
		}

		/**
		 * This method initializes Button_validate	
		 * 	
		 * @return javax.swing.JButton	
		 */
		private JButton getButton_validate() {
			if (Button_validate == null) {
				Button_validate = new JButton();
				Button_validate.setBounds(new Rectangle(415, 394, 68, 56));
				Button_validate.setIcon(new ImageIcon(getClass().getResource("/Img/val.png")));
				Button_validate.setText("");
				Button_validate.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						JOptionPane jop1 = new JOptionPane();	
						int x=0;
						
						x=Integer.parseInt( zip_code.getText());
						
						if(	strater.all_destination.add_dest(new Destination(id_dest.getText(),county.getText(),town.getText(),street.getText(),descc.getText(),x)))
						{
						jop1.showMessageDialog(null,"destination inserted ","Information", JOptionPane.INFORMATION_MESSAGE);
						id_dest.setText("");
						county.setText("");
						street.setText("");
						descc.setText("");
						zip_code.setText("");
						town.setText("");
						}
						else
						{jop1.showMessageDialog(null,"destination exist ","Alert", JOptionPane.ERROR_MESSAGE);
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
				Button_reset.setBounds(new Rectangle(495, 395, 71, 54));
				Button_reset.setIcon(new ImageIcon(getClass().getResource("/Img/reset.png")));
				Button_reset.setText("");
				Button_reset.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						id_dest.setText("");
						county.setText("");
						street.setText("");
						descc.setText("");
						zip_code.setText("");
						town.setText("");
					}
				});
			}
			return Button_reset;
		}

		/**
		 * This method initializes town	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField gettown() {
			if (town == null) {
				town = new JTextField();
				town.setBounds(new Rectangle(167, 224, 150, 26));
			}
			return town;
		}

		/**
		 * This method initializes descc	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getdescc() {
			if (descc == null) {
				descc = new JTextField();
				descc.setBounds(new Rectangle(189, 317, 367, 54));
			}
			return descc;
		}

		/**
		 * This method initializes zip_code	
		 * 	
		 * @return javax.swing.JTextField	
		 */
		private JTextField getzip_code() {
			if (zip_code == null) {
				zip_code = new JTextField();
				zip_code.setBounds(new Rectangle(176, 283, 75, 26));
				zip_code.setText("0");
			}
			return zip_code;
		}

		

	}  //  @jve:decl-index=0:visual-constraint="29,11" 
