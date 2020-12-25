package com.pepe.ppride;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class eRideEntity implements Listener {

    @EventHandler
    public void onEntityClick(PlayerInteractEntityEvent e){
        e.getRightClicked().addPassenger(e.getPlayer());
    }
}
