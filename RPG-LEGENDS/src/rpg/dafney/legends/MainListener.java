package rpg.dafney.legends;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerListPingEvent;

import rpg.dafney.legends.events.block.BlockBreak;
import rpg.dafney.legends.events.block.BlockPlace;
import rpg.dafney.legends.events.block.LeavesDecay;
import rpg.dafney.legends.events.entity.EntityDamage;
import rpg.dafney.legends.events.entity.FoodLevelChange;
import rpg.dafney.legends.events.inventory.InventoryDrag;
import rpg.dafney.legends.events.player.PlayerDropItem;
import rpg.dafney.legends.events.player.PlayerJoin;
import rpg.dafney.legends.events.player.PlayerQuit;
import rpg.dafney.legends.events.server.ServerListPing;

public class MainListener implements Listener
{
	@EventHandler
	void onEvent(BlockBreakEvent event) { BlockBreak.onEvent(event); }

	@EventHandler
	void onEvent(BlockPlaceEvent event) { BlockPlace.onEvent(event); }

	@EventHandler
	void onEvent(LeavesDecayEvent event) { LeavesDecay.onEvent(event); }

	@EventHandler
	void onEvent(EntityDamageEvent event) { EntityDamage.onEvent(event); }

	@EventHandler
	void onEvent(FoodLevelChangeEvent event) { FoodLevelChange.onEvent(event); }

	@EventHandler
	void onEvent(InventoryDragEvent event) { InventoryDrag.onEvent(event); }

	@EventHandler
	void onEvent(PlayerDropItemEvent event) { PlayerDropItem.onEvent(event); }

	@EventHandler
	void onEvent(PlayerJoinEvent event) { PlayerJoin.onEvent(event); }

	@EventHandler
	void onEvent(PlayerQuitEvent event) { PlayerQuit.onEvent(event); }

	@EventHandler
	void onEvent(ServerListPingEvent event) { ServerListPing.onEvent(event); }
}
