package net.novauniverse.games.dropper.game.event;

import org.bukkit.event.Event;

import net.novauniverse.games.dropper.NovaDropper;
import net.novauniverse.games.dropper.game.Dropper;

public abstract class DropperEvent extends Event {
	public Dropper getGame() {
		return (Dropper) NovaDropper.getInstance().getGame();
	}
}