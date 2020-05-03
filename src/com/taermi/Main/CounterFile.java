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
	
	//250, 500, 1000, 50.000, 100.000, 250.000, 500.000, 1.000.000
	
	public static void setAchieve1(Player player, boolean ach1) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement1", ach1);
		CounterFile.save();
	}
	
	public static boolean getAchieve1(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement1");
	}
	
	public static void setAchieve50(Player player, boolean ach50) throws IOException{
	    Clicker.set(player.getUniqueId() + ".Achievement50", ach50);
		CounterFile.save();
	}
	
	public static boolean getAchieve50(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement50");
	}
	
	public static void setAchieve100(Player player, boolean ach100) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement100", ach100);
		CounterFile.save();
	}
	
	
	public static boolean getAchieve100(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement100");
	}
	
	public static void setAchieve250(Player player, boolean ach250) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement250", ach250);
		CounterFile.save();
	}
	
	public static boolean getAchieve250(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement250");
	}
	
	public static void setAchieve500(Player player, boolean ach500) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement500", ach500);
		CounterFile.save();
	}
	
	public static boolean getAchieve500(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement500");
	}
	
	public static void setAchieve1000(Player player, boolean ach1000) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement1000", ach1000);
		CounterFile.save();
	}
	
	public static boolean getAchieve1000(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement1000");
	}
	
	public static void setAchieve50000(Player player, boolean ach50k) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement50000", ach50k);
		CounterFile.save();
	}
	
	public static boolean getAchieve50000(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement50000");
	}
	
	public static void setAchieve100000(Player player, boolean ach100k) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement100000", ach100k);
		CounterFile.save();
	}
	
	public static boolean getAchieve100000(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement100000");
	}
	
	public static void setAchieve250000(Player player, boolean ach250k) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement250000", ach250k);
		CounterFile.save();
	}
	
	public static boolean getAchieve250000(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement250000");
	}
	
	public static void setAchieve500000(Player player, boolean ach500k) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement500000", ach500k);
		CounterFile.save();
	}
	
	public static boolean getAchieve500000(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement500000");
	}
	
	public static void setAchieve1000000(Player player, boolean ach1m) throws IOException{
		Clicker.set(player.getUniqueId() + ".Achievement1000000", ach1m);
		CounterFile.save();
	}
	
	public static boolean getAchieve1000000(Player player) {
		return Clicker.getBoolean(player.getUniqueId() + ".Achievement1000000");
	}
	
	public static void setName(Player player, String name) throws IOException{
		Clicker.set(player.getUniqueId() + ".Name", name);
		CounterFile.save();
	}
	
	public static String getName(Player player) {
		return Clicker.getString(player.getUniqueId() + ".Name");
	}
	
	//Max Cookies
	public static int getMaxCookies(Player player) {
		return Clicker.getInt(player.getUniqueId() + ".MaxCookies");
	}
	
	public static void setMaxCookies(Player player, int maxcookies) throws IOException{
		Clicker.set(player.getUniqueId() + ".MaxCookies", maxcookies);
		CounterFile.save();
	}
	
	

}
