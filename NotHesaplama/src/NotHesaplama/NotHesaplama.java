package test;
import java.util.Scanner;

public class NotHesaplama 
{
	public static void main(String[] args) 
	{
		try (Scanner input = new Scanner(System.in)) {
			int fizik,matematik,turkce,kimya,muzik,tarih,sonuc;
			System.out.print("Fizik Notunuz : ");
			fizik = input.nextInt();
			System.out.print("Matematik Notunuz : ");
			matematik = input.nextInt();
			System.out.print("Turkce Notunuz : ");
			turkce = input.nextInt();
			System.out.print("Kimya Notunuz : ");
			kimya = input.nextInt();
			System.out.print("Muzik Notunuz : ");
			muzik = input.nextInt();
			System.out.print("Tarih Notunuz : ");
			tarih = input.nextInt();
			
			sonuc = (fizik + matematik + turkce + kimya + muzik + tarih) / 6;
			System.out.println("Ortalamaniz : " + sonuc);
		}
	}
}