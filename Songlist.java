/**
 * Just Tried reading a file full of songs that I like and I cut out the singer
 * Just listed out song names .. 
 * Original file sonali.txt contains songname/singername
 * Used Array List to store the song names.  :)
 * @author sonalimoholkar
 */

import java.io.*;
import java.util.*;

public class Songlist{
  
	ArrayList<String> songList = new ArrayList<String> ();
	
	public static void main(String args[]) throws IOException{
	//	ArrayList<String> songList = new ArrayList<String> ();
	Songlist sl = new Songlist();
		sl.getSongs();
	}
	
	
	void getSongs() throws IOException{
		File file = new File("/Users/sonalimoholkar/Documents/sonali.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line=null;
		while((line=reader.readLine())!=null){
			addSong(line);
			//addSong();
		}
		System.out.println(songList);
	}
	
	void addSong(String lineToParse){
		//String lineToParse=null;
		String[] tokens = lineToParse.split("/");
		songList.add(tokens[0]);
	}
	}
