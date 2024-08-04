package artefact01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class BasicsExecutorService {

	public static void main(String[] args)
			throws InterruptedException, ExecutionException, FileNotFoundException {
		System.setOut(new PrintStream(new FileOutputStream("src/main/java/artefact01/output.txt")));
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				for (int i = 0; i < 11; i++) {
					System.out.println("From first callable : " + i);
				}
				return "Task 1";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				for (int i = -10; i < 1; i++) {
					System.out.println("From second callable : " + i);
				}
				return "Task 2";
			}
		});
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				for (int i = 90; i < 101; i++) {
					System.out.println("From third callable : " + i);
				}
				return "Task 3";
			}
		});

		java.util.List<Future<String>> futures = executorService
				.invokeAll(callables);

		for (Future<String> future : futures) {
			System.out.println("future.get = " + future.get());
		}

		executorService.shutdown();

	}
}
