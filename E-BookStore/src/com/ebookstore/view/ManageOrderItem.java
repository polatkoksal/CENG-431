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

public class ManageOrderItem extends JFrame {

	private static final long serialVersionUID = -1737888456476041559L;
	private JPanel contentPane;
	private JButton btnSave;
	private JList jItemList;
	private JList jCustomlist;
	private JComboBox comboBox;
	private JButton back;

	public ManageOrderItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCustomerList = new JLabel("Customer List");
		lblCustomerList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCustomerList.setBounds(10, 84, 95, 14);
		contentPane.add(lblCustomerList);

		JLabel lblItemList = new JLabel("Item List");
		lblItemList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblItemList.setBounds(432, 85, 95, 14);
		contentPane.add(lblItemList);

		jCustomlist = new JList();
		jCustomlist.setBounds(21, 120, 196, 236);
		contentPane.add(jCustomlist);

		jItemList = new JList();
		jItemList.setBounds(340, 120, 204, 236);
		contentPane.add(jItemList);

		JLabel lblManageOrderItem = new JLabel("Manage Order Item");
		lblManageOrderItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblManageOrderItem.setBounds(171, 29, 182, 14);
		contentPane.add(lblManageOrderItem);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "PREPARING",
				"SHIPPED", "DELIVERED" }));
		comboBox.setBounds(25, 459, 114, 20);
		contentPane.add(comboBox);

		btnSave = new JButton("Save");
		btnSave.setBounds(411, 456, 89, 23);
		contentPane.add(btnSave);

		back = new JButton("Back");
		back.setBounds(328, 456, 81, 23);
		contentPane.add(back);
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
