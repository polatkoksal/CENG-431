package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UpdateRemoveCustomer extends JFrame {

	private static final long serialVersionUID = -6180979058074168352L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textSurName;
	private JTextField textCredit;
	private JButton btnUpdate;
	private JButton btnRemove;
	private JList jlist;
	private JButton back;

	public UpdateRemoveCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		jlist = new JList();
		jlist.setBounds(10, 84, 205, 283);
		contentPane.add(jlist);

		JLabel lblUpdateRemove = new JLabel("Update / Remove Customer Panel");
		lblUpdateRemove.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUpdateRemove.setBounds(70, 11, 274, 14);
		contentPane.add(lblUpdateRemove);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(271, 85, 46, 14);
		contentPane.add(lblName);

		textName = new JTextField();
		textName.setBounds(368, 82, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);

		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSurname.setBounds(271, 142, 60, 14);
		contentPane.add(lblSurname);

		textSurName = new JTextField();
		textSurName.setBounds(368, 140, 86, 20);
		contentPane.add(textSurName);
		textSurName.setColumns(10);

		JLabel lblCredit = new JLabel("Credit");
		lblCredit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCredit.setBounds(271, 208, 46, 14);
		contentPane.add(lblCredit);

		textCredit = new JTextField();
		textCredit.setBounds(368, 206, 86, 20);
		contentPane.add(textCredit);
		textCredit.setColumns(10);

		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(308, 280, 89, 23);
		contentPane.add(btnUpdate);

		btnRemove = new JButton("Remove");
		btnRemove.setBounds(409, 280, 89, 23);
		contentPane.add(btnRemove);

		back = new JButton("Back");
		back.setBounds(351, 315, 117, 25);
		contentPane.add(back);
	}

	public void addActionListenerToUpdateCustomerBtn(ActionListener listener) {
		btnUpdate.addActionListener(listener);
	}

	public void addActionListenerToRemoveCustomerBtn(ActionListener listener) {
		btnRemove.addActionListener(listener);
	}

	public void addListSelectionListenerToUpdateCustomerList(
			ListSelectionListener listener) {
		jlist.addListSelectionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JTextField getTextName() {
		return textName;
	}

	public void setTextName(JTextField textName) {
		this.textName = textName;
	}

	public JTextField getTextSurName() {
		return textSurName;
	}

	public void setTextSurName(JTextField textSurName) {
		this.textSurName = textSurName;
	}

	public JTextField getTextCredit() {
		return textCredit;
	}

	public void setTextCredit(JTextField textCredit) {
		this.textCredit = textCredit;
	}

	public JList getJlist() {
		return jlist;
	}

	public void setJlist(JList jlist) {
		this.jlist = jlist;
	}

}
