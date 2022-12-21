import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import classes.*;

public class main {
	public static void main(String args[]) {
		ArrayList<client> cls = new ArrayList<client>();

		cls.add(new client(22, "Бодриков А. В."));
		cls.add(new client(50, "Герасимов П. А."));
		cls.add(new client(13, "Морозов О. Д."));
		cls.add(new client(44, "Шнейдер А. Д."));
		cls.add(new client(31, "Гаврилов А. Д."));
		
		System.out.print(cls + "\n\nРезультат поиска: ");

		String name = new String("Гаврилов А. Д.");
    		for (client cl : cls) {
        		if (cl.get_name().equals(name)) {
            			System.out.println("Нашёл!\n");
        		}
		}
		
		cls.sort(Comparator.comparing(client::get_id));
		System.out.println("\nРезультат сортировки по id по возрастанию: " + cls);
		
	}
}