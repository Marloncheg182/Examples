package Patterns.Visitor;

import junit.framework.TestCase;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class TestVisitorPattern extends TestCase{

    private MacConfigurator macConfigurator;
    private LinuxConfigurator linuxConfigurator;
    private DLinkRouter dLinkRouter;
    private TPLinkRouter tpLinkRouter;
    private LinkSysRouter linkSysRouter;

    public void setUp() throws Exception {

        macConfigurator = new MacConfigurator();
        linuxConfigurator = new LinuxConfigurator();

        dLinkRouter = new DLinkRouter();
        tpLinkRouter = new TPLinkRouter();
        linkSysRouter = new LinkSysRouter();
    }
    public void testDlink(){
        dLinkRouter.accept(macConfigurator);
        dLinkRouter.accept(linuxConfigurator);
    }
    public void testLinkSys(){
        linkSysRouter.accept(macConfigurator);
        linkSysRouter.accept(linuxConfigurator);
    }
}