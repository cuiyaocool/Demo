package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
	
	public void readLinesFromFlies(String fileName) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String lineString = null;
			while((lineString = br.readLine())!=null){
				System.out.println(lineString);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUtil uilt = new FileUtil();
		uilt.readLinesFromFlies("E://win7_1.txt");
	}

}
