package RiversLab;

import java.util.ArrayList;

public class CalanderDay {
    public byte id;
    public ArrayList<Event> events = new ArrayList<>();
    CalanderDay(byte n){
        this.id = (byte) (n + 1);
    }
}