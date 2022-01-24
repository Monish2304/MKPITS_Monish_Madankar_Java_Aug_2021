package Networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingEx1 {
    private static InetAddress InetAdress;

    public static void main(String[] args) throws IOException {
        InetAddress ob=InetAdress.getLocalHost();
        System.out.println(ob);
        System.out.println(ob.getHostAddress());
        System.out.println(ob.getHostName());
        System.out.println(ob.getByName("www.google.com"));
        System.out.println(ob.getLoopbackAddress());
        //System.out.println(ob.getAllByName("www.google.com"));
        //System.out.println(ob.isAnyLocalAddress());
        //System.out.println(ob.isLinkLocalAddress());
        //System.out.println(ob.isReachable(Integer.parseInt("1000")));

    }
}
