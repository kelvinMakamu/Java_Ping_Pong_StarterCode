package models;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {
    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingPong.runPingPong(1));
    }
    
    @Test
    public void runPingPong_countUpToGivenNumber_ArrayList(){
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected,testPingPong.runPingPong(2));
    }
    
    @Test
    public void runPingPong_replaceMultiplesOf3_ArrayList(){
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add("Ping");
        assertEquals(expected, testPingPong.runPingPong(3));
    }
    
    @Test
    public void runPingPong_replaceMultiplesOf5_ArrayList(){
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add("Ping");
        expected.add(4);
        expected.add("Pong");
        assertEquals(expected, testPingPong.runPingPong(5));
    }
    
     @Test
    public void runPingPong_replaceMultiplesOfBoth3And5_ArrayList() {
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add("Ping");
        expected.add(4);
        expected.add("Pong");
        expected.add("Ping");
        expected.add(7);
        expected.add(8);
        expected.add("Ping");
        expected.add("Pong");
        expected.add(11);
        expected.add("Ping");
        expected.add(13);
        expected.add(14);
        expected.add("Ping Pong");
        assertEquals(expected, testPingPong.runPingPong(15));
    }
}