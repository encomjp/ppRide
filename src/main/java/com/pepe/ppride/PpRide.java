package com.pepe.ppride;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PpRide extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[ppRide] - Successfully started");
        Bukkit.getPluginManager().registerEvents(new eRideEntity(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
