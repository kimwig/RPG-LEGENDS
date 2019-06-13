package rpg.dafney.legends.events.player;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

import rpg.dafney.legends.functions.Texts;
import rpg.dafney.legends.utils.Utils;

public class PlayerJoin
{
	// ** Event
	public static void onEvent(PlayerJoinEvent event)
	{
		// ** Player
		Player player = event.getPlayer();

		// ** Display name
		String displayname = player.getDisplayName();
		
		// ** Join Message
		if(player.isOp() == false) { event.setJoinMessage(Utils.color(Texts.join_message.replace("%player%", displayname))); }
		else { event.setJoinMessage(""); }
		
		// ** Return
		return;
	}
}