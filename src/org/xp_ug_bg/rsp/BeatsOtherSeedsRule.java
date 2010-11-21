package org.xp_ug_bg.rsp;

public class BeatsOtherSeedsRule implements Rule {

	private final Seed seed;

	public BeatsOtherSeedsRule(Seed seed) {
		this.seed = seed;
	}

	@Override
	public boolean beats(Seed first, Seed second) {
		return this.seed.equals(first) && !this.seed.equals(second);
	}

}
