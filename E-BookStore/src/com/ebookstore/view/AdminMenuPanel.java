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

public class AdminMenuPanel extends JFrame {

	private JPanel contentPane;
	private AddCustomerPanel addCustomer;
	private AddTitlePanel addTitle;
	private UpdateOrRemoveCustomer updOrRemove;
	private UpdateOrRemoveTitle updOrRemoveTitle;

	public AdminMenuPanel() {
		setTitle("Admin Menu Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Menu Panel");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMenu.setBounds(183, 29, 89, 24);
		contentPane.add(lblMenu);

		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addCustomer = new AddCustomerPanel();
				addCustomer.setVisible(true);
				setVisible(false);
			}
		});
		btnAddCustomer.setBounds(165, 89, 216, 30);
		contentPane.add(btnAddCustomer);

		JButton btnNewButton = new JButton("Update  / Remove Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updOrRemove = new UpdateOrRemoveCustomer();
				updOrRemove.setVisible(true);
				setVisible(false);

			}
		});
		btnNewButton.setBounds(165, 175, 216, 30);
		contentPane.add(btnNewButton);

		JButton btnAddTitle = new JButton("Add Title");
		btnAddTitle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTitle = new AddTitlePanel();
				addTitle.setVisible(true);
				setVisible(false);
			}
		});
		btnAddTitle.setBounds(165, 216, 216, 30);
		contentPane.add(btnAddTitle);

		JButton btnNewButton_2 = new JButton("Update / Remove Title");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_2.setBounds(165, 257, 216, 30);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Manage Order Item\r\n");
		btnNewButton_1.setBounds(165, 130, 216, 34);
		contentPane.add(btnNewButton_1);
	}

}
