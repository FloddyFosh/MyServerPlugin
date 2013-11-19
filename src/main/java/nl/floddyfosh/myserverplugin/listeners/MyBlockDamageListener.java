package nl.floddyfosh.myserverplugin.listeners;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.block.Skull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;

import nl.floddyfosh.myserverplugin.MyServerPlugin;
import nl.floddyfosh.myserverplugin.customitems.MyCustomItem;
import nl.floddyfosh.myserverplugin.customitems.MyCustomItemManager;

public class MyBlockDamageListener implements Listener {
    
    private MyServerPlugin plugin;
    
    public MyBlockDamageListener(MyServerPlugin plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockDamage(BlockDamageEvent event) {
        if (event.getBlock().getType() == Material.SKULL) {
            Skull skull = (Skull) event.getBlock().getState();
            if (skull.getSkullType() == SkullType.PLAYER && skull.hasOwner() && MyCustomItemManager.isCustomItem(skull.getOwner())) {
                event.getPlayer().sendMessage(MyCustomItem.forSkinName(skull.getOwner()).getLore());
            }
        }
    }

}
