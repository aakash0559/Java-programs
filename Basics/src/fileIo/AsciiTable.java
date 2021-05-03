package fileIo;

import java.io.FileWriter;
import java.io.IOException;

public class AsciiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C://Users//ELCOT//Desktop//aakaSh//javafiles//Ascii.txt");
			for(int i=1;i<=127;i++){
		//System.out.println(i+"-->"+(char)i);
		//char a=((char)i);
		fw.write(i+"---->"+(char)i);
		System.out.println();
			}fw.flush();
			fw.close();
		} catch (IOException e) {
		}
	}

}
