package Assesments17.useclasses;

import Assesments17.interfacecs.Player;

public class Stadium {
    Player player;

    public Stadium(Player player){
        this.player=player;
        System.out.println("run player in stadium..");
    }

    public void execute(){
        if(this.player!=null){
            this.player.play();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
