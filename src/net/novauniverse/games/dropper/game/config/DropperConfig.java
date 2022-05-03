package net.novauniverse.games.dropper.game.config;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.json.JSONArray;
import org.json.JSONObject;

import net.zeeraa.novacore.spigot.gameengine.module.modules.game.Game;
import net.zeeraa.novacore.spigot.gameengine.module.modules.game.map.mapmodule.MapModule;
import net.zeeraa.novacore.spigot.utils.LocationUtils;
import net.zeeraa.novacore.spigot.utils.VectorArea;

public class DropperConfig extends MapModule {
	private List<DropperMap> maps;
	private boolean shuffleOrder;

	public DropperConfig(JSONObject json) {
		super(json);

		this.maps = new ArrayList<DropperMap>();

		JSONArray maps = json.getJSONArray("maps");
		for (int i = 0; i < maps.length(); i++) {
			JSONObject map = maps.getJSONObject(i);

			World defaultWorld = Bukkit.getServer().getWorlds().get(0);

			Location spawnLocation = LocationUtils.fromJSONObject(map.getJSONObject("start_location"), defaultWorld);
			Location spectatorLocation = LocationUtils.fromJSONObject(map.getJSONObject("spectator_location"), defaultWorld);

			VectorArea area = VectorArea.fromJSON(map.getJSONObject("area"));
			VectorArea completeArea = VectorArea.fromJSON(map.getJSONObject("complete_area"));

			int health = 2;

			if (map.has("health")) {
				health = map.getInt("health");
			}

			int time = 120;
			if (map.has("time")) {
				time = map.getInt("time");
			}
			
			boolean nightVision = false;
			if(map.has("night_vision")) {
				nightVision = map.getBoolean("night_vision");
			}

			DropperMap dropperMap = new DropperMap(area, completeArea, spawnLocation, spectatorLocation, health, time, nightVision);
			this.maps.add(dropperMap);
		}

		if (json.has("shuffle_map_order")) {
			this.shuffleOrder = json.getBoolean("shuffle_map_order");
		}
	}

	public boolean isShuffleOrder() {
		return shuffleOrder;
	}

	public List<DropperMap> getMaps() {
		return maps;
	}

	@Override
	public void onGameStart(Game game) {
		this.maps.forEach(map -> map.setupWorld(game.getWorld()));
	}
}
