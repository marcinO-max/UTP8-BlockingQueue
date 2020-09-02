/**
 *
 *  @author Piątkowski Marcin S16425
 *
 */

package zad1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
	public static BlockingQueue<Towar> towary = new LinkedBlockingQueue<>();
	public static AtomicBoolean isFinished = new AtomicBoolean();
	  public static void main(String[] args) {
		  new A().start();
		  new B().start();
	  }
}

