package fr.arcane.realphys;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.FallingBlock;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.util.Vector;

public class RealPhysListeners implements Listener {

	
	@SuppressWarnings({ "deprecation"})
	@EventHandler
	public void OnExplode(EntityExplodeEvent e) {
		
		Random random = new Random();
		
		Vector v = new Vector();
		
		for (Block b : e.blockList()) {
			if (b.getType() == Material.AIR) {
				return;
			}
			
			int randomx =(random.nextInt(4)-2);
			int randomy =(random.nextInt(4)-2);
			
			v.setY(0.5f);
			v.setX(randomx);
			v.setZ(randomy);
			
			BlockState saved = b.getState();
			b.setType(Material.AIR);
			
			FallingBlock fallingb = Bukkit.getWorld("world").spawnFallingBlock(saved.getLocation(), saved.getType(), saved.getData().getData());
			fallingb.setVelocity(v);
			
		}
	}
	
	
	
	@SuppressWarnings({ "unused", "deprecation" })
	@EventHandler
	public void onPlace(BlockPlaceEvent event) {
		
		Location locevent = event.getBlockPlaced().getLocation();
		Block bevent = event.getBlock();
		Material eventbm = event.getBlock().getType();
		Location downloc = new Location(locevent.getWorld(), locevent.getX(), locevent.getY() - 1, locevent.getZ());
		Block downblock = downloc.getBlock();
		Material downblockm = downblock.getType();
		BlockState save = bevent.getState();
		Vector fall = new Vector();
		fall.setY(0);
		fall.setX(0);
		fall.setY(0);
		
		
		if (bevent.getType() == Material.DIAMOND_BLOCK) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		
		if (bevent.getType() == Material.GLASS) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		
		if (bevent.getType() == Material.STONE) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		
		if (bevent.getType() == Material.STAINED_GLASS) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		
		if (bevent.getType() == Material.WOOD_STAIRS) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		
		if (bevent.getType() == Material.WOOD || bevent.getType() == Material.WOOD_STAIRS || bevent.getType() == Material.WOOD_DOUBLE_STEP || bevent.getType() == Material.WOOD_STEP  ) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		
		if (bevent.getType() == Material.LOG) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.STAINED_CLAY) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.STAINED_GLASS_PANE) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.WOOL) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.BRICK || bevent.getType() == Material.BRICK_STAIRS) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.STEP || bevent.getType() == Material.DOUBLE_STEP ) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.COBBLESTONE || bevent.getType() == Material.COBBLESTONE_STAIRS || bevent.getType() == Material.COBBLE_WALL || bevent.getType() == Material.MOSSY_COBBLESTONE ) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.SPRUCE_WOOD_STAIRS || bevent.getType() == Material.SPRUCE_FENCE || bevent.getType() == Material.SPRUCE_FENCE_GATE ) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.BIRCH_WOOD_STAIRS || bevent.getType() == Material.BIRCH_FENCE || bevent.getType() == Material.BIRCH_FENCE_GATE ) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		

		if (bevent.getType() == Material.DARK_OAK_STAIRS || bevent.getType() == Material.DARK_OAK_FENCE || bevent.getType() == Material.DARK_OAK_FENCE_GATE ) {
			if (downblock.getType() == Material.AIR) {
				
				bevent.setType(Material.AIR);
				
				FallingBlock fallingblock = Bukkit.getWorld("world").spawnFallingBlock(save.getLocation(), save.getType(), save.getData().getData());
				fallingblock.setVelocity(fall);
			
			}
		}
		
		
	}
}
