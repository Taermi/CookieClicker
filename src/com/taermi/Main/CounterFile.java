package com.taermi.Main;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class CounterFile {
	
	public static File ClickerFile = new File("plugins/CookieClicker", "Clicker.yml");
	public static FileConfiguration Clicker = YamlConfiguration.loadConfiguration(ClickerFile);
	
	public static void save() {
		try {
			Clicker.save(ClickerFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void load() {
		Clicker = YamlConfiguration.loadConfiguration(ClickerFile);
	}
	
	public static void setClickCount(Player player, int clickcount) throws IOException{
		Clicker.set(player.getUniqueId() + ".ClickerCount", clickcount);
		CounterFile.save();
	}
	
	public static int getClickCount(Player player) {
		return Clicker.getInt(player.getUniqueId() + ".ClickerCount");
	}

}
