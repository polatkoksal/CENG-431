package com.ebookstore.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UpdateOrRemoveTitle extends JFrame {

	private JPanel contentPane;
	private JTextField textTitle;
	private JTextField textPrice;
	private AdminMenuPanel admMenu;

	public UpdateOrRemoveTitle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUpdateRemove = new JLabel("Update / Remove Title");
		lblUpdateRemove.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUpdateRemove.setBounds(175, 28, 240, 37);
		contentPane.add(lblUpdateRemove);

		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(20, 102, 62, 14);
		contentPane.add(lblType);

		JList jlist = new JList();
		jlist.setBounds(10, 191, 155, 278);
		jlist.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		contentPane.add(jlist);

		JLabel lblItemList = new JLabel("Item List");
		lblItemList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblItemList.setBounds(47, 173, 82, 14);
		contentPane.add(lblItemList);

		final JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitle.setBounds(265, 192, 62, 14);
		contentPane.add(lblTitle);

		textTitle = new JTextField();
		textTitle.setBounds(360, 189, 86, 20);
		contentPane.add(textTitle);
		textTitle.setColumns(10);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrice.setBounds(265, 241, 46, 14);
		contentPane.add(lblPrice);

		textPrice = new JTextField();
		textPrice.setBounds(360, 239, 86, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescription.setBounds(265, 307, 82, 14);
		contentPane.add(lblDescription);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(360, 335, 131, 94);
		contentPane.add(textArea);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admMenu = new AdminMenuPanel();
				admMenu.setVisible(true);
				setVisible(false);

			}
		});
		btnUpdate.setBounds(335, 446, 89, 23);
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
		btnRemove.setBounds(445, 446, 89, 23);
		contentPane.add(btnRemove);

		final JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				Integer i = comboBox.getSelectedIndex();
				if (i == 0) {
					lblTitle.setText("Author");
				}
				if (i == 1) {
					lblTitle.setText("Kind");

				}
				if (i == 2) {
					lblTitle.setText("Area");
				}

			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Book",
				"Music CD", "Computer Software" }));
		comboBox.setBounds(92, 100, 72, 20);
		contentPane.add(comboBox);
	}

}
