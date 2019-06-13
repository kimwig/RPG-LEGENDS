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
		
		// ** JoinMessage
		PlayerJoin.sendJoinMessage(player, event);
		
		// ** Return
		return;
	}
	
	// ** sendJoinMessage
	public static void sendJoinMessage(Player player, PlayerJoinEvent event)
	{
		// ** Null Message, Broadcasting by ourself
		event.setJoinMessage(null);
		
		// ** Name
		String pName = player.getName();
		
		// ** Op Join
		if(player.isOp()) { Utils.broadcastMessage(Texts.player_join_message_op.replace("%player%", pName)); }
		
		// ** Player Join
		else { Utils.broadcastMessage(Texts.player_join_message.replace("%player%", pName)); }
		
		// ** Return
		return;
	}
}