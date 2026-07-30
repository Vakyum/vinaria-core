package fr.vakyum.vinariaCore;

import fr.vakyum.vinariaCore.commands.lobbyCommand;
import fr.vakyum.vinariaCore.listeners.PlayerListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class VinariaCore extends JavaPlugin {

    private static VinariaCore instance;

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("VinariaCore OK !");

        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

        getCommand("lobby").setExecutor(new lobbyCommand());

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerListeners(), this);

    }

    public static VinariaCore getInstance() {
        return instance;
    }
}
