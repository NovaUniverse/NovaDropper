package net.novauniverse.games.dropper.game.config;

import org.bukkit.Location;
import org.bukkit.World;

import net.zeeraa.novacore.spigot.utils.VectorArea;

public class DropperMap {
	private VectorArea area;
	private VectorArea completeArea;

	private Location spawnLocation;
	private Location spectatorLocation;

	private int health;
	private int time;

	public DropperMap(VectorArea area, VectorArea completeArea, Location spawnLocation, Location spectatorLocation, int health, int time) {
		this.area = area;
		this.completeArea = completeArea;
		this.spawnLocation = spawnLocation;
		this.spectatorLocation = spectatorLocation;
		this.health = health;
		this.time = time;
	}

	public void setupWorld(World world) {
		this.spawnLocation = new Location(world, this.spawnLocation.getX(), this.spawnLocation.getY(), this.spawnLocation.getZ(), this.spawnLocation.getYaw(), this.spawnLocation.getPitch());
		this.spectatorLocation = new Location(world, this.spectatorLocation.getX(), this.spectatorLocation.getY(), this.spectatorLocation.getZ(), this.spectatorLocation.getYaw(), this.spectatorLocation.getPitch());
	}

	public VectorArea getArea() {
		return area;
	}

	public VectorArea getCompleteArea() {
		return completeArea;
	}

	public Location getSpawnLocation() {
		return spawnLocation;
	}

	public Location getSpectatorLocation() {
		return spectatorLocation;
	}

	public int getHealth() {
		return health;
	}
	
	public int getTime() {
		return time;
	}
}