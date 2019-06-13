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
		
		// ** JoinMessage
		PlayerQuit.sendQuitMessage(player, event);
		
		// ** Return
		return;
	}
	
	// ** sendQuitMessage
	public static void sendQuitMessage(Player player, PlayerQuitEvent event)
	{
		// ** Null Message, Broadcasting by ourself
		event.setQuitMessage(null);
		
		// ** Name
		String pName = player.getName();
		
		// ** Op Join
		if(player.isOp()) { Utils.broadcastMessage(Texts.player_quit_message_op.replace("%player%", pName)); }
		
		// ** Player Join
		else { Utils.broadcastMessage(Texts.player_quit_message.replace("%player%", pName)); }
		
		// ** Return
		return;
	}
}
