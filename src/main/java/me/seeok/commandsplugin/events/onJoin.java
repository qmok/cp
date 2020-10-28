package me.seeok.commandsplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e){
    Player player = e.getPlayer();
    e.setJoinMessage("Welcome back "+ChatColor.AQUA+player.getDisplayName()+"!");
    player.getLocation().setX(26);
    player.getLocation().setY(67);
    player.getLocation().setZ(860);
    }
}