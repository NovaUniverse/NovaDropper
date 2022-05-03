package net.novauniverse.games.dropper.game.event;

import java.util.UUID;

import org.bukkit.event.HandlerList;

public class DropperPlacementEvent extends DropperEvent {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	private UUID uuid;
	private PlacementType type;
	private int placement;
	private int score;

	public DropperPlacementEvent(UUID uuid, PlacementType type, int placement, int score) {
		this.uuid = uuid;
		this.type = type;
		this.placement = placement;
		this.score = score;
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

	public PlacementType getType() {
		return type;
	}

	public int getPlacement() {
		return placement;
	}

	public int getScore() {
		return score;
	}
}