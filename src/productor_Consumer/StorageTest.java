package productor_Consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StorageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage storage = new Storage();
		ExecutorService taskSubmit = Executors.newFixedThreadPool(10);
		 //给定6个生产者
        taskSubmit.submit(new Producer(storage, 70));
        taskSubmit.submit(new Producer(storage, 10));
        taskSubmit.submit(new Producer(storage, 20));
        taskSubmit.submit(new Producer(storage, 10));
        taskSubmit.submit(new Producer(storage, 10));
        taskSubmit.submit(new Producer(storage, 10));
		
		 //给定4个消费者
        taskSubmit.submit(new Consumer(storage, 30));
        taskSubmit.submit(new Consumer(storage, 10));
        taskSubmit.submit(new Consumer(storage, 20));
  
        taskSubmit.shutdown();

	}

}
