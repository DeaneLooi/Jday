package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import jday.util.BackgroundPanel;
import org.freixas.jcalendar.JCalendar;


public class Sport2 extends BackgroundPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Sport2() {
		super();
		initialize();
	}
	
	public Sport2(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel lblDearMemberThe = new JLabel("Dear member, the maximum time for booking is 2 hours.");
		lblDearMemberThe.setBounds(89, 30, 486, 25);
		lblDearMemberThe.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		add(lblDearMemberThe);
		
		JButton button = new JButton("Confirm");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Your booking no. is 123212");
			}
		});
		button.setBounds(640, 430, 87, 23);
		add(button);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new Sport(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		button_1.setBounds(640, 464, 87, 23);
		add(button_1);
		
		JLabel label_1 = new JLabel("Please  choose your date");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_1.setBounds(89, 57, 246, 23);
		add(label_1);
		
		JLabel label_2 = new JLabel("Booking time:");
		label_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_2.setBounds(89, 343, 129, 25);
		add(label_2);
		
		JLabel label_3 = new JLabel("Court:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(145, 381, 70, 25);
		add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 381, 176, 30);
		add(textField);
		
		JLabel label_4 = new JLabel("Start:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(145, 419, 57, 23);
		add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Please choose the time", "0800-0900", "0900-1000", "1000-1100", "1100-1200", "1200-1300", "1300-1400", "1400-1500", "1500-1600", "1600-1700", "1700-1800", "1800-1900", "1900-2000"}));
		comboBox.setBounds(210, 419, 157, 20);
		add(comboBox);
		
		JLabel label_5 = new JLabel("End:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(399, 414, 46, 33);
		add(label_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Please choose the time", "0800-0900", "0900-1000", "1000-1100", "1100-1200", "1200-1300", "1300-1400", "1400-1500", "1500-1600", "1600-1700", "1700-1800", "1800-1900", "1900-2000"}));
		comboBox_1.setBounds(457, 421, 157, 20);
		add(comboBox_1);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(89, 94, 572, 238);
		add(calendar);

	}
}
