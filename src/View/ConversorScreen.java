package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Model.SearchFiles;
import Model.TextToPDF;

public class ConversorScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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

		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(211, 107, 45, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchFiles sf = new SearchFiles();
				sf.selectFile();
			}
		});
		getContentPane().add(btnNewButton);

		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextToPDF cv = new TextToPDF();
				cv.converter();
			}
		});
		btnConverter.setBounds(59, 218, 165, 56);
		btnConverter.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		getContentPane().add(btnConverter);
	}

}
