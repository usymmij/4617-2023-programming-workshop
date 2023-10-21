package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Drivetrain;

public class Robot extends TimedRobot {
  public Drivetrain drive;
  

  @Override
  public void robotInit() {
    drive = new Drivetrain();
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {

    drive.loop();
    
  }

 
}