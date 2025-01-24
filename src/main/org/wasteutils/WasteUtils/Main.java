package org.wasteutils.WasteUtils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.wasteutils.WasteUtils.Listeners.LoggingListener;

public class Main extends JavaPlugin {
    public static void main(String[] args) {
    }
    @Override
    public void onLoad() {
        this.saveDefaultConfig();
        this.reloadConfig();
        Bukkit.getConsoleSender().sendMessage("§3WasteUtils§f >>§ePlugin was loaded. Hello from WasteUtils V0.0.1 Demo!");
        Boolean isDebugging = this.getConfig().getBoolean("debug");
        if (isDebugging = Boolean.TRUE) {
            Bukkit.getConsoleSender().sendMessage("§3WasteUtils§f >>§eDebugger was enabled.");
        }
    }


    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§3WasteUtils§f >>§ePlugin was Enabled.");
        getServer().getPluginManager().registerEvents(new LoggingListener(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§3WasteUtils§f >>§ePlugin was Disabled.");
    }
}