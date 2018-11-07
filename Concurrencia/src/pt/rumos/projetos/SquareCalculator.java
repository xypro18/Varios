package pt.rumos.projetos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {
	
	//private ExecutorService executor = Executors.newSingleThreadExecutor();
	private ExecutorService executor = Executors.newFixedThreadPool(4);
	
	public Future<Integer> calculate(Integer input) {
		return executor.submit(()-> {
			Thread.sleep(1000);
			return input *input;
		});
	}
	
	public static void main(String...s) throws InterruptedException, ExecutionException {
		SquareCalculator sc = new SquareCalculator();
		
		Future<Integer> t1 = sc.calculate(10);
		Future<Integer> t2 = sc.calculate(7);
		Future<Integer> t3 = sc.calculate(110);
		Future<Integer> t4 = sc.calculate(10222);
		
		System.out.println(t4.get());
		System.out.println(t3.get());
		System.out.println(t2.get());
		System.out.println(t1.get());
	}
	

}
