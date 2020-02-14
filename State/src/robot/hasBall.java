package robot;

public class hasBall implements State {
	Robot robot;
	
	public hasBall(Robot robot) {
		//creates robot
		this.robot = robot;
	}
	
	//lets person know robot already has a ball
	@Override
	public void pickUpBall() {
		System.out.println("Your robot already has a ball");
	}

	//Shoots the ball and takes away power. Sets to noPower if robot is out of power
	//Sets to no ball state otherwise
	@Override
	public void shootBall() {
		System.out.println("You fired your ball at a target");
		robot.power = robot.power - 1;
		robot.ball = false;
		if (robot.power == 0){
			robot.setState(robot.getNoPowerState());
		}
		else {
			robot.setState(robot.getNoBallState());
		}

	}

	//checks if robot is full if not recharges it.
	@Override
	public void recharge() {
		if (robot.power < 10) {
			System.out.println("Recharging robot...Robot is recharged");
			robot.power = 10;
		}
		else {
			System.out.println("You robot is already fully charged");
		}

	}

}
