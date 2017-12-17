package szostyzestawzadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie4 {

	public static void main(String[] args) throws IOException 
	{
		String nazwaPliku="zadanie6.txt";
		szyfruj(nazwaPliku,2);

	}

	
	public static void szyfruj(String nazwaWe, int przesun) throws IOException
	{
		File file = new File(nazwaWe);
		File file2 = new File("ala.txt");
		FileReader r = new FileReader(file);
		FileWriter w = new FileWriter(file2);
		
		int i,a;
		while((i=r.read())!=-1)
		{
			a=i+przesun;
			w.write(a);
		
		}
		w.close();
		r.close();
	}
	
}
