package GOF.Behavioral.State;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class TVRemoteBasic {
    private String state="";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction(){
        if (state.equalsIgnoreCase("ON")){
            System.out.println("TV is turned on");
        } else if (state.equalsIgnoreCase("OFF")){
            System.out.println("TV is turned off");
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic remoteBasic = new TVRemoteBasic();
        remoteBasic.setState("ON");
        remoteBasic.doAction();

        remoteBasic.setState("OFF");
        remoteBasic.doAction();
    }
}
