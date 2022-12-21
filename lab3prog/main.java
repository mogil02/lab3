import java.util.Scanner;
import classes.*;

public class main {
	public static void main(String args[]) {
		dercl drcl = new dercl(12, "Иванов М. В.", 'M', 24);  
        	client cl1 = new client(10, "Власенко Д. В.");
        	client cl2 = new client(13, "Чазов В. В.");

        	System.out.println(drcl); //вывод через toString()
        	System.out.println(cl1); //вывод через toString()
		System.out.println(cl1); //вывод через toString()
		
	}
}