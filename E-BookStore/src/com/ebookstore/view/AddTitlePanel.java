package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddTitlePanel extends JFrame {

	private static final long serialVersionUID = 3511703477002477243L;
	private JPanel contentPane;
	private JTextField textTitle;
	private JTextField textTitlePrice;
	private JButton btnSave;
	private final JComboBox comboBoxType;
	private JTextArea textArea;
	private JTextField mainTitle;
	private JButton back;

	public AddTitlePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAddTitle = new JLabel("Add Title");
		lblAddTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddTitle.setBounds(175, 39, 87, 25);
		contentPane.add(lblAddTitle);

		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(73, 104, 46, 14);
		contentPane.add(lblType);

		final JLabel lblTitle = new JLabel("Author");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitle.setBounds(73, 214, 46, 14);
		contentPane.add(lblTitle);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrice.setBounds(73, 246, 46, 14);
		contentPane.add(lblPrice);

		comboBoxType = new JComboBox();
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] { "Book",
				"Music CD", "Computer Software " }));
		comboBoxType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Integer i = comboBoxType.getSelectedIndex();
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
		comboBoxType.setBounds(175, 102, 87, 20);
		contentPane.add(comboBoxType);

		textTitle = new JTextField();
		textTitle.setBounds(176, 212, 86, 20);
		contentPane.add(textTitle);
		textTitle.setColumns(10);

		textTitlePrice = new JTextField();
		textTitlePrice.setBounds(176, 244, 86, 20);
		contentPane.add(textTitlePrice);
		textTitlePrice.setColumns(10);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescription.setBounds(73, 320, 76, 14);
		contentPane.add(lblDescription);

		textArea = new JTextArea();
		textArea.setBounds(176, 321, 195, 146);
		contentPane.add(textArea);

		btnSave = new JButton("Save");
		btnSave.setBounds(395, 486, 89, 23);
		contentPane.add(btnSave);

		mainTitle = new JTextField();
		mainTitle.setBounds(175, 155, 114, 19);
		contentPane.add(mainTitle);
		mainTitle.setColumns(10);

		JLabel lblTitle_1 = new JLabel("Title");
		lblTitle_1.setBounds(62, 157, 70, 15);
		contentPane.add(lblTitle_1);

		back = new JButton("Back");
		back.setBounds(296, 485, 87, 20);
		contentPane.add(back);
	}

	public void addActionListenerToSaveTitleBtn(ActionListener listener) {
		btnSave.addActionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JTextField getMainTitle() {
		return mainTitle;
	}

	public void setMainTitle(JTextField mainTitle) {
		this.mainTitle = mainTitle;
	}

	public JTextField getTextTitle() {
		return textTitle;
	}

	public void setTextTitle(JTextField textTitle) {
		this.textTitle = textTitle;
	}

	public JTextField getTextTitlePrice() {
		return textTitlePrice;
	}

	public void setTextTitlePrice(JTextField textTitlePrice) {
		this.textTitlePrice = textTitlePrice;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JComboBox getComboBoxType() {
		return comboBoxType;
	}
}
