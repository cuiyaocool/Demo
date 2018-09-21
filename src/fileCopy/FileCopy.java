package fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;


public class FileCopy {

	public static void copyFileUsingFileStreams(File source, File dest) throws IOException {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(source);
			outputStream = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = inputStream.read(buf)) > 0) {
				System.out.println(new String(buf));
				outputStream.write(buf, 0, len);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			inputStream.close();
			outputStream.close();
		}
	}
	
	public static void copyFileUsingFileChannels(File source, File dest) throws IOException {
		FileChannel input = null;
		FileChannel output = null;
		try {
			input = new FileInputStream(source).getChannel();
			output = new FileOutputStream(dest).getChannel();
			output.transferFrom(input, 0, input.size());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			input.close();
			output.close();
		}
	}
}
