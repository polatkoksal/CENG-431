package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddCustomerPanel extends JFrame {

	private static final long serialVersionUID = -5863124355146942675L;
	private JPanel contentPane;
	private JTextField textUsrName;
	private JTextField textUsrSurname;
	private JTextField textUsrCredit;
	private JButton btnSave;
	private JButton back;

	public AddCustomerPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAddCustomerPanel = new JLabel("Add Customer Panel");
		lblAddCustomerPanel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddCustomerPanel.setBounds(107, 33, 171, 40);
		contentPane.add(lblAddCustomerPanel);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(36, 104, 118, 14);
		contentPane.add(lblName);

		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSurname.setBounds(36, 153, 118, 14);
		contentPane.add(lblSurname);

		textUsrName = new JTextField();
		textUsrName.setBounds(164, 101, 114, 20);
		contentPane.add(textUsrName);
		textUsrName.setColumns(10);

		textUsrSurname = new JTextField();
		textUsrSurname.setBounds(164, 150, 114, 20);
		contentPane.add(textUsrSurname);
		textUsrSurname.setColumns(10);

		btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSave.setBounds(333, 265, 89, 23);
		contentPane.add(btnSave);

		JLabel lblCustomerCredit = new JLabel("Customer Credit");
		lblCustomerCredit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCustomerCredit.setBounds(36, 201, 118, 14);
		contentPane.add(lblCustomerCredit);

		textUsrCredit = new JTextField();
		textUsrCredit.setBounds(164, 198, 114, 20);
		contentPane.add(textUsrCredit);
		textUsrCredit.setColumns(10);

		back = new JButton("Back");
		back.setFont(new Font("Tahoma", Font.BOLD, 11));
		back.setBounds(235, 264, 86, 24);
		contentPane.add(back);
	}

	public void addActionListenerToSaveCustomerBtn(ActionListener listener) {
		btnSave.addActionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JTextField getTextUsrName() {
		return textUsrName;
	}

	public void setTextUsrName(JTextField textUsrName) {
		this.textUsrName = textUsrName;
	}

	public JTextField getTextUsrSurname() {
		return textUsrSurname;
	}

	public void setTextUsrSurname(JTextField textUsrSurname) {
		this.textUsrSurname = textUsrSurname;
	}

	public JTextField getTextUsrCredit() {
		return textUsrCredit;
	}

	public void setTextUsrCredit(JTextField textUsrCredit) {
		this.textUsrCredit = textUsrCredit;
	}

}
