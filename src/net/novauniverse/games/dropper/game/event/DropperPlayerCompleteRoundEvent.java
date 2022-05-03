package net.novauniverse.games.dropper.game.event;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class DropperPlayerCompleteRoundEvent extends DropperEvent {
	private static final HandlerList HANDLERS_LIST = new HandlerList();

	private Player player;
	private int playersLeft;
	private int totalPlayers;
	private int placement;

	public DropperPlayerCompleteRoundEvent(Player player, int playersLeft, int totalPlayers, int placement) {
		this.player = player;
		this.playersLeft = playersLeft;
		this.totalPlayers = totalPlayers;
		this.placement = placement;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS_LIST;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS_LIST;
	}

	public Player getPlayer() {
		return player;
	}

	public int getTotalPlayers() {
		return totalPlayers;
	}

	public int getPlayersLeft() {
		return playersLeft;
	}

	public int getPlacement() {
		return placement;
	}
}