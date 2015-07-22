package Lazorenko.Server.Model.Info;

import Lazorenko.Common.Messages.ChatMessage;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by andriylazorenko on 26.06.15.
 */

public class ClientInfo extends AbstractClientInfo {

    public ClientInfo() {
    }

    public ClientInfo(Socket s) throws IOException {
        this.s = s;
        this.ois = new ObjectInputStream(s.getInputStream());
        this.oos = new ObjectOutputStream(s.getOutputStream());
    }

    public void nameExistsNotifyClient(ConcurrentMap map, String sender){
        String notify = "Name already exists! Try again!";
        ChatMessage notification = new ChatMessage(notify);
        send(notification,map,sender);
    }
    public void validateNotifyClient (ConcurrentMap map, String sender){
        String notify = "Name is invalid! Try again!";
        ChatMessage notification = new ChatMessage(notify);
        send(notification,map,sender);
    }

}


