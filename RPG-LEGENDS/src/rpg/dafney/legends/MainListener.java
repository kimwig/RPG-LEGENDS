package rpg.dafney.legends;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.server.ServerListPingEvent;

import rpg.dafney.legends.events.block.BlockBreak;
import rpg.dafney.legends.events.block.BlockPlace;
import rpg.dafney.legends.events.server.ServerListPing;


public class MainListener implements Listener
{
	@EventHandler
	void onEvent(BlockBreakEvent event) { BlockBreak.onEvent(event); return; }
	
	@EventHandler
	void onEvent(BlockPlaceEvent event) { BlockPlace.onEvent(event); return; }
	
	@EventHandler
	void onEvent(ServerListPingEvent event) { ServerListPing.onEvent(event); }
}