import java.net.ServerSocket;

public class Server{
    public static void main(String [] args) throws Exception {
        final ServerSocket server = new ServerSocket(8080);
        
        System.out.println("Listening for connection on port 8080 ....");
        while (true){
            //spins forever
            final Socket client = server.accept();
            //1.read HTTP request fro the client socket
            //2.Prepare a HTTP reposnse
            //3.Send HTTP response to the client
            //4.Close the socket
        }

        
    }
}