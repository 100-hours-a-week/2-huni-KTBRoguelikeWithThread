package org.example.Game;
import org.example.Character.Monster;
import org.example.Character.Player;

public class Autobattle extends Thread {
    private Player player;
    private Monster monster;
    private Turn turn;

    public Autobattle(Player player, Monster monster, Turn turn){
        this.player = player;
        this.monster = monster;
        this.turn = turn;
    }

    @Override
    public void run(){
        while (!player.isDead() && !monster.isDead()){
            try {
                Thread.sleep(2000);
                player.attack(monster);
                if (!monster.isDead()) {
                    monster.attack(player);
                }
                turn.turnOver();
                System.out.println("자동 전투 진행 중.. " + turn.getTurn() + "턴 진행\n");
            } catch (InterruptedException e) {
                System.out.println("자동 전투 스레드 강제 종료");
                break;
            }
        }
    }
}
