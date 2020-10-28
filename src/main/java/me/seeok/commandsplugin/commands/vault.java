package me.seeok.commandsplugin.commands;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class vault implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            //creating vault
            Inventory vault = Bukkit.createInventory(player, 9, "Your Vault");
            player.openInventory(vault);
            //put in item
            ItemStack item1 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
            item1.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1000);
            item1.addUnsafeEnchantment(Enchantment.DURABILITY, 1000);
            item1.addUnsafeEnchantment(Enchantment.LUCK, 1000);
            item1.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1000);
            item1.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 1000);
            vault.setItem(0, item1);
            //set item meta
            ItemMeta meta1 = item1.getItemMeta();
            meta1.setDisplayName("Lucky Pickaxe");
        }else{
            System.out.println("You need to be a player to use this command.");
        }
        return true;
    }
}
