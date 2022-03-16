import java.io.*; 
import java.awt.*;

import javax.swing.*; 

import java.util.List;
import java.util.ArrayList;

/**
 * This script is modified from the Recite.java from the Java programming class.
 * @author Xia
 * The modifications are:
 * 1. Design the graphical interface again.
 * 2. Get rid of unnecessary information from the input.
 * 3. Change the speed of the word change.
 */

public class WordTalent{
	private JFrame frame;
	private JButton b1,b2,b3;
	private JTextArea header1,header2;
	private JTextField text1,text2;

	private void init(){
		frame = new JFrame("Word Talent");
		Container contentPane = frame.getContentPane();

		// set the layout as null;	
		contentPane.setLayout(null);

		// add text as headers
		header1 = new JTextArea("Word");
		header2 = new JTextArea("Meaning");
		header1.setBackground(null);
		header2.setBackground(null);
		contentPane.add(header1);
		contentPane.add(header2);
		header1.setBounds(140,60,240,60);
		header2.setBounds(400,60,240,60);
		
		// set texts
		text1 = new JTextField("");
		text1.setBackground(null);
		contentPane.add(text1);
		text2 = new JTextField("");
		text2.setBackground(null);
		contentPane.add(text2);		
		text1.setBounds(140,150,240,60);
		text2.setBounds(400,150,240,60);

		frame.setSize(800,400);
		frame.setVisible(true);
	}
	
	List<String> words = new ArrayList<>();
	List<String> meanings = new ArrayList<>();
	int current = 0;
	public void start() {
		new Thread(()->{
			try{
				readAll();
			}catch(IOException ex){}
			new javax.swing.Timer(1500,(e)->{
				text1.setText( words.get(current) );
				text2.setText( meanings.get(current) );
				current++;
			}).start();
		}).start();
	}

	public void readAll( ) throws IOException{
		String fileName = "College_Grade4.txt";
		String charset = "GB2312";
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(
				new FileInputStream(fileName), charset)); 
		String line; 
		while ((line = reader.readLine()) != null) { 
			line = line.trim();
			if( line.length() == 0 ) continue;
			String[] areas = line.split("\\t");
			words.add(areas[0]);
			meanings.add(areas[1]);
		} 
		reader.close();
	}

	public static void main( String[] args){
		WordTalent f = new WordTalent();
		f.init();
		f.start();
	}
}
