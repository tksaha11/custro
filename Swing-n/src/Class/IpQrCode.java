/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Helper.Ip;
import Helper.QrCode;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Bro
 */
public class IpQrCode {
    private ImageIcon qrImg;    
    private String ip;
    private byte[] result;
    
    public ImageIcon getQr(){
        ip=Ip.getIpAddress();
        try {
            result=QrCode.getQRCodeImage(ip, 300, 300);
        } catch (IOException ex) {
        }
        qrImg=new ImageIcon(result);
        return qrImg;
    }
}
