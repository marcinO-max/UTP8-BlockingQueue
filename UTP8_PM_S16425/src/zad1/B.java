package zad1;

import java.math.BigDecimal;

public class B extends Thread {
	@Override
	public void run() {
		int counter = 0;
		BigDecimal sum = BigDecimal.ZERO;
		try {
			while(!Main.isFinished.get()) {
				Towar towar = Main.towary.take();
				sum = sum.add(new BigDecimal(String.valueOf(towar.getWaga())));
				if(++counter % 100 == 0)
					System.out.println(String.format("policzono wage %s towarów", counter));	
			}
			System.out.println(sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
