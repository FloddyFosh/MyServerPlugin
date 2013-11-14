package nl.floddyfosh.myserverplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MyCommandExecutor implements CommandExecutor {

	private MyServerPlugin plugin;
	
	public MyCommandExecutor(MyServerPlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		return false;
	}
}
