package org.xp_ug_bg.rsp;

public class FirstBeatsSecondRule implements Rule{

	private final Seed first;
	private final Seed second;

	public FirstBeatsSecondRule(Seed first, Seed second) {
		this.first = first;
		this.second = second;
	}

	public boolean beats(Seed first, Seed second) {
		return this.first.equals(first) && this.second.equals(second);
	}
}
