package fr.vakyum.vinariaCore.commands;

import com.google.common.base.Joiner;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if(args.length == 0) {
        sender.sendMessage("§c/broadcast <message>");
        return false;
    } else {
        String message = Joiner.on(" ").join(args);
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§6§lVinaria Network §r§8>> %s".formatted(message));
        }

    }
    return true;

    }

}
