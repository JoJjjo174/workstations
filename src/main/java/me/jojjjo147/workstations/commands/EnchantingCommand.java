package me.jojjjo147.workstations.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnchantingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("This command can only be executed by a player!");
            return true;
        }

        Player player = (Player) commandSender;
        player.openEnchanting(player.getLocation(), true);
        player.playSound(player, Sound.BLOCK_ENCHANTMENT_TABLE_USE, 1, 1);
        return true;
    }
}
