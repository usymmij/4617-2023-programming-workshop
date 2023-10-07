package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.XboxController;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Robot extends TimedRobot {
  private CANSparkMax motorControllerA;
  private CANSparkMax motorControllerB;
  private CANSparkMax motorControllerC;

  private XboxController controller;


  @Override
  public void robotInit() {

    controller = new XboxController(0);

    motorControllerA = new CANSparkMax(1, MotorType.kBrushless);
    motorControllerA.restoreFactoryDefaults();
    motorControllerA.setIdleMode(IdleMode.kCoast);

    motorControllerB = new CANSparkMax(2, MotorType.kBrushless);
    motorControllerB.restoreFactoryDefaults();
    motorControllerB.setIdleMode(IdleMode.kCoast);
    motorControllerB.follow(motorControllerA);

    motorControllerC = new CANSparkMax(3, MotorType.kBrushless);
    motorControllerC.restoreFactoryDefaults();
    motorControllerC.setIdleMode(IdleMode.kCoast);
    motorControllerC.follow(motorControllerA);

  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    motorControllerA.set(controller.getRightY());
  }

 
}
