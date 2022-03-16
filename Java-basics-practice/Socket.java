import java.net.*;
import java.io.*;

public class Socket{
        public static testClient(String hostName, String portNumber){
                try {
                        Socket s1 = new Socket(hostName, portNumber);
                        InputStream is = s1.getInputStream();
                        DataInputStream dis = new DataInputStream(is);
                        System.out.println(dis.readUTF());
                        dis.close();
                        s1.close();
                } catch (ConnectException connExc) {
                        System.err.println("Cannot connect");
                } catch (IOException e) {
                }
        }

        public static testServer(){
                ServerSocket s = null;
                try {
                        s = new ServerSocket(8888);
                } catch (IOException e) {}

                while (true) {
                        try {
                                Socket s1 = s.accept();
                                OutputStream os = s1.getOutputStream();
                                DataOutputStream dos = new DataOutputStream(os);
                                dos.writeUTF("Hello,bye-bye!");
                                dos.close();
                                s1.close();
                        } catch (IOException e) {}
                }
        }
}
