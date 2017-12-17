package szostyzestawzadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie1 {
	

	public static void main(String[] args) throws IOException 
	{
		String nazwaPlikuWe="test1.txt";
		LiczSlowaZnaki(nazwaPlikuWe);
		
	}
	public static int[] LiczSlowaZnaki(String NazwaPliku) throws IOException
	{
		File plik = new File(NazwaPliku);
		FileReader r = new FileReader(plik);
		int i,sumaZnakow=0,sumaBialychZnakow=0,sumaWyrazow=1;
		int[]tab=new int[3];
		while((i=r.read())!=-1)
		{
			sumaZnakow++;
			
			if(i==(int)('\n')||i==(int)(' ')|| i==(int)('\t'))
			{
				sumaBialychZnakow++;
				sumaWyrazow++;
			}
		}
		System.out.println(sumaZnakow);
		r.close();
		
		tab[0]=sumaZnakow;
		tab[1]=sumaBialychZnakow;
		tab[2]=sumaWyrazow;
		for(int j =0 ; j<tab.length;j++)
		{
			System.out.println(tab[j]);
		}
		
		return tab;
	}

}
