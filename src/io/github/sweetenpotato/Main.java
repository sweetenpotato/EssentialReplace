package io.github.sweetenpotato;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	PluginDescriptionFile pdFile = this.getDescription();
	String dos_plname = pdFile.getName() + "";
	String dos_plvers = " version : " + pdFile.getVersion() + "";
	String dos_plinfo = dos_plname + dos_plvers + "";
	String chat_plname = Prefix.green + pdFile.getName() + "";
	String chat_plvers = Prefix.green + " version : " + pdFile.getVersion() + "";
	String chat_plinfo = chat_plname + chat_plvers + "";

	public static boolean plugin_on = true;
	public final Logger logger = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {
		console(Prefix.dos_prefix + Prefix.dos_info + dos_plinfo + "가 활성화되었습니다.");
		getCommand("es").setExecutor(new CommandEs());
		if (plugin_on) {
			cmd();
		} else {
		}
	}

	@Override
	public void onDisable() {
		console(Prefix.dos_prefix + Prefix.dos_info + dos_plinfo + "가 비활성화되었습니다.");
	}

	public void console(String msg) {
		getLogger().info(msg);
	}

	public void cmd() {
		getCommand("spawn").setExecutor(new CommandSpawn());
	}

}
