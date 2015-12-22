package ClassesTypes.AnonymousClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
public class AnonymousClass2 {
    public static void main(String[] args) {
        JButton closeWindow = new JButton("Close Window");
        closeWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JFrame jFrame = new JFrame();
        jFrame.add(closeWindow);
        jFrame.setSize(300, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
