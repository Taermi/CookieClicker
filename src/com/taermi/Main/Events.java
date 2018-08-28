package com.taermi.Main;

import java.io.IOException;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;

public class Events implements Listener {

	@EventHandler
	public void onClick(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			CounterFile.setClickCount(p, CounterFile.getClickCount(p) + 1);
			p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
		}

	}
	
	@EventHandler
	public void onAchieve250(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 249 && CounterFile.getClickCount(p) < 251) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "250 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve250(p, true);
			}
		}

	}
	
	@EventHandler
	public void onAchieve500(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 499 && CounterFile.getClickCount(p) < 501) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "500 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve500(p, true);
			}
		}

	}

	@EventHandler
	public void onAchieve1000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 999 && CounterFile.getClickCount(p) < 1001) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "1000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve1000(p, true);
			}
		}

	}
	
	@EventHandler
	public void onAchieve50000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 49999 && CounterFile.getClickCount(p) < 50001) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "50.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve50000(p, true);
			}
		}

	}
	
	@EventHandler
	public void onAchieve100000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 99999 && CounterFile.getClickCount(p) < 100001) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "100.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve100000(p, true);
			}
		}
	}
	
	@EventHandler
	public void onAchieve250000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 249000 && CounterFile.getClickCount(p) < 250001) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "250.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve250000(p, true);
			}
		}
	}
	
	@EventHandler
	public void onAchieve500000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 499999 && CounterFile.getClickCount(p) < 500001) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "500.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve500000(p, true);
			}
		}
	}
	
	@EventHandler
	public void onAchieve1000000(PlayerInteractEvent event) throws IOException {
		Player p = event.getPlayer();
		String message = ChatColor.GOLD + "" + CounterFile.getClickCount(p) + ChatColor.GREEN + " Cookies";
		if (p.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
			if (CounterFile.getClickCount(p) > 999999 && CounterFile.getClickCount(p) < 1000001) {
				p.spigot().sendMessage(net.md_5.bungee.api.ChatMessageType.ACTION_BAR, new TextComponent(message));
				p.sendMessage(ChatColor.GREEN + "You've got already " + ChatColor.GOLD + "1.000.000 Cookies" + ChatColor.GREEN + ", go on!");
				CounterFile.setAchieve1000000(p, true);
			}
		}
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) throws IOException{
		Player p = event.getPlayer();
		if(!p.hasPlayedBefore()) {
			CounterFile.setName(p, p.getDisplayName());
			System.out.println("[CookieClicker] Created CookieClicker entry for " + p.getDisplayName());
		}
	}

}
