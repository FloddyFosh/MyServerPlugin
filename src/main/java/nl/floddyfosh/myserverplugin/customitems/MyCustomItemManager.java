package nl.floddyfosh.myserverplugin.customitems;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class MyCustomItemManager {
	
	private MyCustomItemManager() {
		
	}
	
	public static ItemStack getCustomItem(MyCustomItem type) {
		final ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        final SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setOwner(type.getSkinName());
        meta.setDisplayName(ChatColor.GOLD + type.getDisplayName());
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(type.getLore());
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
	}

	public static boolean isCustomItem(String input) {
        for (MyCustomItem t : MyCustomItem.values()) {
            if (input.equalsIgnoreCase(t.getSkinName()))
                return true;
        }
        return false;
    }
}
