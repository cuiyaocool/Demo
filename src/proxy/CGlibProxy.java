package proxy;

/**
 * jdk��̬��������java�ڲ��ķ��������ʵ�ֵģ�cglib��̬����ײ����ǽ���asm��ʵ�ֵġ�
 * 
 * Cglib ��һ������Ķ�̬�����ܣ��ײ�ʹ��asm���ڴ��ж�̬�����ɱ���������࣬ʹ��cglib��ʹ���������û��ʵ���κνӿ�Ҳ����ʵ�ֶ�̬�����ܡ�
 * 
 * cglib�����ã������ٶ�Զ����jdk��̬����
 * cglib����ʹ�ü̳к��������ַ�ʽʹ�ã���һ���ǻ��ڼ̳еĶ�̬��������ֱ����super����target����������spring�в�֧�֣���Ϊ�����Ļ������target
 * ����Ͳ���Ϊspring����
 * ���ԣ�cglibʹ�����õķ�ʽ�������ﵽ���ص�Ч����
 * 
 * �����ࣺ
 * net.sf.cglib.proxy.Enhancer��Ҫ����ǿ��
 * net.sf.cglib.proxy.MethodInterceptor �C ��Ҫ�ķ��������࣬����Callback�ӿڵ��ӽӿڣ���Ҫ�û�ʵ��
 * net.sf.cglib.proxy.MethodProxy �C JDK��java.lang.reflect.Method��Ĵ����࣬���Է����ʵ�ֶ�Դ���󷽷��ĵ���,��ʹ�ã�
 * Object o = methodProxy.invokeSuper(proxy, args);
 * @author cy
 *
 */
public class CGlibProxy{

}
