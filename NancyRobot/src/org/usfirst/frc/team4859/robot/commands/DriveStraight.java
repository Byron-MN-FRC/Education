/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4859.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4859.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class DriveStraight extends Command {
	double sped;
	double time;
	public DriveStraight(double speed, double tiem) {
		// Use requires() here to declare subsystem dependencies
		sped = speed;
		time = tiem;
		requires(Robot.m_subsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		setTimeout(time);
		Robot.m_subsystem.driveStraight(sped);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.m_subsystem.driveStraight(sped);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		if (time != 0) {
		return isTimedOut();
		}else {
			return false;
		}
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.m_subsystem.driveStop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.m_subsystem.driveStop();
	}
}
