/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


public final class Constants {
	public static class X3D {
		public static final int
			// ---Joystick IDs---
			LEFT_JOYSTICK_ID = 0,
			// RIGHT_JOYSTICK_ID = 1,

			/// ---Axes---
			ROLL_AXIS = 0,
			PITCH_AXIS = 1,
			// YAW_AXIS = 2,
			// OTHER_AXIS = 3,

			// ---Button IDs---
			TRIGGER_BUTTON_ID = 1,
			GRIP_BUTTON_ID = 2,
			THREE_BUTTON_ID = 3,
			FOUR_BUTTON_ID = 4,
			FIVE_BUTTON_ID = 5,
			SIX_BUTTON_ID = 6,
			SEVEN_BUTTON_ID = 7,
			EIGHT_BUTTON_ID = 8,
			NINE_BUTTON_ID = 9,
			TEN_BUTTON_ID = 10,
			ELEVEN_BUTTON_ID = 11,
			TWELVE_BUTTON_ID = 12;
	}

	public static class Gamepad {
		public static final int
			JOYSTICK_ID = 2,

			// ---Axes---
			LEFT_X_AXIS = 0,
			LEFT_Y_AXIS = 1,
			RIGHT_X_AXIS = 4,
			RIGHT_Y_AXIS = 5,
			// LEFT_TRIGGER_AXIS = 2,
			// RIGHT_TRIGGER_AXIS = 3,

			// ---Button IDs---
			A_BUTTON_ID = 1,
			B_BUTTON_ID = 2,
			X_BUTTON_ID = 3,
			Y_BUTTON_ID = 4,
			LEFT_BUMPER_BUTTON_ID = 5,
			RIGHT_BUMPER_BUTTON_ID = 6,
			BACK_BUTTON_ID = 7,
			START_BUTTON_ID = 8,
			// LOGITECH_BUTTON_ID = 9,
			LEFT_JOYSTICK_BUTTON_ID = 10,
			RIGHT_JOYSTICK_BUTTON_ID = 11,

			// ---POV Indices---
			ANGLE_UP_POV = 0;
	}

	public static class AxisDominanceThresholds {
		public static final double
			// Drive axis dominance thresholds
			ARCADE = 0.35,
			TANK = 0.21;
	}

	public static class DriverControlIDs {
		public static final int
			// Tank drive axis
			// LEFT_TANK_DRIVE_AXIS_ID = X3D.PITCH_AXIS,
			// RIGHT_TANK_DRIVE_AXIS_ID = X3D.PITCH_AXIS,

			// Arcade drive axis
			ARCADE_DRIVE_FORWARD_AXIS_ID = X3D.PITCH_AXIS,
			ARCADE_DRIVE_ANGLE_AXIS_ID = X3D.ROLL_AXIS,
			TOGGLE_ARCADE_DRIVE_BUTTON_ID = X3D.FIVE_BUTTON_ID,	// does not toggle drive mode for spotter
			DRIVE_STRAIGHT_BUTTON_ID = X3D.GRIP_BUTTON_ID,

			// Manipulator buttons
			BACKWARD_INTAKE_BUTTON_ID = X3D.SIX_BUTTON_ID,
			FORWARD_INTAKE_BUTTON_ID = X3D.FOUR_BUTTON_ID,
			FEEDER_BUTTON_ID = X3D.TRIGGER_BUTTON_ID,
			SHOOT_BUTTON_ID = X3D.THREE_BUTTON_ID,

			// Control panel arm buttons
			PANEL_SPIN_BUTTON_ID = X3D.TWELVE_BUTTON_ID,
			PANEL_SPIN_REVERSE_BUTTON_ID = X3D.ELEVEN_BUTTON_ID,
			
			// Climber buttons
			EXTEND_CLIMBER_BUTTON_ID = X3D.TEN_BUTTON_ID,
			LOWER_CLIMBER_BUTTON_ID = X3D.NINE_BUTTON_ID,

			// Winch buttons
			SPOOL_WINCH_BUTTON_ID = X3D.EIGHT_BUTTON_ID,
			UNSPOOL_WINCH_BUTTON_ID = X3D.SEVEN_BUTTON_ID;
	}

	public static class SpotterControlIDs {
		public static final int
			// Tank drive axis
			LEFT_TANK_DRIVE_AXIS_ID = Gamepad.LEFT_Y_AXIS,
			RIGHT_TANK_DRIVE_AXIS_ID = Gamepad.RIGHT_Y_AXIS,

			// Arcade drive axis
			ARCADE_DRIVE_FORWARD_AXIS_ID = Gamepad.LEFT_Y_AXIS,
			ARCADE_DRIVE_ANGLE_AXIS_ID = Gamepad.LEFT_X_AXIS,
			
			// Drive mode function buttons
			DRIVE_STRAIGHT_POV_ANGLE = Gamepad.ANGLE_UP_POV,
			TOGGLE_ARCADE_DRIVE_BUTTON_ID = Gamepad.LEFT_JOYSTICK_BUTTON_ID,	// does not toggle drive mode for driver
			TOGGLE_SENSITIVITY_BUTTON_ID = Gamepad.RIGHT_JOYSTICK_BUTTON_ID,	// does not toggle motor sensitivities for driver

			// Manipulator buttons
			INTAKE_BUTTON_ID = Gamepad.X_BUTTON_ID,
			FEEDER_BUTTON_ID = Gamepad.B_BUTTON_ID,

			// Control panel arm trigger axes
			PANEL_SPIN_BUTTON_ID = Gamepad.LEFT_BUMPER_BUTTON_ID,
			PANEL_SPIN_REVERSE_BUTTON_ID = Gamepad.RIGHT_BUMPER_BUTTON_ID,
			
			// Climber buttons
			EXTEND_CLIMBER_BUTTON_ID = Gamepad.Y_BUTTON_ID,
			LOWER_CLIMBER_BUTTON_ID = Gamepad.A_BUTTON_ID,

			// Winch buttons
			SPOOL_WINCH_BUTTON_ID = Gamepad.BACK_BUTTON_ID,
			UNSPOOL_WINCH_BUTTON_ID = Gamepad.START_BUTTON_ID;
	}

	public static class Drive {
		public static final int
			LEFT_A_TALON_FX_ID = 1,
			LEFT_B_TALON_FX_ID = 2,
			RIGHT_A_TALON_FX_ID = 3,
			RIGHT_B_TALON_FX_ID = 4;

			// LEFT_ENCODER_CHANNELA_ID = 6,
			// LEFT_ENCODER_CHANNELB_ID = 7,
			// RIGHT_ENCODER_CHANNELA_ID = 8,
			// RIGHT_ENCODER_CHANNELB_ID = 9,

			// GYRO_ID = 0,

			// FRONT_DISTANCE_PING_ID = 10,
			// FRONT_DISTANCE_ECHO_ID = 11,
			// BACK_DISTANCE_PING_ID = 12,
			// BACK_DISTANCE_ECHO_ID = 13;

		public static final double
			ENCODER_DISTANCE_PER_PULSE  = (15.24 * Math.PI) / 256; // diameter * pi = circumference. circumference / 256 = distance per pulse

		public static final int
			ENCODER_DECODING_SCALE_FACTOR = 2;


		public static class PID {
			/**
			 * Which PID slot to pull gains from. Starting 2018, you can choose from
			 * 0,1,2 or 3. Only the first two (0,1) are visible in web-based
			 * configuration.
			 */
			public static final int kSlotIdx = 0;

			/**
			 * Talon FX supports multiple (cascaded) PID loops. For
			 * now we just want the primary one.
			 */
			public static final int kPIDLoopIdx = 0;

			/**
			 * Set to zero to skip waiting for confirmation, set to nonzero to wait and
			 * report to DS if action fails.
			 */
			public static final int kTimeoutMs = 30;

			/**
			 * PID Gains may have to be adjusted based on the responsiveness of control loop.
			 * kF: 1023 represents output value to Talon at 100%, 20660 represents Velocity units at 100% output
			 * 
			 * 	                                    			  kP   	 kI    kD      kF          Iz    PeakOut */
			public final static Gains kGains_Velocit  = new Gains( 0.1, 0.001, 5, 1023.0/20660.0,  300,  1.00);
		}
	}

	public static class Manipulator {
		public static final int
			WRIST_FIRE_TALONSRX_ID = 3,
			ELBOW_FIRE_TALONSRX_ID = 1,
			SHOULDER_FIRE_TALONSRX_ID = 11,

			BOTTOM_INTAKE_TALONSRX_ID = 8;

		public static final double
			INTAKE_PERCENT_OUTPUT = 0.5;

		public static final int
			SHOOTER_SPEED_TOLERANCE = 20,
			ELBOW_TARGET_RPM = 4_550,	// low shooter
			WRIST_TARGET_RPM = 4_545, // high shooter, RPMs are changed to units/100ms in motor commands
			COUNTS_PER_REVOLUTION = 1024,
			UNITS_PER_REVOLUTION = COUNTS_PER_REVOLUTION * 4;	//the talon counts every rising and falling edge
	}

	public static class Climber {
		public static final int
			// ENCODER_CHANNELA_ID = 2,
			// FRONT_ENCODER_CHANNELB_ID = 3,
			TALONSRX_ID = 9;
		
		// TODO: Figure out climber encoder distance per pulse
		// public static final double CLIMBER_ENCODER_DISTANCE_PER_PULSE = SOME VALUE;
	}

	public static class Winch {
		public static final int
			TALONFX_ID = 12;
	}

	public static class ControlPanel {
		public static final int
			CONTROLSPIN_TALONSRX_ID = 7;
	}

// RIO Post Info
// public static int[] expectedTalonIDs = {
// 	DRIVE_LEFT_A_TALON_SRX_ID,
// 	DRIVE_LEFT_B_TALON_SRX_ID,
// 	DRIVE_RIGHT_A_TALON_SRX_ID,
// 	DRIVE_RIGHT_B_TALON_SRX_ID
// };

// public static int[] expectedDIOEncoders = {
// 	DRIVE_LEFT_ENCODER_CHANNELA_ID,
// 	DRIVE_LEFT_ENCODER_CHANNELB_ID,
// 	DRIVE_RIGHT_A_TALON_SRX_ID,
// 	DRIVE_RIGHT_B_TALON_SRX_ID
// };

// public static int expectedGyro = DRIVE_GYRO_ID;

// public static int[] expectedDIOUltrasonic = {
// 	DRIVE_FRONT_DISTANCE_PING_ID,
// 	DRIVE_FRONT_DISTANCE_ECHO_ID,
// 	DRIVE_BACK_DISTANCE_PING_ID,
// 	DRIVE_BACK_DISTANCE_ECHO_ID
// };
}
