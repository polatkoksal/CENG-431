package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private static final long serialVersionUID = 3031000867754745289L;
	private JPanel contentPane;
	private JTextField textAdminName;
	private JTextField textAdminSurname;
	private JButton btnLogin;
	private JButton back;

	public AdminLogin() {
		setTitle("Admin Login Page\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdminLogin = new JLabel("Admin Login ");
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdminLogin.setBounds(140, 47, 113, 22);
		contentPane.add(lblAdminLogin);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(44, 115, 57, 32);
		contentPane.add(lblName);

		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(44, 178, 57, 22);
		contentPane.add(lblSurname);

		textAdminName = new JTextField();
		textAdminName.setBounds(111, 121, 86, 20);
		contentPane.add(textAdminName);
		textAdminName.setColumns(10);

		textAdminSurname = new JTextField();
		textAdminSurname.setBounds(111, 180, 86, 20);
		contentPane.add(textAdminSurname);
		textAdminSurname.setColumns(10);

		btnLogin = new JButton("Login");
		btnLogin.setBounds(317, 263, 89, 23);
		contentPane.add(btnLogin);

		back = new JButton("Back");
		back.setBounds(219, 262, 86, 24);
		contentPane.add(back);
	}

	public void addActionListenerToAdminLoginBtn(ActionListener listener) {
		btnLogin.addActionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JTextField getTextAdminName() {
		return textAdminName;
	}

	public void setTextAdminName(JTextField textAdminName) {
		this.textAdminName = textAdminName;
	}

	public JTextField getTextAdminSurname() {
		return textAdminSurname;
	}

	public void setTextAdminSurname(JTextField textAdminSurname) {
		this.textAdminSurname = textAdminSurname;
	}

}
