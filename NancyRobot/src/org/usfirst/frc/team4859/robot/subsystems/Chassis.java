/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4859.robot.subsystems;

import org.usfirst.frc.team4859.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Chassis extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public WPI_TalonSRX leftmotor1 = new WPI_TalonSRX(RobotMap.firstLeftMotor);
	public WPI_TalonSRX leftmotor2 = new WPI_TalonSRX(RobotMap.secondLeftMotor);
	public WPI_TalonSRX rightmotor1 = new WPI_TalonSRX(RobotMap.firstRightMotor);
	public WPI_TalonSRX rightmotor2 = new WPI_TalonSRX(RobotMap.secondRightMotor);
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	public void driveStraight(double speed) {
		leftmotor1.set(speed);
		leftmotor2.set(speed);
		rightmotor1.set(-speed);
		rightmotor2.set(-speed);
	}	public void driveStop() {
		leftmotor1.set(0);
		leftmotor2.set(0);
		rightmotor1.set(0);
		rightmotor2.set(0);
	}
}
