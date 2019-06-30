package rpg.dafney.legends.events.player;

import org.bukkit.event.player.PlayerVelocityEvent;

public class PlayerVelocity
{
	// ** Event
	public static void onEvent(PlayerVelocityEvent event)
	{
		// ** Cancel Event
		event.setCancelled(true);
	
		// ** Return
		return;
	}
}