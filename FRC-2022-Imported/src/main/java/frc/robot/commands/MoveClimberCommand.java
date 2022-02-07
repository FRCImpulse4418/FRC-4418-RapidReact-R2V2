/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotContainer;
import frc.robot.subsystems.TeleopSensitivitySubsystem;


public class MoveClimberCommand extends CommandBase {
	private boolean extendingClimber;

	public MoveClimberCommand(boolean extendingClimber) {
		this.extendingClimber = extendingClimber;
		addRequirements(RobotContainer.climbSubsystem);
	}

	// Called when the command is initially scheduled.
	// Broke for FLL
	@Override
	public void initialize() {
		if (extendingClimber) {
			RobotContainer.climbSubsystem.setClimbMotor(0.0 * TeleopSensitivitySubsystem.moveClimberInputRate);
		} else {
			RobotContainer.climbSubsystem.setClimbMotor(0.0 * TeleopSensitivitySubsystem.moveClimberInputRate);
		}
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
		
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
		RobotContainer.climbSubsystem.setClimbMotor(0.0);
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return false;
	}
}
