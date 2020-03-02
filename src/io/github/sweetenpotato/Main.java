package io.github.sweetenpotato;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;

	PluginDescriptionFile pdFile = this.getDescription();

	// 색깔 간략화
	String white = ChatColor.WHITE + "";
	String red = ChatColor.RED + "";
	String dark_red = ChatColor.DARK_RED + "";
	String gold = ChatColor.GOLD + "";
	String yellow = ChatColor.YELLOW + "";
	String green = ChatColor.GREEN + "";
	String dark_green = ChatColor.DARK_GREEN + "";
	String aqua = ChatColor.AQUA + "";
	String blue = ChatColor.BLUE + "";
	String dark_blue = ChatColor.DARK_BLUE + "";
	String gray = ChatColor.GRAY + "";

	// 플레이어 채팅 상에서
	String chat_prefix = aqua + "[EssentialReplace] " + "";
	String chat_info = yellow + "[Info] " + "";
	String chat_error = dark_red + "[Error] " + red + "";
	String chat_warning = dark_red + "[Warning] " + red + "";
	String chat_plname = green + pdFile.getName() + "";
	String chat_plvers = green + " version : " + pdFile.getVersion() + "";
	String chat_plinfo = chat_plname + chat_plvers + "";

	// 콘솔 창에서
	String dos_prefix = "[EssentialReplace] ";
	String dos_info = "[Info] ";
	String dos_error = "[Error] ";
	String dos_warning = "[Warning] ";
	String dos_plname = pdFile.getName() + "";
	String dos_plvers = " version : " + pdFile.getVersion() + "";
	String dos_plinfo = dos_plname + dos_plvers + "";

	@Override
	public void onEnable() {
		console(dos_prefix + dos_info + dos_plinfo + "가 활성화되었습니다.");
		getCommand("spawn").setExecutor(new CommandSpawn());
	}

	@Override
	public void onDisable() {
		console(dos_prefix + dos_info + dos_plinfo + "가 비활성화되었습니다.");
	}

	public void console(String msg) {
		getLogger().info(msg);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("es")) {
			if (sender instanceof Player) {
				if (args.length < 1) {
					sender.sendMessage(
							yellow + "------------" + green + "[EssentialReplace]" + yellow + "------------");
					sender.sendMessage(chat_prefix + chat_info + aqua + "Plugin Name : " + pdFile.getName());
					sender.sendMessage(chat_prefix + chat_info + aqua + "Plugin Version : " + pdFile.getVersion());
					sender.sendMessage(chat_prefix + chat_info + aqua + "Minecraft Version : " + pdFile.getAPIVersion());
					sender.sendMessage(chat_prefix + chat_info + aqua + "Author : " + pdFile.getAuthors());
					sender.sendMessage(chat_prefix + chat_info + aqua + "Please type " + yellow + "/es help" + "");
				}
				return true;
			} else {

			}
		}
		return false;
	}
}
