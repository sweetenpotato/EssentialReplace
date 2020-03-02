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
		if (plugin_on == true) {
			getCommand("spawn").setExecutor(new CommandSpawn());
		}
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
					sender.sendMessage(chat_prefix + chat_info + blue + "플러그인 이름 : " + pdFile.getName());
					sender.sendMessage(chat_prefix + chat_info + blue + "플러그인 버전 : " + pdFile.getVersion());
					sender.sendMessage(chat_prefix + chat_info + blue + "마인크래프트 버전 : " + pdFile.getAPIVersion());
					sender.sendMessage(chat_prefix + chat_info + blue + "개발자 : " + pdFile.getAuthors());
					sender.sendMessage(chat_prefix + chat_info + blue + "EssentialReplace의 명령어 목록을 보시려면 " + yellow
							+ "/es help" + blue + "를 입력해 주세요.");
				} else {
					if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage(
								yellow + "------------" + green + "[EssentialReplace]" + yellow + "------------");
						sender.sendMessage(chat_prefix + chat_info + blue + "/es reload" + green + " : 플러그인을 다시 불러옵니다." );
						sender.sendMessage(chat_prefix + chat_info + blue + "/es off" + green + " : 명령어를 인식하지 않게 합니다.");
						sender.sendMessage(chat_prefix + chat_info + blue + "/es on" + green + " : 명령어를 인식하게 합니다.");
						sender.sendMessage(chat_prefix + chat_info + blue + "/es info" + green + " : EssentialReplace의 정보를 표시합니다.");
						sender.sendMessage(chat_prefix + chat_info + blue + "/spawn" + green + " : 스폰으로 이동합니다.");
					}
					else {
						sender.sendMessage(chat_prefix + chat_error + "올바른 명령어가 아닙니다. /es help를 입력하여 명령어를 확인하세요.");
					}
				}
				return true;
			} //입력한 사람이 player인 경우
			
			else {
				if (args.length < 1) {
					sender.sendMessage("------------[EssentialReplace]------------");
					sender.sendMessage(dos_prefix + dos_info + "플러그인 이름 : " + pdFile.getName());
					sender.sendMessage(dos_prefix + dos_info + "플러그인 버전 : " + pdFile.getVersion());
					sender.sendMessage(dos_prefix + dos_info + "마인크래프트 버전 : " + pdFile.getAPIVersion());
					sender.sendMessage(dos_prefix + dos_info + "개발자 : " + pdFile.getAuthors());
					sender.sendMessage(dos_prefix + dos_info + "EssentialReplace의 명령어 목록을 보시려면 /es help를 입력해 주세요.");
				} else {
					if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage("------------[EssentialReplace]------------");
						sender.sendMessage(dos_prefix + dos_info + "/es reload : 플러그인을 다시 불러옵니다." );
						sender.sendMessage(dos_prefix + dos_info + "/es off : 명령어를 인식하지 않게 합니다.");
						sender.sendMessage(dos_prefix + dos_info + "/es on : 명령어를 인식하게 합니다.");
						sender.sendMessage(dos_prefix + dos_info + "/es info : EssentialReplace의 정보를 표시합니다.");
						sender.sendMessage(dos_prefix + dos_info + "/spawn : 스폰으로 이동합니다.");
					}
					else {
						sender.sendMessage(dos_prefix + dos_error + "올바른 명령어가 아닙니다. /es help를 입력하여 명령어를 확인하세요.");
					}
				}
				return true;
			}
		}
		return false;
	}
}
