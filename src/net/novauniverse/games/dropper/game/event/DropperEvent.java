package net.novauniverse.games.dropper.game.event;


import org.bukkit.event.Event;

import net.novauniverse.games.dropper.NovaDropper;
import net.zeeraa.novacore.spigot.gameengine.module.modules.game.Game;

public abstract class DropperEvent extends Event {
	public Game getGame() {
		return NovaDropper.getInstance().getGame();
	}
}
