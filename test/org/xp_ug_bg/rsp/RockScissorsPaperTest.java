package org.xp_ug_bg.rsp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.xp_ug_bg.rsp.Seed.*;

public class RockScissorsPaperTest {
	
	private RockScissorsPaper rsp;

	@Before
	public void setup() {
		rsp = RockScissorsPaperFactory.getInstance();
	}
	
	@Test
	public void rockBeatsScissorsTest() throws Exception {
		assertBeats(ROCK, SCISSORS);
	}

  @Test
	public void scissorsDoesntBeatRockTest() throws Exception {
		assertDoesntBeat(SCISSORS, ROCK);
	}
	
	@Test
	public void rockDoesntBeatRockTest() throws Exception {
		assertDoesntBeat(ROCK, ROCK);
	}
	
	@Test
	public void scissorsBeatsPaperTest() throws Exception {
		assertBeats(SCISSORS, PAPER);
	}

	@Test
	public void paperBeatsRockTest() throws Exception {
		assertBeats(PAPER, ROCK);
	}
	
	@Test
	public void peaceBeatsOtherSeedsTest() throws Exception {
		assertBeats(PEACE, ROCK);
		assertBeats(PEACE, PAPER);
		assertBeats(PEACE, SCISSORS);
	}
	
	@Test
	public void peaceDoesntBeatPeaceTest() throws Exception {
		assertDoesntBeat(PEACE, PEACE);
	}

	private void assertBeats(Seed first, Seed second) {
	  assertTrue(rsp.beats(first, second));
	}
	
  private void assertDoesntBeat(Seed first, Seed second) {
    assertFalse(rsp.beats(first, second));
  }
}
