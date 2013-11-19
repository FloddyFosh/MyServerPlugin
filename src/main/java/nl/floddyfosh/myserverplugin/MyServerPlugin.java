package nl.floddyfosh.myserverplugin;

import java.util.logging.Logger;

import nl.floddyfosh.myserverplugin.listeners.*;

import org.bukkit.plugin.java.JavaPlugin;

public final class MyServerPlugin extends JavaPlugin{
	
	public void onEnable(){
		log("onEnable has been invoked!");
		
		initListeners();
		initCommands();
	}
 
	public void onDisable(){
		log("onDisable has been invoked!");
	}
	
	public void initListeners() {
		new MyBlockBreakListener(this);
		new MyBlockDamageListener(this);
		new MyEntityDeathListener(this);
		new MyLoginListener(this);
	}
	
	public void initCommands() {
		getCommand("testmyplugin").setExecutor(new MyCommandExecutor(this));
	}
	
	public static void log(String s) {
        Logger.getLogger("Minecraft").info("[MyServerPlugin] " + s);
    }
	
}
