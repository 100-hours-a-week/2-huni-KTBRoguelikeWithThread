package org.example.Game;

import java.util.concurrent.atomic.AtomicInteger;

public class Turn {
    private AtomicInteger turn = new AtomicInteger(0);

    public void turnOver(){
        turn.incrementAndGet();
    }
    public int getTurn(){
        return turn.get();
    }
}
