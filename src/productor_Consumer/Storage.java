package productor_Consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者消费者模型，描述是：有一块缓冲区作为仓库，生产者可以将产品放入仓库，消费者可以从仓库中取走产品。
 * 解决消费者和生产者问题的核心在于保证同一资源被多个线程并发访问时的完整性 。一般采用信号量或加锁机制解决。
 * 下面介绍Java中解决生产者和消费者问题主要三种仿： （1）wait() / notify()、notifyAll()
 * wait和notify方法是Object的两个方法，因此每个类都会拥有这两个方法。 wait()方法：使当前线程处于等待状态，放弃锁，让其他线程执行。
 * notify()方法：唤醒其他等待同一个锁的线程，放弃锁，自己处于等待状态。
 * 
 * @author Administrator
 *
 */
public class Storage {
	private static final int MAX_SIZE = 100;
	private List<Object> data = new ArrayList<Object>();

	public synchronized void product(int num) {
		if (data.size() + num > MAX_SIZE) {
			System.out.println("生产操作-->数量：" + num + "，超出仓库容量，生产阻塞！------库存："
					+ data.size());

			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		for (int i = 0; i < num; i++) {// 生产num个产品
			data.add(new Object());
		}
		System.out
				.println("生产操作-->数量：" + num + "，成功入库~------库存：" + data.size());
		// 生产完产品后，唤醒其他等待消费的线程
		notify();

	}

	public synchronized void consume(int num) {
		if (data.size() - num < 0) {// 如果产品数量不足
			System.out.println("消费操作-->数量：" + num + "，库存不足，消费阻塞！------库存："
					+ data.size());
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < num; i++) {
			data.remove(0);
		}
		System.out
				.println("消费操作-->数量：" + num + "，消费成功~------库存：" + data.size());
		// 消费完产品后，唤醒其他等待生产的线程
		notify();

	}

}
