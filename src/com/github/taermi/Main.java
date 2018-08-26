package com.github.taermi;

import java.io.IOException;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	@EventHandler
	public void onClick(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		if(p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			CounterFile.setClickCount(p, CounterFile.getClickCount(p)+1);
			
		}
		
	}

}
