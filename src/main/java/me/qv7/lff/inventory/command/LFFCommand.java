package me.qv7.lff.inventory.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

/**
 * @author 7qv_ on 2/3/2022.
 * @project LFF Plugin
 */
public class LFFCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            Inventory lffinv = Bukkit.createInventory(player, 9, "LFF Menu");

            ItemStack diamond_class = new ItemStack(Material.DIAMOND_CHESTPLATE); 
            ItemStack bard_class =  new ItemStack(Material.GOLD_CHESTPLATE);
            ItemStack archer_class = new ItemStack(Material.LEATHER_CHESTPLATE);
            ItemStack rogue_class = new ItemStack(Material.CHAINMAIL_CHESTPLATE);

            ItemMeta diamond_class_meta = diamond_class.getItemMeta();
            diamond_class_meta.setDisplayName(ChatColor.AQUA + "Diamond Class");
            diamond_class.setItemMeta(diamond_class_meta);

            ItemMeta bard_class_meta = bard_class.getItemMeta();
            bard_class_meta.setDisplayName(ChatColor.GOLD + "Bard Class");
            bard_class.setItemMeta(bard_class_meta);

            ItemMeta archer_class_meta = archer_class.getItemMeta();
            archer_class_meta.setDisplayName(ChatColor.BLUE + "Archer Class");
            archer_class.setItemMeta(archer_class_meta);

            ItemMeta rogue_class_meta = rogue_class.getItemMeta();
            rogue_class_meta.setDisplayName(ChatColor.BLUE + "Archer Class");
            rogue_class.setItemMeta(rogue_class_meta);

            ItemStack[] lff_menu = {diamond_class, bard_class, archer_class, rogue_class};
            lffinv.setContents(lff_menu);
            player.openInventory(lffinv);
        }
        return true;
    }
}