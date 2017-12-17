package szostyzestawzadania;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie3b {

	public static void main(String[] args) throws IOException 
	{
		String nazwaPliku="zadanie3.txt";
		sumujIZapisz(nazwaPliku);

	}

	public static void sumujIZapisz(String nazwaPliku) throws IOException
	{
		
		File file = new File (nazwaPliku);
		
		BufferedReader r= new BufferedReader(new FileReader(file));
		BufferedWriter w= new BufferedWriter(new FileWriter(file,true));
		int suma=0;
		String i;
		int pom;
		while((i=r.readLine())!=null)
		{
			
		suma=suma+Integer.valueOf(i);
			
			
		}
		
		System.out.println(suma);
		w.newLine();
		w.write(Integer.toString(suma+1));
	
		r.close();
		w.close();
		
	}
}
