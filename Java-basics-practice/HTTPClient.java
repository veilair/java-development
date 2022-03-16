import java.net.* ;
import java.io.* ;
import java.util.* ;

public class HTTPClient {
        public static void main(String args[]) {
                String hostName=args[0];
                String portName=args[1];
                String uriName=args[2];

                doGet(hostName, portName, uriName);
        }

        public static void doGet(String host, int port, String uri) {
                Socket socket = null;

                try {
                        socket = new Socket(host, port);
                } catch(Exception e) {
                        e.printStackTrace();
                }

                try {
                        StringBuffer sb = new StringBuffer("GET " + uri + " HTTP/1.1\r\n");
                        sb.append("Host: " + host + ":" + port + "\r\n");
                        sb.append("Accept: */*\r\n");
                        sb.append("Accept-Language: zh-cn\r\n");
                        sb.append("Accept-Encoding: gzip, deflate\r\n");
                        sb.append("User-Agent: HTTPClient\r\n");
                        sb.append("Connection: close\r\n");
                        sb.append("\r\n");

                        OutputStream socketOut = socket.getOutputStream();
                        socketOut.write(sb.toString().getBytes());
                        socketOut.flush();

                        InputStream streamIn = socket.getInputStream();
                        String content = readAll(streamIn, "utf8");
                        System.out.println(content);

                } catch(Exception e) {
                        e.printStackTrace();
                } finally {
                        try {
                                socket.close();
                        } catch(Exception e) {
                                e.printStackTrace();
                        }
                }
        } //#doGet()

        public static String readAll(InputStream src, String encoding) throws IOException {
                BufferedReader input = new BufferedReader(new InputStreamReader(src, encoding));
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line = input.readLine()) != null) {
                        sb.append(line);
                        sb.append("\r\n");
                }
                input.close();
                return sb.toString();
    }

}
