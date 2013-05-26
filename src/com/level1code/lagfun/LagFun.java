package com.level1code.lagfun;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LagFun extends JavaPlugin implements Listener {
	public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
 
    @EventHandler
    public void chat(AsyncPlayerChatEvent event) {
    	event.setMessage(event.getMessage().replaceAll("\\b[Ll]+[Aa]+[Gg]+", "fun"));
    }
}
