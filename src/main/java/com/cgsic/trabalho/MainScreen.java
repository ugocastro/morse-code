package com.cgsic.trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	
	MorseCode morseCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setTitle("Morse Code");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterAWord = new JLabel("Enter a word or an Expression");
		lblEnterAWord.setBounds(6, 6, 207, 16);
		panel.add(lblEnterAWord);
		
		textField = new JTextField();
		textField.setBounds(3, 23, 358, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("GO!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				morseCode = new MorseCode();
				String result = morseCode.encrypt(textField.getText());
				textArea.setText(result);
			}
		});
		btnNewButton.setBounds(376, 24, 56, 29);
		panel.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(6, 57, 426, 203);
		panel.add(textArea);
	}
}
