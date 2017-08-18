package io.github.bedwarsrel.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import io.github.bedwarsrel.game.Game;
import io.github.bedwarsrel.game.Team;

public class BedwarsFriendlyBreakEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private Game game;
	private Player player;
	private Team team;

	public BedwarsFriendlyBreakEvent(Game game, Player p, Team bedDestroyTeam) {
		this.game = game;
		this.player = p;
		this.team = bedDestroyTeam;
	}

	@Override
	public HandlerList getHandlers() {
		return BedwarsFriendlyBreakEvent.handlers;
	}

	public static HandlerList getHandlerList() {
		return BedwarsFriendlyBreakEvent.handlers;
	}

	public Team getBedDestroyTeam() {
		return team;
	}

	public Player getBreaker() {
		return player;
	}

	public Game getGame() {
		return this.game;
	}
}
