package jday.ui.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import jday.util.BackgroundPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.freixas.jcalendar.JCalendar;
import javax.swing.border.MatteBorder;

public class AUpdate extends BackgroundPanel {

	/**
	 * Create the panel.
	 */
	public AUpdate() {
		super();
		initialize();
	}
	
	public AUpdate(JFrame f){
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
		label.setIcon(new ImageIcon(AUpdate.class.getResource("/images/90logo.png")));
		label.setBounds(10, 11, 94, 102);
		add(label);
		
		JCalendar calendar = new JCalendar();
		calendar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		calendar.setBounds(20, 124, 720, 365);
		add(calendar);

	}
}
