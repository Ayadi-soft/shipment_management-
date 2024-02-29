package GUI;

import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Event;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.KeyStroke;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.Dimension;

public class App {

	public JFrame jFrame = null;   
	private JPanel jContentPane = null;
	public JToolBar jToolBar = null;
	private JButton Button_logout = null;
	private JButton Button_customer_info = null;
	private JButton Button_booking_shipment = null;
	private JButton Button_add_dest = null;
	private JButton Button_add_customer = null;
	private JButton Button_payment = null;
	private JButton Button_exit = null;
	public static App_init strater;
	private JButton Button_search = null;
	

	/**
	 * This method initializes Button_search	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_search() {
		if (Button_search == null) {
			Button_search = new JButton();
			Button_search.setIcon(new ImageIcon(getClass().getResource("/Img/recherche-icon.png")));
			Button_search.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Search_shipment form = new Search_shipment(strater);
					form.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
					jFrame.setContentPane(form);
					
				}
			});
		}
		return Button_search;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 strater = new App_init();
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			
				App application = new App();
				application.getJFrame().setVisible(true);
				strater.main_form=application;
				strater.activate();
			}
		});
	}

	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setSize(650, 500);
			java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
			jFrame.setLocation((screenSize.width-jFrame.getSize().width)/2,(screenSize.height-jFrame.getSize().height)/2);
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("Courier Management");
		}
		return jFrame;
	}


	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
		}
		return jContentPane;
	}
	
	/**
	 * This method initializes jToolBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJToolBar() {
		if (jToolBar == null) {
			jToolBar = new JToolBar();
			jToolBar.add(getButton_logout());
			jToolBar.add(getButton_customer_info());
			jToolBar.add(getButton_booking_shipment());
			jToolBar.add(getButton_add_dest());
			jToolBar.add(getButton_search());
			jToolBar.add(getButton_payment());
			jToolBar.add(getButton_add_customer());
			jToolBar.add(getButton_exit());
			
		}
		return jToolBar;
	}

	/**
	 * This method initializes Button_logout	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_logout() {
		if (Button_logout == null) {
			Button_logout = new JButton();
			Button_logout.setIcon(new ImageIcon(getClass().getResource("/Img/logout.png")));
			Button_logout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 Authentication form = new Authentication(strater,strater.main_form) ;
					form.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
					jFrame.setContentPane(form);
					deactivate_menu();
				}
			});
		}
		return Button_logout;
	}

	/**
	 * This method initializes Button_customer_info	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_customer_info() {
		if (Button_customer_info == null) {
			Button_customer_info = new JButton();
			Button_customer_info.setIcon(new ImageIcon(getClass().getResource("/Img/user_info.png")));
			Button_customer_info.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Customer_info form = new Customer_info(strater);
					form.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
					jFrame.setContentPane(form);
				}
			});
		}
		return Button_customer_info;
	}

	/**
	 * This method initializes Button_booking_shipment	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_booking_shipment() {
		if (Button_booking_shipment == null) {
			Button_booking_shipment = new JButton();
			Button_booking_shipment.setIcon(new ImageIcon(getClass().getResource("/Img/ship.png")));
			Button_booking_shipment.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {	
					Book_ship form = new Book_ship(strater) ;
 					form.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
					jFrame.setContentPane(form);
				}
			});
		}
		return Button_booking_shipment;
	}

	/**
	 * This method initializes Button_add_dest	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_add_dest() {
		if (Button_add_dest == null) {
			Button_add_dest = new JButton();
			Button_add_dest.setIcon(new ImageIcon(getClass().getResource("/Img/dest.png")));
			Button_add_dest.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Add_destination form = new Add_destination(strater) ;
				form.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
				jFrame.setContentPane(form);
				}
			});
		}
		return Button_add_dest;
	}

	/**
	 * This method initializes Button_add_customer	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_add_customer() {
		if (Button_add_customer == null) {
			Button_add_customer = new JButton();
			Button_add_customer.setIcon(new ImageIcon(getClass().getResource("/Img/add_cust.png")));
			Button_add_customer.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					Add_Cust form = new Add_Cust(strater) ;
					form.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
					jFrame.setContentPane(form);
				}
			});
		}
		return Button_add_customer;
	}

	/**
	 * This method initializes Button_payment	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_payment() {
		if (Button_payment == null) {
			Button_payment = new JButton();
			Button_payment.setIcon(new ImageIcon(getClass().getResource("/Img/fines.png")));
			Button_payment.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
 					Payment form = new Payment(strater) ;
 					form.add(getJToolBar(), BorderLayout.BEFORE_FIRST_LINE);
 					jFrame.setContentPane(form);
				}
			});
		}
		return Button_payment;
	}

	/**
	 * This method initializes Button_exit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_exit() {
		if (Button_exit == null) {
			Button_exit = new JButton();
			Button_exit.setIcon(new ImageIcon(getClass().getResource("/Img/arreter.png")));
			Button_exit.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);}
			});
		}
		return Button_exit;
	}


	public void deactivate_menu()
	{
		 Button_logout.setEnabled(false);
		  Button_customer_info.setEnabled(false);
		 Button_booking_shipment.setEnabled(false);
		 Button_add_dest.setEnabled(false);
		// Button_add_customer.setEnabled(false);
		 Button_payment.setEnabled(false);
		 Button_search.setEnabled(false);
		
	}
	
	public void Activate_menu_super_user()
	{
		 Button_logout.setEnabled(true);
		  Button_customer_info.setEnabled(true);
		 Button_booking_shipment.setEnabled(true);
		 Button_add_dest.setEnabled(true);
		 Button_add_customer.setEnabled(true);
		 Button_payment.setEnabled(true);
		 Button_search.setEnabled(true);
	}
	public void Activate_menu_normal_user()
	{
		 Button_logout.setEnabled(true);
		  Button_customer_info.setEnabled(true);
		  Button_search.setEnabled(true);
		  
	}
}
