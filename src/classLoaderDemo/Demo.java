package classLoaderDemo;

/**
 * ����ClassToBeLoad��
 * ��D���½�һ��Ŀ¼classLoaderDemo,дһ��ClassToBeLoad��java,Ϊ���𱾰��е�ClassToBeLoad��дΪ����;
 * package classLoaderDemo;
 * public class ClassToBeLoad {
 * 		public ClassToBeLoad() {
 * 			System.out.print("����D��");
 * 		}
 * }
 * ���������ClassToBeLoad��class
 * @author cuiyao
 *
 */
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// �����Զ������������Ϊϵͳ�趨�ĸ�����������Ӧ�ü�����
		MyClassLoader myClassLoader = new MyClassLoader("D:/", "�Զ��������1");
		Class<?> clazz = myClassLoader.loadClass("classLoaderDemo.ClassToBeLoad");
		clazz.newInstance();
		//�����Զ������������������Ϊ��һ��������
		MyClassLoader myClassLoader2 = new MyClassLoader(myClassLoader, "D:/", "�Զ��������2");
		Class<?> clazz2 = myClassLoader2.loadClass("classLoaderDemo.ClassToBeLoad");
		clazz2.newInstance();
		//�����Զ������������������Ϊϵͳ������bootstrap
		MyClassLoader myClassLoader3 = new MyClassLoader(null, "D:/", "�Զ��������3");
		Class<?> clazz3 = myClassLoader3.loadClass("classLoaderDemo.ClassToBeLoad");
		clazz3.newInstance();
	}
/**
 * ���ڰ���sun.misc.Launcher$AppClassLoader@382f3bf0
 * ���ڰ���sun.misc.Launcher$AppClassLoader@382f3bf0
 * ����D���Զ��������
 */
/**
 * ���������
 * ��һ����������ĸ�������Ϊϵͳ�趨�ĸ���������ΪAppClassLoader����classPath�¼����࣬���Լ��ص��ǰ��е���
 * �ڶ�����������ĸ�������Ϊ��һ������һ���ĸ�������ΪAppClassLoader��ͬ�ϣ����Խ��һ��
 * ��������������ĸ�������Ϊbootstrap�����ز������࣬���Դ��Զ���������м��أ����ص���D��Ԥ�õ���
 */
}
