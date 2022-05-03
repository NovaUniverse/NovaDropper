package net.novauniverse.games.dropper.game.event;

import org.bukkit.event.HandlerList;

public class DropperRoundEndEvent extends DropperEvent {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}
}