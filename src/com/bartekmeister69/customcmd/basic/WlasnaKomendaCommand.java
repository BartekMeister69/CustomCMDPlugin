package com.bartekmeister69.customcmd.basic;

import static com.bartekmeister69.customcmd.helper.ColorHelper.colored;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.ArrayList;
import java.util.List;

public class WlasnaKomendaCommand extends BukkitCommand {

    protected List<String> command;

    public WlasnaKomendaCommand(String name, List<String> command) {
        super(name, "Komenda "+name, "/"+name, new ArrayList<>());
        this.command = new ArrayList<>();
        for (String a : command) {
            this.command.add(colored(a));
        }
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] strings) {
        for (String a : this.command) {
            sender.sendMessage(a);
        }
        return true;
    }
}
