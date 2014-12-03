package com.ebookstore.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class CustomerPanel extends JFrame {

	private JPanel contentPane;
	private CustomerLogin customerLogin;

	public CustomerPanel(String customerName,String customerSurname) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcome.setBounds(72, 23, 86, 25);
		contentPane.add(lblWelcome);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setText(customerName);
		
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomerName.setBounds(168, 28, 317, 14);
		contentPane.add(lblCustomerName);
		
		JLabel lblYourCreditIs = new JLabel("Your Credit  Amount   :");
		lblYourCreditIs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblYourCreditIs.setBounds(40, 63, 153, 14);
		contentPane.add(lblYourCreditIs);
		
		JLabel label = new JLabel("00");
		label.setBounds(244, 64, 241, 14);
		contentPane.add(label);
		
		JList jTitlelist = new JList();
		jTitlelist.setBounds(23, 171, 180, 321);
		contentPane.add(jTitlelist);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(10, 128, 64, 14);
		contentPane.add(lblType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Books", "Music CDs", "Computer Softwares"}));
		comboBox.setBounds(107, 126, 72, 20);
		contentPane.add(comboBox);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitle.setBounds(297, 171, 180, 14);
		contentPane.add(lblTitle);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(297, 224, 209, 25);
		contentPane.add(lblPrice);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescription.setBounds(297, 274, 72, 25);
		contentPane.add(lblDescription);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(379, 280, 106, 84);
		contentPane.add(textArea);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setBounds(427, 490, 89, 23);
		contentPane.add(btnBuy);
	}

}
