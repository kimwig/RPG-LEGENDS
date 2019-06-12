package rpg.dafney.legends;

import org.bukkit.plugin.java.JavaPlugin;

import rpg.dafney.legends.functions.Config;
import rpg.dafney.legends.functions.Timers;

public class Main extends JavaPlugin
{
	// ** onEnable
	public void onEnable()
	{
		// ** Load Config
		Config.Load();
		
		// ** Load Timers
		Timers.Start();
	}
	
	// ** onDisable
	public void onDisable()
	{
		// ** Save Config
		Config.Save();
	}
}