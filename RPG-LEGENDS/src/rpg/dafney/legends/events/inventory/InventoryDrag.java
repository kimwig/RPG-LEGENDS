package rpg.dafney.legends.events.inventory;

import org.bukkit.event.inventory.InventoryDragEvent;

public class InventoryDrag
{
	// ** Event
	public static void onEvent(InventoryDragEvent event)
	{
		// ** Cancel event
		event.setCancelled(true);

		// ** Return
		return;
	}
}