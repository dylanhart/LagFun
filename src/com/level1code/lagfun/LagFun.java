package com.level1code.lagfun;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LagFun extends JavaPlugin implements Listener {
	
	private String regex; // "\\b[Ll]+\\s*[Aa]+\\s*[Gg]+"
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		
		saveDefaultConfig();
		regex = getConfig().getString("regex");
		
		getLogger().info("loading with regex: '" + regex + "'");
	}
 
	public void onDisable() {
	}

	public void onReload() {
		reloadConfig();
		regex = getConfig().getString("regex");
	}
	
	@EventHandler
	public void chat(AsyncPlayerChatEvent event) {
		event.setMessage(event.getMessage().replaceAll(regex, "Adoro esse Server! :D"));
	}
}
