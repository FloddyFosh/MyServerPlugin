package nl.floddyfosh.myserverplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import nl.floddyfosh.myserverplugin.MyServerPlugin;

public class MyEntityDeathEvent implements Listener {

	private MyServerPlugin plugin;
	
	public MyEntityDeathEvent(MyServerPlugin plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
    public void onEntityDeath(EntityDeathEvent event) {
        // Some code here
    }
	
}
