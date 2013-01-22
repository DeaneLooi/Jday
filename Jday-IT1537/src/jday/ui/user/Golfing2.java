package jday.ui.user;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import jday.entities.Member;
import jday.util.BackgroundPanel;
import org.freixas.jcalendar.JCalendar;
import javax.swing.ButtonGroup;


public class Golfing2 extends BackgroundPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	public Golfing2() {
		super();
		initialize();
	}
	
	public Golfing2(JFrame f,Member m){
		this();
		myFrame = f;
		this.m = m;
	}

	/**
	 * Create the panel.
	 */
	public void initialize() {
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JButton btnBack = new JButton("Confirm");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new Golfing(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnBack.setBounds(632, 448, 89, 23);
		add(btnBack);
		
		JLabel lblPleaseChooseYour = new JLabel("Please  choose your date");
		lblPleaseChooseYour.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPleaseChooseYour.setBounds(89, 25, 246, 23);
		add(lblPleaseChooseYour);
		
		JLabel label = new JLabel("Please choose the time and Green fees");
		label.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label.setBounds(89, 321, 329, 23);
		add(label);
		
		JLabel label_1 = new JLabel("Time:");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_1.setBounds(92, 366, 57, 23);
		add(label_1);
		
		JRadioButton radioButton = new JRadioButton("Morning");
		buttonGroup.add(radioButton);
		radioButton.setOpaque(false);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton.setBounds(143, 398, 109, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Afternoon");
		buttonGroup.add(radioButton_1);
		radioButton_1.setOpaque(false);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_1.setBounds(143, 426, 109, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Evening");
		buttonGroup.add(radioButton_2);
		radioButton_2.setOpaque(false);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_2.setBounds(143, 454, 109, 23);
		add(radioButton_2);
		
		JLabel label_2 = new JLabel("Green Fees:");
		label_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_2.setBounds(380, 362, 102, 31);
		add(label_2);
		
		JRadioButton radioButton_3 = new JRadioButton("9 Holes");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setOpaque(false);
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_3.setBounds(466, 398, 102, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("18 Holes");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setOpaque(false);
		radioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButton_4.setBounds(466, 426, 102, 23);
		add(radioButton_4);
		
		JCalendar calendar = new JCalendar();
		calendar.setBackground(new Color(221, 160, 221));
		calendar.setBounds(77, 59, 630, 251);
		add(calendar);
	

	}
}
