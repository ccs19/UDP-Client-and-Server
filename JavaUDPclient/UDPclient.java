import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String args[]) throws Exception
    {
        if(args.length != 2)
        {
            System.out.println("Usage: TCPclient <hostname> <args>");
        }
        else
        {
            InetAddress address = InetAddress.getByName(args[0]);
            int port = Integer.parseInt(args[1]);
            System.out.println("IP: " + args[0]);
            Socket clientSock = new Socket(address, port);

            PrintWriter out = new PrintWriter(clientSock.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Input text to send: ");
            String textToSend = read.readLine();
            textToSend = textToSend + '\0';
            out.print(textToSend);
            out.flush();

            //Response
            String response = in.readLine();
            System.out.println(response);

            //clean up
            out.close();
            in.close();
            read.close();
            clientSock.close();

        }
    }
}


import java.net.DatagramSocket;

/*
 * UDPclient.java
 * Systems and Networks II
 * Project 2
 *
 * This file describes the functions to be implemented by the UDPclient class
 * You may also implement any helper functions you deem necessary to complete the project.
 */

public class UDPclient
{
	private DatagramSocket _socket; // the socket for communication with a server
	
	/**
	 * Constructs a TCPclient object.
	 */
	public UDPclient()
	{
	}
	
	/**
	 * Creates a datagram socket and binds it to a free port.
	 *
	 * @return - 0 or a negative number describing an error code if the connection could not be established
	 */
	public int createSocket()
	{
		
	}

	/**
	 * Sends a request for service to the server. Do not wait for a reply in this function. This will be
	 * an asynchronous call to the server.
	 * 
	 * @param request - the request to be sent
	 * @param hostAddr - the ip or hostname of the server
	 * @param port - the port number of the server
	 *
	 * @return - 0, if no error; otherwise, a negative number indicating the error
	 */
	public int sendRequest(String request, String hostAddr, int port)
	{
		
	}
	
	/**
	 * Receives the server's response following a previously sent request.
	 *
	 * @return - the server's response or NULL if an error occurred
	 */
	public String receiveResponse()
	{
		
	}
	
	/*
    * Prints the response to the screen in a formatted way.
    *
    * response - the server's response as an XML formatted string
    *
    */
	public static void printResponse(String response)
	{
	
	}
 

	/*
	 * Closes an open socket.
	 *
    * @return - 0, if no error; otherwise, a negative number indicating the error
	 */
	public int closeSocket() 
	{
		
	}
}