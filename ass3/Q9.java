// Write a Program to read a text file.

package ass3;

import java.io.FileReader;
import java.io.IOException;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileReader reader = new FileReader("C:\\Users\\abc\\Desktop\\MyFile.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
