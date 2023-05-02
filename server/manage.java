package server;

import java.io.IOException;

public class manage {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start(9000);
    }
}