package io.github.daschnerj.antiNetherRoof;

import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class RoofListener implements Listener
{
	
	public final AntiNetherRoof plugin;
	
	public RoofListener(AntiNetherRoof instance) 
    {
        plugin = instance;
    }

	@EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent e)
    {
		if(!e.getPlayer().isOp() || !e.getPlayer().hasPermission("antinetherroof.bypass"))
		{
			if(e.getPlayer().getWorld().getEnvironment() == Environment.NETHER)
			{
				if(e.getPlayer().getLocation().getY() >= 128)
				{
					e.getPlayer().setHealth(0);
				}
			}
		}	
    }

	
}
