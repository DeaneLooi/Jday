package jday.ui.admin;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.lang.reflect.Member;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import jday.entities.FnB;
import jday.util.BackgroundPanel;
import jday.util.FnBViewTableModel;

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
		
		JTable table = new JTable();
		
		ArrayList<FnB>list = FnB.searchFnbOrder(null);
		FnBViewTableModel model = new FnBViewTableModel(list);
		table.setModel(model);
		table.setBounds(0,0,600,400);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 50, 600, 400);
		add(scrollPane);

		JLabel lblMembersParticular = new JLabel("RESTAURANT ORDER SUMMARY");
		lblMembersParticular.setForeground(new Color(0, 0, 0));
		lblMembersParticular.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblMembersParticular.setBounds(224, 23, 268, 46);
		panel.add(lblMembersParticular);
		lblMembersParticular.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setOpaque(false);
		btnRefresh.setFont(new Font("Candara", Font.PLAIN, 12));
		btnRefresh.setBounds(52, 470, 86, 23);
		panel.add(btnRefresh);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setOpaque(false);
		btnDelete.setFont(new Font("Candara", Font.PLAIN, 12));
		btnDelete.setBounds(150, 469, 86, 23);
		panel.add(btnDelete);

	}
}
