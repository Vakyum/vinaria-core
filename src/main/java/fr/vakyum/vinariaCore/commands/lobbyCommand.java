package fr.vakyum.vinariaCore.commands;

import fr.vakyum.vinariaCore.VinariaCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class lobbyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        try {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(b);

            out.writeUTF("Connect");
            out.writeUTF("lobby");

            player.sendPluginMessage(
                    VinariaCore.getInstance(),
                    "BungeeCord",
                    b.toByteArray()
            );

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}
