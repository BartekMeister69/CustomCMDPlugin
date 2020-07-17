package com.bartekmeister69.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.plugin.Plugin;

import com.bartekmeister69.customcmd.Main;
import com.bartekmeister69.customcmd.basic.WlasnaKomendaCommand;

import java.util.List;

public class Config {

    private static Plugin plugin = Main.getPlugin(Main.class);

    static {
        FileConfiguration config = plugin.getConfig();

        for(String c : config.getConfigurationSection("commands").getKeys(false)) {
            String name = c;
            List<String> content = config.getStringList("commands."+c);
            ((CraftServer) plugin.getServer()).getCommandMap().register(name, new WlasnaKomendaCommand(name,content));
        }
    }

}
