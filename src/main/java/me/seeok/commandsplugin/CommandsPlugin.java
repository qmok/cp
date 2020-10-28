package me.seeok.commandsplugin;

import me.seeok.commandsplugin.commands.*;
import me.seeok.commandsplugin.events.PlayerMove;
import me.seeok.commandsplugin.events.onJoin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("-----------------------");
        System.out.println("-CommandsPlugin Active-");
        System.out.println("-----------------------");
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerMove(), this);
        getCommand("god").setExecutor(new god());
        getCommand("feed").setExecutor(new feed());
        getCommand("ungod").setExecutor(new ungod());
        getCommand("givehealth").setExecutor(new GiveHealth());
        getCommand("sendword").setExecutor(new sendword());
        getCommand("vault").setExecutor(new vault());
        getCommand("waterbreathe").setExecutor(new waterbreathe());
        getCommand("unwaterbreathe").setExecutor(new unwaterbreathe());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("-------------------------");
        System.out.println("-CommandsPlugin Inactive-");
        System.out.println("-------------------------");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Cmd1
        if (command.getName().equals("death")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.DARK_RED + "Sure.");
                player.setHealth(0);
            } else {
                System.out.println("You need to be a player to use this command.");
            }
        }
        return false;
    }
}