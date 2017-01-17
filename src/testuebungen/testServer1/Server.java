/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuebungen.testServer1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author primus
 */
public class Server
{
  public static void main (String[] args) throws IOException, InterruptedException
  {
    ServerSocket ss = new ServerSocket(9999);
    String response;
    while(true)
    {
      try
      {
        Socket socket = ss.accept();
        System.out.println("connected");
        try(BufferedReader br =
                new BufferedReader(
                new InputStreamReader(socket.getInputStream())))
        {
          Thread.sleep(200);
          response = br.readLine();
          System.out.println("Get response: " + response);
        }
        if(response.equals("GETCAR"))
        {
          try(BufferedWriter bw =
                  new BufferedWriter(
                  new OutputStreamWriter(
                  socket.getOutputStream())))
          {
            bw.write("BMW-E46");
            System.out.println("data send: BMW-E46" );
            bw.flush();
          }
        }
        socket.close();
        System.out.println("disconnected");
      }
      catch(Exception ex)
      {
        System.out.println(ex.getMessage());
      }
    }
  }
}
