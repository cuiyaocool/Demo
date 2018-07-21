package classLoaderDemo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class MyClassLoader extends ClassLoader {
	
	private String path;//类的路径
	private String name;//类加载器的名称
	
	public MyClassLoader(String path, String name) {
		/**
		 * super();//让系统类加载器成为父加载器
		 */
		this.name = name;
		this.path = path;
	}
	public MyClassLoader(ClassLoader parent, String path, String name) {
		super(parent);//显示指定父加载器
		this.name = name;
		this.path = path;
	}
	/**
	 * 通过自定义加载器加载自己定义的类
	 */
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		byte[] data = readClassFileToBinaryArray(name);
		return this.defineClass(name, data, 0, data.length);
	}
	
	/*
	 * 获取.class文件的字节数组 
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
			//关闭流
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
