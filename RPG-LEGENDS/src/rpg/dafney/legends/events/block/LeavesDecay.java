package rpg.dafney.legends.events.block;

import org.bukkit.event.block.LeavesDecayEvent;

public class LeavesDecay
{
	// ** Event
	public static void onEvent(LeavesDecayEvent event)
	{
		// ** Cancel event
		event.setCancelled(true);

		// ** Return
		return;
	}
}