package me.qv7.lff;

import me.qv7.lff.inventory.LFFInventory;
import me.qv7.lff.inventory.command.LFFCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class LFF extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new LFFInventory(), this);
        getCommand("lff").setExecutor(new LFFCommand());

        Bukkit.getConsoleSender().sendMessage(ChatColor.BOLD + "-------------------");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "LFF Plugin");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Author 7qv_");
        Bukkit.getConsoleSender().sendMessage(ChatColor.BOLD + "-------------------");
    }

    @Override
    public void onDisable() {
    }
}
