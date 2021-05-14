import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

import javax.swing.JOptionPane;

public class CLI_ipFinder{
    public static void main(String[] args) throws UnknownHostException{

        IP_Finder();
        
    }

    public static void IP_Finder() throws UnknownHostException{

        Scanner sc = new Scanner(System.in); 
        String url = sc.nextLine().toLowerCase();
        sc.close();

        InetAddress IP = InetAddress.getByName(url);

        IP.getAddress();

        JOptionPane.showMessageDialog(null,IP);
    }
}