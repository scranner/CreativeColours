package scranner.colourchat;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class colourchat extends JavaPlugin
{
	private final signlistener signListener = new signlistener(this);
	Logger log = Logger.getLogger("Minecraft");

	public void onDisable()
	{
		this.log.info("|=================================|");
		this.log.info("|       Created By scranner       |");
		this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		this.log.info("|        Creative Colours         |");
		this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		this.log.info("|      --==  Disabled  ==--       |");
		this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		this.log.info("|              v1.3               |");
		this.log.info("|=================================|");
	}

	public void onEnable()
	{
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.SIGN_CHANGE, this.signListener, Event.Priority.Monitor, this);
		this.log.info("|================================|");
		this.log.info("|      Created By scranner       |");
		this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		this.log.info("|       Creative Colours         |");
		this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		this.log.info("|      --==  Enabled  ==--       |");
		this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		this.log.info("|              v1.3              |");
		this.log.info("|================================|");
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] split)
	{
		if (label.equals("colours")) {
			Player player = (Player)sender;
			player.sendMessage(ChatColor.RED + "Red");
			player.sendMessage(ChatColor.GREEN + "Green");
			player.sendMessage(ChatColor.YELLOW + "Yellow");
			player.sendMessage(ChatColor.LIGHT_PURPLE + "Pink");
			player.sendMessage(ChatColor.BLUE + "Blue");
			player.sendMessage(ChatColor.AQUA + "Cyan");
			player.sendMessage(ChatColor.GOLD + "Gold");
			player.sendMessage(ChatColor.DARK_PURPLE + "Purple");
			player.sendMessage(ChatColor.DARK_AQUA + "Teal");
			player.sendMessage(ChatColor.DARK_RED + "Crimson");
			player.sendMessage(ChatColor.BLACK + "Black");
			player.sendMessage(ChatColor.GRAY + "Gray");
			player.sendMessage(ChatColor.DARK_BLUE + "Navy");
		}
		else if (label.equals("colors")) {
			Player player = (Player)sender;
			player.sendMessage(ChatColor.RED + "Red");
			player.sendMessage(ChatColor.GREEN + "Green");
			player.sendMessage(ChatColor.YELLOW + "Yellow");
			player.sendMessage(ChatColor.LIGHT_PURPLE + "Pink");
			player.sendMessage(ChatColor.BLUE + "Blue");
			player.sendMessage(ChatColor.AQUA + "Cyan");
			player.sendMessage(ChatColor.GOLD + "Gold");
			player.sendMessage(ChatColor.DARK_PURPLE + "Purple");
			player.sendMessage(ChatColor.DARK_AQUA + "Teal");
			player.sendMessage(ChatColor.DARK_RED + "Crimson");
			player.sendMessage(ChatColor.BLACK + "Black");
			player.sendMessage(ChatColor.GRAY + "Gray");
			player.sendMessage(ChatColor.DARK_BLUE + "Navy");
		}
		else if (label.equals("red"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.RED + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("green"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.GREEN + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("yellow"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.YELLOW + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("pink"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.LIGHT_PURPLE + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("blue"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.BLUE + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("cyan"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.AQUA + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("gold"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.GOLD + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("purple"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.DARK_PURPLE + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("teal"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.DARK_AQUA + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("crimson"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.DARK_RED + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("black"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.BLACK + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("gray"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.GRAY + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}
		else if (label.equals("navy"))
		{
			if (split.length == 0)
			{
				sender.sendMessage(ChatColor.GRAY + "Syntax: /colour [msg]");
			}

			String Message = mergeArray(split, 0);
			Player player = (Player)sender;
			Server server = player.getServer();
			if (player.hasPermission("creativecolours.chat"))
				server.broadcastMessage("<" + player.getDisplayName() + ">" + ": " + ChatColor.DARK_BLUE + Message);
			else {
				sender.sendMessage(ChatColor.RED + "You have insufficient permissions to do this");
			}

		}

		return false;
	}

	public String mergeArray(String[] split, int StartFrom)
	{
		String Output = "";

		if (StartFrom < split.length)
		{
			Output = split[StartFrom];
			for (int i = StartFrom + 1; i < split.length; i++)
			{
				Output = Output + " " + split[i];
			}
		}
		return Output;
	}
}