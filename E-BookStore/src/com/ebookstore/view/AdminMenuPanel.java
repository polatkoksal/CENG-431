package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;

public class AdminMenuPanel extends JFrame {

	private static final long serialVersionUID = 9192879402009206960L;
	private JPanel contentPane;
	private JButton btnAddCustomer;
	private JButton updateRemoveCustomer;
	private JButton btnAddTitle;
	private JButton updateRemoveTitle;
	private JButton manageOrderItem;
	private JButton back;

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
		lblMenu.setBounds(183, 29, 133, 24);
		contentPane.add(lblMenu);

		btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.setBounds(165, 89, 216, 30);
		contentPane.add(btnAddCustomer);

		updateRemoveCustomer = new JButton("Update  / Remove Customer");
		updateRemoveCustomer.setBounds(165, 130, 216, 30);
		contentPane.add(updateRemoveCustomer);

		btnAddTitle = new JButton("Add Title");
		btnAddTitle.setBounds(165, 216, 216, 30);
		contentPane.add(btnAddTitle);

		updateRemoveTitle = new JButton("Update / Remove Title");
		updateRemoveTitle.setBounds(165, 257, 216, 30);
		contentPane.add(updateRemoveTitle);

		manageOrderItem = new JButton("Manage Order Item\r\n");
		manageOrderItem.setBounds(165, 171, 216, 34);
		contentPane.add(manageOrderItem);

		back = new JButton("Back");
		back.setBounds(448, 317, 96, 25);
		contentPane.add(back);
	}

	public void addActionListenerToAddCustomer(ActionListener listener) {
		btnAddCustomer.addActionListener(listener);
	}

	public void addActionListenerToAddTitle(ActionListener listener) {
		btnAddTitle.addActionListener(listener);
	}

	public void addActionListenerToUpdateOrRemoveTitle(ActionListener listener) {
		updateRemoveTitle.addActionListener(listener);
	}

	public void addActionListenerToUpdateRemoveCustomerBtn(
			ActionListener listener) {
		updateRemoveCustomer.addActionListener(listener);
	}

	public void addActionListenerToManageOrderItemBtn(ActionListener listener) {
		manageOrderItem.addActionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

}
