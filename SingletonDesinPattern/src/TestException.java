import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class TestException {
	public void getFileReader() throws FileNotFoundException{
		File file =new File("abs.xml");
		BufferedReader br=new BufferedReader(new FileReader(file));
		Singleton.getInstance();
	}

}
