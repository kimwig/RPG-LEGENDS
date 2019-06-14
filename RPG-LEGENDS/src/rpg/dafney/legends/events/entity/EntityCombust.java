package rpg.dafney.legends.events.entity;

import org.bukkit.event.entity.EntityCombustEvent;

public class EntityCombust
{
	// ** Event
	public static void onEvent(EntityCombustEvent event)
	{
		// ** Cancel Event
		event.setCancelled(true);

		// ** Return
		return;
	}
}