package me.jojjjo147.workstations;

import me.jojjjo147.workstations.commands.WorkbenchCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Workstations extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("craft").setExecutor(new WorkbenchCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
