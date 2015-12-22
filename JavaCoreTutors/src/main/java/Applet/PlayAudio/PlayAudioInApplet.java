package Applet.PlayAudio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class PlayAudioInApplet extends Applet {
    private static final long serialVersionUID = 2530894095587089544L;

    private AudioClip clip;

    public void init(){
        clip = getAudioClip(getDocumentBase(), "https://music.yandex.ua/album/2453156/track/21442294");

    }

    public void paint(Graphics g){
        // clip was played
        clip.play();
        // clip was stopped
        clip.stop();
        // play in loop
        clip.loop();
    }
}
