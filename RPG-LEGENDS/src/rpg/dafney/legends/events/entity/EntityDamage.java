package rpg.dafney.legends.events.entity;

import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class EntityDamage
{
	// ** Event
	public static void onEvent(EntityDamageEvent event)
	{
		// ** Cancel Fall Damage
		if (event.getCause() == DamageCause.FALL) { event.setCancelled(true); }

		// ** Cancel Starvation Damage
		if (event.getCause() == DamageCause.STARVATION) { event.setCancelled(true); }

		// ** Cancel Poison Damage
		if (event.getCause() == DamageCause.POISON) { event.setCancelled(true); }

		// ** Cancel Wither Damage
		if (event.getCause() == DamageCause.WITHER) { event.setCancelled(true); }

		// ** Return
		return;
	}
}