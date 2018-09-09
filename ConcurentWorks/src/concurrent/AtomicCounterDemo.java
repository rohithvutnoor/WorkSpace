package concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterDemo {
	private static AtomicInteger c= new AtomicInteger(0);
	static int newValue;
	public static void increment() {
		c.incrementAndGet();
	}
	public static void decrement() {
		c.decrementAndGet();
	}
	public static int getValue() {
		return c.get();
	}
	public static void main(String[] args) {
		AtomicCounterDemo ac = new AtomicCounterDemo();
		System.out.println(ac.getValue());
		ac.decrement();
		System.out.println(ac.getValue());
		ac.increment();
		System.out.println(ac.getValue());
	}
}
