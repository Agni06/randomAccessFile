/*
a
44
43.231
44
false

*/

import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    RandomAccessFile file = null;
	    try{
	        file = new RandomAccessFile("data.da", "rw");
	        file.writeChar('a');
	        file.writeInt(44);
	        file.writeDouble(43.231);
	        file.seek(0);
	        System.out.println(file.readChar());
	        System.out.println(file.readInt());
	        System.out.println(file.readDouble());
	        file.seek(2);
	        System.out.println(file.readInt());
	        file.seek(file.length());
	        file.writeBoolean(false);
	        file.seek(4);
	        System.out.println(file.readBoolean());
	        file.close();
	        
	        
	    }
	    catch(IOException e)
	    {
	        System.out.println(e);
	    }


	}
}
