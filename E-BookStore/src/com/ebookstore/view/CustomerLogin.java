package com.ebookstore.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textCustomerName;
	private JTextField textCustomerSurname;
	private JLabel lblSurname ;
	private CustomerPanel customerPanel;

	public CustomerLogin() {
		setTitle("Customer Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCustomerLogin = new JLabel("Customer Login");
		lblCustomerLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomerLogin.setBounds(143, 34, 168, 22);
		contentPane.add(lblCustomerLogin);

		final JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(21, 98, 61, 29);
		contentPane.add(lblName);

		 lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSurname.setBounds(21, 138, 80, 29);
		contentPane.add(lblSurname);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerPanel = new CustomerPanel(lblName.getText(), lblSurname.getText());
			}
		});
		btnLogin.setBounds(238, 199, 89, 23);
		contentPane.add(btnLogin);

		textCustomerName = new JTextField();
		textCustomerName.setBounds(121, 103, 86, 20);
		contentPane.add(textCustomerName);
		textCustomerName.setColumns(10);

		textCustomerSurname = new JTextField();
		textCustomerSurname.setBounds(121, 143, 86, 20);
		contentPane.add(textCustomerSurname);
		textCustomerSurname.setColumns(10);
	}

}
