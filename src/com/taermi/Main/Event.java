package com.taermi.Main;

import java.io.IOException;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;

public class Event implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if(p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			CounterFile.setClickCount(p, CounterFile.getClickCount(p)+1);
			p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
		}
		
	}

}
