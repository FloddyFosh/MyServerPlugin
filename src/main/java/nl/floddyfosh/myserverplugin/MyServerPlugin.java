package nl.floddyfosh.myserverplugin;

import nl.floddyfosh.myserverplugin.listeners.*;

import org.bukkit.plugin.java.JavaPlugin;

public final class MyServerPlugin extends JavaPlugin{
	
	public void onEnable(){
		getLogger().info("onEnable has been invoked!");
		
		initListeners();
	}
 
	public void onDisable(){
		getLogger().info("onDisable has been invoked!");
	}
	
	public void initListeners() {
		new MyLoginListener(this);
	}
	
}
