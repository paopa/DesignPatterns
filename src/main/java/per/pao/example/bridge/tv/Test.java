package per.pao.example.bridge.tv;

public class Test {
    public static void main(String[] args) {
        Remote sony = new SonyRemoteImpl(new SonyTVImpl());
        Remote philips = new PhilipsRemoteImpl(new PhilipsTVImpl());
        sony.on();
        philips.on();
        sony.off();
        philips.off();
    }
}
