package sinema_proje;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;


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
	
	public static void main(String[] args) {
		
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
	

	
	private JButton btnNewButton_40; 
	
	private JToggleButton tglbtnNewToggleButton;
	private JToggleButton tglbtnNewToggleButton_1; 
	private JToggleButton tglbtnNewToggleButton_2; 
	private JToggleButton tglbtnNewToggleButton_3;
	private JToggleButton tglbtnNewToggleButton_4;
	private JToggleButton tglbtnNewToggleButton_4_1;
	private JToggleButton tglbtnNewToggleButton_4_2;
	private JToggleButton tglbtnNewToggleButton_4_3;
	private JToggleButton tglbtnNewToggleButton_4_5;
	private JToggleButton tglbtnNewToggleButton_4_6;
	private JToggleButton tglbtnNewToggleButton_4_7;
	private JToggleButton tglbtnNewToggleButton_4_8;
	private JToggleButton tglbtnNewToggleButton_4_9;
	private JToggleButton tglbtnNewToggleButton_4_10;
	private JToggleButton tglbtnNewToggleButton_4_11;
	private JToggleButton tglbtnNewToggleButton_4_12;
	private JToggleButton tglbtnNewToggleButton_4_13;
	private JToggleButton tglbtnNewToggleButton_4_14;
	private JToggleButton tglbtnNewToggleButton_4_15;
	private JToggleButton tglbtnNewToggleButton_4_16;
	private JToggleButton tglbtnNewToggleButton_4_16_1; 
	private JToggleButton tglbtnNewToggleButton_4_16_2;
	private JToggleButton tglbtnNewToggleButton_4_16_3;
	private JToggleButton tglbtnNewToggleButton_4_16_4;
	private JToggleButton tglbtnNewToggleButton_4_16_4_1;
	private JToggleButton tglbtnNewToggleButton_4_16_4_2;
	private JToggleButton tglbtnNewToggleButton_4_16_4_3;
	private JToggleButton tglbtnNewToggleButton_4_16_4_4;
	private JToggleButton tglbtnNewToggleButton_4_16_4_5;
	private JToggleButton tglbtnNewToggleButton_4_16_4_6;
	private JToggleButton tglbtnNewToggleButton_4_16_4_7;
	private JToggleButton tglbtnNewToggleButton_4_16_4_8;
	private JToggleButton tglbtnNewToggleButton_5;
	private JToggleButton tglbtnNewToggleButton_5_1;
	private JToggleButton tglbtnNewToggleButton_5_1_1;
	private JToggleButton tglbtnNewToggleButton_5_1_2;
	private JToggleButton tglbtnNewToggleButton_5_1_3;
	private JToggleButton tglbtnNewToggleButton_5_1_4;
	private JToggleButton tglbtnNewToggleButton_5_1_5;
	private JToggleButton tglbtnNewToggleButton_5_1_6;
	private JToggleButton tglbtnNewToggleButton_5_1_7;
	private JToggleButton tglbtnNewToggleButton_5_1_8;
	private JToggleButton tglbtnNewToggleButton_5_1_9;
	private JToggleButton tglbtnNewToggleButton_5_1_10;
	private JToggleButton tglbtnNewToggleButton_5_1_11;
	private JToggleButton tglbtnNewToggleButton_5_1_12;
	private JToggleButton tglbtnNewToggleButton_5_1_13;
	private JToggleButton tglbtnNewToggleButton_5_1_14;
	private JToggleButton tglbtnNewToggleButton_5_1_15;
	private JToggleButton tglbtnNewToggleButton_5_1_16;
	private JToggleButton tglbtnNewToggleButton_5_1_17;
	private JToggleButton tglbtnNewToggleButton_5_1_18;
	private JToggleButton tglbtnNewToggleButton_5_1_19;
	private JToggleButton tglbtnNewToggleButton_5_1_20;
	private JToggleButton tglbtnNewToggleButton_5_1_21;
	private JToggleButton tglbtnNewToggleButton_5_1_22;
	private JToggleButton tglbtnNewToggleButton_5_1_23;
	private JToggleButton tglbtnNewToggleButton_5_1_24;
	private JToggleButton tglbtnNewToggleButton_5_1_25;
	private JTextField textFieldFilm;
	private JTextField textFieldSeans;
	private JTextField textFieldSalon;
	private JTextField textFieldKoltuk;
	private JTextField textFieldMenu;
	private JTextField textFieldBilet;
	
	
	
	public FilmSecimi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1206, 696);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 1176, 643);
		tabbedPane.setBackground(new Color(255, 255, 255));
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		tabbedPane.addTab("Vizyondaki Filmler", null, panel, null);
		
		JButton btnNewButton_41 = new JButton("Bilet Almak İçin Tıklayınız\r\n");
		btnNewButton_41.setBackground(new Color(255, 255, 255));
		btnNewButton_41.setBounds(895, 533, 232, 47);
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
		
		JLabel lblNewLabel_15 = new JLabel("       --- VİZYONDAKİ FİLMLER---");
		lblNewLabel_15.setBounds(355, 10, 341, 21);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_18 = new JLabel("Yönetmen: Ali Atay\r\n");
		lblNewLabel_18.setBounds(43, 361, 189, 13);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Türü: Komedi\r\n\r\n");
		lblNewLabel_19.setBounds(43, 342, 189, 13);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("ÖLÜMLÜ DÜNYA 2\r\n\r\n\r\n");
		lblNewLabel_20.setBounds(43, 303, 189, 13);
		lblNewLabel_20.setBackground(Color.BLACK);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_16 = new JLabel("Senarist: Ali Atay\r\n ,");
		lblNewLabel_16.setBounds(43, 378, 189, 13);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Feyyaz Yiğit Çakmak\r\n");
		lblNewLabel_17.setBounds(43, 393, 189, 21);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_22 = new JLabel("Süre: 1s57dk");
		lblNewLabel_22.setBounds(43, 416, 189, 13);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_24 = new JLabel("Türü: Dram\r\n");
		lblNewLabel_24.setBounds(275, 342, 189, 13);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Yönetmen: Ozan Uzunoğlu\r\n");
		lblNewLabel_25.setBounds(275, 361, 189, 13);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Senarist: Hakan Evrensel\r\n");
		lblNewLabel_26.setBounds(275, 378, 189, 13);
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Süre: 2s3dk");
		lblNewLabel_27.setBounds(275, 397, 123, 13);
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_27);
		
		JLabel lblNewLabel_23 = new JLabel("NEFES: YER EKSİ İKİ\r\n");
		lblNewLabel_23.setBounds(275, 303, 189, 13);
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_28 = new JLabel("KARA CUMA");
		lblNewLabel_28.setBounds(505, 303, 189, 13);
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Türü: Korku\r\n");
		lblNewLabel_29.setBounds(507, 342, 189, 13);
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Yönetmen: Eli Roth\r\n");
		lblNewLabel_30.setBounds(505, 361, 189, 13);
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Senarist: Jeff Rendell\r\n");
		lblNewLabel_31.setBounds(505, 378, 189, 13);
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("Süre: 1s47dk");
		lblNewLabel_32.setBounds(505, 397, 189, 13);
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("AÇLIK OYUNLARI:KUŞLARIN ve YILANLARIN ŞARKISI");
		lblNewLabel_33.setBounds(718, 303, 200, 13);
		lblNewLabel_33.setToolTipText("Açlık Oyunları: Kuşların ve Yılanların Şarkısı\r\n\r\n\r\n");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("ORMAN ÇETESİ:DÜNYA TURU");
		lblNewLabel_34.setBounds(944, 303, 200, 13);
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("Türü:Bilim Kurgu,Aksiyon,Macera\r\n\r\n");
		lblNewLabel_35.setBounds(718, 342, 189, 13);
		lblNewLabel_35.setToolTipText("Türü:Bilim Kurgu,Aksiyon,Macera\r\n\r\n");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Yönetmen: Francis Lawrence\r\n\r\n\r\n");
		lblNewLabel_36.setBounds(718, 361, 189, 13);
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("Senarist: Micheal Arndt,Micheal Lesslie\r\n\r\n");
		lblNewLabel_37.setBounds(718, 378, 189, 13);
		lblNewLabel_37.setToolTipText("Senarist: Micheal Arndt,Micheal Lesslie\r\n\r\n");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Süre: 2s38dk\r\n");
		lblNewLabel_38.setBounds(718, 397, 189, 13);
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("Türü:Animasyon,Macera,Komedi,Aile\r\n");
		lblNewLabel_39.setBounds(944, 342, 189, 13);
		lblNewLabel_39.setToolTipText("Türü:Animasyon,Macera,Komedi,Aile\r\n");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("Yönetmen: Laurent Bru, Yannick Moulin,\r\nBenoit Somville\r\n");
		lblNewLabel_40.setBounds(944, 361, 189, 13);
		lblNewLabel_40.setToolTipText("Yönetmen: Laurent Bru, Yannick Moulin,\r\nBenoit Somville\r\n");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("Senarist: David Alaux,Eric Tosti\r\n");
		lblNewLabel_41.setBounds(944, 378, 189, 13);
		lblNewLabel_41.setToolTipText("Senarist: David Alaux,Eric Tosti\r\n");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel("Süre: 1s29dk");
		lblNewLabel_42.setBounds(944, 397, 189, 13);
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_42);
		Image img50=new ImageIcon(this.getClass().getResource("/2461629.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img50));
		
		JLabel lblNewLabel_52 = new JLabel("---SEANSLAR---");
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_52.setBounds(43, 459, 230, 21);
		lblNewLabel_52.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_52);
		
		JLabel lblNewLabel_54 = new JLabel("09.00");
		lblNewLabel_54.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_54.setBounds(43, 497, 45, 13);
		panel.add(lblNewLabel_54);
		
		JLabel lblNewLabel_55 = new JLabel("10.00");
		lblNewLabel_55.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_55.setBounds(43, 533, 45, 13);
		panel.add(lblNewLabel_55);
		
		JLabel lblNewLabel_56 = new JLabel("12.00\r\n");
		lblNewLabel_56.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_56.setBounds(43, 572, 45, 13);
		panel.add(lblNewLabel_56);
		
		JLabel lblNewLabel_53 = new JLabel("14.00\r\n");
		lblNewLabel_53.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_53.setBounds(139, 498, 45, 13);
		panel.add(lblNewLabel_53);
		
		JLabel lblNewLabel_57 = new JLabel("15.00");
		lblNewLabel_57.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_57.setBounds(139, 533, 45, 13);
		panel.add(lblNewLabel_57);
		
		JLabel lblNewLabel_58 = new JLabel("17.00");
		lblNewLabel_58.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_58.setBounds(139, 572, 45, 13);
		panel.add(lblNewLabel_58);
		
		JLabel lblNewLabel_59 = new JLabel("19.00");
		lblNewLabel_59.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_59.setBounds(228, 498, 45, 13);
		panel.add(lblNewLabel_59);
		
		JLabel lblNewLabel_60 = new JLabel("21.00");
		lblNewLabel_60.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_60.setBounds(228, 534, 45, 13);
		panel.add(lblNewLabel_60);
		
		JLabel lblNewLabel_61 = new JLabel("22.00");
		lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_61.setBounds(228, 572, 45, 13);
		panel.add(lblNewLabel_61);
		
	
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 34));
		tabbedPane.addTab("Koltuk Seçimi", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(6, 6, 822, 600);
		tabbedPane_1.setBackground(new Color(192, 192, 192));
		panel_1.add(tabbedPane_1);
		Image img15=new ImageIcon(this.getClass().getResource("/kırmızı.jpg")).getImage();
		Image img16=new ImageIcon(this.getClass().getResource("/mavi.png")).getImage();
		Image img17=new ImageIcon(this.getClass().getResource("/yeşil.png")).getImage();
		Image img5=new ImageIcon(this.getClass().getResource("/kırmızı.jpg")).getImage();
		Image img6=new ImageIcon(this.getClass().getResource("/mavi.png")).getImage();
		Image img7=new ImageIcon(this.getClass().getResource("/yeşil.png")).getImage();
	
		 
		 		JPanel panel1 = new JPanel();
		 		panel1.setBackground(new Color(123, 0, 34));
		 		tabbedPane_1.addTab("Salon 1", null, panel1, null);
		 		panel1.setLayout(null);
		 		
		 		JButton btnNewButton_2 = new JButton("3");
		 		btnNewButton_2.setBounds(155, 143, 55, 50);
		 		btnNewButton_2.setBackground(Color.RED);
		 		btnNewButton_2.setEnabled(false);
		 		
		 			panel1.add(btnNewButton_2);
		 			
		 			JButton btnNewButton_10 = new JButton("11");
		 			btnNewButton_10.setBounds(681, 143, 55, 50);
		 			btnNewButton_10.setBackground(Color.RED);
		 			btnNewButton_10.setEnabled(false);
		 			
		 				panel1.add(btnNewButton_10);
		 				
		 				JButton btnNewButton_16 = new JButton("17");
		 				btnNewButton_16.setBounds(285, 231, 55, 50);
		 				btnNewButton_16.setBackground(Color.RED);
		 				btnNewButton_16.setEnabled(false);
		 				
		 										
		 					panel1.add(btnNewButton_16);
		 					
		 					JButton btnNewButton_21 = new JButton("22");
		 					btnNewButton_21.setBounds(616, 231, 55, 50);
		 					btnNewButton_21.setBackground(Color.RED);
		 					btnNewButton_21.setEnabled(false);
		 					
		 							panel1.add(btnNewButton_21);
		 							
		 							JButton btnNewButton_24 = new JButton("25");
		 							btnNewButton_24.addActionListener(new ActionListener() {
		 								public void actionPerformed(ActionEvent e) {
		 								}
		 							});
		 							btnNewButton_24.setBounds(25, 318, 55, 50);
		 							btnNewButton_24.setBackground(Color.RED);
		 							btnNewButton_24.setEnabled(false);
		 							
		
		 								panel1.add(btnNewButton_24);
		 								
		 								JButton btnNewButton_31 = new JButton("32");
		 								btnNewButton_31.setBounds(486, 318, 55, 50);
		 								btnNewButton_31.setBackground(Color.RED);
		 								btnNewButton_31.setEnabled(false);
		 								
		 									panel1.add(btnNewButton_31);
		 									
		 									JButton btnNewButton_32 = new JButton("33");
		 									btnNewButton_32.setBounds(551, 318, 55, 50);
		 									btnNewButton_32.setBackground(Color.RED);
		 									btnNewButton_32.setEnabled(false);
		 									
		 										panel1.add(btnNewButton_32);
		 										
		 										
		 										txtPerde_1 = new JTextField();
		 										txtPerde_1.setBounds(25, 51, 776, 19);
		 										txtPerde_1.setBackground(SystemColor.activeCaptionBorder);
		 										txtPerde_1.setHorizontalAlignment(SwingConstants.CENTER);
		 										txtPerde_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		 										txtPerde_1.setText("PERDE");
		 										panel1.add(txtPerde_1);
		 										txtPerde_1.setColumns(10);
		 										
		 										JLabel lbldolu = new JLabel("");
		 										lbldolu.setBounds(300, 484, 55, 50);
		 										lbldolu.setIcon(new ImageIcon(img15));
		 										panel1.add(lbldolu);
		 										
		 										JLabel lblboş = new JLabel("");
		 										lblboş.setBounds(489, 484, 55, 50);
		 										lblboş.setIcon(new ImageIcon(img16));
		 										panel1.add(lblboş);
		 										
		 										JLabel lblseç = new JLabel("");
		 										lblseç.setBounds(392, 484, 55, 50);
		 										lblseç.setIcon(new ImageIcon(img17));
		 										panel1.add(lblseç);
		 										
		 										txtDoluKoltuk_1 = new JTextField();
		 										txtDoluKoltuk_1.setBounds(279, 544, 90, 19);
		 										txtDoluKoltuk_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		 										txtDoluKoltuk_1.setText("DOLU KOLTUK");
		 										txtDoluKoltuk_1.setHorizontalAlignment(SwingConstants.CENTER);
		 										panel1.add(txtDoluKoltuk_1);
		 										txtDoluKoltuk_1.setColumns(10);
		 										
		 										txtBoKoltuk_1 = new JTextField();
		 										txtBoKoltuk_1.setBounds(379, 544, 81, 19);
		 										txtBoKoltuk_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		 										txtBoKoltuk_1.setText("BOŞ KOLTUK");
		 										txtBoKoltuk_1.setHorizontalAlignment(SwingConstants.CENTER);
		 										panel1.add(txtBoKoltuk_1);
		 										txtBoKoltuk_1.setColumns(10);
		 										
		 										txtSeilenKoltuk_1 = new JTextField();
		 										txtSeilenKoltuk_1.setBounds(469, 544, 102, 19);
		 										txtSeilenKoltuk_1.setText("SEÇİLEN KOLTUK");
		 										txtSeilenKoltuk_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		 										txtSeilenKoltuk_1.setHorizontalAlignment(SwingConstants.CENTER);
		 										panel1.add(txtSeilenKoltuk_1);
		 										txtSeilenKoltuk_1.setColumns(10);
		 										
		 										JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("1");
		 										tglbtnNewToggleButton_6.setBounds(25, 143, 55, 50);
		 										tglbtnNewToggleButton_6.setForeground(new Color(0, 0, 0));
		 										tglbtnNewToggleButton_6.setBackground(new Color(128, 255, 128));
		 										tglbtnNewToggleButton_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										panel1.add(tglbtnNewToggleButton_6);
		 										
		 										JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("2");
		 										tglbtnNewToggleButton_1_1.setBounds(90, 143, 55, 50);
		 										tglbtnNewToggleButton_1_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_1_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_1_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_2_1 = new JToggleButton("4");
		 										tglbtnNewToggleButton_2_1.setBounds(220, 143, 55, 50);
		 										tglbtnNewToggleButton_2_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_2_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_2_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_3_1 = new JToggleButton("5");
		 										tglbtnNewToggleButton_3_1.setBounds(285, 143, 55, 50);
		 										tglbtnNewToggleButton_3_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_3_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_3_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_17 = new JToggleButton("6");
		 										tglbtnNewToggleButton_4_17.setBounds(350, 143, 55, 50);
		 										tglbtnNewToggleButton_4_17.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_17.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_17);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_1_1 = new JToggleButton("7");
		 										tglbtnNewToggleButton_4_1_1.setBounds(415, 143, 55, 50);
		 										tglbtnNewToggleButton_4_1_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_1_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_1_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_2_1 = new JToggleButton("8");
		 										tglbtnNewToggleButton_4_2_1.setBounds(486, 143, 55, 50);
		 										tglbtnNewToggleButton_4_2_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_2_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_2_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_3_1 = new JToggleButton("9");
		 										tglbtnNewToggleButton_4_3_1.setBounds(551, 143, 55, 50);
		 										tglbtnNewToggleButton_4_3_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_3_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_3_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_4 = new JToggleButton("10");
		 										tglbtnNewToggleButton_4_4.setBounds(616, 143, 55, 50);
		 										tglbtnNewToggleButton_4_4.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_4.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_4);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_5_1 = new JToggleButton("12");
		 										tglbtnNewToggleButton_4_5_1.setBounds(746, 143, 55, 50);
		 										tglbtnNewToggleButton_4_5_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_5_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_5_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_5_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_6_1 = new JToggleButton("18");
		 										tglbtnNewToggleButton_4_6_1.setBounds(350, 231, 55, 50);
		 										tglbtnNewToggleButton_4_6_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_6_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_6_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_6_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_7_1 = new JToggleButton("19");
		 										tglbtnNewToggleButton_4_7_1.setBounds(415, 231, 55, 50);
		 										tglbtnNewToggleButton_4_7_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_7_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_7_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_7_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_8_1 = new JToggleButton("20");
		 										tglbtnNewToggleButton_4_8_1.setBounds(486, 231, 55, 50);
		 										tglbtnNewToggleButton_4_8_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_8_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_8_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_8_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_9_1 = new JToggleButton("21");
		 										tglbtnNewToggleButton_4_9_1.setBounds(551, 231, 55, 50);
		 										tglbtnNewToggleButton_4_9_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_9_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_9_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_9_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_10_1 = new JToggleButton("23");
		 										tglbtnNewToggleButton_4_10_1.setBounds(681, 231, 55, 50);
		 										tglbtnNewToggleButton_4_10_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_10_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_10_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_10_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_11_1 = new JToggleButton("24");
		 										tglbtnNewToggleButton_4_11_1.setBounds(746, 231, 55, 50);
		 										tglbtnNewToggleButton_4_11_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_11_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_11_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_11_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_12_1 = new JToggleButton("13");
		 										tglbtnNewToggleButton_4_12_1.setBounds(25, 231, 55, 50);
		 										tglbtnNewToggleButton_4_12_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_12_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_12_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_12_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_13_1 = new JToggleButton("14");
		 										tglbtnNewToggleButton_4_13_1.setBounds(90, 231, 55, 50);
		 										tglbtnNewToggleButton_4_13_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_13_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_13_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_13_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_14_1 = new JToggleButton("15");
		 										tglbtnNewToggleButton_4_14_1.setBounds(155, 231, 55, 50);
		 										tglbtnNewToggleButton_4_14_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_14_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_14_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_14_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_15_1 = new JToggleButton("16");
		 										tglbtnNewToggleButton_4_15_1.setBounds(220, 231, 55, 50);
		 										tglbtnNewToggleButton_4_15_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_15_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_15_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_15_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_5 = new JToggleButton("26");
		 										tglbtnNewToggleButton_4_16_5.setBounds(90, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_5.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_5.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_5);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_1_1 = new JToggleButton("27");
		 										tglbtnNewToggleButton_4_16_1_1.setBounds(155, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_1_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_1_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_1_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_2_1 = new JToggleButton("28");
		 										tglbtnNewToggleButton_4_16_2_1.setBounds(220, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_2_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_2_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_2_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_3_1 = new JToggleButton("29");
		 										tglbtnNewToggleButton_4_16_3_1.setBounds(285, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_3_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_3_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_3_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_9 = new JToggleButton("30");
		 										tglbtnNewToggleButton_4_16_4_9.setBounds(350, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_9.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_9.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_9);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_1_1 = new JToggleButton("31");
		 										tglbtnNewToggleButton_4_16_4_1_1.setBounds(415, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_1_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_1_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_1_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_2_1 = new JToggleButton("34");
		 										tglbtnNewToggleButton_4_16_4_2_1.setBounds(616, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_2_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_2_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_2_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_3_1 = new JToggleButton("35");
		 										tglbtnNewToggleButton_4_16_4_3_1.setBounds(681, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_3_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_3_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_3_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_4_1 = new JToggleButton("36");
		 										tglbtnNewToggleButton_4_16_4_4_1.setBounds(746, 318, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_4_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_4_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_4_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_4_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_5_1 = new JToggleButton("37");
		 										tglbtnNewToggleButton_4_16_4_5_1.setBounds(285, 396, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_5_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_5_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_5_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_5_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_6_1 = new JToggleButton("38");
		 										tglbtnNewToggleButton_4_16_4_6_1.setBounds(350, 396, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_6_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_6_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_6_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_6_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_7_1 = new JToggleButton("39");
		 										tglbtnNewToggleButton_4_16_4_7_1.setBounds(415, 396, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_7_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_7_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_7_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_7_1);
		 										
		 										JToggleButton tglbtnNewToggleButton_4_16_4_8_1 = new JToggleButton("40");
		 										tglbtnNewToggleButton_4_16_4_8_1.setBounds(486, 396, 55, 50);
		 										tglbtnNewToggleButton_4_16_4_8_1.setForeground(Color.BLACK);
		 										tglbtnNewToggleButton_4_16_4_8_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		 										tglbtnNewToggleButton_4_16_4_8_1.setBackground(new Color(128, 255, 128));
		 										panel1.add(tglbtnNewToggleButton_4_16_4_8_1);
		 										
		 										
		 										
		
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(123, 0, 34));
		tabbedPane_1.addTab("Salon 2", null, panel_12, null);
		panel_12.setLayout(null);
		
		JButton btnNewButton_211 = new JButton("3");
		
				btnNewButton_211.setBackground(Color.RED);
				
				
		
		btnNewButton_211.setBounds(189, 138, 55, 50);
		panel_12.add(btnNewButton_211);
		
		JButton btnNewButton_61 = new JButton("7");
		btnNewButton_61.setBackground(Color.RED);
		btnNewButton_61.setEnabled(false);
		
			btnNewButton_61.setBounds(452, 138, 55, 50);
			panel_12.add(btnNewButton_61);
			
			JButton btnNewButton_231 = new JButton("24");
			btnNewButton_231.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_231.setBackground(Color.RED);
			btnNewButton_231.setEnabled(false);
			
				btnNewButton_231.setBounds(164, 310,  55, 50);
				panel_12.add(btnNewButton_231);
				
				JButton btnNewButton_301 = new JButton("31");
				btnNewButton_301.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_301.setBackground(Color.RED);
				btnNewButton_301.setEnabled(false);
				
					
					btnNewButton_301.setBounds(619, 310, 55, 50);
					panel_12.add(btnNewButton_301);
					
					JButton btnNewButton_3111 = new JButton("32");
					btnNewButton_3111.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					btnNewButton_3111.setBackground(Color.RED);
					btnNewButton_3111.setEnabled(false);
					
						
						btnNewButton_3111.setBounds(684, 310, 55, 50);
						panel_12.add(btnNewButton_3111);
						
						txtPerde = new JTextField();
						txtPerde.setBackground(SystemColor.activeCaptionBorder);
						txtPerde.setFont(new Font("Tahoma", Font.BOLD, 15));
						txtPerde.setText("PERDE");
						txtPerde.setHorizontalAlignment(SwingConstants.CENTER);
						txtPerde.setBounds(47, 62, 734, 19);
						panel_12.add(txtPerde);
						txtPerde.setColumns(10);
						
						JLabel lblNewLabel = new JLabel("dolu_koltuk");
						lblNewLabel.setIcon(new ImageIcon(img5));
						lblNewLabel.setBounds(300, 484, 55, 50);
						panel_12.add(lblNewLabel);
						
						JLabel lblNewLabel_1 = new JLabel("bos_koltuk");
						lblNewLabel_1.setForeground(SystemColor.inactiveCaptionText);
						lblNewLabel_1.setIcon(new ImageIcon(img6));
						lblNewLabel_1.setBounds(489, 484, 55, 50);
						panel_12.add(lblNewLabel_1);
						
						JLabel lblNewLabel_21 = new JLabel("seçilen_koltuk");
						lblNewLabel_21.setIcon(new ImageIcon(img7));
						lblNewLabel_21.setBounds(392, 484, 55, 50);
						panel_12.add(lblNewLabel_21);
						
						txtDoluKoltuk = new JTextField();
						txtDoluKoltuk.setBackground(Color.WHITE);
						txtDoluKoltuk.setFont(new Font("Tahoma", Font.BOLD, 10));
						txtDoluKoltuk.setText("DOLU KOLTUK");
						txtDoluKoltuk.setHorizontalAlignment(SwingConstants.CENTER);
						txtDoluKoltuk.setBounds(279, 544, 90, 19);
						panel_12.add(txtDoluKoltuk);
						txtDoluKoltuk.setColumns(10);
						
						txtSeilenKoltuk = new JTextField();
						txtSeilenKoltuk.setHorizontalAlignment(SwingConstants.CENTER);
						txtSeilenKoltuk.setFont(new Font("Tahoma", Font.BOLD, 10));
						txtSeilenKoltuk.setText("SEÇİLEN KOLTUK");
						txtSeilenKoltuk.setBounds(469, 544, 102, 19);
						panel_12.add(txtSeilenKoltuk);
						txtSeilenKoltuk.setColumns(10);
						
						txtBoKoltuk = new JTextField();
						txtBoKoltuk.setHorizontalAlignment(SwingConstants.CENTER);
						txtBoKoltuk.setFont(new Font("Tahoma", Font.BOLD, 10));
						txtBoKoltuk.setText("BOŞ KOLTUK");
						txtBoKoltuk.setBounds(379, 544, 81, 19);
						panel_12.add(txtBoKoltuk);
						txtBoKoltuk.setColumns(10);
						
						JToggleButton tglbtnNewToggleButton_5_2 = new JToggleButton("1");
						tglbtnNewToggleButton_5_2.setBackground(new Color(128, 255, 128));
						tglbtnNewToggleButton_5_2.setBounds(59, 138, 55, 50);
						panel_12.add(tglbtnNewToggleButton_5_2);
						
							
							JToggleButton tglbtnNewToggleButton_5_1_26 = new JToggleButton("2");
							tglbtnNewToggleButton_5_1_26.setBackground(new Color(128, 255, 128));
							tglbtnNewToggleButton_5_1_26.setBounds(124, 138, 55, 50);
							panel_12.add(tglbtnNewToggleButton_5_1_26);
							
								JToggleButton tglbtnNewToggleButton_5_1_1_1 = new JToggleButton("4");
								tglbtnNewToggleButton_5_1_1_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_1_1.setBounds(254, 138, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_1_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_2_1 = new JToggleButton("5");
								tglbtnNewToggleButton_5_1_2_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_2_1.setBounds(319, 138, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_2_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_3_1 = new JToggleButton("6");
								tglbtnNewToggleButton_5_1_3_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_3_1.setBounds(387, 138, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_3_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_4_1 = new JToggleButton("8");
								tglbtnNewToggleButton_5_1_4_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_4_1.setBounds(517, 138, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_4_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_5_1 = new JToggleButton("9");
								tglbtnNewToggleButton_5_1_5_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_5_1.setBounds(582, 138, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_5_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_6_1 = new JToggleButton("10");
								tglbtnNewToggleButton_5_1_6_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_6_1.setBounds(647, 138, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_6_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_7_1 = new JToggleButton("12");
								tglbtnNewToggleButton_5_1_7_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_7_1.setBounds(59, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_7_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_8_1 = new JToggleButton("13");
								tglbtnNewToggleButton_5_1_8_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_8_1.setBounds(124, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_8_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_9_1 = new JToggleButton("14");
								tglbtnNewToggleButton_5_1_9_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_9_1.setBounds(189, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_9_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_10_1 = new JToggleButton("15");
								tglbtnNewToggleButton_5_1_10_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_10_1.setBounds(254, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_10_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_11_1 = new JToggleButton("16");
								tglbtnNewToggleButton_5_1_11_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_11_1.setBounds(319, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_11_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_12_1 = new JToggleButton("17");
								tglbtnNewToggleButton_5_1_12_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_12_1.setBounds(387, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_12_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_13_1 = new JToggleButton("18");
								tglbtnNewToggleButton_5_1_13_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_13_1.setBounds(452, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_13_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_14_1 = new JToggleButton("19");
								tglbtnNewToggleButton_5_1_14_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_14_1.setBounds(517, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_14_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_15_1 = new JToggleButton("20");
								tglbtnNewToggleButton_5_1_15_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_15_1.setBounds(582, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_15_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_16_1 = new JToggleButton("21");
								tglbtnNewToggleButton_5_1_16_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_16_1.setBounds(647, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_16_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_17_1 = new JToggleButton("11");
								tglbtnNewToggleButton_5_1_17_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_17_1.setBounds(712, 138, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_17_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_18_1 = new JToggleButton("22");
								tglbtnNewToggleButton_5_1_18_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_18_1.setBounds(712, 226, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_18_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_19_1 = new JToggleButton("23");
								tglbtnNewToggleButton_5_1_19_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_19_1.setBounds(99, 310, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_19_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_20_1 = new JToggleButton("25");
								tglbtnNewToggleButton_5_1_20_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_20_1.setBounds(229, 310, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_20_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_21_1 = new JToggleButton("26");
								tglbtnNewToggleButton_5_1_21_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_21_1.setBounds(294, 310, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_21_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_22_1 = new JToggleButton("27");
								tglbtnNewToggleButton_5_1_22_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_22_1.setBounds(359, 310, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_22_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_23_1 = new JToggleButton("28");
								tglbtnNewToggleButton_5_1_23_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_23_1.setBounds(424, 310, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_23_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_24_1 = new JToggleButton("29");
								tglbtnNewToggleButton_5_1_24_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_24_1.setBounds(489, 310, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_24_1);
								
								JToggleButton tglbtnNewToggleButton_5_1_25_1 = new JToggleButton("30\r\n");
								tglbtnNewToggleButton_5_1_25_1.setBackground(new Color(128, 255, 128));
								tglbtnNewToggleButton_5_1_25_1.setBounds(554, 310, 55, 50);
								panel_12.add(tglbtnNewToggleButton_5_1_25_1);
						
	
		 
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(838, 31, 323, 575);
		panel_1.add(panel_2);
		panel_2.setBackground(new Color(255, 250, 240));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Film Giriniz  :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(58, 16, 114, 26);
		panel_2.add(lblNewLabel_3);
		
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(245, 222, 179));
			panel_3.setBounds(58, 63, 220, 111);
			panel_2.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_4 = new JLabel("---BİLET FİYATLARI---");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_4.setBounds(10, 10, 195, 13);
			panel_3.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("119 TL");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
			lblNewLabel_5.setBounds(140, 40, 45, 13);
			panel_3.add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("89 TL");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
			lblNewLabel_6.setBounds(140, 63, 45, 13);
			panel_3.add(lblNewLabel_6);
			
			JLabel lblNewLabel_7 = new JLabel("59 TL");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
			lblNewLabel_7.setBounds(140, 86, 45, 13);
			panel_3.add(lblNewLabel_7);
			
			JLabel lblNewLabelTam = new JLabel("1- TAM");
			lblNewLabelTam.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabelTam.setBounds(30, 40, 45, 13);
			panel_3.add(lblNewLabelTam);
			
			JLabel lblNewLabelOgrenci = new JLabel("2- ÖĞRENCİ");
			lblNewLabelOgrenci.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabelOgrenci.setBounds(30, 63, 70, 13);
			panel_3.add(lblNewLabelOgrenci);
			
			JLabel lblNewLabelCocuk = new JLabel("3- ÇOCUK");
			lblNewLabelCocuk.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabelCocuk.setBounds(30, 86, 61, 13);
			panel_3.add(lblNewLabelCocuk);
			
			JLabel lblNewLabel_9 = new JLabel("Seans Giriniz: ");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_9.setBounds(58, 217, 101, 19);
			panel_2.add(lblNewLabel_9);
			
			JButton btnNewButton_40_1 = new JButton("BİLET AL");
			btnNewButton_40_1.setBackground(new Color(255, 255, 255));
			btnNewButton_40_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResultSet myRs= biletbaglanti.yap1();
					int id = 0;
					String secilenFilm = textFieldFilm.getText();
					String secilenSalon = textFieldSalon.getText();
					String secilenSeans =textFieldSeans.getText();
					String secilenMenu = textFieldMenu.getText();
					String secilenKoltuk = textFieldKoltuk.getText();
					String secilenBiletTuru =textFieldBilet.getText();
					String sql="INSERT INTO secimler (id,filmAdi,salon,seans,menu,koltukNo,biletTuru) VALUES ('"+id+"','"+secilenFilm+"','"+secilenSalon+"','"+secilenSeans+"','"+secilenMenu+"','"+secilenKoltuk+"','"+secilenBiletTuru+"')";

					try {
						biletbaglanti.ekle1(sql);
						System.out.println("Veri başarıyla veritabanına eklendi.");
					}catch (SQLException e1) {
						System.out.println("Veri tabanına veri eklenemedi");
						e1.printStackTrace();
					}
					
	
			 
			    
					setVisible(false);
					JOptionPane.showMessageDialog(btnNewButton_40_1,"***BİLETİNİZ OLUŞTURULDU*** ");
				}
			});
			btnNewButton_40_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnNewButton_40_1.setBounds(87, 527, 127, 26);
			panel_2.add(btnNewButton_40_1);
			
			JLabel lblNewLabel_10 = new JLabel("Menü Giriniz : ");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_10.setBounds(58, 461, 96, 13);
			panel_2.add(lblNewLabel_10);
			
			textFieldFilm = new JTextField();
			textFieldFilm.setBounds(182, 22, 96, 19);
			panel_2.add(textFieldFilm);
			textFieldFilm.setColumns(10);
			
			textFieldSeans = new JTextField();
			textFieldSeans.setBounds(182, 218, 96, 19);
			panel_2.add(textFieldSeans);
			textFieldSeans.setColumns(10);
			
			JLabel lblNewLabelSalon = new JLabel("Salon Giriniz : ");
			lblNewLabelSalon.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabelSalon.setBounds(58, 245, 101, 19);
			panel_2.add(lblNewLabelSalon);
			
			JLabel lblNewLabelKoltuk = new JLabel("Koltuk No : ");
			lblNewLabelKoltuk.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabelKoltuk.setBounds(58, 274, 86, 17);
			panel_2.add(lblNewLabelKoltuk);
			
			textFieldSalon = new JTextField();
			textFieldSalon.setBounds(182, 246, 96, 19);
			panel_2.add(textFieldSalon);
			textFieldSalon.setColumns(10);
			
			textFieldKoltuk = new JTextField();
			textFieldKoltuk.setBounds(182, 274, 96, 19);
			panel_2.add(textFieldKoltuk);
			textFieldKoltuk.setColumns(10);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(245, 222, 179));
			panel_4.setBounds(58, 301, 220, 136);
			panel_2.add(panel_4);
			panel_4.setLayout(null);
			
			JLabel lblNewLabel_43 = new JLabel("---MENÜLER---");
			lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_43.setBounds(55, 10, 114, 13);
			panel_4.add(lblNewLabel_43);
			
			JLabel lblNewLabel_44 = new JLabel("1- KAMPANYALI");
			lblNewLabel_44.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_44.setBounds(20, 40, 110, 13);
			panel_4.add(lblNewLabel_44);
			
			JLabel lblNewLabel_45 = new JLabel("2- BÜYÜK");
			lblNewLabel_45.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_45.setBounds(20, 63, 77, 13);
			panel_4.add(lblNewLabel_45);
			
			JLabel lblNewLabel_46 = new JLabel("3- KÜÇÜK");
			lblNewLabel_46.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_46.setBounds(20, 88, 58, 13);
			panel_4.add(lblNewLabel_46);
			
			JLabel lblNewLabel_47 = new JLabel("149 TL\r\n");
			lblNewLabel_47.setFont(new Font("Tahoma", Font.BOLD, 10));
			lblNewLabel_47.setBounds(140, 40, 45, 13);
			panel_4.add(lblNewLabel_47);
			
			JLabel lblNewLabel_48 = new JLabel("189 TL");
			lblNewLabel_48.setFont(new Font("Tahoma", Font.BOLD, 10));
			lblNewLabel_48.setBounds(140, 63, 45, 13);
			panel_4.add(lblNewLabel_48);
			
			JLabel lblNewLabel_49 = new JLabel("119 TL\r\n");
			lblNewLabel_49.setFont(new Font("Tahoma", Font.BOLD, 10));
			lblNewLabel_49.setBounds(140, 88, 45, 13);
			panel_4.add(lblNewLabel_49);
			
			JLabel lblNewLabel_50 = new JLabel("4- ÇOCUK");
			lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_50.setBounds(20, 113, 58, 13);
			panel_4.add(lblNewLabel_50);
			
			JLabel lblNewLabel_51 = new JLabel("99 TL");
			lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_51.setBounds(140, 111, 45, 13);
			panel_4.add(lblNewLabel_51);
			
			textFieldMenu = new JTextField();
			textFieldMenu.setBounds(182, 459, 96, 19);
			panel_2.add(textFieldMenu);
			textFieldMenu.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Bilet Türü Giriniz : ");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_8.setBounds(58, 197, 127, 13);
			panel_2.add(lblNewLabel_8);
			
			textFieldBilet = new JTextField();
			textFieldBilet.setBounds(182, 189, 96, 19);
			panel_2.add(textFieldBilet);
			textFieldBilet.setColumns(10);
		
	}
    }



