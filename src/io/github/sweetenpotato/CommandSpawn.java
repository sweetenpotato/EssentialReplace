package io.github.sweetenpotato;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {
	
	//색깔 간략화
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

	//플레이어 채팅 상에서
	String chat_prefix = aqua + "[EssentialReplace] " + "";
	String chat_info = yellow + "[Info] " + "";
	String chat_error = dark_red + "[Error] " + red + "";
	String chat_warning = dark_red + "[Warning] " + red + "";

	//콘솔 창에서
	String dos_prefix = "[EssentialReplace] ";
	String dos_info = "[Info] ";
	String dos_error = "[Error] ";
	String dos_warning = "[Warning] ";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			if (args.length <1) {
				sender.sendMessage(chat_prefix + green + "스폰으로 이동하였습니다.");
			}
			else {
				sender.sendMessage(chat_prefix + chat_error + "명령어의 인수가 너무 많습니다!" + chat_info + "사용법 : /spawn");
			}
			return true;
		}
		else {
			sender.sendMessage(dos_prefix + "이 명령어는 콘솔에서는 사용할 수 없는 명령어입니다.");
			return true;
		}
	}

}
