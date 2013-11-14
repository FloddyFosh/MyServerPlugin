package nl.floddyfosh.myserverplugin.listeners;

import nl.floddyfosh.myserverplugin.MyServerPlugin;

import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;

public class MyLoginListener implements Listener {
	
	private MyServerPlugin plugin;
	
	public MyLoginListener(MyServerPlugin plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
    public void onLogin(PlayerLoginEvent event) {
        
    }
	
}
