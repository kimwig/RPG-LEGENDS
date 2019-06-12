package rpg.dafney.legends.events.entity;

import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChange 
{
	// ** Event
	public static void onEvent(FoodLevelChangeEvent event)
	{
		// ** Cancel event
		event.setCancelled(true);

		// ** Return
		return;
	}
}