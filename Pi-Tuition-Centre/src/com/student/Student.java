package com.student;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Student {

	private JTextField text1, text2, text3;
	public static final String[] columns = { "Student Name", "Student Roll", "Student Age" };
	private DefaultTableModel model = new DefaultTableModel(columns , 0);
	private JTable table = new JTable(model);
	private JPanel mainPanel = new JPanel(new BorderLayout());

	public Student() {

		JButton addButton = new JButton("+ Add");
		JButton clearButton = new JButton("Clear");
		JPanel buttonPanel = new JPanel();

		buttonPanel.add(addButton);
		buttonPanel.add(clearButton);

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				model.addRow(new Object[] { text1.getText(), text2.getText(), text3.getText() });
			}
		});

		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				text3.setText("");
			}
		});

		JPanel textPanel = new JPanel(new BorderLayout());
		text1 = new JTextField();
		text2 = new JTextField();
		text3 = new JTextField();

		textPanel.add(text1, BorderLayout.NORTH);
		textPanel.add(text2, BorderLayout.CENTER);
		textPanel.add(text3, BorderLayout.SOUTH);


		mainPanel.add(textPanel, BorderLayout.NORTH);
		mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);

	}

	public JComponent getComponent() {
		return mainPanel;
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame f = new JFrame("Register a new Student");
				f.getContentPane().add(new Student().getComponent());
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(440, 450);
				f.setLocationRelativeTo(null);
				f.setVisible(true);
			}
		});
	}
}
