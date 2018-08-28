package com.taermi.Main;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CookieReset implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		Player target = (Player) Bukkit.getPlayer(args[0]);
		if(cmd.getName().equalsIgnoreCase("ccreset")) {
			if(target != null) {
			if(args.length == 1) {
				try {
				CounterFile.setClickCount(target, CounterFile.getClickCount(target) - CounterFile.getClickCount(target));
				CounterFile.setAchieve250(target, false);
				CounterFile.setAchieve500(target, false);
				CounterFile.setAchieve1000(target, false);
				CounterFile.setAchieve50000(target, false);
				CounterFile.setAchieve100000(target, false);
				CounterFile.setAchieve250000(target, false);
				CounterFile.setAchieve500000(target, false);
				CounterFile.setAchieve1000000(target, false);
				CounterFile.save();
				} catch (IOException e) {
					e.printStackTrace();
				}
				p.sendMessage(ChatColor.RED + "Resetted the CookieStats of " + ChatColor.GOLD + target.getDisplayName() + ChatColor.RED + "!");
			}
		  }
		}
		return false;
	}

}
