package sinema_proje;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;

public class FilmSecimi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public FilmSecimi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(131, 166, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 888, 560);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(101, 96, 100));
		tabbedPane.addTab("Vizyondaki Filmler", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ölümlü Dünya 2");
		lblNewLabel_2.setBounds(17, 23, 95, 114);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(124, 23, 95, 114);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Kara Cuma");
		lblNewLabel_2_2.setBounds(6, 209, 95, 114);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setBounds(124, 209, 95, 114);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Orman Çetesi");
		lblNewLabel_2_4.setBounds(292, 23, 95, 114);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("New label");
		lblNewLabel_2_5.setBounds(399, 23, 95, 114);
		panel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("New label");
		lblNewLabel_2_6.setBounds(292, 209, 95, 114);
		panel.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("New label");
		lblNewLabel_2_7.setBounds(399, 209, 95, 114);
		panel.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("New label");
		lblNewLabel_2_8.setBounds(583, 23, 95, 114);
		panel.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_9 = new JLabel("New label");
		lblNewLabel_2_9.setBounds(700, 23, 95, 114);
		panel.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_10 = new JLabel("New label");
		lblNewLabel_2_10.setBounds(583, 209, 95, 114);
		panel.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_2_11 = new JLabel("New label");
		lblNewLabel_2_11.setBounds(700, 209, 95, 114);
		panel.add(lblNewLabel_2_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(101, 96, 100));
		tabbedPane.addTab("Koltuk Seçimi", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(6, 6, 855, 508);
		panel_1.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Salon 1", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setBackground(Color.GREEN);
			}
		});
		btnNewButton.setBounds(40, 85, 55, 50);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_1.setBounds(105, 85, 55, 50);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_2.setBounds(170, 85, 55, 50);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_3.setBounds(235, 85, 55, 50);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_4.setBounds(300, 85, 55, 50);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_5.setBounds(365, 85, 55, 50);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_6.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_6.setBounds(430, 85, 55, 50);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_7.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_7.setBounds(495, 85, 55, 50);
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_8.setBounds(557, 85, 55, 50);
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("10");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_9.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_9.setBounds(622, 85, 55, 50);
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("11");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_10.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_10.setBounds(687, 85, 55, 50);
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("12");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_11.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_11.setBounds(752, 85, 55, 50);
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("13");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_12.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_12.setBounds(40, 178, 55, 50);
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("14");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_13.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_13.setBounds(105, 178, 55, 50);
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("15");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_14.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_14.setBounds(170, 178, 55, 50);
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("16");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_15.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_15.setBounds(235, 178, 55, 50);
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("17");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_16.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_16.setBounds(300, 178, 55, 50);
		panel_2.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("18");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_17.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_17.setBounds(365, 178, 55, 50);
		panel_2.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("19");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_18.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_18.setBounds(430, 178, 55, 50);
		panel_2.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("20");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_19.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_19.setBounds(495, 178, 55, 50);
		panel_2.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("21");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_20.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_20.setBounds(557, 178, 55, 50);
		panel_2.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("22");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_21.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_21.setBounds(622, 178, 55, 50);
		panel_2.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("23");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_22.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_22.setBounds(687, 178, 55, 50);
		panel_2.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("24");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_23.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_23.setBounds(752, 178, 55, 50);
		panel_2.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("25");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_24.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_24.setBounds(40, 274, 55, 50);
		panel_2.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("26");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_25.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_25.setBounds(105, 274, 55, 50);
		panel_2.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("27");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_26.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_26.setBounds(170, 274, 55, 50);
		panel_2.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("28");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_27.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_27.setBounds(235, 274, 55, 50);
		panel_2.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("29");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_28.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_28.setBounds(300, 274, 55, 50);
		panel_2.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("30");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_29.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_29.setBounds(365, 274, 55, 50);
		panel_2.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("31");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_30.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_30.setBounds(430, 274, 55, 50);
		panel_2.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("32");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_31.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_31.setBounds(495, 274, 55, 50);
		panel_2.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("33");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_32.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_32.setBounds(557, 274, 55, 50);
		panel_2.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("34");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_33.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_33.setBounds(622, 274, 55, 50);
		panel_2.add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("35");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_34.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_34.setBounds(687, 274, 55, 50);
		panel_2.add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("36");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_35.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_35.setBounds(752, 274, 55, 50);
		panel_2.add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("37");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_36.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_36.setBounds(266, 348, 55, 50);
		panel_2.add(btnNewButton_36);
		
		JButton btnNewButton_37 = new JButton("38");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_37.setBackground(Color.GREEN);
			}
			
		});
		
		btnNewButton_37.setBounds(348, 348, 55, 50);
		panel_2.add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("39");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_38.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_38.setBounds(430, 348, 55, 50);
		panel_2.add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("40");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_39.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_39.setBounds(517, 348, 55, 50);
		panel_2.add(btnNewButton_39);
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Salon 2", null, panel_3, null);
		panel_3.setLayout(null);
		
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton1.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton1.setBounds(60, 77, 55, 50);
		
		panel_3.add(btnNewButton1);
		
		JButton btnNewButton_111 = new JButton("2");
		btnNewButton_111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_111.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_111.setBounds(125, 77, 55, 50);
		panel_3.add(btnNewButton_111);
		
		JButton btnNewButton_211 = new JButton("3");
		btnNewButton_211.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_211.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_211.setBounds(190, 77, 55, 50);
		panel_3.add(btnNewButton_211);
		
		JButton btnNewButton_311 = new JButton("4");
		btnNewButton_311.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_311.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_311.setBounds(255, 77, 55, 50);
		panel_3.add(btnNewButton_311);
		
		JButton btnNewButton_411 = new JButton("5");
		btnNewButton_411.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_411.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_411.setBounds(320, 77, 55, 50);
		panel_3.add(btnNewButton_411);
		
		JButton btnNewButton_51 = new JButton("6");
		btnNewButton_51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_51.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_51.setBounds(385, 77, 55, 50);
		panel_3.add(btnNewButton_51);
		
		JButton btnNewButton_61 = new JButton("7");
		btnNewButton_61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_61.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_61.setBounds(450, 77, 55, 50);
		panel_3.add(btnNewButton_61);
		
		JButton btnNewButton_71 = new JButton("8");
		btnNewButton_71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_71.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_71.setBounds(515, 77, 55, 50);
		panel_3.add(btnNewButton_71);
		
		JButton btnNewButton_81 = new JButton("9");
		btnNewButton_81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_81.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_81.setBounds(580, 77, 55, 50);
		panel_3.add(btnNewButton_81);
		
		JButton btnNewButton_91 = new JButton("10");
		btnNewButton_91.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_91.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_91.setBounds(645, 77, 55, 50);
		panel_3.add(btnNewButton_91);
		
		JButton btnNewButton_101 = new JButton("11");
		btnNewButton_101.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_101.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_101.setBounds(710, 77, 55, 50);
		panel_3.add(btnNewButton_101);
		
		JButton btnNewButton_1111 = new JButton("12");
		btnNewButton_1111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1111.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_1111.setBounds(60, 192, 55, 50);
		panel_3.add(btnNewButton_1111);
		
		JButton btnNewButton_121 = new JButton("13");
		btnNewButton_121.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_121.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_121.setBounds(125, 192, 55, 50);
		panel_3.add(btnNewButton_121);
		
		JButton btnNewButton_131 = new JButton("14");
		btnNewButton_131.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_131.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_131.setBounds(190, 192, 55, 50);
		panel_3.add(btnNewButton_131);
		
		JButton btnNewButton_141 = new JButton("15");
		btnNewButton_141.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_141.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_141.setBounds(255, 192, 55, 50);
		panel_3.add(btnNewButton_141);
		
		JButton btnNewButton_151 = new JButton("16");
		btnNewButton_151.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_151.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_151.setBounds(320, 192,55, 50);
		panel_3.add(btnNewButton_151);
		
		JButton btnNewButton_161 = new JButton("17");
		btnNewButton_161.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_161.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_161.setBounds(385, 192, 55, 50);
		panel_3.add(btnNewButton_161);
		
		JButton btnNewButton_171 = new JButton("18");
		btnNewButton_171.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_171.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_171.setBounds(450, 192, 55, 50);
		panel_3.add(btnNewButton_171);
		
		JButton btnNewButton_181 = new JButton("19");
		btnNewButton_181.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_181.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_181.setBounds(515, 192,55, 50);
		panel_3.add(btnNewButton_181);
		
		JButton btnNewButton_191 = new JButton("20");
		btnNewButton_191.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_191.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_191.setBounds(580, 192, 55, 50);
		panel_3.add(btnNewButton_191);
		
		JButton btnNewButton_201 = new JButton("21");
		btnNewButton_201.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_201.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_201.setBounds(645, 192, 55, 50);
		panel_3.add(btnNewButton_201);
		
		JButton btnNewButton_2111 = new JButton("22");
		btnNewButton_2111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2111.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_2111.setBounds(710, 192,  55, 50);
		panel_3.add(btnNewButton_2111);
		
		JButton btnNewButton_221 = new JButton("23");
		btnNewButton_221.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_221.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_221.setBounds(98, 302,  55, 50);
		panel_3.add(btnNewButton_221);
		
		JButton btnNewButton_231 = new JButton("24");
		btnNewButton_231.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_231.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_231.setBounds(162, 302,  55, 50);
		panel_3.add(btnNewButton_231);
		
		JButton btnNewButton_241 = new JButton("25");
		btnNewButton_241.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_241.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_241.setBounds(227, 302,  55, 50);
		panel_3.add(btnNewButton_241);
		
		JButton btnNewButton_251 = new JButton("26");
		btnNewButton_251.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_251.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_251.setBounds(292, 302, 55, 50);
		panel_3.add(btnNewButton_251);
		
		JButton btnNewButton_261 = new JButton("27");
		btnNewButton_261.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_261.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_261.setBounds(357, 302,  55, 50);
		panel_3.add(btnNewButton_261);
		
		JButton btnNewButton_271 = new JButton("28");
		btnNewButton_271.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_271.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_271.setBounds(422, 302,  55, 50);
		panel_3.add(btnNewButton_271);
		
		JButton btnNewButton_281 = new JButton("29");
		btnNewButton_281.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_281.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_281.setBounds(487, 302,  55, 50);
		panel_3.add(btnNewButton_281);
		
		JButton btnNewButton_291 = new JButton("30");
		btnNewButton_291.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_291.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_291.setBounds(552, 302,  55, 50);
		panel_3.add(btnNewButton_291);
		
		JButton btnNewButton_301 = new JButton("31");
		btnNewButton_301.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_301.setBackground(Color.GREEN);
			}
			
		});
		
		btnNewButton_301.setBounds(617, 302, 55, 50);
		panel_3.add(btnNewButton_301);
		
		JButton btnNewButton_3111 = new JButton("32");
		btnNewButton_3111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3111.setBackground(Color.GREEN);
			}
			
		});
		btnNewButton_3111.setBounds(682, 302, 55, 50);
		panel_3.add(btnNewButton_3111);
	
		
		
	}
}