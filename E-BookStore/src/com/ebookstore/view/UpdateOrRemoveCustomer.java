package com.ebookstore.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UpdateOrRemoveCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textSurName;
	private JTextField textCredit;
	private AdminMenuPanel admMenu;

	public UpdateOrRemoveCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JList jlist = new JList();
		jlist.setBounds(10, 84, 205, 283);
		jlist.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {

			}
		});

		contentPane.add(jlist);

		JLabel lblUpdateRemove = new JLabel("Update / Remove Customer Panel");
		lblUpdateRemove.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUpdateRemove.setBounds(70, 11, 274, 14);
		contentPane.add(lblUpdateRemove);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(271, 85, 46, 14);
		contentPane.add(lblName);

		textName = new JTextField();
		textName.setBounds(368, 82, 86, 20);
		contentPane.add(textName);
		textName.setColumns(10);

		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSurname.setBounds(271, 142, 60, 14);
		contentPane.add(lblSurname);

		textSurName = new JTextField();
		textSurName.setBounds(368, 140, 86, 20);
		contentPane.add(textSurName);
		textSurName.setColumns(10);

		JLabel lblCredit = new JLabel("Credit");
		lblCredit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCredit.setBounds(271, 208, 46, 14);
		contentPane.add(lblCredit);

		textCredit = new JTextField();
		textCredit.setBounds(368, 206, 86, 20);
		contentPane.add(textCredit);
		textCredit.setColumns(10);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				admMenu = new AdminMenuPanel();
				admMenu.setVisible(true);
				setVisible(false);
			}
		});
		btnUpdate.setBounds(298, 319, 89, 23);
		contentPane.add(btnUpdate);

		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int result = JOptionPane.showConfirmDialog(null,
						"Are you sure?", "Warning", dialogButton);

				if (result == JOptionPane.YES_OPTION) {
					admMenu = new AdminMenuPanel();
					admMenu.setVisible(true);
					setVisible(false);

				} else if (result == JOptionPane.NO_OPTION) {

				}

			}
		});
		btnRemove.setBounds(409, 319, 89, 23);
		contentPane.add(btnRemove);
	}
}
