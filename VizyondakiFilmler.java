package sinema_proje;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VizyondakiFilmler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel kayitOl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VizyondakiFilmler frame = new VizyondakiFilmler();
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
	public VizyondakiFilmler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		kayitOl = new JPanel();
		kayitOl.setBackground(new Color(255, 255, 255));
		kayitOl.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(kayitOl);
		kayitOl.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vizyondaki Fimler");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(338, 29, 192, 29);
		kayitOl.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("film1");
		lblNewLabel_1.setBounds(70, 100, 100, 160);
		kayitOl.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("film2");
		lblNewLabel_1_1.setBounds(215, 100, 100, 160);
		kayitOl.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("film3");
		lblNewLabel_1_2.setBounds(349, 100, 100, 160);
		kayitOl.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("film4");
		lblNewLabel_1_3.setBounds(487, 100, 100, 160);
		kayitOl.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("film5");
		lblNewLabel_1_4.setBounds(630, 100, 100, 160);
		kayitOl.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("film6");
		lblNewLabel_1_5.setBounds(760, 100, 100, 160);
		kayitOl.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Film Adı: Ölümlü Dünya 2"
				+ " Türü : Komedi"
				+ " Süre: 150 dk."
				+ " Altyazılı");
		lblNewLabel_1_6.setToolTipText("Film Adı: Ölümlü Dünya 2"
				+ " Türü : Komedi"
				+ " Süre: 150 dk."
				+ " Altyazılı");
		lblNewLabel_1_6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_1_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_6.setBounds(70, 290, 100, 160);
		kayitOl.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Film Adı : Wonka");
		lblNewLabel_1_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_7.setBounds(215, 287, 100, 160);
		kayitOl.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Film Adı : Nefes Yer Eksi İki");
		lblNewLabel_1_8.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_8.setBounds(338, 290, 100, 160);
		kayitOl.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Film Adı : ");
		lblNewLabel_1_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_9.setBounds(487, 287, 100, 160);
		kayitOl.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Film Adı :");
		lblNewLabel_1_10.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_10.setBounds(599, 287, 100, 160);
		kayitOl.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("Film Adı: ");
		lblNewLabel_1_11.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_11.setBounds(729, 287, 100, 160);
		kayitOl.add(lblNewLabel_1_11);
		
		JButton btnNewButton = new JButton("Koltuk Seçmek İçin Tıklayınız");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(630, 485, 217, 45);
		kayitOl.add(btnNewButton);
		
		
	}
}