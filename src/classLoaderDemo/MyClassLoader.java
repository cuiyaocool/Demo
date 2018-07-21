package classLoaderDemo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class MyClassLoader extends ClassLoader {
	
	private String path;//���·��
	private String name;//�������������
	
	public MyClassLoader(String path, String name) {
		/**
		 * super();//��ϵͳ���������Ϊ��������
		 */
		this.name = name;
		this.path = path;
	}
	public MyClassLoader(ClassLoader parent, String path, String name) {
		super(parent);//��ʾָ����������
		this.name = name;
		this.path = path;
	}
	/**
	 * ͨ���Զ�������������Լ��������
	 */
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		byte[] data = readClassFileToBinaryArray(name);
		return this.defineClass(name, data, 0, data.length);
	}
	
	/*
	 * ��ȡ.class�ļ����ֽ����� 
	 * test.Main
	 * F:/mypath
	 * */
	
	private byte[] readClassFileToBinaryArray(String name) {
		// TODO Auto-generated method stub
		InputStream is = null;
		byte[] returnData = null;
		name = name.replaceAll("\\.", "/");
		String filePath = this.path + name + ".class";
		File file = new java.io.File(filePath);
		ByteArrayOutputStream oStream = new ByteArrayOutputStream();
		try {
			is = new FileInputStream(file);
			int tmp = 0;
			while ((tmp = is.read()) != -1) {
				oStream.write(tmp);
			}
			returnData = oStream.toByteArray();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���
			try {
				is.close();
				oStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return returnData;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
