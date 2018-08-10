package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        try (Socket socket = new Socket("192.168.88.124", 1234)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = reader.readLine();
            System.out.println(s);
            reader.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
