package robot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
		
		//creates robot and checks that power is set as specified
		Robot robot = new Robot(1);
		assertTrue(robot.power == 1);
		
		//makes sure robot gets ball and uses power.
		robot.pickUpBall();
		assertTrue(robot.ball);
		assertTrue(robot.power == 0);
		
		//makes sure robot keeps ball and that power doesn't change.
		robot.shoot();
		assertTrue(robot.ball);
		assertTrue(robot.power == 0);
		
		//makes sure robot keeps ball and power is set to 10
		robot.recharge();
		assertTrue(robot.ball);
		assertTrue(robot.power ==10);
		
		//makes sure robot keeps ball and full power
		robot.recharge();
		assertTrue(robot.ball);
		assertTrue(robot.power ==10);
		
		//makes sure robot keeps ball and power isn't used
		robot.pickUpBall();
		assertTrue(robot.ball);
		assertTrue(robot.power == 10);
		
		//makes sure robot losses ball and uses power.
		robot.shoot();
		assertFalse(robot.ball);
		assertTrue(robot.power == 9);
		
	}

}
