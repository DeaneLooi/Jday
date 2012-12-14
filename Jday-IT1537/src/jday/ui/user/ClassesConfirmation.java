package jday.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import jday.entities.Member;
import jday.entities.Class;
import jday.util.BackgroundPanel;

public class ClassesConfirmation extends BackgroundPanel{


	private Class c = null;
	private Member m = null;
	
	public ClassesConfirmation() {
		super();
		initialize();
	}
	public ClassesConfirmation(JFrame f){
		this();
		myFrame = f;
	}
	
	public ClassesConfirmation(JFrame f, Member m, Class c){
		super();
		this.c = c;
		this.m = m;
		c.retrieveClass();
		m.retrieveMember();
		myFrame = f;
		initialize();
		
	}
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setOpaque(false);
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new Classes(myFrame,m);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnOk.setBounds(133, 363, 89, 23);
		add(btnOk);
		
		JTextPane txtpnConfirmation = new JTextPane();
		txtpnConfirmation.setSelectionColor(new Color(148, 0, 211));
		txtpnConfirmation.setEditable(false);
		txtpnConfirmation.setForeground(new Color(0, 0, 0));
		txtpnConfirmation.setBorder(new LineBorder(new Color(138, 43, 226), 4));
		txtpnConfirmation.setOpaque(false);
		txtpnConfirmation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnConfirmation.setText(" Dear member, you have registered the following class:\r\n\r\n Class:\r\n\r\n Venue:\r\n\r\n Fees:\r\n\r\n Timing:\r\n\t\t\t\t\t\t\t\t\tYour registering No. is \r\n\r\n\t\t\t\t\t\t\t\t\t\tThank You\r\n\t\t\t\t\t\t\t\t\t\tfor your registration");
		txtpnConfirmation.setBounds(38, 46, 511, 390);
		add(txtpnConfirmation);
		
		JLabel lblClass = new JLabel("");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblClass.setForeground(new Color(0, 0, 0));
		lblClass.setBounds(179, 89, 270, 23);
		lblClass.setText(c.getClasstype());
		add(lblClass);
		
		JLabel lblVenue = new JLabel("");
		lblVenue.setForeground(new Color(0, 0, 0));
		lblVenue.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblVenue.setBounds(179, 132, 270, 23);
		lblVenue.setText(c.getVenue());
		add(lblVenue);
		
		JLabel lblFees = new JLabel("");
		lblFees.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFees.setForeground(new Color(0, 0, 0));
		lblFees.setBounds(179, 175, 270, 23);
		lblFees.setText(c.getFees());
		add(lblFees);
		
		JLabel lblRegisterno = new JLabel("1");
		lblRegisterno.setForeground(new Color(0, 0, 0));
		lblRegisterno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegisterno.setBounds(433, 261, 89, 18);
		add(lblRegisterno);
		
		JLabel lblTiming = new JLabel((String) null);
		lblTiming.setForeground(Color.BLACK);
		lblTiming.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTiming.setBounds(179, 217, 270, 23);
		lblTiming.setText(c.getTiming());
		add(lblTiming);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 307, 511, 2);
		add(separator);
	}
}
