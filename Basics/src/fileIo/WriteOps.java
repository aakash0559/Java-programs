package fileIo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C://Users//ELCOT//Desktop//aakaSh//javafiles//filesIO.txt", true);
			String s = "muthamilselvan is a bad boy";
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
