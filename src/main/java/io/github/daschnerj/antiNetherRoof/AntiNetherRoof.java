package io.github.daschnerj.antiNetherRoof;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiNetherRoof extends JavaPlugin 
{
	
	private final RoofListener roofListener = new RoofListener(this);
	
	@Override
	public void onEnable() 
	{
		PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(roofListener, this);
		getLogger().info("onEnable has been invoked!");
	}
 
	@Override
	public void onDisable() 
	{
		getLogger().info("onDisable has been invoked!");
	}
}

