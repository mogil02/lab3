import java.util.Scanner;
import classes.*;

public class main {
	public static void main(String args[]) {
		client cl = new client(1,"Гаврилов А. Д.");
        dercl dcl = new dercl(1,"Гаврилов А. Д.", 'M', 20);
		try {
        		client clone = (client) cl.clone();
			System.out.println("Вывод объекта cl:\n" + cl);
			System.out.println("\nВывод клона cl:\n" + clone + "\n\nВвод данных об объекте cl:");
			cl.input();
			System.out.println("\nВвод данных о клоне объекта cl:");
			clone.input();
			System.out.println("\nВывод обновлённого объекта cl:\n" + cl);
			System.out.println("\nВывод обновлённого клона cl:\n" + clone);
		}
		catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

		try {
        		dercl clone = (dercl) dcl.clone();
			System.out.println("\n\nВывод объекта dcl:\n" + dcl);
			System.out.println("\nВывод клона dcl:\n" + clone + "\n\nВвод данных об объекте dcl:");
			dcl.input();
			System.out.println("\nВвод данных о клоне объекта dcl:");
			clone.input();
			System.out.println("\nВывод обновлённого объекта dcl:\n" + dcl);
			System.out.println("\nВывод обновлённого клона dcl:\n" + clone);
		}
		catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		
	}
}