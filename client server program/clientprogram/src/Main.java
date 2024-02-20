import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Client");

        try{
            //create a socket with IP and port number
            Socket s = new Socket("localhost", 3333);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("merhaba");
            dout.flush();
            dout.close();
        }catch (Exception e){
            System.out.println("error client");
        }
    }
}