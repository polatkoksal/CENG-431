package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 7031949166276083358L;
	private JPanel contentPane;
	private JLabel lblLognPage;
	private JButton btnAdmin;
	private JButton btnCustomer;

	public LoginPage() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblLognPage = new JLabel("LOGIN PAGE");
		lblLognPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLognPage.setBounds(179, 47, 121, 14);
		contentPane.add(lblLognPage);

		btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(179, 150, 89, 23);
		contentPane.add(btnAdmin);

		btnCustomer = new JButton("Customer");
		btnCustomer.setBounds(179, 207, 89, 23);
		contentPane.add(btnCustomer);
	}

	public void addActionListenerToAdminBtn(ActionListener listener) {
		btnAdmin.addActionListener(listener);
	}

	public void addActionListenerToCustomerBtn(ActionListener listener) {
		btnCustomer.addActionListener(listener);
	}
}
