package jday.ui.user;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import jday.util.BackgroundPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.ButtonGroup;

public class SpaBooking extends BackgroundPanel /*BackgroundPanel*/{
	private JRadioButton rdbtnpm;
	private JRadioButton rdbtnNoonPm;
	private JRadioButton rdbtnEveningPm;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public SpaBooking() {
		super();
		initialize();
	}
	
	public SpaBooking(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		rdbtnEveningPm = new JRadioButton("Evening (5 pm - 7 pm)");
		buttonGroup.add(rdbtnEveningPm);
		rdbtnEveningPm.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		rdbtnEveningPm.setOpaque(false);
		rdbtnEveningPm.setBounds(178, 387, 148, 23);
		add(rdbtnEveningPm);
		
		rdbtnNoonPm = new JRadioButton("Noon (1 pm - 4 pm)");
		buttonGroup.add(rdbtnNoonPm);
		rdbtnNoonPm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		rdbtnNoonPm.setOpaque(false);
		rdbtnNoonPm.setBounds(178, 357, 148, 23);
		add(rdbtnNoonPm);
		
		rdbtnpm = new JRadioButton("AM (10 am - 12 pm)");
		buttonGroup.add(rdbtnpm);
		rdbtnpm.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		rdbtnpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		rdbtnpm.setOpaque(false);
		rdbtnpm.setBounds(178, 325, 148, 23);
		add(rdbtnpm);
		
		JTextPane txtpnAvailableForGroup = new JTextPane();
		txtpnAvailableForGroup.setFont(new Font("Candara", Font.PLAIN, 15));
		txtpnAvailableForGroup.setEditable(false);
		txtpnAvailableForGroup.setBackground(SystemColor.menu);
		txtpnAvailableForGroup.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtpnAvailableForGroup.setText("All charges are subject to 10% service charge and 7% GST*.\r\n\r\nRooms are subject to availability.\r\n\r\nPlease adhere to the timing generated from the booking system to avoid any inconvenience.\r\n\r\nA grace period of 15 minutes is given from the timing of your booked session.\r\n\r\nAll bookings made cannot be cancelled.\r\n\r\nAll payments made are non refundable.\r\n\r\nAll transactions are in Singapore Dollars (SGD).");
		txtpnAvailableForGroup.setBounds(396, 84, 251, 359);
		add(txtpnAvailableForGroup);
		
		JLabel lblSession = new JLabel("SESSION :");
		lblSession.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblSession.setBounds(51, 210, 89, 14);
		add(lblSession);
		
		JLabel lblDate = new JLabel("DATE :");
		lblDate.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDate.setBounds(71, 268, 49, 23);
		add(lblDate);
		
		JLabel lblTime = new JLabel("TIME :");
		lblTime.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblTime.setBounds(71, 334, 56, 14);
		add(lblTime);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		spinner.setBounds(178, 270, 46, 22);
		add(spinner);
		
		JComboBox Month = new JComboBox();
		Month.setFont(new Font("Candara", Font.PLAIN, 14));
		Month.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		Month.setToolTipText("");
		Month.setBounds(234, 268, 56, 25);
		add(Month);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerListModel(new String[] {"2012", "2013", "2014", "2015"}));
		spinner_1.setBounds(295, 270, 56, 22);
		add(spinner_1);
		
		JComboBox comboBoxPackages = new JComboBox();
		comboBoxPackages.setFont(new Font("Candara", Font.PLAIN, 14));
		comboBoxPackages.setModel(new DefaultComboBoxModel(new String[] {"  JDay's Spa Packages", "  Balancing Spa Package", "  Healing Spa Package", "  Purifying Spa Package", "  Renewing Spa Package", "  JDAY Experience"}));
		comboBoxPackages.setToolTipText("");
		comboBoxPackages.setBounds(178, 206, 173, 25);
		add(comboBoxPackages);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirm.setBounds(558, 465, 89, 23);
		add(btnConfirm);
		
		JLabel lblSpaBooking = new JLabel("   SPA BOOKING");
		lblSpaBooking.setIcon(new ImageIcon(SpaBooking.class.getResource("/images/Logo.png")));
		lblSpaBooking.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblSpaBooking.setBounds(50, 26, 301, 121);
		add(lblSpaBooking);
		
		JLabel label = new JLabel("Terms & Condition :");
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		label.setBounds(396, 57, 163, 14);
		add(label);

	}
}
