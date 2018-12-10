package NewPackage;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.Buffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashmap {

	
	 // public static  String variable;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		hash_map();
		//textread();
		
		/*

		FileReader fromfile = new FileReader("E:\\OnlineJob\\PWD.txt");
		BufferedReader bufferReader = new BufferedReader(fromfile);
		
		String textFromfile =null;
		while ((textFromfile = bufferReader.readLine())!= null) {
			System.out.println(textFromfile);
		}
		fromfile.close();
		bufferReader.close();
	}
	
	public static void textread() {
		
		Scanner userinput = new Scanner(System.in);
		System.out.println("Learning Java from?");
		String variable = userinput.nextLine();
		System.out.println(variable);
		userinput.close();
		} */
	public static void hash_map() {
		HashMap<Integer, String> testmp = new HashMap<Integer, String>(); 
		testmp.put(1, "Param");
		testmp.put(2, "Selvi");
		testmp.put(3,"" );
		testmp.put(4, "Ragha");
		//testmp.put(4, 100);
		//testmp.put(4,250);
		System.out.println("Elements of Map:");
		testmp.remove(6);
		System.out.println(testmp.containsKey(6));
		System.out.println(testmp);
		System.out.println(testmp.keySet());
		System.out.println(testmp.values());
		System.out.println(testmp.isEmpty());
		
	}

	
}
