package webbrowser.mainframe;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


import static javafx.concurrent.Worker.State.FAILED;

/**
 * @author Oleg Romanenchuk
 */
public class MainFrame extends JFrame {
    private final JFXPanel panel = new JFXPanel();
    private WebEngine engine;

    private final JPanel jPanel = new JPanel(new BorderLayout());
    private final JLabel label = new JLabel();

    private final JButton reloadButton = new JButton("Reload");
    private final JButton backButton = new JButton("Back");
    private final JButton forwardButton = new JButton("Forward");
    private final JButton optionsButton = new JButton("Options");

    private final JTextField fieldForURL = new JTextField();
    private final JProgressBar jProgressBar = new JProgressBar();

    private final JMenu menu = new JMenu();


    public MainFrame() {
        super();
        initialization();
    }

    private void initialization() {
        create();

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openUrl(fieldForURL.getText());
            }
        };


        reloadButton.addActionListener(listener);
        backButton.addActionListener(listener);
        forwardButton.addActionListener(listener);
        optionsButton.addActionListener(listener);
        fieldForURL.addActionListener(listener);

        jProgressBar.setPreferredSize(new Dimension(80, 15));
        jProgressBar.setForeground(Color.green);
        jProgressBar.setStringPainted(true);


        JPanel topPanel = new JPanel(new BorderLayout(5, 0));
        topPanel.setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
        topPanel.add(fieldForURL, BorderLayout.CENTER);
        topPanel.add(reloadButton, BorderLayout.WEST);


        JPanel statusPanel = new JPanel(new BorderLayout(5, 0));
        statusPanel.setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
        statusPanel.add(label, BorderLayout.CENTER);
        statusPanel.add(jProgressBar, BorderLayout.WEST);

        JMenu menuButtons = new JMenu();
        menuButtons.add(backButton);
        menuButtons.add(forwardButton);
        menuButtons.add(optionsButton);

//        JMenuItem

        jPanel.add(topPanel, BorderLayout.NORTH);
        jPanel.add(panel, BorderLayout.CENTER);
        jPanel.add(statusPanel, BorderLayout.SOUTH);
        jPanel.add(menuButtons, BorderLayout.WEST);

        getContentPane().add(jPanel);

        setExtendedState(Frame.MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void create(){
        Platform.runLater(new Runnable() {
            public void run() {
                WebView webView = new WebView();
                engine = webView.getEngine();

                engine.titleProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observable, String oldValue, final String newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                MainFrame.this.setTitle(newValue);
                            }
                        });
                    }
                });

                engine.setOnStatusChanged(new EventHandler<WebEvent<String>>() {
                    public void handle(final WebEvent<String> event) {
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                label.setText(event.getData());

                            }
                        });

                    }
                });

                engine.locationProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observable, String oldValue, final String newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                fieldForURL.setText(newValue);
                            }
                        });
                    }
                });

                engine.getLoadWorker().workDoneProperty().addListener(new ChangeListener<Number>() {
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                jProgressBar.setValue(newValue.intValue());
                            }
                        });
                    }
                });

                engine.getLoadWorker().exceptionProperty().addListener(new ChangeListener<Throwable>() {
                    public void changed(ObservableValue<? extends Throwable> observable, Throwable oldValue, final Throwable newValue) {
                        if (engine.getLoadWorker().getState() == FAILED){
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    JOptionPane.showMessageDialog(jPanel, (newValue != null)? engine.getLocation() +
                                    "\n" + newValue.getMessage() : engine.getLocation() + "\nUnexpected error.",
                                            "Loading error...", JOptionPane.ERROR_MESSAGE);
                                }
                            });
                        }
                    }
                });

                panel.setScene(new Scene(webView));
            }
        });
    }
    public void openUrl(final String url){
        Platform.runLater(new Runnable() {
            public void run() {
                String tmp = uRL(url);
                if (tmp == null){
                    tmp = uRL("http://" + url);
                }
                engine.load(tmp);
            }
        });
    }

    private static String uRL(String string){
        try {
            return new URL(string).toExternalForm();
        } catch (MalformedURLException e) {
            return null;
        }

    }

    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame();

                mainFrame.setVisible(true);
                mainFrame.engine.load("");
            }
        });
    }
}
