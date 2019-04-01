package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student(1,"John");
try
{
FileOutputStream fos= new FileOutputStream("Student.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(obj);
System.out.println("Serialzation Done!!");
}
catch(IOException ioe)
{
   System.out.println(ioe);
 }
}
	


	}

