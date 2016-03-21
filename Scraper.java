package pcapp;
import org.jsoup.Jsoup;
import java.io.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;

import java.io.IOException;

public class Database {

	public Database() {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			String url = "google.com";
			
			String playerHTML="";
			Database db = new Database();
			try{
				// get info from website
				// Use sparingly as to avoid false DOS attack
				//db.getData();
				
				
				//Document doc = Jsoup.parse(in, charsetName, baseUri);
				File in = new File("E:\\SCHOOL\\Software Engineering\\DailyApp\\workspace\\pcapp\\playerOutput.txt");
				
				Document doc = Jsoup.parse(in, "UTF-8", "");
				Elements headings = doc.select("td");
				Scanner input = new Scanner(in);
				while(input.hasNext()){
					playerHTML += input.next();
				
				}
				
				//PrintWriter output = new PrintWriter("playerOutput.txt");
				//output.println(headings);
				//output.close();
				input.close();
				System.out.println(doc);
			}
			catch(FileNotFoundException e){
			
			}
			catch(IOException e){
			}
		}
		public void getData() {
			// TODO Auto-generated constructor stub
			try{
			Document doc = Jsoup.connect("http://www.baseball-reference.com/leagues/AL/2015-standard-batting.shtml").get();
			Elements headings = doc.select("#players_standard_batting th");
			}
			catch(IOException e){
			
			}
		}
}
