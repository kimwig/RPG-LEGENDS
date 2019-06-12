package rpg.dafney.legends;

import org.bukkit.plugin.java.JavaPlugin;

import rpg.dafney.legends.functions.Config;

public class Main extends JavaPlugin
{
	// ** onEnable
	public void onEnable()
	{
		// ** Load Config
		Config.Load();
	}
	
	// ** onDisable
	public void onDisable()
	{
		// ** Save Config
		Config.Save();
	}
}