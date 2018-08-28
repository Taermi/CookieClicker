package com.taermi.Main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new Events(), this);
		getCommand("cookies").setExecutor(new Cookies());
		getCommand("ccreset").setExecutor(new CookieReset());
		
	}
	
	public void onDisable() {
		
	}

}
