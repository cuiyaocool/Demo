package productor_Consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * ������������ģ�ͣ������ǣ���һ�黺������Ϊ�ֿ⣬�����߿��Խ���Ʒ����ֿ⣬�����߿��ԴӲֿ���ȡ�߲�Ʒ��
 * ��������ߺ�����������ĺ������ڱ�֤ͬһ��Դ������̲߳�������ʱ�������� ��һ������ź�����������ƽ����
 * �������Java�н�������ߺ�������������Ҫ���ַ£� ��1��wait() / notify()��notifyAll()
 * wait��notify������Object���������������ÿ���඼��ӵ�������������� wait()������ʹ��ǰ�̴߳��ڵȴ�״̬�����������������߳�ִ�С�
 * notify()���������������ȴ�ͬһ�������̣߳����������Լ����ڵȴ�״̬��
 * 
 * @author Administrator
 *
 */
public class Storage {
	private static final int MAX_SIZE = 100;
	private List<Object> data = new ArrayList<Object>();

	public synchronized void product(int num) {
		if (data.size() + num > MAX_SIZE) {
			System.out.println("��������-->������" + num + "�������ֿ�����������������------��棺"
					+ data.size());

			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		for (int i = 0; i < num; i++) {// ����num����Ʒ
			data.add(new Object());
		}
		System.out
				.println("��������-->������" + num + "���ɹ����~------��棺" + data.size());
		// �������Ʒ�󣬻��������ȴ����ѵ��߳�
		notify();

	}

	public synchronized void consume(int num) {
		if (data.size() - num < 0) {// �����Ʒ��������
			System.out.println("���Ѳ���-->������" + num + "����治�㣬����������------��棺"
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
				.println("���Ѳ���-->������" + num + "�����ѳɹ�~------��棺" + data.size());
		// �������Ʒ�󣬻��������ȴ��������߳�
		notify();

	}

}
