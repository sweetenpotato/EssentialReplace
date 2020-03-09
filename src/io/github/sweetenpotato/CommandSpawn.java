package io.github.sweetenpotato;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			if (args.length <1) {
				sender.sendMessage(Prefix.chat_prefix + Prefix.green + "스폰으로 이동하였습니다.");
			}
			else {
				sender.sendMessage(Prefix.chat_prefix + Prefix.chat_error + "명령어의 인수가 너무 많습니다!" + Prefix.chat_info + "사용법 : /spawn");
			}
			return true;
		}
		else {
			sender.sendMessage(Prefix.dos_prefix + "이 명령어는 콘솔에서는 사용할 수 없는 명령어입니다.");
			return true;
		}
	}

}
