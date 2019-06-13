package rpg.dafney.legends.events.entity;

import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class EntityDamage
{
	// ** Event
	public static void onEvent(EntityDamageEvent event)
	{
		// ** Damage Cause
		DamageCause damageCause = event.getCause();
		
		// ** Cancel Fall Damage
		if(damageCause == DamageCause.FALL) { event.setCancelled(true); }

		// ** Cancel Starvation Damage
		if(damageCause == DamageCause.STARVATION) { event.setCancelled(true); }

		// ** Cancel Poison Damage
		if(damageCause == DamageCause.POISON) { event.setCancelled(true); }

		// ** Cancel Wither Damage
		if(damageCause == DamageCause.WITHER) { event.setCancelled(true); }

		// ** Return
		return;
	}
}