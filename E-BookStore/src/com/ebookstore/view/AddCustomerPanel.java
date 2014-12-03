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

public class AddCustomerPanel extends JFrame {

	private JPanel contentPane;
	private JTextField textUsrName;
	private JTextField textUsrSurname;
    private AdminMenuPanel adminMenu;
    private JTextField textUsrCredit;
	
	public AddCustomerPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMenu = new AdminMenuPanel();
				adminMenu.setVisible(true);
				setVisible(false);
			}
		});
		btnSave.setBounds(281, 208, 89, 23);
		contentPane.add(btnSave);
		
		JLabel lblCustomerCredit = new JLabel("Customer Credit");
		lblCustomerCredit.setBounds(36, 201, 95, 14);
		contentPane.add(lblCustomerCredit);
		
		textUsrCredit = new JTextField();
		textUsrCredit.setBounds(141, 198, 86, 20);
		contentPane.add(textUsrCredit);
		textUsrCredit.setColumns(10);
	}

}
