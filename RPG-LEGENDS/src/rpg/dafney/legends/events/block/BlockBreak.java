package rpg.dafney.legends.events.block;

import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak
{
	// ** Event
	public static void onEvent(BlockBreakEvent event)
	{
		// ** Player
		Player player = event.getPlayer();
		
		// ** Not Allowed
		if(player.isOp() == false) { event.setCancelled(true); }
		
		// ** Return
		return;
	}
}