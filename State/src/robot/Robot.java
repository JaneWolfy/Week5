package robot;

public class Robot {
	//Creates state
	State noPower;
	State hasBall;
	State noBall;
	
	//sets starting states
	State state = noPower;
	int power = 0;
	boolean ball = false;
	
	//method to make robot.
	public Robot(int power) {
		noPower = new noPower(this);
		hasBall = new hasBall(this);
		noBall = new noBall(this);
		
		this.power = power;
		if (power > 0) {
			state = noBall;
		}
	}
	
	//calls the pickUpBall command in the current state.
	public void pickUpBall() {
		state.pickUpBall();
	}
	
	//calls the shootBall command in the current state.
	public void shoot() {
		state.shootBall();
	}
	
	//calls the reccharge common in the current state
	public void recharge() {
		state.recharge();
	}
	
	//changes the state to specified state
	public void setState(State state) {
		this.state = state;
	}
	
	//returns current state
	public State getState() {
		return state;
	}
	
	//returns noPower State
	public State getNoPowerState() {
		return noPower;
	}
	
	//returns hasBall state
	public State getHasBallState() {
		return hasBall;
	}
	
	//returns noBall state
	public State getNoBallState() {
		return noBall;
	}
}
