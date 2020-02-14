package robot;

public class noBall implements State {
	Robot robot;
	
	public noBall(Robot robot) {
		this.robot = robot;
	}
	
	//picks up a ball, uses power, if no more power sets state to no power
	//otherwise sets to has ball state
	@Override
	public void pickUpBall() {
		System.out.println("You have picked up a ball");
		robot.power = robot.power - 1;
		robot.ball = true;
		if(robot.power == 0) {
			System.out.println("You robot is out of power");
			robot.setState(robot.getNoPowerState());
		}
		else{
			robot.setState(robot.getHasBallState());
		}

	}

	//there is not ball so can't shoot
	@Override
	public void shootBall() {
		System.out.println("Your robot needs a ball first");

	}

	//recharges robot if power is less than 10 then 
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
