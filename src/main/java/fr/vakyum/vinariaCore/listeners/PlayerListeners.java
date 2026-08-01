package fr.vakyum.vinariaCore.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListeners implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        Component component = Component.text("[", NamedTextColor.DARK_GRAY)
                .append(Component.text("+", NamedTextColor.GREEN, TextDecoration.BOLD))
                .append(Component.text("] " + player.getName(), NamedTextColor.DARK_GRAY));
        event.joinMessage(component);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        Component component = Component.text("[", NamedTextColor.DARK_GRAY)
                .append(Component.text("-", NamedTextColor.RED, TextDecoration.BOLD))
                .append(Component.text("] " + player.getName(), NamedTextColor.DARK_GRAY));
        event.quitMessage(component);
    }
}
