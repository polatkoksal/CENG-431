package com.ebookstore.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textAdminName;
	private JTextField textAdminSurname;
	private AdminMenuPanel adminMenuPanel;

	public AdminLoginPage() {
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

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMenuPanel = new AdminMenuPanel();
				adminMenuPanel.setVisible(true);
				setVisible(false);
			}
		});
		btnLogin.setBounds(317, 263, 89, 23);
		contentPane.add(btnLogin);
	}
}
