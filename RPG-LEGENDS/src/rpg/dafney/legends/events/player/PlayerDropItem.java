package rpg.dafney.legends.events.player;

import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDropItem
{
	// ** Event
	public static void onEvent(PlayerDropItemEvent event)
	{
		// ** Cancel Event
		event.setCancelled(true);
		
		// ** Return
		return;
	}
}