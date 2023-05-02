package client;

import java.io.IOException;
import java.net.UnknownHostException;

public class main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Client client = new Client();
        client.startConnection("127.0.0.1", 9000);
        String resp = client.sendMessage("hello server");
        System.out.println(resp);
    }
}
