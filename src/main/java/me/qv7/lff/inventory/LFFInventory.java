package me.qv7.lff.inventory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * @author 7qv_ on 2/3/2022.
 * @project LFF Plugin
 */
public class LFFInventory implements Listener {

    @EventHandler
    public void createLFFInventory(InventoryClickEvent event) {

        if (event.getClickedInventory().getTitle().equalsIgnoreCase("LFF Menu")) {
            Player p = (Player) event.getWhoClicked();

            switch(event.getCurrentItem().getType()) {
                case DIAMOND_CHESTPLATE:
                    p.closeInventory();
                    Bukkit.getServer().broadcastMessage(p.getName() + "" + ChatColor.AQUA + "Esta Buscando Faction" + ChatColor.DARK_AQUA + "Su clase es Diamond");
                    break;
                case GOLD_CHESTPLATE:
                    p.closeInventory();
                    Bukkit.getServer().broadcastMessage(p.getName() + "" + ChatColor.GOLD + "Esta Buscando Faction" + "" + ChatColor.GOLD + "Su clase es Bard");
                    break;
                case LEATHER_CHESTPLATE:
                    p.closeInventory();
                    Bukkit.getServer().broadcastMessage(p.getName() + "" + ChatColor.BLUE + "Esta Buscando Faction" + "" +  ChatColor.BLUE + "Su clase es Archer");
                    break;
                case CHAINMAIL_CHESTPLATE:
                    p.closeInventory();
                    Bukkit.getServer().broadcastMessage(p.getName() + "" + ChatColor.RED + "Esta Buscando Faction" + "" +  ChatColor.RED + "Su clase es Rogue");
                    break;
            }

        }
    }

}
