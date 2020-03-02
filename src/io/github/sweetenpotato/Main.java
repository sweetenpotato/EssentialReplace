package io.github.sweetenpotato;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public boolean plugin_on = true;

	public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;

	PluginDescriptionFile pdFile = this.getDescription();

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
	String chat_plname = green + pdFile.getName() + "";
	String chat_plvers = green + " version : " + pdFile.getVersion() + "";
	String chat_plinfo = chat_plname + chat_plvers + "";

	// �ܼ� â����
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
		if (plugin_on == true) {
			getCommand("spawn").setExecutor(new CommandSpawn());
		}
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
		if (label.equalsIgnoreCase("es")) {
			if (sender instanceof Player) {
				if (args.length < 1) {
					sender.sendMessage(
							yellow + "------------" + green + "[EssentialReplace]" + yellow + "------------");
					sender.sendMessage(chat_prefix + chat_info + blue + "�÷����� �̸� : " + pdFile.getName());
					sender.sendMessage(chat_prefix + chat_info + blue + "�÷����� ���� : " + pdFile.getVersion());
					sender.sendMessage(chat_prefix + chat_info + blue + "����ũ����Ʈ ���� : " + pdFile.getAPIVersion());
					sender.sendMessage(chat_prefix + chat_info + blue + "������ : " + pdFile.getAuthors());
					sender.sendMessage(chat_prefix + chat_info + blue + "EssentialReplace�� ��ɾ� ����� ���÷��� " + yellow
							+ "/es help" + blue + "�� �Է��� �ּ���.");
				} else {
					if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage(
								yellow + "------------" + green + "[EssentialReplace]" + yellow + "------------");
						sender.sendMessage(chat_prefix + chat_info + blue + "/es reload" + green + " : �÷������� �ٽ� �ҷ��ɴϴ�." );
						sender.sendMessage(chat_prefix + chat_info + blue + "/es off" + green + " : ��ɾ �ν����� �ʰ� �մϴ�.");
						sender.sendMessage(chat_prefix + chat_info + blue + "/es on" + green + " : ��ɾ �ν��ϰ� �մϴ�.");
						sender.sendMessage(chat_prefix + chat_info + blue + "/es info" + green + " : EssentialReplace�� ������ ǥ���մϴ�.");
						sender.sendMessage(chat_prefix + chat_info + blue + "/spawn" + green + " : �������� �̵��մϴ�.");
					}
					else {
						sender.sendMessage(chat_prefix + chat_error + "�ùٸ� ��ɾ �ƴմϴ�. /es help�� �Է��Ͽ� ��ɾ Ȯ���ϼ���.");
					}
				}
				return true;
			} //�Է��� ����� player�� ���
			
			else {
				if (args.length < 1) {
					sender.sendMessage("------------[EssentialReplace]------------");
					sender.sendMessage(dos_prefix + dos_info + "�÷����� �̸� : " + pdFile.getName());
					sender.sendMessage(dos_prefix + dos_info + "�÷����� ���� : " + pdFile.getVersion());
					sender.sendMessage(dos_prefix + dos_info + "����ũ����Ʈ ���� : " + pdFile.getAPIVersion());
					sender.sendMessage(dos_prefix + dos_info + "������ : " + pdFile.getAuthors());
					sender.sendMessage(dos_prefix + dos_info + "EssentialReplace�� ��ɾ� ����� ���÷��� /es help�� �Է��� �ּ���.");
				} else {
					if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage("------------[EssentialReplace]------------");
						sender.sendMessage(dos_prefix + dos_info + "/es reload : �÷������� �ٽ� �ҷ��ɴϴ�." );
						sender.sendMessage(dos_prefix + dos_info + "/es off : ��ɾ �ν����� �ʰ� �մϴ�.");
						sender.sendMessage(dos_prefix + dos_info + "/es on : ��ɾ �ν��ϰ� �մϴ�.");
						sender.sendMessage(dos_prefix + dos_info + "/es info : EssentialReplace�� ������ ǥ���մϴ�.");
						sender.sendMessage(dos_prefix + dos_info + "/spawn : �������� �̵��մϴ�.");
					}
					else {
						sender.sendMessage(dos_prefix + dos_error + "�ùٸ� ��ɾ �ƴմϴ�. /es help�� �Է��Ͽ� ��ɾ Ȯ���ϼ���.");
					}
				}
				return true;
			}
		}
		return false;
	}
}
