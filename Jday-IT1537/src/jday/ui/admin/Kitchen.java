package jday.ui.admin;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.lang.reflect.Member;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import jday.util.BackgroundPanel;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;

public class Kitchen extends BackgroundPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Kitchen() {
		super();
		initialize();
	}

	public Kitchen(JFrame f) {
		super();
		myFrame = f;
		initialize();
	}

	public Kitchen(JFrame f, Member m) {
		this();
		myFrame = f;
	}

	private void initialize() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(null, "JPanel title",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(-6, -16, 762, 523);
		add(panel);
		panel.setLayout(null);

		final JToggleButton tglbtnNewToggleButton = new JToggleButton("Pending");
		tglbtnNewToggleButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnNewToggleButton.setFont(new Font("Candara", Font.PLAIN, 12));
		tglbtnNewToggleButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					tglbtnNewToggleButton.setText("Completed");

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					tglbtnNewToggleButton.setText("Pending");
				}
			}
		});
		
		final JToggleButton toggleButton = new JToggleButton("Pending");
		toggleButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		toggleButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					toggleButton.setText("Completed");

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					toggleButton.setText("Pending");
				}
			}
		});
		toggleButton.setSelected(false);
		toggleButton.setFont(new Font("Candara", Font.PLAIN, 12));
		toggleButton.setBounds(541, 187, 118, 23);
		panel.add(toggleButton);

		tglbtnNewToggleButton.setSelected(false);
		tglbtnNewToggleButton.setBounds(541, 251, 118, 23);
		panel.add(tglbtnNewToggleButton);

		JLabel lblAddress = new JLabel("Status");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(580, 150, 79, 14);
		panel.add(lblAddress);

		JLabel lblName = new JLabel("No.");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(84, 139, 54, 36);
		panel.add(lblName);
		lblName.setHorizontalAlignment(SwingConstants.TRAILING);

		JLabel lblBirthdate = new JLabel("Order(s)");
		lblBirthdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBirthdate.setBounds(190, 134, 60, 46);
		panel.add(lblBirthdate);
		lblBirthdate.setHorizontalAlignment(SwingConstants.TRAILING);

		JLabel lblMembersId = new JLabel("Qty.");
		lblMembersId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMembersId.setBounds(316, 139, 67, 36);
		panel.add(lblMembersId);

		JLabel lblGivenPin = new JLabel("Location");
		lblGivenPin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGivenPin.setBounds(411, 131, 67, 52);
		panel.add(lblGivenPin);

		JLabel lblMembersParticular = new JLabel("RESTAURANT ORDER SUMMARY");
		lblMembersParticular.setForeground(new Color(0, 0, 0));
		lblMembersParticular.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblMembersParticular.setBounds(274, 51, 268, 46);
		panel.add(lblMembersParticular);
		lblMembersParticular.setHorizontalAlignment(SwingConstants.CENTER);

		table = new JTable();
		table.setRowHeight(32);
		table.setBounds(113, 149, 575, 288);
		panel.add(table);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		table.setOpaque(false);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "", "", null, null, null },
				{ "1", "Grilled Fish", "1", "Pool", null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null }, }, new String[] { "Number",
				"Food", "Qty.", "Location", "Status" }));

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setOpaque(false);
		btnRefresh.setFont(new Font("Candara", Font.PLAIN, 12));
		btnRefresh.setBounds(113, 453, 86, 23);
		panel.add(btnRefresh);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(0).setMaxWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(38);
		table.getColumnModel().getColumn(2).setMinWidth(38);
		table.getColumnModel().getColumn(2).setMaxWidth(45);

	}
}
