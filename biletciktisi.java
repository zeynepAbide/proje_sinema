package sinema_proje;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class biletciktisi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	
	 
	public biletciktisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 416, 543);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("BİLET", null, panel, null);
		panel.setLayout(null);
		
		fetchDataFromDatabase();
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 391, 496);
		panel.add(textArea);
	}
		
		private void fetchDataFromDatabase() {
	       
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinemaKayit", "root", "Z5462")) {
	            Statement statement = connection.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM uyeolanlar");
	            
	            textArea = new JTextArea();
	            textArea.setEditable(false); 
	            
	            while (resultSet.next()) {
	                String data = resultSet.getString("tcno");
	                textArea.append(data + "\n");
	                String data1 = resultSet.getString("adi_soyadi");
	                textArea.append(data1 + "\n");
	                String data2 = resultSet.getString("sifre");
	                textArea.append(data2 + "\n");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	}
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						biletciktisi frame = new biletciktisi();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

}


