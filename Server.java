import java.net.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    int port = 2000;
        Socket socket= null;
        
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("server in ascolto..");
            
            socket = serverSocket.accept();
            System.out.println("server connesso con il socket:" + socket.getRemoteSocketAddress());
            
            socket.getInputStream();
        }catch(BindException be){
        System.err.println("sever gia avviato");
        }catch(IOException ioe){
            
        System.err.println("errore I/0 nell' istanza del server");
                }
        
        
        
                }
}