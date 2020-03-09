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
			if (args.length < 1) { // es 명령어 뒤에 인자 X
				sender.sendMessage("------------[EssentialReplace]------------");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인 이름 : EssentialReplace");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인 버전 : 1.0.0");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "마인크래프트 버전 : 1.15.2");
				sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "개발자 : sweetenpotato");
				sender.sendMessage(
						Prefix.dos_prefix + Prefix.dos_info + "EssentialReplace의 명령어 목록을 보시려면 /es help를 입력해 주세요.");
			} else {// es 명령어 뒤에 인자 O
				if (args.length >= 2) { // 인수가 너무 많을 경우
					sender.sendMessage(
							Prefix.chat_prefix + Prefix.chat_error + "인수가 너무 많습니다. /es help를 입력하여 명령어를 확인하세요.");
					return true;
				}
				
				else { // 인수가 하나
					if (args[0].equalsIgnoreCase("api")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "마인크래프트 버전 : 1.15.2");
						return true;
					} else if (args[0].equalsIgnoreCase("author")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "개발자 : sweetenpotato");
						return true;
					} else if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage("------------[EssentialReplace]------------");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "/es : EssentialReplace의 정보를 표시합니다.");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info
								+ "/es api : EssentialReplace의 현재 버전이 지원하는 마인크래프트 버전을 표시합니다.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es author : EssentialReplace의 저자를 표시합니다.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es help : EssentialReplace에 대한 도움말을 표시합니다.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es info : EssentialReplace의 정보를 표시합니다.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es name : EssentialReplace의 이름을 표시합니다.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es off : EssentialReplace의 명령어 인식을 끕니다.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es on : EssentialReplace의 명령어 인식을 켭니다.");
						sender.sendMessage(
								Prefix.dos_prefix + Prefix.dos_info + "/es plversion : EssentialReplace의 버전을 표시합니다.");
						return true;
					} else if (args[0].equalsIgnoreCase("info")) {
						sender.sendMessage("------------[EssentialReplace]------------");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인 이름 : EssentialReplace");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인 버전 : 1.0.0");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "마인크래프트 버전 : 1.15.2");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "개발자 : sweetenpotato");
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info
								+ "EssentialReplace의 명령어 목록을 보시려면 /es help를 입력해 주세요.");
						return true;
					} else if (args[0].equalsIgnoreCase("name")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인 이름 : EssentialReplace");
						return true;
					} else if (args[0].equalsIgnoreCase("plversion")) {
						sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인 버전 : 1.0.0");
						return true;
					} else if (args[0].equalsIgnoreCase("off")) {
						if (Main.plugin_on == true) {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인의 명령어 인식 기능을 종료합니다.");
							Main.plugin_on = false;
							return true;
						} else {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "이미 명령어 인식 기능이 종료된 상태입니다.");
							return true;
						}
					} else if (args[0].equalsIgnoreCase("on")) {
						if (Main.plugin_on == false) {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "플러그인의 명령어 인식 기능을 활성화합니다.");
							Main.plugin_on = true;
							return true;
						} else {
							sender.sendMessage(Prefix.dos_prefix + Prefix.dos_info + "이미 명령어 인식 기능이 활성화된 상태입니다.");
							return true;
						}
					} else {
						sender.sendMessage(Prefix.chat_prefix + Prefix.chat_error
								+ "옳지 않은 명령어를 입력하셨습니다. /es help를 입력하여 명령어를 확인하세요.");
						return true;
					}
				}
			}
		}
		return false;
	}
}
