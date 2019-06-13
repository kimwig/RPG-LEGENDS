package rpg.dafney.legends.events.server;

import org.bukkit.ChatColor;
import org.bukkit.event.server.ServerListPingEvent;

import rpg.dafney.legends.functions.Texts;

public class ServerListPing
{
	// * onEvent
	public static void onEvent(ServerListPingEvent event)
	{
		// ** Motd
		event.setMotd(Utils.colorTranslate(Texts.server_motd));
		
		// ** Return
		return;
	}
}
