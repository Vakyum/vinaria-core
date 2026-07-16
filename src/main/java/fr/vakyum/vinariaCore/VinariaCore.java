package fr.vakyum.vinariaCore;

import fr.vakyum.vinariaCore.commands.lobbyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class VinariaCore extends JavaPlugin {

    private static VinariaCore instance;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

        getCommand("lobby").setExecutor(new lobbyCommand());
    }

    public static VinariaCore getInstance() {
        return instance;
    }
}
