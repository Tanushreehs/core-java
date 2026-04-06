public class NetRunner {
    public static void main(String[] args) {

        Net net1 = new Net();
        NetRun netrun = new NetRun();
        netrun.useNet(net1);

        Net net2 = null;
        netrun.useNet(net2);
    }
}