package URL;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketMethods {

   public static void main(String[] args) {
      try {
         Socket s = new Socket("www.openclassrooms.com", 80);
         System.out.println("Port de communication c�t� serveur : " + s.getPort());
         System.out.println("Port de communication c�t� client : " + s.getLocalPort());
         System.out.println("Nom de l'h�te distant : " + s.getInetAddress().getHostName());
         System.out.println("Adresse de l'h�te distant : " + s.getInetAddress().getHostAddress());
         System.out.println("Adresse socket de l'h�te distant : " + s.getRemoteSocketAddress());
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}