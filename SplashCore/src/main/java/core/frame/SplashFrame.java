package core.frame;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Stack;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 * Main class, which is used to set a base frame with
 * a basic skin and all basic functions inside
 */
public class SplashFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 700;
    private static final int DEFAULT_HEIGHT = 700;
    private WebEngine engine;

    public SplashFrame() {
        super();
        initialize();
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        final Stack<String> urlStack = new Stack<String>();
        final JEditorPane editorPane = new JEditorPane();
        final JTextField url = new JTextField(30);


        editorPane.setEditable(false);
        editorPane.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        urlStack.push(e.getURL().toString());
                        //set url in textfield
                        url.setText(e.getURL().toString());
                        editorPane.setPage(e.getURL());
                    } catch (IOException ex) {
                        editorPane.setText("Exception: " + ex);
                    }
                }
            }
        });

            ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    urlStack.push(url.getText());
                    editorPane.setPage(url.getText());
                } catch (IOException ex) {
                    editorPane.setText("Exception: " + ex);
                }
            }
        };

        final JProgressBar progressBar = new JProgressBar();
        progressBar.setPreferredSize(new Dimension(80, 15));
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.green);

        final JLabel label = new JLabel("url");


        JButton goButton = new JButton();
        goButton.setIcon(new );
        goButton.addActionListener(listener);
        url.addActionListener(listener);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (urlStack.size() <= 1) return;
                try {
                    urlStack.pop();
                    String urlString = urlStack.peek();
                    url.setText(urlString);
                    editorPane.setPage(urlString);

                } catch (IOException ex) {
                    editorPane.setText("Exception: " + ex);
                }
            }
        });

        JButton forwardButton = new JButton("Forward");
        forwardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (urlStack.size() <= 1) return;
                try {
                    urlStack.pop();
                    String urlString = urlStack.peek();
                    url.setText(urlString);
                    editorPane.setPage(urlString);
                } catch (IOException ex) {
                    editorPane.setText("Exception: " + ex);
                }
            }
        });



        add(new JScrollPane(editorPane), BorderLayout.CENTER);

        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(url);
        panel.add(goButton);
        panel.add(backButton);
        panel.add(forwardButton);
        panel.add(progressBar);

        add(panel, BorderLayout.SOUTH);

        getContentPane().add(panel);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void initialize(){
        createBaseForm();
    }

    private void createBaseForm() {
        Platform.runLater(new Runnable() {
            public void run() {
                WebView webView = new WebView();
                engine = webView.getEngine();

                engine.titleProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observable, String oldValue, final String newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                SplashFrame.this.setTitle(newValue);
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
                                url.setText(newValue);
                            }
                        });
                    }
                });
                engine.getLoadWorker().workDoneProperty().addListener(new ChangeListener<Number>() {
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                progressBar.setvalue(newValue.intValue());
                            }
                        });
                    }
                });

                engine.getLoadWorker().exceptionProperty().addListener(new ChangeListener<Throwable>() {
                    public void changed(ObservableValue<? extends Throwable> observable, Throwable oldValue, final Throwable newValue) {
                        if (engine.getLoadWorker().getState() == Worker.State.FAILED) {
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    JOptionPane.showMessageDialog(panel, (newValue != null) ? engine.getLocation() +
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
                String tmp = urL(url);
                if (tmp ==null){
                    tmp=urL("http://" + url);
                }
                engine.load(tmp);
            }
        });
    }
    private static String urL(String string){
        try{
            return new URL(string).toExternalForm();
        }catch (MalformedURLException e){
            return null;
        }
    }
}
