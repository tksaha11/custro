package Helper;

import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bro
 */
public class Ip {
    public static String getIpAddress() {
        InetAddress ip = null;
        try {
            // TODO add your handling code here:
            ip=InetAddress.getLocalHost();
        } catch (Exception e) {
        }
        return ip.getHostAddress();
    }
    
}
