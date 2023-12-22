package sinema_proje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLayeredPane;

public class kayitOl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kayitOl frame = new kayitOl();
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
	public kayitOl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adınızı Soyadınızı Giriniz");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(216, 134, 211, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblifreniziGiriniz = new JLabel("Şifrenizi Giriniz");
		lblifreniziGiriniz.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblifreniziGiriniz.setBounds(216, 271, 163, 30);
		contentPane.add(lblifreniziGiriniz);
		
		JLabel lblNewLabel_2 = new JLabel("Kayıt Olmak Aşağıdaki Kutucukları Doldurunuz");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(212, 45, 462, 60);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(482, 207, 180, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Üye İseniz Giriş Yapınız");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new anaprogram().setVisible(true);;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(301, 480, 284, 44);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("KAYIT");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ResultSet myRs= baglantiProje.yap();
				String k_adi=textField_1.getText();
				String k_sifre=textField_2.getText();
				String k_tc=textField.getText();
				String sql1="INSERT INTO uyeOlanlar(tcno,adi_soyadi,sifre) VALUES ('"+k_tc+"','"+k_adi+"','"+k_sifre+"')";
				try {
					baglantiProje.ekle(sql1);
					System.out.println("Kayıt yapıldı...");
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(350, 361, 180, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Telefon NO Giriniz");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(216, 212, 211, 24);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(482, 132, 180, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		Image img20=new ImageIcon(this.getClass().getResource("/join-icon-png-4.jpg")).getImage();
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(482, 269, 180, 40);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img23=new ImageIcon(this.getClass().getResource("/filşşeridi.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img23));
		lblNewLabel_3.setBounds(0, 0, 886, 563);
		contentPane.add(lblNewLabel_3);
		
	
		
	
	}
}
