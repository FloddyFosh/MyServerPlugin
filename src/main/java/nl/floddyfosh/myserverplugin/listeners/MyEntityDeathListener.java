package nl.floddyfosh.myserverplugin.listeners;

import java.awt.List;
import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.material.Skull;

import nl.floddyfosh.myserverplugin.MyServerPlugin;
import nl.floddyfosh.myserverplugin.customitems.MyCustomItem;
import nl.floddyfosh.myserverplugin.customitems.MyCustomItemManager;

public class MyEntityDeathListener implements Listener {

	private MyServerPlugin plugin;
	
	public MyEntityDeathListener(MyServerPlugin plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
    public void onEntityDeath(EntityDeathEvent event) {
		
		if (event.getEntity().getLastDamageCause() == null)
            return;
		
		if(event.getEntityType().equals(EntityType.SNOWMAN)) {     	
        	event.getDrops().add(MyCustomItemManager.getCustomItem(MyCustomItem.HW_PUMPKIN));
        }
    }
	
}
