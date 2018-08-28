package com.taermi.Main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Cookies implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("cookies")) {
			Player p = (Player) sender;
			if(args.length == 0) {
				int count = CounterFile.getClickCount(p);
				p.sendMessage(ChatColor.GREEN + "You've got " + ChatColor.GOLD + count + ChatColor.GREEN + " Cookies!");
			}
			if(args.length == 1) {
				Player target = Bukkit.getPlayer(args[0]);
				if(!(target == null)) {
					int count = CounterFile.getClickCount(target);
					p.sendMessage(ChatColor.GOLD + p.getDisplayName() + ChatColor.GREEN + " has got " + ChatColor.GOLD + count + ChatColor.GREEN + " Cookies!");
				}else {
					p.sendMessage(ChatColor.RED + "The Player " + ChatColor.GOLD + target + ChatColor.RED + " couldn't be found!");
				  }
				}
			}
		return false;
	}

}
