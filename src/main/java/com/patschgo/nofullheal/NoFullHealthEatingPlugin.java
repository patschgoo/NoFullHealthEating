package com.patschgo.nofullheal;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoFullHealthEatingPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("NoFullHealthEating enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("NoFullHealthEating disabled");
    }

    @EventHandler
    public void onPlayerItemConsume(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();

        if (player.getHealth() >= player.getMaxHealth()) {
            event.setCancelled(true);
            player.sendMessage("You are already at full health.");
        }
    }
}
