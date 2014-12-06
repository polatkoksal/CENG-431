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
		lblName.setBounds(36, 104, 86, 14);
		contentPane.add(lblName);

		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(36, 153, 86, 14);
		contentPane.add(lblSurname);

		textUsrName = new JTextField();
		textUsrName.setBounds(141, 101, 86, 20);
		contentPane.add(textUsrName);
		textUsrName.setColumns(10);

		textUsrSurname = new JTextField();
		textUsrSurname.setBounds(141, 150, 86, 20);
		contentPane.add(textUsrSurname);
		textUsrSurname.setColumns(10);

		btnSave = new JButton("Save");
		btnSave.setBounds(333, 265, 89, 23);
		contentPane.add(btnSave);

		JLabel lblCustomerCredit = new JLabel("Customer Credit");
		lblCustomerCredit.setBounds(36, 201, 95, 14);
		contentPane.add(lblCustomerCredit);

		textUsrCredit = new JTextField();
		textUsrCredit.setBounds(141, 198, 86, 20);
		contentPane.add(textUsrCredit);
		textUsrCredit.setColumns(10);

		back = new JButton("Back");
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
