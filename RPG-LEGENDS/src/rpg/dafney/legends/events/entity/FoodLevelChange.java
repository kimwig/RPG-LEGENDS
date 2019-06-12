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
		
		// ** Reset
		player.setSaturation(200);
		player.setExhaustion(0);
		
		// ** Cancel event
		event.setCancelled(true);

		// ** Return
		return;
	}
}