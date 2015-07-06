package Structural.Adapter.Adapter;

/**
 * Created by Dell on 6/20/2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
       // empty body
    }
}
