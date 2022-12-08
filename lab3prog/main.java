import java.util.Scanner;
import classes.*;

public class main {
	public static void main(String args[]) {
		System.out.println("\nПроверка ввода трансмиссии с помощью обработки исключений:");
		specifications spec = new specifications();
		spec.spec_input();
		System.out.println();

		deal[] Deals = new deal[3];
		for (int i = 0; i < 3; i++) {
			Deals[i] = new deal();
			Deals[i].deal_input();
		}

		System.out.println("\nВывод одномерного массива: ");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			Deals[i].deal_output();
			System.out.println("Общая трата криента на авто и доп услуги: " + Deals[i].sum_costs());
		}
		
		deal[][] spdeals = new deal[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				spdeals[i][j] = new deal();
			}
		}
		for (int i = 0; i < 2; i++) {
			spdeals[1][i] = Deals[i];
		}

		System.out.println("\nВывод двумерного массива, в первую ячейку которого, был скопирован уже инициализированный одномерный массив:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				spdeals[i][j].deal_output();
			}
			System.out.println();
		}
		System.out.println();
	}
}