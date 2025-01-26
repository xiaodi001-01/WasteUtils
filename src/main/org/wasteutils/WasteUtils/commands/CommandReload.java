package org.wasteutils.WasteUtils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.wasteutils.WasteUtils.Main;

import java.util.Objects;

public class CommandReload implements CommandExecutor {
    private Main plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender.hasPermission("wasteutils.reload")){
            sender.sendMessage(Objects.requireNonNull(this.plugin.lang.getString("plugin.reload")));
            this.plugin.loadConfig();
            return true;
        } else {
            sender.sendMessage(Objects.requireNonNull(this.plugin.lang.getString("plugin.nopermission")));
            return false;
        }
    }

}
