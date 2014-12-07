package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CustomerLogin extends JFrame {

	private static final long serialVersionUID = 6159482071555506846L;
	private JPanel contentPane;
	private JTextField textCustomerName;
	private JTextField textCustomerSurname;
	private JLabel lblSurname;
	private JButton btnLogin;
	private JButton back;

	public CustomerLogin() {
		setTitle("Customer Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCustomerLogin = new JLabel("Customer Login");
		lblCustomerLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomerLogin.setBounds(143, 34, 168, 22);
		contentPane.add(lblCustomerLogin);

		final JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(78, 98, 61, 29);
		contentPane.add(lblName);

		lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSurname.setBounds(78, 138, 80, 29);
		contentPane.add(lblSurname);

		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBounds(331, 197, 89, 23);
		contentPane.add(btnLogin);

		textCustomerName = new JTextField();
		textCustomerName.setBounds(167, 103, 126, 20);
		contentPane.add(textCustomerName);
		textCustomerName.setColumns(10);

		textCustomerSurname = new JTextField();
		textCustomerSurname.setBounds(167, 143, 126, 20);
		contentPane.add(textCustomerSurname);
		textCustomerSurname.setColumns(10);

		back = new JButton("Back");
		back.setFont(new Font("Tahoma", Font.BOLD, 13));
		back.setBounds(230, 197, 89, 24);
		contentPane.add(back);
	}

	public void addActionListenerToCustomerLoginBtn(ActionListener listener) {
		btnLogin.addActionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JTextField getTextCustomerName() {
		return textCustomerName;
	}

	public void setTextCustomerName(JTextField textCustomerName) {
		this.textCustomerName = textCustomerName;
	}

	public JTextField getTextCustomerSurname() {
		return textCustomerSurname;
	}

	public void setTextCustomerSurname(JTextField textCustomerSurname) {
		this.textCustomerSurname = textCustomerSurname;
	}

}
