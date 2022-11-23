import java.util.Scanner;
import classes.*;

public class main {
	public static void main(String args[]) {
		System.out.println();
String mname = "Митрофанов А.А.";
		int id_m = 10;
		int wag = 2000;
		manager man1 = new manager();
		manager man2 = new manager(id_m);
		manager man3 = new manager(id_m, wag, mname);
		man1.manager_input();
		System.out.println("\n" + "man1:");
		man1.manager_output();
		System.out.println("\n" + "man2:");
		man2.manager_output();
		System.out.println("\n" + "man3:");
		man3.manager_output();
		System.out.println("\n");

		int id_c = 331;
		String cname = "Петров П.П.";
		client cl1 = new client();
		client cl2 = new client(id_c);
		client cl3 = new client(id_c, cname);
		cl1.client_input();
		System.out.println("\n" + "cl1:");
		cl1.client_output();
		System.out.println("\n" + "cl2:");
		cl2.client_output();
		System.out.println("\n" + "cl3:");
		cl3.client_output();
		System.out.println("\n");
		
		int c_cost = 400000;
		String crname = "Лада Самара";
		specifications spec = new specifications(78, 133, 1, 1.5);
		car car1 = new car();
		car car2 = new car(crname);
		car car3 = new car(c_cost, crname, spec);
		car1.car_input();
		System.out.println("\n" + "car1:");
		car1.car_output();
		System.out.println("\n" + "car2:");
		car2.car_output();
		System.out.println("\n" + "car3:");
		car3.car_output();
		System.out.println("\n");

		int s_cost = 2100;
		String sname = "Установка сигнализации";
		service ser1 = new service();
		service ser2 = new service(sname);
		service ser3 = new service(s_cost, sname);
		ser1.service_input();
		System.out.println("\n" + "ser1:");
		ser1.service_output();
		System.out.println("\n" + "ser2:");
		ser2.service_output();
		System.out.println("\n" + "ser3:");
		ser3.service_output();
		System.out.println("\n");

		deal[] Deals = new deal[3];
		Deals[0] = new deal();
		Deals[1] = new deal(car3);
		Deals[2] = new deal(car1, cl1, man1, ser1);
		for (int i = 0; i < 3; i++) {
			System.out.println();
			Deals[i].deal_output();
			System.out.println("Общая трата криента на авто и доп услуги: " + Deals[i].sum_costs());
		}
		System.out.println();
	}
}