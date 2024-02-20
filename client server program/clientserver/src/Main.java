import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println(("server is activated..."));
        //open server socket, bind and start listening
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(3333);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        try {
            while (true) {
                //accept connection request
                Socket s = null;
                try {
                    s = ss.accept();
                    try {
                        DataInputStream dis = new DataInputStream(s.getInputStream());
                        String str = dis.readUTF();
                        System.out.println("read: " + str);
                    } catch (IOException e) {
                        throw new RuntimeException(e.getMessage());
                    } finally {
                        //close stream channel
                        try {
                            if (s != null) {
                                s.close();
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e.getMessage());
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e.getMessage());
                }
            }
        } finally {
            //close socket
            try {
                if (ss != null) {
                    ss.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}