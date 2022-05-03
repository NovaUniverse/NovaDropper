package net.novauniverse.games.dropper.game.event;

import java.util.UUID;

import org.bukkit.event.HandlerList;

public class DropperPlayerFailRoundEvent extends DropperEvent {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	private UUID uuid;

	public DropperPlayerFailRoundEvent(UUID uuid) {
		this.uuid = uuid;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}

	public UUID getUuid() {
		return uuid;
	}
}