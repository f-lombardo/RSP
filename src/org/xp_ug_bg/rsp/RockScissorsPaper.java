package org.xp_ug_bg.rsp;

public class RockScissorsPaper {

	private final Rule[] rules;

	public RockScissorsPaper(Rule ... rules) {
		this.rules = rules;
	}

	public boolean beats(Seed first, Seed second) {
		for (Rule rule: rules) {
			if (rule.beats(first, second)) {
				return true;
			}
		}
		return false;
	}

}
