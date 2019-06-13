package rpg.dafney.legends.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.bukkit.ChatColor;

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
}