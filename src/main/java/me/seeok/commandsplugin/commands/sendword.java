package me.seeok.commandsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sendword implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length > 0){
                player.sendMessage(args[0]);
            }else{
                player.sendMessage(ChatColor.RED+"You need to give the command and argument. '/sendword <word>'");
            }
        }else{
            System.out.println("You need to be a player to use this command.");
        }

        return false;
    }
}
