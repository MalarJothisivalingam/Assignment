
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {
	public static void main(String [] args) throws Exception {
	      Demo e = new Demo();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("employee.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.println(e.name+" "+e.address+" "+e.SSN+" "+e.number);
	         System.out.println("Serialized data is saved in employee.ser");
	         ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee.txt"));  
	         Demo s=(Demo)in.readObject();
	         System.out.println(s.name+" "+s.address+" "+s.SSN+" "+s.number);
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }

}
