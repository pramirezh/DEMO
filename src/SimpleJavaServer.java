import java.io.*;
import java.net.*;
import java.util.Date;

public class SimpleJavaServer {

  public static void main(String[] args) {

    //Reviso el puerto
    if (args.length < 1) {
      System.out.println("Debe especificar el puerto.");
      return;
    }
    int port = Integer.parseInt(args[0]);

    //Abro el sockect de escucha
    try (ServerSocket serverSocket = new ServerSocket(port)) {

      while (true) {

        //Quedo en espera
        System.out.println("Escuchando en el puerto " + port + ".");
        Socket socket = serverSocket.accept();
        System.out.println("Cliente conectado\n");

        //Creo el buffer de lectura
        InputStream input = socket.getInputStream();
        int buffSize = socket.getReceiveBufferSize();
        byte[] bytes = new byte[buffSize];

        //Leo los datos y cierro la conexiones
        int count = input.read(bytes);
        System.out.write(bytes, 0, count);
        socket.close();
        System.out.println();
		
      }

    } catch (IOException ex) {
      System.out.println("Server exception: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}