package rpg.dafney.legends.events.player;

import java.lang.reflect.Field;

import org.bukkit.craftbukkit.v1_14_R0.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

import net.minecraft.server.v1_14_R0.IChatBaseComponent;
import net.minecraft.server.v1_14_R0.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_14_R0.IChatBaseComponent.ChatSerializer;
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
		
		// ** Header & Footer
		sendHeaderFooter(player, Utils.colorTranslate(Texts.tablist_header), Utils.colorTranslate(Texts.tablist_footer));
		
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

	// ** sendHeaderFooter
	public static void sendHeaderFooter(Player player, String header, String footer)
	{
		// ** Tablist Header
		IChatBaseComponent tabHeader = ChatSerializer.a("{\"text\": \"" + header + "\"}");
		
		// ** Tablist Footer
		IChatBaseComponent tabFooter = ChatSerializer.a("{\"text\": \"" + footer + "\"}");
		
		PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();
		try {
			// ** Header field
			Field headerField = packet.getClass().getDeclaredField("a");
			headerField.setAccessible(true);
			headerField.set(packet, tabHeader);
			headerField.setAccessible(false);
			
			// ** Footer field
			Field footerField = packet.getClass().getDeclaredField("b");
			footerField.setAccessible(true);
			footerField.set(packet, tabFooter);
			footerField.setAccessible(false);
		} catch (Exception e) { e.printStackTrace(); }

		// ** Send Packet
		((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
	}
}
