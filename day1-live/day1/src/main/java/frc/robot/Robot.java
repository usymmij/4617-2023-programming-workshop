package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Robot extends TimedRobot {
  private CANSparkMax RMotorA;
  private CANSparkMax RMotorB;
  private CANSparkMax RMotorC;

  private CANSparkMax LMotorA;
  private CANSparkMax LMotorB;
  private CANSparkMax LMotorC;
  private XboxController controller;

  private double left;
  private double right;

  @Override
  public void robotInit() {

    controller = new XboxController(0);

    RMotorA = new CANSparkMax(1, MotorType.kBrushless);
    RMotorA.restoreFactoryDefaults();
    RMotorA.setIdleMode(IdleMode.kCoast);

    RMotorB = new CANSparkMax(2, MotorType.kBrushless);
    RMotorB.restoreFactoryDefaults();
    RMotorB.setIdleMode(IdleMode.kCoast);
    RMotorB.follow(RMotorA);

    RMotorC = new CANSparkMax(3, MotorType.kBrushless);
    RMotorC.restoreFactoryDefaults();
    RMotorC.setIdleMode(IdleMode.kCoast);
    RMotorC.follow(RMotorA);


    LMotorA = new CANSparkMax(4, MotorType.kBrushless);
    LMotorA.restoreFactoryDefaults();
    LMotorA.setIdleMode(IdleMode.kCoast);

    LMotorB = new CANSparkMax(5, MotorType.kBrushless);
    LMotorB.restoreFactoryDefaults();
    LMotorB.setIdleMode(IdleMode.kCoast);
    LMotorB.follow(LMotorA);

    LMotorC = new CANSparkMax(6, MotorType.kBrushless);
    LMotorC.restoreFactoryDefaults();
    LMotorC.setIdleMode(IdleMode.kCoast);
    LMotorC.follow(LMotorA);

    LMotorA.setInverted(true);
    LMotorB.setInverted(true);
    LMotorC.setInverted(true);

  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {

    right = controller.getRightY() - controller.getLeftX();
    left = controller.getRightY() + controller.getLeftX();
    
    RMotorA.set(right);
    LMotorA.set(left);

    //System.out.println("Hi I am a Robot");
    System.out.printf("Left: %f \t\t Right: %f", left, right);

    // \ and / are not the same!
  }

 
}
