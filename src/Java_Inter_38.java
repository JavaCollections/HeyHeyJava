import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;


public class Server extends JFrame {

    // VARIABLE DECLARATION
    private JTextField userrText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;

    //CONSTRUCTOR
    public Server() {
        super("Bucky's Instant Messenger");
        userrText = new JTextField();
        userrText.setEditable(false);
        userrText.addActionListener() {
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    sendMessage(event.getActionCommand());
                    userrText.setText("");
                }
            }
        } ;
        add(userrText, BorderLayout.NORTH);
        chatWindow = new JTextArea();
        add(new JScrollPane(chatWindow));
        setSize(300, 150);
        setVisible(true);
    }

    public void startRunning(){
        try{
            server = new ServerSocket(6789,100);
            While(true){
                try{
                    //Trying to connect and have conversation
                }catch (EOFException eofException){
                    showMessage("\n Server ended the connection");
                }finally {
                    closeCrap();
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
     // WAIT FOR CONNECTION & DISPLAY INFORMATION
    private void waitForConnection() throws IOException{
        showMessage("Waiting for someone to connect...\n");
        Connection = server.accept();
        showMessage( "Now Connected to " + connection.getInetAddress().getHostName());
    }

    // GET STREAM TO SEND AND RECEIVE DATA
    private void setupStreams() throws IOException{
        output = new ObjectOutputStream(Connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n Streams are not setup \n");
    }
}
