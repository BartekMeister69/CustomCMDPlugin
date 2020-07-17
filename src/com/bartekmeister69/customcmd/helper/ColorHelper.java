package com.bartekmeister69.customcmd.helper;

import org.bukkit.ChatColor;

public class ColorHelper {

    public static String colored(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
