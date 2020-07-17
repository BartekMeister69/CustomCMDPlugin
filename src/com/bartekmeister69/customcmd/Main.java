package com.bartekmeister69.customcmd;

import org.bukkit.plugin.java.JavaPlugin;

import com.bartekmeister69.config.Config;




public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        new Config();
    }
}
