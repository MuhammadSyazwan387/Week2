package LAB2;
import java.io.*;
public class MyReader extends FileReader {

	File file;
	char [] content = new char [1000];
	MyReader (File file) throws Exception
	{
		super(file);
		this.file=file;
	}
}
