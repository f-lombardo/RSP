package org.xp_ug_bg.rsp;

import static org.xp_ug_bg.rsp.Seed.*;

public class RockScissorsPaperFactory {

	public static RockScissorsPaper getInstance() {
		return new RockScissorsPaper(
		                  new FirstBeatsSecondRule(ROCK, SCISSORS),
				              new FirstBeatsSecondRule(SCISSORS, PAPER),
				              new FirstBeatsSecondRule(PAPER, ROCK),
				              new BeatsOtherSeedsRule(PEACE));
	}

}
