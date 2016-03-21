package xyz.zaddrot.main;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Created by night on 08.03.2016.
 */
public class Starter {
    public static void main(String[] args){
        try {
            Connection.Response SMS = Jsoup.connect("http://sms.ru/sms/send?api_id=8CF99BD9-9565-171F-0D5B-8F1D88CF3428&to=79807057233&text=hello+world").method(Connection.Method.GET).execute();
            System.out.println(SMS.body());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
