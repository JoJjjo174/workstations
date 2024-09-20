package me.jojjjo147.workstations;

import me.jojjjo147.workstations.commands.EnchantingCommand;
import me.jojjjo147.workstations.commands.EnderChestCommand;
import me.jojjjo147.workstations.commands.WorkbenchCommand;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class Workstations extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("craft").setExecutor(new WorkbenchCommand());
        getCommand("enchanting").setExecutor(new EnchantingCommand());
        getCommand("enderchest").setExecutor(new EnderChestCommand());

        int pluginId = 23427;
        Metrics metrics = new Metrics(this, pluginId);
    }
}
