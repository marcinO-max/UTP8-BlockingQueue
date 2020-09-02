package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A extends Thread {
	@Override
	public void run() {
		try(Scanner sc = new Scanner(new File("Towary.txt"))) {
			int counter = 0;
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().split(" ");
				String id = data[0];
				double waga = Double.parseDouble(data[1]);
				Towar towar = new Towar(id, waga);
				Main.towary.add(towar);
				if(++counter % 200 == 0)
					System.out.println(String.format("Utworzono %s obiektów", counter));
			}
			Main.isFinished.set(true);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
