package hashEquel;

public class Student {
	int num;
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	public Student(int num, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.num = num;
		
	}
	
}
