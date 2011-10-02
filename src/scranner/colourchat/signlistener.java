package scranner.colourchat;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.SignChangeEvent;

public class signlistener extends BlockListener
{
	public signlistener(colourchat instance)
	{
	}

	public void onSignChange(SignChangeEvent event)
	{
		
		Player player = event.getPlayer();

		if(player.hasPermission("creativecolours.sign"))
		{
		
		String[] lines = event.getLines();

		int i = 0;

		for (String line : lines)
			{
				event.setLine(i++, line.replaceAll("&([0-9a-fA-F])", "§$1"));
			}
		}
		else
		{
			player.sendMessage(ChatColor.RED + "You dont have permission to place coloured signs!");			
		}
	}
}