package sinema_proje;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;


public class FilmSecimi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPerde;
	private JTextField txtPerde_1;
	private JTextField txtDoluKoltuk;
	private JTextField txtSeilenKoltuk;
	private JTextField txtBoKoltuk;
	private JTextField txtDoluKoltuk_1;
	private JTextField txtBoKoltuk_1;
	private JTextField txtSeilenKoltuk_1;
	private boolean secildi = false;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String koltuk;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmSecimi frame = new FilmSecimi();
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
	public FilmSecimi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1206, 604);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 1176, 560);
		tabbedPane.setBackground(new Color(255, 255, 255));
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Vizyondaki Filmler", null, panel, null);
		
		JButton btnNewButton_41 = new JButton("Bilet Almak İçin Tıklayınız\r\n");
		btnNewButton_41.setBounds(846, 505, 232, 21);
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		panel.setLayout(null);
		btnNewButton_41.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(btnNewButton_41);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(43, 41, 189, 252);
		Image img35=new ImageIcon(this.getClass().getResource("/2461629.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img35));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(275, 41, 189, 252);
		Image img36=new ImageIcon(this.getClass().getResource("/neffes.png")).getImage();
		lblNewLabel_11.setIcon(new ImageIcon(img36));
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(505, 41, 175, 252);
		Image img37=new ImageIcon(this.getClass().getResource("/karra.jpg")).getImage();
		lblNewLabel_12.setIcon(new ImageIcon(img37));
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(718, 41, 175, 252);
		Image img38=new ImageIcon(this.getClass().getResource("/açlık.jpg")).getImage();
		lblNewLabel_13.setIcon(new ImageIcon(img38));
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(944, 41, 183, 252);
		Image img39=new ImageIcon(this.getClass().getResource("/orman.png")).getImage();
		lblNewLabel_14.setIcon(new ImageIcon(img39));
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("        VİZYONDAKİ FİLMLER");
		lblNewLabel_15.setBounds(355, 10, 341, 21);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_18 = new JLabel("Yönetmen: Ali Atay\r\n");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_18.setBounds(43, 383, 189, 13);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Türü: Komedi\r\n\r\n");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19.setBounds(43, 351, 189, 13);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Ölümlü Dünya 2\r\n");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_20.setBounds(43, 319, 189, 13);
		panel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_16 = new JLabel("Senarist: Ali Atay\r\n");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_16.setBounds(43, 415, 189, 13);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Feyyaz Yiğit Çakmak\r\n");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_17.setBounds(43, 447, 189, 13);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_22 = new JLabel("Süre: 1s57dk");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_22.setBounds(43, 479, 189, 13);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_24 = new JLabel("Türü: Dram\r\n");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_24.setBounds(275, 352, 189, 13);
		panel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Yönetmen: Ozan Uzunoğlu\r\n");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_25.setBounds(275, 384, 189, 13);
		panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Senarist: Hakan Evrensel\r\n");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_26.setBounds(275, 416, 189, 13);
		panel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Süre: 2s3dk");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_27.setBounds(275, 448, 189, 13);
		panel.add(lblNewLabel_27);
		
		JLabel lblNewLabel_23 = new JLabel("Nefes:Yer Eksi İki\r\n");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_23.setBounds(275, 321, 189, 13);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_28 = new JLabel("Kara Cuma\r\n");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_28.setBounds(505, 321, 189, 13);
		panel.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Türü: Korku\r\n");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_29.setBounds(505, 353, 189, 13);
		panel.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Yönetmen: Eli Roth\r\n");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_30.setBounds(505, 384, 189, 13);
		panel.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Senarist: Jeff Rendell\r\n");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_31.setBounds(505, 416, 189, 13);
		panel.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Süre: 1s47dk");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_32.setBounds(505, 448, 189, 13);
		panel.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Açlık Oyunları: Kuşların ve Yılanların Şarkısı\r\n\r\n");
		lblNewLabel_33.setToolTipText("Açlık Oyunları: Kuşların ve Yılanların Şarkısı\r\n\r\n\r\n");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setBounds(718, 321, 200, 13);
		panel.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Orman Çetesi:Dünya Turu\r\n");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_34.setBounds(955, 321, 189, 13);
		panel.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("Türü:Bilim Kurgu,Aksiyon,Macera\r\n\r\n");
		lblNewLabel_35.setToolTipText("Türü:Bilim Kurgu,Aksiyon,Macera\r\n\r\n");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_35.setBounds(718, 352, 189, 13);
		panel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Yönetmen: Francis Lawrence\r\n\r\n\r\n");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_36.setBounds(718, 384, 189, 13);
		panel.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("Senarist: Micheal Arndt,Micheal Lesslie\r\n\r\n");
		lblNewLabel_37.setToolTipText("Senarist: Micheal Arndt,Micheal Lesslie\r\n\r\n");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_37.setBounds(718, 416, 189, 13);
		panel.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Süre: 2s38dk\r\n");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_38.setBounds(718, 448, 189, 13);
		panel.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("Türü:Animasyon,Macera,Komedi,Aile\r\n");
		lblNewLabel_39.setToolTipText("Türü:Animasyon,Macera,Komedi,Aile\r\n");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_39.setBounds(944, 352, 189, 13);
		panel.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("Yönetmen: Laurent Bru, Yannick Moulin,\r\nBenoit Somville\r\n");
		lblNewLabel_40.setToolTipText("Yönetmen: Laurent Bru, Yannick Moulin,\r\nBenoit Somville\r\n");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_40.setBounds(944, 384, 189, 13);
		panel.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("Senarist: David Alaux,Eric Tosti\r\n");
		lblNewLabel_41.setToolTipText("Senarist: David Alaux,Eric Tosti\r\n");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_41.setBounds(944, 416, 189, 13);
		panel.add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel("Süre: 1s29dk");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_42.setBounds(944, 448, 189, 13);
		panel.add(lblNewLabel_42);
	
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 34));
		tabbedPane.addTab("Koltuk Seçimi", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(new Color(192, 192, 192));
		tabbedPane_1.setBounds(6, 6, 855, 508);
		panel_1.add(tabbedPane_1);
		Image img15=new ImageIcon(this.getClass().getResource("/kırmızı.jpg")).getImage();
		Image img16=new ImageIcon(this.getClass().getResource("/mavi.png")).getImage();
		Image img17=new ImageIcon(this.getClass().getResource("/yeşil.png")).getImage();
		
				JPanel panel1 = new JPanel();
				panel1.setBackground(new Color(123, 0, 34));
				tabbedPane_1.addTab("Salon 1", null, panel1, null);
				panel1.setLayout(null);
				
				JButton btnNewButton_2 = new JButton("3");
				btnNewButton_2.setBounds(173, 94, 55, 50);
				btnNewButton_2.setBackground(Color.RED);
				btnNewButton_2.setEnabled(false);
			
				panel1.add(btnNewButton_2);
				
				JButton btnNewButton_10 = new JButton("11");
				btnNewButton_10.setBounds(693, 94, 55, 50);
				btnNewButton_10.setBackground(Color.RED);
				btnNewButton_10.setEnabled(false);
			
				panel1.add(btnNewButton_10);
				
				JButton btnNewButton_16 = new JButton("17");
				btnNewButton_16.setBounds(303, 167, 55, 50);
				btnNewButton_16.setBackground(Color.RED);
				btnNewButton_16.setEnabled(false);
			
									
				panel1.add(btnNewButton_16);
				
				JButton btnNewButton_21 = new JButton("22");
				btnNewButton_21.setBounds(628, 167, 55, 50);
				btnNewButton_21.setBackground(Color.RED);
				btnNewButton_21.setEnabled(false);
		
				panel1.add(btnNewButton_21);
				
				JButton btnNewButton_24 = new JButton("25");
				btnNewButton_24.setBounds(43, 243, 55, 50);
				btnNewButton_24.setBackground(Color.RED);
				btnNewButton_24.setEnabled(false);
			
		
				panel1.add(btnNewButton_24);
				
				JButton btnNewButton_31 = new JButton("32");
				btnNewButton_31.setBounds(498, 243, 55, 50);
				btnNewButton_31.setBackground(Color.RED);
				btnNewButton_31.setEnabled(false);
			
				panel1.add(btnNewButton_31);
				
				JButton btnNewButton_32 = new JButton("33");
				btnNewButton_32.setBounds(563, 243, 55, 50);
				btnNewButton_32.setBackground(Color.RED);
				btnNewButton_32.setEnabled(false);
			
				panel1.add(btnNewButton_32);
				
				
				txtPerde_1 = new JTextField();
				txtPerde_1.setBounds(43, 10, 767, 19);
				txtPerde_1.setBackground(SystemColor.activeCaptionBorder);
				txtPerde_1.setHorizontalAlignment(SwingConstants.CENTER);
				txtPerde_1.setFont(new Font("Tahoma", Font.BOLD, 15));
				txtPerde_1.setText("PERDE");
				panel1.add(txtPerde_1);
				txtPerde_1.setColumns(10);
				
				JLabel lbldolu = new JLabel("");
				lbldolu.setBounds(303, 392, 55, 50);
				lbldolu.setIcon(new ImageIcon(img15));
				panel1.add(lbldolu);
				
				JLabel lblboş = new JLabel("");
				lblboş.setBounds(498, 392, 55, 50);
				lblboş.setIcon(new ImageIcon(img16));
				panel1.add(lblboş);
				
				JLabel lblseç = new JLabel("");
				lblseç.setBounds(397, 392, 55, 50);
				lblseç.setIcon(new ImageIcon(img17));
				panel1.add(lblseç);
				
				txtDoluKoltuk_1 = new JTextField();
				txtDoluKoltuk_1.setBounds(285, 452, 90, 19);
				txtDoluKoltuk_1.setFont(new Font("Tahoma", Font.BOLD, 10));
				txtDoluKoltuk_1.setText("DOLU KOLTUK");
				txtDoluKoltuk_1.setHorizontalAlignment(SwingConstants.CENTER);
				panel1.add(txtDoluKoltuk_1);
				txtDoluKoltuk_1.setColumns(10);
				
				txtBoKoltuk_1 = new JTextField();
				txtBoKoltuk_1.setBounds(385, 452, 79, 19);
				txtBoKoltuk_1.setFont(new Font("Tahoma", Font.BOLD, 10));
				txtBoKoltuk_1.setText("BOŞ KOLTUK");
				txtBoKoltuk_1.setHorizontalAlignment(SwingConstants.CENTER);
				panel1.add(txtBoKoltuk_1);
				txtBoKoltuk_1.setColumns(10);
				
				txtSeilenKoltuk_1 = new JTextField();
				txtSeilenKoltuk_1.setBounds(474, 452, 105, 19);
				txtSeilenKoltuk_1.setText("SEÇİLEN KOLTUK");
				txtSeilenKoltuk_1.setFont(new Font("Tahoma", Font.BOLD, 10));
				txtSeilenKoltuk_1.setHorizontalAlignment(SwingConstants.CENTER);
				panel1.add(txtSeilenKoltuk_1);
				txtSeilenKoltuk_1.setColumns(10);
				
				JToggleButton tglbtnNewToggleButton = new JToggleButton("1");
				tglbtnNewToggleButton.setForeground(new Color(0, 0, 0));
				tglbtnNewToggleButton.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
				if (tglbtnNewToggleButton.isSelected()) {
					tglbtnNewToggleButton.setBackground(Color.GREEN);
					tglbtnNewToggleButton.setEnabled(false);
                } 
				else {
                	tglbtnNewToggleButton.setEnabled(true);
                }
				
				tglbtnNewToggleButton.setBounds(43, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton);
				
				JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("2");
				tglbtnNewToggleButton_1.setForeground(Color.BLACK);
				tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_1.setBackground(new Color(128, 255, 128));
				
				tglbtnNewToggleButton_1.setBounds(108, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_1);
				
				JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("4");
				tglbtnNewToggleButton_2.setForeground(Color.BLACK);
				tglbtnNewToggleButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_2.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_2.setBounds(238, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_2);
				
				JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("5");
				tglbtnNewToggleButton_3.setForeground(Color.BLACK);
				tglbtnNewToggleButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_3.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_3.setBounds(303, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_3);
				
				JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("6");
				tglbtnNewToggleButton_4.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4.setBounds(368, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_4);
				
				JToggleButton tglbtnNewToggleButton_4_1 = new JToggleButton("7");
				tglbtnNewToggleButton_4_1.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_1.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_1.setBounds(433, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_1);
				
				JToggleButton tglbtnNewToggleButton_4_2 = new JToggleButton("8");
				tglbtnNewToggleButton_4_2.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_2.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_2.setBounds(498, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_2);
				
				JToggleButton tglbtnNewToggleButton_4_3 = new JToggleButton("9");
				tglbtnNewToggleButton_4_3.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_3.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_3.setBounds(563, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_3);
				
				JToggleButton tglbtnNewToggleButton_4_4 = new JToggleButton("10");
				tglbtnNewToggleButton_4_4.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_4.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_4.setBounds(628, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_4);
				
				JToggleButton tglbtnNewToggleButton_4_5 = new JToggleButton("12");
				tglbtnNewToggleButton_4_5.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_5.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_5.setBounds(758, 94, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_5);
				
				JToggleButton tglbtnNewToggleButton_4_6 = new JToggleButton("18");
				tglbtnNewToggleButton_4_6.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_6.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_6.setBounds(368, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_6);
				
				JToggleButton tglbtnNewToggleButton_4_7 = new JToggleButton("19");
				tglbtnNewToggleButton_4_7.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_7.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_7.setBounds(433, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_7);
				
				JToggleButton tglbtnNewToggleButton_4_8 = new JToggleButton("20");
				tglbtnNewToggleButton_4_8.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_8.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_8.setBounds(498, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_8);
				
				JToggleButton tglbtnNewToggleButton_4_9 = new JToggleButton("21");
				tglbtnNewToggleButton_4_9.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_9.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_9.setBounds(563, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_9);
				
				JToggleButton tglbtnNewToggleButton_4_10 = new JToggleButton("23");
				tglbtnNewToggleButton_4_10.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_10.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_10.setBounds(693, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_10);
				
				JToggleButton tglbtnNewToggleButton_4_11 = new JToggleButton("24");
				tglbtnNewToggleButton_4_11.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_11.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_11.setBounds(758, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_11);
				
				JToggleButton tglbtnNewToggleButton_4_12 = new JToggleButton("13");
				tglbtnNewToggleButton_4_12.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_12.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_12.setBounds(43, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_12);
				
				JToggleButton tglbtnNewToggleButton_4_13 = new JToggleButton("14");
				tglbtnNewToggleButton_4_13.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_13.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_13.setBounds(108, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_13);
				
				JToggleButton tglbtnNewToggleButton_4_14 = new JToggleButton("15");
				tglbtnNewToggleButton_4_14.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_14.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_14.setBounds(173, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_14);
				
				JToggleButton tglbtnNewToggleButton_4_15 = new JToggleButton("16");
				tglbtnNewToggleButton_4_15.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_15.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_15.setBounds(238, 167, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_15);
				
				JToggleButton tglbtnNewToggleButton_4_16 = new JToggleButton("26");
				tglbtnNewToggleButton_4_16.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16.setBounds(108, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16);
				
				JToggleButton tglbtnNewToggleButton_4_16_1 = new JToggleButton("27");
				tglbtnNewToggleButton_4_16_1.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_1.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_1.setBounds(173, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_1);
				
				JToggleButton tglbtnNewToggleButton_4_16_2 = new JToggleButton("28");
				tglbtnNewToggleButton_4_16_2.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_2.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_2.setBounds(238, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_2);
				
				JToggleButton tglbtnNewToggleButton_4_16_3 = new JToggleButton("29");
				tglbtnNewToggleButton_4_16_3.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_3.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_3.setBounds(303, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_3);
				
				JToggleButton tglbtnNewToggleButton_4_16_4 = new JToggleButton("30");
				tglbtnNewToggleButton_4_16_4.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4.setBounds(368, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_1 = new JToggleButton("31");
				tglbtnNewToggleButton_4_16_4_1.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_1.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_1.setBounds(433, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_1);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_2 = new JToggleButton("34");
				tglbtnNewToggleButton_4_16_4_2.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_2.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_2.setBounds(628, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_2);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_3 = new JToggleButton("35");
				tglbtnNewToggleButton_4_16_4_3.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_3.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_3.setBounds(693, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_3);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_4 = new JToggleButton("36");
				tglbtnNewToggleButton_4_16_4_4.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_4.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_4.setBounds(758, 243, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_4);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_5 = new JToggleButton("37");
				tglbtnNewToggleButton_4_16_4_5.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_5.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_5.setBounds(280, 318, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_5);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_6 = new JToggleButton("38");
				tglbtnNewToggleButton_4_16_4_6.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_6.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_6.setBounds(353, 318, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_6);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_7 = new JToggleButton("39");
				tglbtnNewToggleButton_4_16_4_7.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_7.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_7.setBounds(433, 318, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_7);
				
				JToggleButton tglbtnNewToggleButton_4_16_4_8 = new JToggleButton("40");
				tglbtnNewToggleButton_4_16_4_8.setForeground(Color.BLACK);
				tglbtnNewToggleButton_4_16_4_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
				tglbtnNewToggleButton_4_16_4_8.setBackground(new Color(128, 255, 128));
				tglbtnNewToggleButton_4_16_4_8.setBounds(514, 318, 55, 50);
				panel1.add(tglbtnNewToggleButton_4_16_4_8);
				
				
		
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(123, 0, 34));
		tabbedPane_1.addTab("Salon 2", null, panel_12, null);
		panel_12.setLayout(null);
		
		JButton btnNewButton_211 = new JButton("3");
		
				btnNewButton_211.setBackground(Color.RED);
			
			
		
		btnNewButton_211.setBounds(204, 120, 55, 50);
		panel_12.add(btnNewButton_211);
		
		JButton btnNewButton_61 = new JButton("7");
		btnNewButton_61.setBackground(Color.RED);
		btnNewButton_61.setEnabled(false);
	
		btnNewButton_61.setBounds(464, 120, 55, 50);
		panel_12.add(btnNewButton_61);
		
		JButton btnNewButton_231 = new JButton("24");
		btnNewButton_231.setBackground(Color.RED);
		btnNewButton_231.setEnabled(false);
	
		btnNewButton_231.setBounds(170, 272,  55, 50);
		panel_12.add(btnNewButton_231);
		
		JButton btnNewButton_301 = new JButton("31");
		btnNewButton_301.setBackground(Color.RED);
		btnNewButton_301.setEnabled(false);
	
		
		btnNewButton_301.setBounds(625, 272, 55, 50);
		panel_12.add(btnNewButton_301);
		
		JButton btnNewButton_3111 = new JButton("32");
		btnNewButton_3111.setBackground(Color.RED);
		btnNewButton_3111.setEnabled(false);
	
		
		btnNewButton_3111.setBounds(690, 272, 55, 50);
		panel_12.add(btnNewButton_3111);
		
		txtPerde = new JTextField();
		txtPerde.setBackground(SystemColor.activeCaptionBorder);
		txtPerde.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPerde.setText("PERDE");
		txtPerde.setHorizontalAlignment(SwingConstants.CENTER);
		txtPerde.setBounds(59, 10, 734, 19);
		panel_12.add(txtPerde);
		txtPerde.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("dolu_koltuk");
		Image img5=new ImageIcon(this.getClass().getResource("/kırmızı.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img5));
		lblNewLabel.setBounds(303, 392, 55, 50);
		panel_12.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("bos_koltuk");
		lblNewLabel_1.setForeground(SystemColor.inactiveCaptionText);
		Image img6=new ImageIcon(this.getClass().getResource("/mavi.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img6));
		lblNewLabel_1.setBounds(498, 392, 55, 50);
		panel_12.add(lblNewLabel_1);
		
		JLabel lblNewLabel_21 = new JLabel("seçilen_koltuk");
		Image img7=new ImageIcon(this.getClass().getResource("/yeşil.png")).getImage();
		lblNewLabel_21.setIcon(new ImageIcon(img7));
		lblNewLabel_21.setBounds(397, 392, 55, 50);
		panel_12.add(lblNewLabel_21);
		
		txtDoluKoltuk = new JTextField();
		txtDoluKoltuk.setBackground(Color.WHITE);
		txtDoluKoltuk.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtDoluKoltuk.setText("DOLU KOLTUK");
		txtDoluKoltuk.setHorizontalAlignment(SwingConstants.CENTER);
		txtDoluKoltuk.setBounds(285, 452, 90, 19);
		panel_12.add(txtDoluKoltuk);
		txtDoluKoltuk.setColumns(10);
		
		txtSeilenKoltuk = new JTextField();
		txtSeilenKoltuk.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeilenKoltuk.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtSeilenKoltuk.setText("SEÇİLEN KOLTUK");
		txtSeilenKoltuk.setBounds(479, 452, 106, 19);
		panel_12.add(txtSeilenKoltuk);
		txtSeilenKoltuk.setColumns(10);
		
		txtBoKoltuk = new JTextField();
		txtBoKoltuk.setHorizontalAlignment(SwingConstants.CENTER);
		txtBoKoltuk.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtBoKoltuk.setText("BOŞ KOLTUK");
		txtBoKoltuk.setBounds(385, 452, 81, 19);
		panel_12.add(txtBoKoltuk);
		txtBoKoltuk.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("1");
		tglbtnNewToggleButton_5.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5.setBounds(71, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5);
		tglbtnNewToggleButton_5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if (tglbtnNewToggleButton_5.isSelected()) {
	                   
	                    System.out.println("Secilen Salon : SALON 2 --- Seçilen Koltuk : 1 ");
	                } 
	            }
	        });
		
		JToggleButton tglbtnNewToggleButton_5_1 = new JToggleButton("2");
		tglbtnNewToggleButton_5_1.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1.setBounds(139, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1);
		tglbtnNewToggleButton_5_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tglbtnNewToggleButton_5_1.isSelected()) {
                   
                    System.out.println("ToggleButton seçildi.");
                } 
            }
        });
		
		JToggleButton tglbtnNewToggleButton_5_1_1 = new JToggleButton("4");
		tglbtnNewToggleButton_5_1_1.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_1.setBounds(269, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_1);
		
		JToggleButton tglbtnNewToggleButton_5_1_2 = new JToggleButton("5");
		tglbtnNewToggleButton_5_1_2.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_2.setBounds(334, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_2);
		
		JToggleButton tglbtnNewToggleButton_5_1_3 = new JToggleButton("6");
		tglbtnNewToggleButton_5_1_3.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_3.setBounds(399, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_3);
		
		JToggleButton tglbtnNewToggleButton_5_1_4 = new JToggleButton("8");
		tglbtnNewToggleButton_5_1_4.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_4.setBounds(529, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_4);
		
		JToggleButton tglbtnNewToggleButton_5_1_5 = new JToggleButton("9");
		tglbtnNewToggleButton_5_1_5.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_5.setBounds(594, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_5);
		
		JToggleButton tglbtnNewToggleButton_5_1_6 = new JToggleButton("10");
		tglbtnNewToggleButton_5_1_6.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_6.setBounds(659, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_6);
		
		JToggleButton tglbtnNewToggleButton_5_1_7 = new JToggleButton("12");
		tglbtnNewToggleButton_5_1_7.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_7.setBounds(71, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_7);
		
		JToggleButton tglbtnNewToggleButton_5_1_8 = new JToggleButton("13");
		tglbtnNewToggleButton_5_1_8.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_8.setBounds(139, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_8);
		
		JToggleButton tglbtnNewToggleButton_5_1_9 = new JToggleButton("14");
		tglbtnNewToggleButton_5_1_9.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_9.setBounds(204, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_9);
		
		JToggleButton tglbtnNewToggleButton_5_1_10 = new JToggleButton("15");
		tglbtnNewToggleButton_5_1_10.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_10.setBounds(269, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_10);
		
		JToggleButton tglbtnNewToggleButton_5_1_11 = new JToggleButton("16");
		tglbtnNewToggleButton_5_1_11.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_11.setBounds(334, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_11);
		
		JToggleButton tglbtnNewToggleButton_5_1_12 = new JToggleButton("17");
		tglbtnNewToggleButton_5_1_12.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_12.setBounds(399, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_12);
		
		JToggleButton tglbtnNewToggleButton_5_1_13 = new JToggleButton("18");
		tglbtnNewToggleButton_5_1_13.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_13.setBounds(464, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_13);
		
		JToggleButton tglbtnNewToggleButton_5_1_14 = new JToggleButton("19");
		tglbtnNewToggleButton_5_1_14.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_14.setBounds(529, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_14);
		
		JToggleButton tglbtnNewToggleButton_5_1_15 = new JToggleButton("20");
		tglbtnNewToggleButton_5_1_15.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_15.setBounds(594, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_15);
		
		JToggleButton tglbtnNewToggleButton_5_1_16 = new JToggleButton("21");
		tglbtnNewToggleButton_5_1_16.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_16.setBounds(659, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_16);
		
		JToggleButton tglbtnNewToggleButton_5_1_17 = new JToggleButton("11");
		tglbtnNewToggleButton_5_1_17.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_17.setBounds(724, 120, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_17);
		
		JToggleButton tglbtnNewToggleButton_5_1_18 = new JToggleButton("22");
		tglbtnNewToggleButton_5_1_18.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_18.setBounds(724, 198, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_18);
		
		JToggleButton tglbtnNewToggleButton_5_1_19 = new JToggleButton("23");
		tglbtnNewToggleButton_5_1_19.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_19.setBounds(105, 272, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_19);
		
		JToggleButton tglbtnNewToggleButton_5_1_20 = new JToggleButton("25");
		tglbtnNewToggleButton_5_1_20.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_20.setBounds(235, 272, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_20);
		
		JToggleButton tglbtnNewToggleButton_5_1_21 = new JToggleButton("26");
		tglbtnNewToggleButton_5_1_21.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_21.setBounds(300, 272, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_21);
		
		JToggleButton tglbtnNewToggleButton_5_1_22 = new JToggleButton("27");
		tglbtnNewToggleButton_5_1_22.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_22.setBounds(365, 272, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_22);
		
		JToggleButton tglbtnNewToggleButton_5_1_23 = new JToggleButton("28");
		tglbtnNewToggleButton_5_1_23.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_23.setBounds(430, 272, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_23);
		
		JToggleButton tglbtnNewToggleButton_5_1_24 = new JToggleButton("29");
		tglbtnNewToggleButton_5_1_24.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_24.setBounds(495, 272, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_24);
		
		JToggleButton tglbtnNewToggleButton_5_1_25 = new JToggleButton("30\r\n");
		tglbtnNewToggleButton_5_1_25.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton_5_1_25.setBounds(560, 272, 55, 50);
		panel_12.add(tglbtnNewToggleButton_5_1_25);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 240));
		panel_2.setBounds(871, 31, 290, 483);
		
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Film Seçiniz  :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 27, 114, 26);
		panel_2.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "Ölümlü Dünya 2", "Nefes Yer Eksi İki", "Kara Cuma", "Orman Çetesi : Dünya Turu", "Açlık Oyunları : Kuşların ve Yılanların Şarkısı"}));
		comboBox.setBounds(132, 29, 129, 26);
		panel_2.add(comboBox);
	
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(245, 222, 179));
		panel_3.setBounds(35, 77, 215, 141);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("---BİLET FİYATLARI---");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 10, 195, 13);
		panel_3.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("TAM");
		rdbtnNewRadioButton.setBackground(new Color(245, 222, 179));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton.setBounds(6, 36, 69, 21);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("ÖĞRENCİ");
		rdbtnNewRadioButton_1.setBackground(new Color(245, 222, 179));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton_1.setBounds(6, 72, 69, 21);
		panel_3.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("ÇOCUK");
		rdbtnNewRadioButton_2.setBackground(new Color(245, 222, 179));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnNewRadioButton_2.setBounds(6, 108, 69, 21);
		panel_3.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("119 TL");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(126, 40, 45, 13);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("89 TL");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(126, 76, 45, 13);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("59 TL");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7.setBounds(126, 108, 45, 13);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("SEANS");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(35, 267, 45, 34);
		panel_2.add(lblNewLabel_9);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "10.00", "10.30", "11.00", "12.45", "15.45", "17.30", "21.00", "22.00"}));
		comboBox_2.setBounds(132, 275, 129, 21);
		panel_2.add(comboBox_2);
		
		JButton btnNewButton_40 = new JButton("BİLET AL");
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new biletciktisi().setVisible(true);
			}
		});
		btnNewButton_40.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_40.setBounds(88, 401, 127, 26);
		panel_2.add(btnNewButton_40);
		
		JLabel lblNewLabel_10 = new JLabel("MENÜ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(35, 339, 45, 13);
		panel_2.add(lblNewLabel_10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "KAMPANYALI (149 TL)", "BÜYÜK (189 TL)", "KÜÇÜK (119 TL)", "ÇOCUK (99 TL)"}));
		comboBox_3.setBounds(132, 336, 129, 21);
		panel_2.add(comboBox_3);
	}
}
		