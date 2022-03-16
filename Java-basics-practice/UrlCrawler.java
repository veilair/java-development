import java.awt.Container;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * This script is modified based on the URLCrawler from the Java programming class.
 * Modifications are:
 * 1. Added a graphical interface.
 * 2. Avoid downloading a url multiple times.
 * 3. Record the email addresses encountered.
 * 4. Judge whether it's a web based on the html tag.
 */

class UrlCrawler {
	private JFrame frame;
	private JTextArea header1,header2,header3;
	private static JTextArea text1, text2,text3;

	private void init(){
		frame = new JFrame("URL Crawler");
		Container contentPane = frame.getContentPane();

		// set the layout as null;
		contentPane.setLayout(null);

		// add text as headers
		header1 = new JTextArea("Downloaded");
		header2 = new JTextArea("Duplicated");
		header3 = new JTextArea("Email");
		header1.setBackground(null);
		header2.setBackground(null);
		header3.setBackground(null);
		
		contentPane.add(header1);
		contentPane.add(header2);
		contentPane.add(header3);
		header1.setBounds(140,60,240,60);
		header2.setBounds(400,60,240,60);
		header3.setBounds(660,60,240,60);
		
		// set texts
		text1 = new JTextArea("");
		text1.setBackground(null);
		contentPane.add(text1);
		text2 = new JTextArea("");
		text2.setBackground(null);
		contentPane.add(text2);		
		text3 = new JTextArea("");
		text3.setBackground(null);
		contentPane.add(text3);			
		text1.setBounds(140,150,240,800);
		text2.setBounds(400,150,240,800);
		text3.setBounds(660,150,240,800);
		
		frame.setSize(1000,1000);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) throws Exception{
		UrlCrawler f = new UrlCrawler();
		f.init();
		ConcurrentLinkedQueue<String> urls = new ConcurrentLinkedQueue<>();
		ConcurrentLinkedQueue<String> storage = new ConcurrentLinkedQueue<>();
		urls.add( "http://www.dstang.com" );
		storage.add("http://www.dstang.com");
		int cnt=0;
		while(!urls.isEmpty()){
			String url = urls.poll();
			System.out.println(url);
			new Thread( ()-> {
				try{					
					String content = download(new URL(url), "gb2312");
					text1.append(url+"\n");
					List<String> moreUrl = parse( content );
					boolean shift=false;
					for(int i = 0; i < moreUrl.size(); i++){
						String tmpurl = moreUrl.get(i);
						if(tmpurl.equals("General shift")){
							shift=true;
						}else if(!shift){
							if (storage.contains(tmpurl)){
								System.out.println(tmpurl + " have been identified before.");
								text2.append(tmpurl + "\n");
							}else{
								urls.add(tmpurl);
								System.out.println(tmpurl + " is added to the list.");
							}
						}else{
							System.out.println("Email identified: " + tmpurl);
							text2.append(tmpurl + "\n");
						}	
					}
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}).start();
			
			if(cnt++>5) break;
			try{ Thread.sleep(4000); }catch(InterruptedException ex){}
		}
	}

	static List<String> parse(String text) {
		// Define pattern
		String wPattern = "\\s*href\\s*=\\s*(\"([^\"]*\")|(\'[^\']*\')|([^\'\">\\s]+))\\s*";
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
 		Pattern webPattern = Pattern.compile(wPattern, Pattern.CASE_INSENSITIVE);
 		Pattern emailPattern = Pattern.compile(ePattern, Pattern.CASE_INSENSITIVE);
		
 		// Web matcher
 		Matcher webMatcher = webPattern.matcher( text );
		List<String> list = new ArrayList<>();
		while (webMatcher.find()) {
			String href = webMatcher.group(1);
			href = href.replaceAll("\'","").replaceAll("\"","");
			if(href.startsWith("http:") )
				list.add(href); 
		}
		
		// Email matcher
		list.add("General shift");
		Matcher emailMatcher = emailPattern.matcher( text );
		while (emailMatcher.find()) {
			String email = webMatcher.group(1);
			list.add(email); 
		}
		return list;
	}

	static String download( URL url, String charset) throws Exception{
		System.out.println("Downloading " + url);
		try(InputStream input = url.openStream();
			ByteArrayOutputStream output = new ByteArrayOutputStream()){
			byte[] data = new byte[1024];
			int length;
			while((length=input.read(data))!=-1){
				output.write(data,0,length);
			}
			byte[] content = output.toByteArray();
			String contents = new String(content, Charset.forName(charset));
			if(contents.contains("<html>") || contents.contains("<HTML>")){
				System.out.println(url + " is a html.");
			}else{
				System.out.println(url + " is not a html.");
			}
			return contents;
		}
	}
}
