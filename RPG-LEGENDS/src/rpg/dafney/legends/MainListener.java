package rpg.dafney.legends;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import rpg.dafney.legends.events.server.ServerListPing;


public class MainListener implements Listener
{
	@EventHandler
	void onEvent(ServerListPingEvent event) { ServerListPing.onEvent(event); }
}