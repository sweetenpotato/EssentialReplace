package io.github.sweetenpotato;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandEs implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {// player
			return true;
		}
		
		else { // console
			if (args.length < 1) { // es ��ɾ� �ڿ� ���� X
				sender.sendMessage("------------[EssentialReplace]------------");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷����� �̸� : EssentialReplace");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷����� ���� : 1.0.0");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "����ũ����Ʈ ���� : 1.15.2");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "������ : sweetenpotato");
				sender.sendMessage(
						Prefix.dos_prefix + Prefix.dos_info + "EssentialReplace�� ��ɾ� ����� ���÷��� /es help�� �Է��� �ּ���.");
			} else {// es ��ɾ� �ڿ� ���� O
				if (args.length >= 2) { // �μ��� �ʹ� ���� ���
					sender.sendMessage(
							Prefix.chat_prefix + Prefix.chat_error + "�μ��� �ʹ� �����ϴ�. /es help�� �Է��Ͽ� ��ɾ Ȯ���ϼ���.");
					return true;
				}
				
				else { // �μ��� �ϳ�
					if (args[0].equalsIgnoreCase("api")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "����ũ����Ʈ ���� : 1.15.2");
						return true;
					} else if (args[0].equalsIgnoreCase("author")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "������ : sweetenpotato");
						return true;
					} else if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage("------------[EssentialReplace]------------");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "/es : EssentialReplace�� ������ ǥ���մϴ�.");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info
								+ "/es api : EssentialReplace�� ���� ������ �����ϴ� ����ũ����Ʈ ������ ǥ���մϴ�.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es author : EssentialReplace�� ���ڸ� ǥ���մϴ�.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es help : EssentialReplace�� ���� ������ ǥ���մϴ�.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es info : EssentialReplace�� ������ ǥ���մϴ�.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es name : EssentialReplace�� �̸��� ǥ���մϴ�.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es off : EssentialReplace�� ��ɾ� �ν��� ���ϴ�.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es on : EssentialReplace�� ��ɾ� �ν��� �մϴ�.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es plversion : EssentialReplace�� ������ ǥ���մϴ�.");
						return true;
					} else if (args[0].equalsIgnoreCase("info")) {
						sender.sendMessage("------------[EssentialReplace]------------");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷����� �̸� : EssentialReplace");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷����� ���� : 1.0.0");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "����ũ����Ʈ ���� : 1.15.2");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "������ : sweetenpotato");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info
								+ "EssentialReplace�� ��ɾ� ����� ���÷��� /es help�� �Է��� �ּ���.");
						return true;
					} else if (args[0].equalsIgnoreCase("name")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷����� �̸� : EssentialReplace");
						return true;
					} else if (args[0].equalsIgnoreCase("plversion")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷����� ���� : 1.0.0");
						return true;
					} else if (args[0].equalsIgnoreCase("off")) {
						if (Main.plugin_on == true) {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷������� ��ɾ� �ν� ����� �����մϴ�.");
							Main.plugin_on = false;
							return true;
						} else {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�̹� ��ɾ� �ν� ����� ����� �����Դϴ�.");
							return true;
						}
					} else if (args[0].equalsIgnoreCase("on")) {
						if (Main.plugin_on == false) {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�÷������� ��ɾ� �ν� ����� Ȱ��ȭ�մϴ�.");
							Main.plugin_on = true;
							return true;
						} else {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "�̹� ��ɾ� �ν� ����� Ȱ��ȭ�� �����Դϴ�.");
							return true;
						}
					} else {
						sender.sendMessage(Prefix.chat_prefix + Prefix.chat_error
								+ "���� ���� ��ɾ �Է��ϼ̽��ϴ�. /es help�� �Է��Ͽ� ��ɾ Ȯ���ϼ���.");
						return true;
					}
				}
			}
		}
		return false;
	}
}
