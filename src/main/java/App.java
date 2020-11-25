
import java.util.ArrayList;
import java.util.Scanner;

import models.PingPong;

public class App {
    
    public static void main(String [] args){
        System.out.println("I am a Ping Pong Application");
        System.out.println("****************************");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int countUpTo = inputScanner.nextInt();
        try{
            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(countUpTo);
            System.out.println(pingPongResult);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
