package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class ManageOrderItem extends JFrame {

	private static final long serialVersionUID = -1737888456476041559L;
	private JPanel contentPane;
	private JButton btnSave;
	private JList jItemList;
	private JList jCustomlist;
	private JComboBox comboBox;
	private JButton back;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	public ManageOrderItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCustomerList = new JLabel("Customer List");
		lblCustomerList.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCustomerList.setBounds(10, 84, 114, 14);
		contentPane.add(lblCustomerList);

		JLabel lblItemList = new JLabel("Item List");
		lblItemList.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblItemList.setBounds(320, 84, 95, 14);
		contentPane.add(lblItemList);

		JLabel lblManageOrderItem = new JLabel("Manage Order Item");
		lblManageOrderItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblManageOrderItem.setBounds(171, 29, 182, 14);
		contentPane.add(lblManageOrderItem);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "PREPARING",
				"SHIPPED", "DELIVERED" }));
		comboBox.setBounds(25, 439, 114, 40);
		contentPane.add(comboBox);

		btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSave.setBounds(411, 449, 89, 30);
		contentPane.add(btnSave);

		back = new JButton("Back");
		back.setFont(new Font("Tahoma", Font.BOLD, 11));
		back.setBounds(320, 449, 89, 30);
		contentPane.add(back);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 120, 193, 284);
		contentPane.add(scrollPane);
		
				jCustomlist = new JList();
				scrollPane.setViewportView(jCustomlist);
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(320, 120, 207, 284);
				contentPane.add(scrollPane_1);
				
						jItemList = new JList();
						scrollPane_1.setViewportView(jItemList);
	}

	public void addActionListenerToManageSaveBtn(ActionListener listener) {
		btnSave.addActionListener(listener);
	}

	public void addListSelectionListenerToCustomList(
			ListSelectionListener listener) {
		jCustomlist.addListSelectionListener(listener);
	}

	public void addListSelectionListenerToItemList(
			ListSelectionListener listener) {
		jItemList.addListSelectionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JList getjItemList() {
		return jItemList;
	}

	public void setjItemList(JList jItemList) {
		this.jItemList = jItemList;
	}

	public JList getjCustomlist() {
		return jCustomlist;
	}

	public void setjCustomlist(JList jCustomlist) {
		this.jCustomlist = jCustomlist;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

}
