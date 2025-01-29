package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import Model.SearchFiles;
import Model.TextToPDF;

public class ConversorScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private SearchFiles sf;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorScreen frame = new ConversorScreen();
					frame.setVisible(true);
					frame.setBounds(100, 100, 299, 337);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConversorScreen() {
		setResizable(false);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Selecione um arquivo ");
		lblNewLabel.setBounds(22, 82, 165, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lblNewLabel);

		JTextArea fileSelected = new JTextArea();
		fileSelected.setText("Nenhum arquivo selecionado");
		fileSelected.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		fileSelected.setBounds(22, 107, 179, 22);
		fileSelected.setEditable(false);
		fileSelected.setBackground(new Color(192, 192, 192));
		getContentPane().add(fileSelected);
		
		sf = new SearchFiles(fileSelected);

		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(211, 107, 45, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sf.selectFile();
			}
		});
		getContentPane().add(btnNewButton);

		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextToPDF cv = new TextToPDF();
				cv.converter(sf.getSelectedFile());
			}
		});
		btnConverter.setBounds(59, 218, 165, 56);
		btnConverter.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		getContentPane().add(btnConverter);
	}

}
