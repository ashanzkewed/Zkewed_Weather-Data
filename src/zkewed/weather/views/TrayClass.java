/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.views;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class TrayClass {
    
    static TrayIcon trayIcon;
    
    public TrayClass() {
        show();
    }
    
    public static void show() {
        if (!SystemTray.isSupported()) {
            System.exit(0);
        }
        trayIcon = new TrayIcon(createIcon("../photos/Zkewed.ico", "Icon"));
        trayIcon.setToolTip("Zkewed Weather App");
        final SystemTray st = SystemTray.getSystemTray();
    
        final PopupMenu pm = new PopupMenu();
        MenuItem exit = new MenuItem("exit");
        pm.add(exit);
        
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });
        trayIcon.setPopupMenu(pm);
        try {
            st.add(trayIcon);
        } catch (AWTException ex) {
            Logger.getLogger(TrayClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected static Image createIcon(String path, String desc) {
        URL imageUrl = TrayClass.class.getResource(path);
        return (new ImageIcon(imageUrl, desc).getImage());
    }
}
