package de.reave.invObs.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import static de.reave.invObs.Utils.prefixString;

public class SeeEnderChestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!sender.hasPermission("seeenderchestpermission")){
            sender.sendMessage(prefixString("Insufficient permissions", ChatColor.RED));
            return true;
        }
        if(!(sender instanceof Player)) {
            sender.sendMessage(prefixString("You are no player", ChatColor.RED));
            return true;
        }
        Player player = (Player) sender;
        if(args.length != 1){
            sender.sendMessage(prefixString("You have to enter a player name", ChatColor.RED));
            return true;
        }
        if(!sender.getServer().getOnlinePlayers().contains(sender.getServer().getPlayer(args[0]))){
            sender.sendMessage(prefixString("This player isn't online", ChatColor.RED));
            return true;
        }
        Player target = player.getServer().getPlayer(args[0]);
        player.openInventory(target.getEnderChest());

        return false;
    }
}
