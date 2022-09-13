package fr.arcane.realphys;

import org.bukkit.plugin.java.JavaPlugin;

public class RealPhysics extends JavaPlugin{
		
	@Override
	public void onEnable() {
		System.out.println("[RealisticPhysics] Fall !!");
		getServer().getPluginManager().registerEvents(new RealPhysListeners(), this);
		
	}
	
}
