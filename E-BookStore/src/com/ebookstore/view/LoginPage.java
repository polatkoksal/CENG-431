package com.ebookstore.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private AdminLoginPage adminLogin;

	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLognPage = new JLabel("LOGIN PAGE");
		lblLognPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLognPage.setBounds(179, 47, 121, 14);
		contentPane.add(lblLognPage);

		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminLogin = new AdminLoginPage();
				adminLogin.setVisible(true);
				setVisible(false);
			}
		});
		btnAdmin.setBounds(179, 150, 89, 23);
		contentPane.add(btnAdmin);

		JButton btnCustomer = new JButton("Customer");
		btnCustomer.setBounds(179, 207, 89, 23);
		contentPane.add(btnCustomer);
	}
}
