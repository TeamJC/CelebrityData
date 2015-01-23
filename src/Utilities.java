import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Utilities {

	/*void Create(String name, String text) throws FileNotFoundException, UnsupportedEncodingException{
		
		PrintWriter writer = new PrintWriter(name + ".txt", "UTF-8");
		writer.println(text);
		writer.close();
		System.out.println("Written");
		
	}
		
	@SuppressWarnings("resource")
	String Read(String read) throws FileNotFoundException{
		return (new Scanner(new File(read))).useDelimiter("\\A").next();
	}*/
	
	
	
	@SuppressWarnings("unchecked")
	ArrayList<String> Sort(String read) throws FileNotFoundException{
		
		Scanner s = new Scanner(new File(read));
		ArrayList<String> ret = new ArrayList<String>();
		
		while(s.hasNextLine()){
			ret.add(s.nextLine());
		}
		
		Collections.sort(ret);
		
		return ret;
	}
	
	
	
	
	
	/*String NerdText(String read) throws FileNotFoundException{
		Scanner s = new Scanner(new File(read));
		String ret = "";
		while(s.hasNextLine()){
		
			if(s.hasNext("The")){
				ret += s.nextLine() + "\n"; 
			}
			else{
				s.nextLine();
			}
		
		}
		return ret;
	}*/
	
	
	
}
