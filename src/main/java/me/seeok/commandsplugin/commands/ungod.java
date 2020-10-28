package me.seeok.commandsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ungod implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            player.setInvulnerable(false);
            player.sendMessage(ChatColor.BOLD+"You are no longer a god.");
        }else{
            System.out.println("You need to be a player to use this command.");
        }



        return false;
    }
}
