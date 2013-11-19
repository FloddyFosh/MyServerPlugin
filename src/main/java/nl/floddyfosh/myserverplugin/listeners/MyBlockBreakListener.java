package nl.floddyfosh.myserverplugin.listeners;

import nl.floddyfosh.myserverplugin.MyServerPlugin;
import nl.floddyfosh.myserverplugin.customitems.MyCustomItem;
import nl.floddyfosh.myserverplugin.customitems.MyCustomItemManager;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.block.Skull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class MyBlockBreakListener implements Listener {
    
    private MyServerPlugin plugin;
    
    public MyBlockBreakListener(MyServerPlugin plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getBlock().getType() == Material.SKULL) {
            Skull skull = (Skull) event.getBlock().getState();
            if (skull.getSkullType() == SkullType.PLAYER && skull.hasOwner() && MyCustomItemManager.isCustomItem(skull.getOwner())) {
                event.setCancelled(true);
                event.getBlock().setType(Material.AIR);
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), MyCustomItemManager.getCustomItem(MyCustomItem.forSkinName(skull.getOwner())));
            }
        }
    }

}
