package io.github.sweetenpotato;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;

public class CommandEs implements CommandExecutor {

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
	String chat_plname = green + "EssentialReplace";
	String chat_plvers = green + "version : " + "1.0.0";
	String chat_plinfo = chat_plname + chat_plvers + "";

	// 콘솔 창에서
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
			if (args.length < 1) { // es 명령어 뒤에 인자 X
				sender.sendMessage("------------[EssentialReplace]------------");
				sender.sendMessage(dos_prefix + dos_info + "플러그인 이름 : EssentialReplace");
				sender.sendMessage(dos_prefix + dos_info + "플러그인 버전 : 1.0.0");
				sender.sendMessage(dos_prefix + dos_info + "마인크래프트 버전 : 1.15.2");
				sender.sendMessage(dos_prefix + dos_info + "개발자 : sweetenpotato");
				sender.sendMessage(dos_prefix + dos_info + "EssentialReplace의 명령어 목록을 보시려면 /es help를 입력해 주세요.");
			} else {// es 명령어 뒤에 인자 O
				if (args.length >= 2) { // 인수가 너무 많을 경우
					sender.sendMessage(chat_prefix + chat_error + "인수가 너무 많습니다. /es help를 입력하여 명령어를 확인하세요.");
				} else { // 인수가 하나
					switch (args[0]) {
						case "api":
							sender.sendMessage(dos_prefix + dos_info + "마인크래프트 버전 : 1.15.2");
							break;
						case "author":
							sender.sendMessage(dos_prefix + dos_info + "개발자 : sweetenpotato");
							break;
						case "help":
							sender.sendMessage("------------[EssentialReplace]------------");
							sender.sendMessage(dos_prefix + dos_info + "/es : EssentialReplace의 정보를 표시합니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es api : EssentialReplace의 현재 버전이 지원하는 마인크래프트 버전을 표시합니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es author : EssentialReplace의 저자를 표시합니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es help : EssentialReplace에 대한 도움말을 표시합니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es info : EssentialReplace의 정보를 표시합니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es name : EssentialReplace의 이름을 표시합니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es off : EssentialReplace의 명령어 인식을 끕니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es on : EssentialReplace의 명령어 인식을 켭니다.");
							sender.sendMessage(dos_prefix + dos_info + "/es plversion : EssentialReplace의 버전을 표시합니다.");
							break;
						case "info":
							sender.sendMessage("------------[EssentialReplace]------------");
							sender.sendMessage(dos_prefix + dos_info + "플러그인 이름 : EssentialReplace");
							sender.sendMessage(dos_prefix + dos_info + "플러그인 버전 : 1.0.0");
							sender.sendMessage(dos_prefix + dos_info + "마인크래프트 버전 : 1.15.2");
							sender.sendMessage(dos_prefix + dos_info + "개발자 : sweetenpotato");
							sender.sendMessage(dos_prefix + dos_info + "EssentialReplace의 명령어 목록을 보시려면 /es help를 입력해 주세요.");
							break;
						case "name":
							sender.sendMessage(dos_prefix + dos_info + "플러그인 이름 : EssentialReplace");
							break;
						case "plversion":
							sender.sendMessage(dos_prefix + dos_info + "플러그인 버전 : 1.0.0");
							break;
						case "off":
							break;
						default:
							sender.sendMessage(chat_prefix + chat_error + "옳지 않은 명령어를 입력하셨습니다. /es help를 입력하여 명령어를 확인하세요.");
							break;
					}
				}
			}
		}
		return false;
	}

}
