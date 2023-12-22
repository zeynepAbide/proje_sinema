package sinema_proje;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DropMode;

public class anaprogram extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel girisSayfasi;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anaprogram frame = new anaprogram();
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
	public anaprogram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		girisSayfasi = new JPanel();
		girisSayfasi.setBackground(SystemColor.control);
		girisSayfasi.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(girisSayfasi);
		girisSayfasi.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CINEMA'AZ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(250, 26, 361, 60);
		girisSayfasi.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adınızı Soyadınızı Giriniz");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(205, 113, 197, 40);
		girisSayfasi.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Şifrenizi Giriniz ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(205, 180, 180, 40);
		girisSayfasi.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(470, 116, 180, 40);
		girisSayfasi.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(470, 183, 180, 40);
		girisSayfasi.add(passwordField);
		JButton btnNewButton_1 = new JButton("GİRİŞ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pass=new String (passwordField.getPassword());
				String adiSoyadi = textField.getText();
				String sql ="SELECT * FROM uyeOlanlar WHERE adi_soyadi = '"+adiSoyadi+"'";
				try {
					ResultSet myRs =baglantiProje.bul(sql);
					while(myRs.next()) {
						if(adiSoyadi.equals(myRs.getString("adi_soyadi"))&& pass.equals(myRs.getString("sifre"))){
							setVisible(false);
							new VizyondakiFilmler().setVisible(true);;
							}else {

			                    JOptionPane.showMessageDialog(anaprogram.this,
			                            "Kayıtlı kişi bulunamadı!!!", "Uyarı", JOptionPane.WARNING_MESSAGE);			                
							}
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
			}
		});
		btnNewButton_1.setBounds(381, 248, 100, 40);
		girisSayfasi.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Üye Değilseniz Kayıt Olun");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new kayitOl().setVisible(true);;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(301, 298, 280, 40);
		girisSayfasi.add(btnNewButton);
		
		JLabel lbllogo_anaprogram = new JLabel("");
		lbllogo_anaprogram.setHorizontalAlignment(SwingConstants.CENTER);
		Image img1=new ImageIcon(this.getClass().getResource("/sinema hall.jpg")).getImage();
		lbllogo_anaprogram.setIcon(new ImageIcon(img1));
		lbllogo_anaprogram.setBounds(0, 0, 899, 593);
		girisSayfasi.add(lbllogo_anaprogram);
	}
}