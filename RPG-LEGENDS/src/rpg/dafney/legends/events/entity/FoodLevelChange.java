package rpg.dafney.legends.events.entity;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChange 
{
	// ** Event
	public static void onEvent(FoodLevelChangeEvent event)
	{
		// ** Player
		Player player = (Player) event.getEntity();
		
		// ** Reset Exhaustion and Saturation
		player.setSaturation(20);
		player.setExhaustion(0);
		
		// ** Cancel event
		event.setCancelled(true);

		// ** Return
		return;
	}
}