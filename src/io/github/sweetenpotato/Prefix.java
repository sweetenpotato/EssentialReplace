package io.github.sweetenpotato;

import org.bukkit.ChatColor;

public class Prefix{
	
	
	//색깔 간략화
	public static String white = ChatColor.WHITE + "";
	public static String red = ChatColor.RED + "";
	public static String dark_red = ChatColor.DARK_RED + "";
	public static String gold = ChatColor.GOLD + "";
	public static String yellow = ChatColor.YELLOW + "";
	public static String green = ChatColor.GREEN + "";
	public static String dark_green = ChatColor.DARK_GREEN + "";
	public static String aqua = ChatColor.AQUA + "";
	public static String blue = ChatColor.BLUE + "";
	public static String dark_blue = ChatColor.DARK_BLUE + "";
	public static String gray = ChatColor.GRAY + "";

	//플레이어 채팅 상에서
	public static String chat_prefix = aqua + "[EssentialReplace] " + "";
	public static String chat_info = yellow + "[Info] " + "";
	public static String chat_error = dark_red + "[Error] " + red + "";
	public static String chat_warning = dark_red + "[Warning] " + red + "";
	
	//콘솔 창에서
	public static String dos_prefix = "[EssentialReplace] ";
	public static String dos_info = "[Info] ";
	public static String dos_error = "[Error] ";
	public static String dos_warning = "[Warning] ";
}