package p182;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex2 {

	private static Path path;
	static InputStream is = null;
	public static void main(String[] args) {
		byte[] contents = new byte[100];
		
		try {
			is = Files.newInputStream(path);
			is.read(contents);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if( is !=null) {
			    try {
			    	is.close();
			    }catch (Exception e) { }
			}
		}
	}
}