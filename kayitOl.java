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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class kayitOl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
		setBounds(100, 100, 793, 574);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adınızı Soyadınızı Giriniz :");
		lblNewLabel.setBounds(184, 148, 211, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblifreniziGiriniz = new JLabel("Şifrenizi Giriniz :");
		lblifreniziGiriniz.setBounds(184, 202, 163, 30);
		lblifreniziGiriniz.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblifreniziGiriniz);
		
		JLabel lblNewLabel_2 = new JLabel("Kayıt Olmak Aşağıdaki Kutucukları Doldurunuz");
		lblNewLabel_2.setBounds(185, 60, 435, 60);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Üye İseniz Giriş Yapınız");
		btnNewButton.setBounds(260, 423, 284, 44);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new anaprogram().setVisible(true);;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("KAYIT");
		btnNewButton_1.setBounds(312, 316, 180, 44);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ResultSet myRs= baglantiProje.yap();
				int k_id = 0;
				String k_adi=textField_1.getText();
				String k_sifre=textField_2.getText();
			
				String sql1="INSERT INTO uyeOlanlar(id,adi_soyadi,sifre) VALUES ('"+k_id+"','"+k_adi+"','"+k_sifre+"')";
				try {
					baglantiProje.ekle(sql1);
					System.out.println("Kayıt yapıldı...");
				}catch (SQLException e1) {
					e1.printStackTrace();
			}
			}
		});
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(466, 151, 180, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(466, 205, 180, 30);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(-18, -268, 829, 848);
		Image img23=new ImageIcon(this.getClass().getResource("/ss.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img23));
		contentPane.add(lblNewLabel_3);
		

		
	
	}
}

