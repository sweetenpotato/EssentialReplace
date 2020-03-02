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
	
	//���� ����ȭ
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

	//�÷��̾� ä�� �󿡼�
	String chat_prefix = aqua + "[EssentialReplace] " + "";
	String chat_info = yellow + "[Info] " + "";
	String chat_error = dark_red + "[Error] " + red + "";
	String chat_warning = dark_red + "[Warning] " + red + "";
	String chat_plname = green + pdFile.getName() + "";
	String chat_plvers = green + " version : " + pdFile.getVersion() + "";
	String chat_plinfo = chat_plname + chat_plvers + "";

	//�ܼ� â����
	String dos_prefix = "[EssentialReplace] ";
	String dos_info = "[Info] ";
	String dos_error = "[Error] ";
	String dos_warning = "[Warning] ";
	String dos_plname = pdFile.getName() + "";
	String dos_plvers = " version : " + pdFile.getVersion() + "";
	String dos_plinfo = dos_plname + dos_plvers + "";
	
	@Override
	public void onEnable() {
		console(dos_prefix + dos_info + dos_plinfo + "�� Ȱ��ȭ�Ǿ����ϴ�.");
	}
	
	@Override
	public void onDisable() {
		console(dos_prefix + dos_info + dos_plinfo + "�� ��Ȱ��ȭ�Ǿ����ϴ�.");
	}
	
	public void console(String msg) {
		getLogger().info(msg);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("spawn")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.teleport(player.getWorld().getSpawnLocation());
				player.sendMessage(chat_prefix + green + "�������� �̵��Ͽ����ϴ�.");
			}
			else {
				sender.sendMessage(dos_prefix + "�� ���ɾ�� �ֿܼ����� ����� �� ���� ���ɾ��Դϴ�.");
			}
			return true;
		}
		return false;
	}
}