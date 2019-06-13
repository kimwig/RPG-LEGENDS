package rpg.dafney.legends.events.player;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

import rpg.dafney.legends.functions.Texts;
import rpg.dafney.legends.utils.Utils;

public class PlayerQuit
{
	// ** Event
	public static void onEvent(PlayerQuitEvent event)
	{
		// ** Player
		Player player = event.getPlayer();
		
		// ** Display name
		String displayname = player.getDisplayName();
		
		// ** Quit Message
		if(player.isOp() == false) { event.setQuitMessage(Utils.color(Texts.quit_message.replace("%player%", displayname))); }
		else { event.setQuitMessage(""); }
		
		// ** Return
		return;
	}
}