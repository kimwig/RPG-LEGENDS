package rpg.dafney.legends.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.bukkit.ChatColor;

import rpg.dafney.legends.Main;

public class Utils
{
	// ** Translate Color
	public static final String color(String string)
	{
        return ChatColor.translateAlternateColorCodes('&', string);
    }

	// ** Number Format
	public static final String format(double value)
	{
		DecimalFormat formatter = new DecimalFormat("#,###");
		DecimalFormatSymbols symbol = DecimalFormatSymbols.getInstance();
		symbol.setGroupingSeparator(',');
		formatter.setDecimalFormatSymbols(symbol);
		return formatter.format(value);
	}
	
	// ** Broadcast a Message
	public static void broadcastMessage(String message)
	{
		// ** Message
		if(message == null || message.isEmpty()) { return; }
		
		// ** Color
		message = Utils.color(message);
		
		// ** Broadcast
		Main.server.broadcastMessage(message);
		
		// ** Return
		return;
	}
}