package rpg.dafney.legends;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import rpg.dafney.legends.functions.Config;
import rpg.dafney.legends.functions.Timers;

public class Main extends JavaPlugin
{
	// ** Plugin
	public static Plugin plugin;
	public static Server server;
	public static PluginManager pluginManager;
	public static BukkitScheduler scheduler;
	
	// ** onEnable
	public void onEnable()
	{
		// ** Plugin
		plugin = this;
		
		// ** Server
		server = plugin.getServer();
		
		// ** Manager
		pluginManager = server.getPluginManager();
		
		// ** Scheduler
		scheduler = server.getScheduler();
		
		// ** Load Config
		Config.loadConfig();
		
		// ** Load Timers
		Timers.startTimers();
		
		// ** Register Listener
		pluginManager.registerEvents(new MainListener(), this);
	}
	
	// ** onDisable
	public void onDisable()
	{
		// ** Save Config
		Config.saveConfig();
		
		// ** Reset Tasks
		scheduler.cancelTasks(plugin);
		
		// ** Reset Plugin
		plugin = null;
	}
}