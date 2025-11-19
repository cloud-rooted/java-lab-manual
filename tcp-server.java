import java.net.*;
import java.io.*;

// A simple TCP Server that echoes back a client's message.
class SimpleServer {
  public static void main(String args[]) throws Exception {
  int port = 3000;
  // Use try-with-resources for the server socket
  try (ServerSocket serverSocket = new ServerSocket(port)) {
  System.out.println("Server started. Listening on port " + port);
  while (true) {
  // Wait for a client connection
  try (Socket clientSocket = serverSocket.accept(); // Blocking

call

// Setup input stream to read data from client
BufferedReader in = new BufferedReader(new

InputStreamReader(clientSocket.getInputStream()));

// Setup output stream to send data to client
PrintWriter out = new
PrintWriter(clientSocket.getOutputStream(), true))

{
System.out.println("Client connected from: " +

clientSocket.getRemoteSocketAddress());
String inputLine;
while ((inputLine = in.readLine()) != null) {
System.out.println("Server received: " + inputLine);
// Echo the message back to the client
out.println("Server Echo: " + inputLine);
}
} catch (IOException e) {
System.out.println("Exception handling client connection:

" + e.getMessage());
}
}
} catch (IOException e) {
System.out.println("Could not listen on port " + port + ": " +

e.getMessage());
}
}
}
// NOTE: Run this program first, and then run the SimpleClient program.

// https://drive.google.com/file/d/1PMMVGhM_0p4F0r0aFbEJhiPdOrefzRwB/view?usp=sharing
