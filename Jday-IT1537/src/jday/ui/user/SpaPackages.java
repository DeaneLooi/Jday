package jday.ui.user;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import jday.util.BackgroundPanel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class SpaPackages extends BackgroundPanel {

	protected static final JComponent txtpnHarmonisingTheBody = null;
	protected static final JComponent txtpnCreateYourOwn = null;
	protected static final JComponent txtpnBasedOnMalay = null;

	/**
	 * Create the panel.
	 */
	public SpaPackages() {
		super();
		initialize();
	}
	
	public SpaPackages(JFrame f){
		this();
		myFrame = f;
	}
	
	private void initialize(){
		setSize(new Dimension(750, 500));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setLayout(null);
		
		JButton btnBookNow = new JButton("Book Now!");
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new SpaBooking(myFrame);
				myFrame.getContentPane().removeAll();
				myFrame.getContentPane().add(panel);
				myFrame.getContentPane().validate();
				myFrame.getContentPane().repaint();
			}
		});
		btnBookNow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBookNow.setOpaque(false);
		btnBookNow.setBounds(617, 419, 103, 35);
		add(btnBookNow);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"     Berdua-Dua", "", "     Best of Friends", "", "    Couple suite upgrade"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(39, 339, 218, 73);
		add(list_1);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list_1.setOpaque(false);
		list_1.setFont(new Font("Candara", Font.PLAIN, 16));
		list_1.setBackground(SystemColor.menu);
		
		final JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if( list.getSelectedIndex()==0){
					txtpnHarmonisingTheBody.setVisible(true);
					txtpnBasedOnMalay.setVisible(false);
					txtpnCreateYourOwn.setVisible(false);
					
				}
				if( list.getSelectedIndex()==1){
					txtpnHarmonisingTheBody.setVisible(false);
					txtpnBasedOnMalay.setVisible(true);
					txtpnCreateYourOwn.setVisible(false);
				}
				if( list.getSelectedIndex()==2){
					txtpnHarmonisingTheBody.setVisible(false);
					txtpnBasedOnMalay.setVisible(false);
					txtpnCreateYourOwn.setVisible(true);
				}
				
			}
		});
		list.setBounds(39, 190, 218, 73);
		add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setFont(new Font("Candara", Font.PLAIN, 16));
		list.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		list.setOpaque(false);
		list.setBackground(SystemColor.menu);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"     Balancing Spa Package", "", "     Healing Spa Package", "", "     JDAY Experience"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(null);
		panel_1.setBounds(340, 88, 380, 305);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDescription = new JLabel("DESCRIPTION");
		lblDescription.setBackground(Color.BLACK);
		lblDescription.setForeground(new Color(0, 0, 0));
		lblDescription.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblDescription.setBounds(144, 22, 103, 14);
		panel_1.add(lblDescription);
		
		JTextPane txtpnBasedOnMalay = new JTextPane();
		txtpnBasedOnMalay.setText("\r\nBased on Malay jamu philosophy, jamu herbal remedies and massages emphasise on healing from within. Be treated to traditional Indonesian and Malay spa therapies.\r\n\r\n \r\n2 hours 30 minutes: SGD 320.00 (exclusive of taxes)");
		txtpnBasedOnMalay.setFont(new Font("Candara", Font.PLAIN, 15));
		txtpnBasedOnMalay.setEditable(false);
		txtpnBasedOnMalay.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnBasedOnMalay.setBackground(SystemColor.menu);
		txtpnBasedOnMalay.setAlignmentY(5.0f);
		txtpnBasedOnMalay.setAlignmentX(3.0f);
		txtpnBasedOnMalay.setBounds(34, 58, 319, 224);
		panel_1.add(txtpnBasedOnMalay);
		
		JTextPane txtpnHarmonisingTheBody = new JTextPane();
		txtpnHarmonisingTheBody.setBounds(34, 58, 319, 224);
		panel_1.add(txtpnHarmonisingTheBody);
		txtpnHarmonisingTheBody.setEditable(false);
		txtpnHarmonisingTheBody.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnHarmonisingTheBody.setBackground(SystemColor.menu);
		txtpnHarmonisingTheBody.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnHarmonisingTheBody.setAlignmentX(3.0f);
		txtpnHarmonisingTheBody.setAlignmentY(5.0f);
		txtpnHarmonisingTheBody.setFont(new Font("Candara", Font.PLAIN, 15));
		txtpnHarmonisingTheBody.setText("\r\n\r\nHarmonising the body by unblocking the vital energy, qi, experience the powerful effects of Ginseng and feel the Balancing effects of this traditional Chinese based treatment.\r\n\r\n \r\n4 hours: SGD 460.00 (exclusive of taxes)");
		
		JTextPane txtpnCreateYourOwn = new JTextPane();
		txtpnCreateYourOwn.setText("\r\nCreate your own Damai Experience from our a la carte menu. Choose from our a la carte menu your preferred body scrub and massage, and complete your holistic treatment with a healthy spa lunch at Oasis.\r\n\r\n \r\n2 hours 30 minutes: SGD 300.00 (exclusive of taxes)");
		txtpnCreateYourOwn.setFont(new Font("Candara", Font.PLAIN, 15));
		txtpnCreateYourOwn.setEditable(false);
		txtpnCreateYourOwn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnCreateYourOwn.setBackground(SystemColor.menu);
		txtpnCreateYourOwn.setAlignmentY(5.0f);
		txtpnCreateYourOwn.setAlignmentX(3.0f);
		txtpnCreateYourOwn.setBounds(34, 58, 319, 224);
		panel_1.add(txtpnCreateYourOwn);
		
		JLabel lblJdaysJourneyIndex = new JLabel("JDAY's Journey Index");
		lblJdaysJourneyIndex.setForeground(Color.BLACK);
		lblJdaysJourneyIndex.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblJdaysJourneyIndex.setBounds(51, 160, 173, 19);
		add(lblJdaysJourneyIndex);
		
		JLabel lblJdaysCoupleJourney = new JLabel("JDAY's Couple Journey Index");
		lblJdaysCoupleJourney.setForeground(Color.BLACK);
		lblJdaysCoupleJourney.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblJdaysCoupleJourney.setBounds(37, 296, 220, 19);
		add(lblJdaysCoupleJourney);
		
		JLabel lblSpaPackages = new JLabel("   SPA PACKAGES\r\n");
		lblSpaPackages.setIcon(new ImageIcon(SpaPackages.class.getResource("/images/Logo.png")));
		lblSpaPackages.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblSpaPackages.setBounds(26, 11, 265, 121);
		add(lblSpaPackages);

	}
}
