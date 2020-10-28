package me.seeok.commandsplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class waterbreathe implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("CommandsPlugin.waterbreathe")){
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 999999999, 100));
                player.sendMessage(ChatColor.BOLD+"You are now able to breathe underwater.");
            }else{
                player.sendMessage(ChatColor.DARK_RED+"You do not have the required permission to run this command.");
            }

        }else{
            System.out.println("You need to be a player to use this command.");
        }

        return false;
    }
}
