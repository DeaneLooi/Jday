package jday.ui.user;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jday.util.BackgroundPanel;
import javax.swing.JTextField;

public class KaraokeConfirmation extends BackgroundPanel {


	public KaraokeConfirmation() {
		super();
		initialize();
	}

	public KaraokeConfirmation(JFrame f) {
		this();
		myFrame = f;
		
	}
	
	private void initialize(){
		setSize(750,500);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new KaraokeRegular(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
				
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(316, 309, 89, 23);
		add(btnNewButton);
		
		JTextPane txtpnDearMemberYou = new JTextPane();
		txtpnDearMemberYou.setBorder(new LineBorder(new Color(123, 104, 238), 4));
		txtpnDearMemberYou.setText("    Dear member, you have booked the following:\r\n\r\n\r\n\tDate: 28 January  2013\r\n\tTime: JDAY Happy (2pm -7pm)\r\n\tRoom Type: Family Room\r\n\t\r\n\r\n\t\tYour booking No. is 5634A\r\n\r\n    Please present the booking number upon **        \r\n\t\r\n\tThank you!\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t");
		txtpnDearMemberYou.setOpaque(false);
		txtpnDearMemberYou.setEditable(false);
		txtpnDearMemberYou.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnDearMemberYou.setForeground(new Color(0, 0, 0));
		txtpnDearMemberYou.setBounds(53, 32, 387, 341);
		add(txtpnDearMemberYou);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(58, 233, 382, 2);
		add(separator);
	}
}
