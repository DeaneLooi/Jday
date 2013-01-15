package jday.ui.admin;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Insets;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultCaret;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import jday.util.BackgroundPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.freixas.jcalendar.JCalendarCombo;

public class AUpdate2 extends BackgroundPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public AUpdate2() {
		super();
		initialize();
	}
	
	public AUpdate2(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(new Color(204, 51, 153));
		setSize(new Dimension(750, 500));
		setLayout(null);
		
		JLabel label = new JLabel("logo");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JPanel panel = new AMainpage(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
				
			}
		});
		label.setIcon(new ImageIcon(AUpdate2.class.getResource("/images/90logo.png")));
		label.setBounds(10, 11, 94, 102);
		add(label);
		
		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(48, 124, 106, 27);
		add(lblNewLabel);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDescription.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDescription.setBounds(48, 326, 106, 27);
		add(lblDescription);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(202, 125, 466, 27);
		add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		textArea.setWrapStyleWord(true);
		textArea.setFocusTraversalKeysEnabled(false);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea.setBounds(202, 280, 466, 150);
		add(textArea);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new AUpdate(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(562, 441, 106, 35);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Edit Events");
		lblNewLabel_1.setForeground(new Color(153, 51, 153));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		lblNewLabel_1.setBounds(114, 43, 160, 30);
		add(lblNewLabel_1);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDate.setBounds(48, 179, 106, 27);
		add(lblDate);
		
		JLabel lblVenue = new JLabel("Venue:");
		lblVenue.setHorizontalAlignment(SwingConstants.TRAILING);
		lblVenue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVenue.setBounds(48, 236, 106, 27);
		add(lblVenue);
		
		JCalendarCombo calendarCombo = new JCalendarCombo();
		calendarCombo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		calendarCombo.setBounds(202, 182, 307, 35);
		add(calendarCombo);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(202, 242, 466, 27);
		add(textField_1);

	}
}


/* JPanel panel = new AUpdate2(myFrame);
			myFrame.getContentPane().removeAll();
			myFrame.getContentPane().add(panel);
			myFrame.getContentPane().validate();
			myFrame.getContentPane().repaint();
	To change panel		
*/
