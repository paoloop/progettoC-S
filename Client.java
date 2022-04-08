
import java.io.*;
import java.net.*;

public class Client {

public static void main (String[] args) {

int port= 2000 ;
String ip = "127.0.0.1";

  
try{
Socket socket = new Socket (ip, port);
socket.close();
}catch (IOException i0e) {
System.err.println("Non lo so");
  }
  }
}