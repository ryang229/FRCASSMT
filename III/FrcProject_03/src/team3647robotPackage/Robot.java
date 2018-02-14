package team3647robotPackage;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot 
{	
	//This function is run whenever the robot starts. This function is used for any initialization of code
	@Override
	public void robotInit() 
	{
		Joysticks JSO;
	}

	 //This function runs once, right before autonomous period starts. 
	@Override
	public void autonomousInit() 
	{

	}

	//This is the function that is called during the autonomous period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void autonomousPeriodic() 
	{

	}

	//This is the function that is called during the Tele-operated period
	//This function runs periodically, meaning it acts as an infinite loop
	@Override
	public void teleopPeriodic() 
	{
		JSO.updateMainController(); // get joystick values
		/* prevent reset encoder if in dead zone */
		if(Joysticks.leftJoySticky = 0) encoders.reset;
		/* set motor power */
		Motors.leftMotor.set(Joysticks.leftJoySticky);
		Motors.rightMotor.set(-Joysticks.leftJoySticky);
		/***************************************
		 * This code determines the direction of
		 * travel, and uses the correct course
		 * correction software to perform course 
		 * corrections if needed. 
		 **************************************/
		if(

		
	}

	//This is the function that is called during the test
	//Test is an option available in the driver station and can be used to test specific pieces of code.
	//This function runs periodically, meaning it acts like an infinite loop
	@Override
	public void testPeriodic() 
	{
		
	}
}

