package io.github.sweetenpotato;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;

public class CommandEs implements CommandExecutor {

	// ���� ����ȭ
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

	// �÷��̾� ä�� �󿡼�
	String chat_prefix = aqua + "[EssentialReplace] " + "";
	String chat_info = yellow + "[Info] " + "";
	String chat_error = dark_red + "[Error] " + red + "";
	String chat_warning = dark_red + "[Warning] " + red + "";
	String chat_plname = green + "EssentialReplace";
	String chat_plvers = green + "version : " + "1.0.0";
	String chat_plinfo = chat_plname + chat_plvers + "";

	// �ܼ� â����
	String dos_prefix = "[EssentialReplace] ";
	String dos_info = "[Info] ";
	String dos_error = "[Error] ";
	String dos_warning = "[Warning] ";
	String dos_plname = "EssentialReplace ";
	String dos_plvers = "version : 1.0.0 ";
	String dos_plinfo = dos_plname + dos_plvers + "";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {// player

		} else { // console
			if (args.length < 1) { // es ��ɾ� �ڿ� ���� X
				sender.sendMessage("------------[EssentialReplace]------------");
				sender.sendMessage(dos_prefix + dos_info + "�÷����� �̸� : EssentialReplace");
				sender.sendMessage(dos_prefix + dos_info + "�÷����� ���� : 1.0.0");
				sender.sendMessage(dos_prefix + dos_info + "����ũ����Ʈ ���� : 1.15.2");
				sender.sendMessage(dos_prefix + dos_info + "������ : sweetenpotato");
				sender.sendMessage(dos_prefix + dos_info + "EssentialReplace�� ��ɾ� ����� ���÷��� /es help�� �Է��� �ּ���.");
			} else {// es ��ɾ� �ڿ� ���� O
				if (args.length >= 2) { // �μ��� �ʹ� ���� ���
					sender.sendMessage(chat_prefix + chat_error + "�μ��� �ʹ� �����ϴ�. /es help�� �Է��Ͽ� ��ɾ Ȯ���ϼ���.");
				} else { // �μ��� �ϳ�
					switch (args[0]) {
						case "api":
							sender.sendMessage(dos_prefix + dos_info + "����ũ����Ʈ ���� : 1.15.2");
							break;
						case "author":
							sender.sendMessage(dos_prefix + dos_info + "������ : sweetenpotato");
							break;
						case "help":
							sender.sendMessage("------------[EssentialReplace]------------");
							sender.sendMessage(dos_prefix + dos_info + "/es : EssentialReplace�� ������ ǥ���մϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es api : EssentialReplace�� ���� ������ �����ϴ� ����ũ����Ʈ ������ ǥ���մϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es author : EssentialReplace�� ���ڸ� ǥ���մϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es help : EssentialReplace�� ���� ������ ǥ���մϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es info : EssentialReplace�� ������ ǥ���մϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es name : EssentialReplace�� �̸��� ǥ���մϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es off : EssentialReplace�� ��ɾ� �ν��� ���ϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es on : EssentialReplace�� ��ɾ� �ν��� �մϴ�.");
							sender.sendMessage(dos_prefix + dos_info + "/es plversion : EssentialReplace�� ������ ǥ���մϴ�.");
							break;
						case "info":
							sender.sendMessage("------------[EssentialReplace]------------");
							sender.sendMessage(dos_prefix + dos_info + "�÷����� �̸� : EssentialReplace");
							sender.sendMessage(dos_prefix + dos_info + "�÷����� ���� : 1.0.0");
							sender.sendMessage(dos_prefix + dos_info + "����ũ����Ʈ ���� : 1.15.2");
							sender.sendMessage(dos_prefix + dos_info + "������ : sweetenpotato");
							sender.sendMessage(dos_prefix + dos_info + "EssentialReplace�� ��ɾ� ����� ���÷��� /es help�� �Է��� �ּ���.");
							break;
						case "name":
							sender.sendMessage(dos_prefix + dos_info + "�÷����� �̸� : EssentialReplace");
							break;
						case "plversion":
							sender.sendMessage(dos_prefix + dos_info + "�÷����� ���� : 1.0.0");
							break;
						case "off":
							break;
						default:
							sender.sendMessage(chat_prefix + chat_error + "���� ���� ��ɾ �Է��ϼ̽��ϴ�. /es help�� �Է��Ͽ� ��ɾ Ȯ���ϼ���.");
							break;
					}
				}
			}
		}
		return false;
	}

}
