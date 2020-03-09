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
				sender.sendMessage(Prefix.chat_prefix + Prefix.green + "�������� �̵��Ͽ����ϴ�.");
			}
			else {
				sender.sendMessage(Prefix.chat_prefix + Prefix.chat_error + "��ɾ��� �μ��� �ʹ� �����ϴ�!" + Prefix.chat_info + "���� : /spawn");
			}
			return true;
		}
		else {
			sender.sendMessage(Prefix.dos_prefix + "�� ��ɾ�� �ֿܼ����� ����� �� ���� ��ɾ��Դϴ�.");
			return true;
		}
	}

}
