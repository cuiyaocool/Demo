package fanxin;
/**
 * 泛形类 在类名称后面加上<T>
 * @author cy
 *
 * @param <T>
 */
public class FanXinClass<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
