package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

// dont type this, let it autocomplete
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.REVPhysicsSim;

// explain libraries/download

public class Robot extends TimedRobot {
    // creating the motor controller object
    // explain autocomplete importing the library
    private CANSparkMax motorController;
    private XboxController controller;

    // describe robot init
    @Override
    public void robotInit() {
        // explain initialization and motor types
        motorController = new CANSparkMax(0, MotorType.kBrushless);
        motorController.restoreFactoryDefaults();
        motorController.setIdleMode(IdleMode.kCoast);
        // explain factory defaults as good practice
        // explain CAN chain and IDs
    }

    // describe periodic modes as repeating
    @Override
    public void teleopPeriodic() {
        // set speed
        // explain speed 0-1 float
        motorController.set(1);
        System.out.println(motorController.getAppliedOutput());

        // demo!
        // assign different speeds and id numbers, let everyone upload
        
        // show 2 motor tank drive
        
        // find and replace: motorController -> motor0
        // motor duplicate init code for all motors
        
        // init controller:  private XboxController controller

        /*
         * motor0.set(controller.getRightY())
         * motor1.set(controller.getLeftY())
         */

        // show other controller buttons
        /*
         *  if(controller.getBButtonPressed()) {
         *      motor0.set(1);
         *      motor1.set(1);
         *  }
         */
        // DEMO the bad if statment, then show fix
         /*
          *  else {
         *      motor0.set(0);
         *      motor1.set(0);
          *  }
          */
        // change it to different buttons and controls

        // do improper tank drive with multiple sets
        /* 
         * motor0.set(controller.getRightY())
         * motor2.set(controller.getRightY())
         * motor1.set(controller.getLeftY())
         * motor3.set(controller.getLeftY())
         */
        // do tank drive with followers

        // assign worksheet with controls
    }
}
