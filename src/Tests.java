import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {


	@Test
	public void caseOneSameStartingLocation() {
		Kangaroo Sarah = new Kangaroo();
		assertEquals("No", Sarah.kangaroo(10, 5, 10, 20));
	}

	@Test
	public void caseTwoDifferentLocationAndVelocity() {
		Kangaroo Jane = new Kangaroo();
		assertEquals("Yes", Jane.kangaroo(0, 3, 4, 2));
	}

	@Test
	public void caseTwoBDifferentLocationAndVelocity() {
		Kangaroo Gary = new Kangaroo();
		assertEquals("No", Gary.kangaroo(0, 2, 5, 3));
	}

	@Test
	public void caseThreeDifferentStartingLocationAndSameVelocity() {
		Kangaroo Lary = new Kangaroo();
		assertEquals("No", Lary.kangaroo(1, 2, 5, 2));
	}

}
