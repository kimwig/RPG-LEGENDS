package rpg.dafney.legends.events.block;

import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace
{
	// ** Event
	public static void onEvent(BlockPlaceEvent event)
	{
		// ** Player
		Player player = event.getPlayer();
		
		// ** Not Allowed
		if(player.isOp() == false) { event.setCancelled(true); }
		
		// ** Return
		return;
	}
}