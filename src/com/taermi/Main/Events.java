package com.taermi.Main;

import java.io.IOException;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;

public class Events implements Listener {

	//Clickcounter
	@EventHandler
	public void onClick(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		Integer count = CounterFile.getClickCount(p);
		Integer max = CounterFile.getMaxCookies(p);
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			CounterFile.setClickCount(p, count + 1);
			String message = ChatColor.GOLD + "" + count + ChatColor.GREEN + " Cookies";
			p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
			
			//Max Cookie Counter
			if(count > max){
				CounterFile.setMaxCookies(p, count+1);
			}
		}

	}
	
	//Event for people who murder cookies
	@EventHandler
	public void onEat(PlayerItemConsumeEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.DARK_RED + "MURDERER! Everything is lost now!";
		if(event.getItem().getType() == Material.COOKIE){
			p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
			CounterFile.setClickCount(p, CounterFile.getClickCount(p) - CounterFile.getClickCount(p));
		}
	}
	
	//Achievement 1 Cookie
	@EventHandler
	public void onAchieve1(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 1) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "This is your " + ChatColor.GOLD + "first" + ChatColor.GREEN + " Cookie! May the Adventure begin...");
				CounterFile.setAchieve1(p, true);
			}
		}

	}
	
	//Achievement 50 Cookies
	@EventHandler
	public void onAchieve50(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 50) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "50 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve50(p, true);
			}
		}

	}
	
	//Achievement 100 Cookies
	@EventHandler
	public void onAchieve100(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 100) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "100 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve100(p, true);
			}
		}

	}
	
	//Achievement 250 Cookies
	@EventHandler
	public void onAchieve250(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 250) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "250 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve250(p, true);
			}
		}

	}
	
	//Achievement 500 Cookies
	@EventHandler
	public void onAchieve500(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 500) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "500 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve500(p, true);
			}
		}

	}

	//Achievement 1.000 Cookies
	@EventHandler
	public void onAchieve1000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 1000) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "1000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve1000(p, true);
			}
		}

	}
	
	//Achievement 50.000 Cookies
	@EventHandler
	public void onAchieve50000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 50000) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "50.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve50000(p, true);
			}
		}

	}
	
	//Achievement 100.000 Cookies
	@EventHandler
	public void onAchieve100000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 100000) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "100.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve100000(p, true);
			}
		}
	}
	
	//Achievement 250.000 Cookies
	@EventHandler
	public void onAchieve250000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 250000) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "250.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve250000(p, true);
			}
		}
	}
	
	//Achievement 500.000 Cookies
	@EventHandler
	public void onAchieve500000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 500000) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "500.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve500000(p, true);
			}
		}
	}
	
	//Achievement 1.000.000 Cookies
	@EventHandler
	public void onAchieve1000000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) == 1000000) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "1.000.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve1000000(p, true);
			}
		}
	}
	
	//Creates an Entry for every new player
	@EventHandler
	public void onJoin(PlayerJoinEvent event) throws IOException{
		Player p = event.getPlayer();
		if(!p.hasPlayedBefore()) {
			CounterFile.setName(p, p.getDisplayName());
			System.out.println("[CookieClicker] Created CookieClicker entry for " + p.getDisplayName());
		}
	}

}
