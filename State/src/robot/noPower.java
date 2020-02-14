package robot;

public class noPower implements State {
	Robot robot;
	
	//Connects the robot to this method
	public noPower(Robot robot) {
		this.robot = robot;
	}
	
	//returns no power message.
	@Override
	public void pickUpBall() {
		System.out.println("The robot doesn't have power, please recharge");

	}

	//returns no power message
	@Override
	public void shootBall() {
		System.out.println("The robot doesn't have power, please recharge");

	}
	
	//recharges robot and sets state depending on robot if it has a robot.
	@Override
	public void recharge() {
		System.out.println("Recharging robot...Robot is recharged");
		if (robot.ball) {
			robot.setState(robot.getHasBallState());
		}
		else {
			robot.setState(robot.getNoBallState());
		}
		robot.power = 10;

	}

}
