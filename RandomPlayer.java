package me.lowynzx.lowcx.core;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Random;

public class Testing {

    static ArrayList<Player> jugadores = new ArrayList<>(Bukkit.getServer().getOnlinePlayers().size());

    public static Player getJugadorRandom(){
        int r = new Random().nextInt(jugadores.size());
        Player selected = (Player) Bukkit.getServer().getOnlinePlayers().toArray()[r];
        return selected;
    }
}


