package fileCopy;

import java.io.File;
import java.io.IOException;


public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File source = new File("E://win7.txt");
		File dest = new File("E://win7_1.txt");
		
		try {
			long time = System.currentTimeMillis();
			FileCopy.copyFileUsingFileStreams(source, dest);
			System.out.println(System.currentTimeMillis() - time);
			time = System.currentTimeMillis();
			FileCopy.copyFileUsingFileChannels(source, dest);
			System.out.println(System.currentTimeMillis() - time);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
