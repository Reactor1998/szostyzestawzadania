package szostyzestawzadania;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie2 {

	public static void main(String[] args) throws IOException 
	{
		String plikWe="tekst1.txt";
		String plikWy="tekst2.txt";
		String slowo="egzamin";
		Szukaj(plikWe,plikWy,slowo);
	}


	public static void Szukaj(String nazwaPlikuWe,String nazwaPlikuWy,String slowo) throws IOException
	{
		File file2= new File(nazwaPlikuWy);
		BufferedWriter r1 = new BufferedWriter(new FileWriter(file2));
		File file= new File(nazwaPlikuWe);
		BufferedReader r = new BufferedReader(new FileReader(file));
		
		String linia;
		while((linia=r.readLine()) != null)
		{
			if(linia.contains(slowo))
			{
				r1.write(linia);
			}
		
		
		}
		r.close();
		r1.close();
}
}
