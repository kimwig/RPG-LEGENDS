package rpg.dafney.legends.data;

import java.util.HashMap;
import java.util.UUID;

public class Data
{
	// ** Player Game
	public static HashMap<UUID, Long> playerCoins = new HashMap<UUID, Long>();
	
	// ** Write
	public static void setPlayerCoins(UUID pUUID, long pCoins)
	{
		// ** Not Less than 0
		if(pCoins < 0) { pCoins = 0; }
		
		// ** Not Larger than MAX
		if(pCoins > Long.MAX_VALUE) { pCoins = Long.MAX_VALUE; }
		
		// ** Save
		Data.playerCoins.put(pUUID, pCoins);
	}
}