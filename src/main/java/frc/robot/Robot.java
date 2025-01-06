// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;

//import edu.wpi.first.cameraserver.CameraServer;
//import edu.wpi.first.cscore.UsbCamera;
//import edu.wpi.first.cscore.VideoSource.ConnectionStrategy;
//import edu.wpi.first.networktables.NetworkTableEntry;
//import edu.wpi.first.networktables.NetworkTableInstance;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

//import javax.swing.plaf.TreeUI;

import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkBase.SoftLimitDirection;

//import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.robot.Constants.ModuleConstants;
import frc.robot.LEDConstants.BlinkinPattern;
import frc.robot.LEDConstants.LEDoption;
import edu.wpi.first.wpilibj.PS4Controller;


/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  

  //public boolean skip = false;

  private Command m_autonomousCommand;

  private RobotContainer m_robotContainer;

  private final CANSparkMax m_NoteIntake = new CANSparkMax(10,MotorType.kBrushless);
  private final CANSparkFlex m_DriveTower = new CANSparkFlex(9,MotorType.kBrushless);
  private final CANSparkFlex m_ShooterLeft = new CANSparkFlex(11,MotorType.kBrushless);
  private final CANSparkFlex m_ShooterRight = new CANSparkFlex(12,MotorType.kBrushless);

  private final Spark m_blinkin = new Spark(0);

  private PS4Controller frank;

  public String m_ledSelected;
  public final SendableChooser<String> m_chooser = new SendableChooser<>();

  //UsbCamera camera1;
  //UsbCamera camera2;
  //NetworkTableEntry cameraSelection;

  //public static final String White = "White";
  //private static final String CP1_2_TWINKLES = "CP1_2_TWINKLES";
  //private static final String RAINBOW_RAINBOW_PALETTE = "RAINBOW_RAINBOW_PALETTE";
  

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.

    //CameraServer.startAutomaticCapture(0);
    //CameraServer.startAutomaticCapture(1);

    //cameraSelection = NetworkTableInstance.getDefault().getTable("").getEntry("CameraSelection");

    //camera1.setConnectionStrategy(ConnectionStrategy.kKeepOpen);
    //camera2.setConnectionStrategy(ConnectionStrategy.kKeepOpen);

    m_robotContainer = new RobotContainer();

    frank = new PS4Controller(1);

    //Fixed Palette Pattern
    m_chooser.addOption("RAINBOW_RAINBOW_PALETTE", LEDoption.RAINBOW_RAINBOW_PALETTE);
    m_chooser.addOption("RAINBOW_PARTY_PALETTE", LEDoption.RAINBOW_PARTY_PALETTE);
    m_chooser.addOption("RAINBOW_OCEAN_PALETTE", LEDoption.RAINBOW_OCEAN_PALETTE);
    m_chooser.addOption("RAINBOW_LAVA_PALETTE", LEDoption.RAINBOW_LAVA_PALETTE);
    m_chooser.addOption("RAINBOW_FOREST_PALETTE", LEDoption.RAINBOW_FOREST_PALETTE);
    m_chooser.addOption("RAINBOW_WITH_GLITTER", LEDoption.RAINBOW_WITH_GLITTER);
    m_chooser.addOption("CONFETTI", LEDoption.CONFETTI);
    m_chooser.addOption("SHOT_RED", LEDoption.SHOT_RED);
    m_chooser.addOption("SHOT_BLUE", LEDoption.SHOT_BLUE);
    m_chooser.addOption("SHOT_WHITE", LEDoption.SHOT_WHITE);
    m_chooser.addOption("SINELON_RAINBOW_PALETTE", LEDoption.SINELON_RAINBOW_PALETTE);
    m_chooser.addOption("SINELON_PARTY_PALETTE", LEDoption.SINELON_PARTY_PALETTE);
    m_chooser.addOption("SINELON_OCEAN_PALETTE", LEDoption.SINELON_OCEAN_PALETTE);
    m_chooser.addOption("SINELON_LAVA_PALETTE", LEDoption.SINELON_LAVA_PALETTE);
    m_chooser.addOption("SINELON_FOREST_PALETTE", LEDoption.SINELON_FOREST_PALETTE);
    m_chooser.addOption("BEATS_PER_MINUTE_RAINBOW_PALETTE", LEDoption.BEATS_PER_MINUTE_RAINBOW_PALETTE);
    m_chooser.addOption("BEATS_PER_MINUTE_PARTY_PALETTE", LEDoption.BEATS_PER_MINUTE_PARTY_PALETTE);
    m_chooser.addOption("BEATS_PER_MINUTE_OCEAN_PALETTE", LEDoption.BEATS_PER_MINUTE_OCEAN_PALETTE);
    m_chooser.addOption("BEATS_PER_MINUTE_LAVA_PALETTE", LEDoption.BEATS_PER_MINUTE_LAVA_PALETTE);
    m_chooser.addOption("BEATS_PER_MINUTE_FOREST_PALETTE", LEDoption.BEATS_PER_MINUTE_FOREST_PALETTE);
    m_chooser.addOption("FIRE_MEDIUM", LEDoption.FIRE_MEDIUM);
    m_chooser.addOption("FIRE_LARGE", LEDoption.FIRE_LARGE);
    m_chooser.addOption("TWINKLES_RAINBOW_PALETTE", LEDoption.TWINKLES_RAINBOW_PALETTE);
    m_chooser.addOption("TWINKLES_PARTY_PALETTE", LEDoption.TWINKLES_PARTY_PALETTE);
    m_chooser.addOption("TWINKLES_OCEAN_PALETTE", LEDoption.TWINKLES_OCEAN_PALETTE);
    m_chooser.addOption("TWINKLES_LAVA_PALETTE", LEDoption.TWINKLES_LAVA_PALETTE);
    m_chooser.addOption("TWINKLES_FOREST_PALETTE", LEDoption.TWINKLES_FOREST_PALETTE);
    m_chooser.addOption("COLOR_WAVES_RAINBOW_PALETTE", LEDoption.COLOR_WAVES_RAINBOW_PALETTE);
    m_chooser.addOption("COLOR_WAVES_PARTY_PALETTE", LEDoption.COLOR_WAVES_PARTY_PALETTE);
    m_chooser.addOption("COLOR_WAVES_OCEAN_PALETTE", LEDoption.COLOR_WAVES_OCEAN_PALETTE);
    m_chooser.addOption("COLOR_WAVES_LAVA_PALETTE", LEDoption.COLOR_WAVES_LAVA_PALETTE);
    m_chooser.addOption("COLOR_WAVES_FOREST_PALETTE", LEDoption.COLOR_WAVES_FOREST_PALETTE);
    m_chooser.addOption("LARSON_SCANNER_RED", LEDoption.LARSON_SCANNER_RED);
    m_chooser.addOption("LARSON_SCANNER_GRAY", LEDoption.LARSON_SCANNER_GRAY);
    m_chooser.addOption("LIGHT_CHASE_RED", LEDoption.LIGHT_CHASE_RED);
    m_chooser.addOption("LIGHT_CHASE_BLUE", LEDoption.LIGHT_CHASE_BLUE);
    m_chooser.addOption("LIGHT_CHASE_GRAY", LEDoption.LIGHT_CHASE_GRAY);
    m_chooser.addOption("HEARTBEAT_RED", LEDoption.HEARTBEAT_RED);
    m_chooser.addOption("HEARTBEAT_BLUE", LEDoption.HEARTBEAT_BLUE);
    m_chooser.addOption("HEARTBEAT_WHITE", LEDoption.HEARTBEAT_WHITE);
    m_chooser.addOption("HEARTBEAT_GRAY", LEDoption.HEARTBEAT_GRAY);
    m_chooser.addOption("BREATH_RED", LEDoption.BREATH_RED);
    m_chooser.addOption("BREATH_BLUE", LEDoption.BREATH_BLUE);
    m_chooser.addOption("BREATH_GRAY", LEDoption.BREATH_GRAY);
    m_chooser.addOption("STROBE_RED", LEDoption.STROBE_RED);
    m_chooser.addOption("STROBE_BLUE", LEDoption.STROBE_BLUE);
    m_chooser.addOption("STROBE_GOLD", LEDoption.STROBE_GOLD);
    m_chooser.addOption("STROBE_WHITE", LEDoption.STROBE_WHITE);
    
    //Solid color
    m_chooser.addOption("RED", LEDoption.RED);
    m_chooser.addOption("GREEN", LEDoption.GREEN);
    m_chooser.addOption("WHITE", LEDoption.WHITE);
    
    //Team Color Options
    m_chooser.setDefaultOption("Team Color", LEDoption.TeamColor);
    m_chooser.addOption("Fun Team Color", LEDoption.FunTeamColor);

    SmartDashboard.putData("LED Choices", m_chooser);

    

  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();

    SmartDashboard.putNumber("robot_rotaion", m_robotContainer.getdrive().getrotation());

  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() { // All auto routines commented out currently (lines 187, 200-202)
    //m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)

    

    //if (m_autonomousCommand != null) {
    //  m_autonomousCommand.schedule();
    //}
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
   

      m_ShooterLeft.set(-0.99);
      m_ShooterRight.set(-0.99);
      m_NoteIntake.set(0.4);
   
      }

    





  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }

    m_ledSelected = m_chooser.getSelected();
    System.out.println("BlinkinPattern Selected: " + m_ledSelected);

  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {

    m_DriveTower.enableSoftLimit(CANSparkMax.SoftLimitDirection.kForward, true);
    m_DriveTower.enableSoftLimit(CANSparkMax.SoftLimitDirection.kReverse, true);

    //set the softlimit
    m_DriveTower.setSoftLimit(SoftLimitDirection.kForward, (float) ModuleConstants.kSoftLimitForward);
    m_DriveTower.setSoftLimit(SoftLimitDirection.kReverse, (float) ModuleConstants.kSoftLimitReverse);

    if (frank.getR2Button()) {

        m_ShooterLeft.set(0.6); // 0.6
        m_ShooterRight.set(0.6); // 0.6
  
      } else if (frank.getR1Button()) {
  
        m_ShooterLeft.set(-0.99); // -0.99
        m_ShooterRight.set(-0.99); // -0.99
  
      } else {
  
        m_ShooterLeft.set(0.0);
        m_ShooterRight.set(0.0);
  
      }
      
      if (frank.getTriangleButton()) {
  
        m_DriveTower.set(0.45);
        
      } else if (frank.getCrossButton()) {
  
        m_DriveTower.set(-0.45);
       
      } else {
  
        m_DriveTower.set(0);
  
      }
      
  
      
      if (frank.getL1Button()) {
  
        m_NoteIntake.set(0.7);
        
      } else if (frank.getL2Button()) {
  
        m_NoteIntake.set(-0.7);
       
      } else {
  
        m_NoteIntake.set(0);
  
      }


      switch (m_ledSelected) {

        //Fixed Palette Pattern
        case LEDoption.RAINBOW_RAINBOW_PALETTE:
          m_blinkin.set(BlinkinPattern.RAINBOW_RAINBOW_PALETTE);
          break;
        
        case LEDoption.RAINBOW_PARTY_PALETTE:
          m_blinkin.set(BlinkinPattern.RAINBOW_PARTY_PALETTE);
          break;

        case LEDoption.RAINBOW_OCEAN_PALETTE:
          m_blinkin.set(BlinkinPattern.RAINBOW_OCEAN_PALETTE);
          break;
        
        case LEDoption.RAINBOW_LAVA_PALETTE:
          m_blinkin.set(BlinkinPattern.RAINBOW_LAVA_PALETTE);
          break;
        
        case LEDoption.RAINBOW_FOREST_PALETTE:
          m_blinkin.set(BlinkinPattern.RAINBOW_FOREST_PALETTE);
          break;

        case LEDoption.RAINBOW_WITH_GLITTER:
          m_blinkin.set(BlinkinPattern.RAINBOW_WITH_GLITTER);
          break;

        case LEDoption.CONFETTI:
          m_blinkin.set(BlinkinPattern.CONFETTI);
          break;

        case LEDoption.SHOT_RED:
          m_blinkin.set(BlinkinPattern.SHOT_RED);
          break;

        case LEDoption.SHOT_BLUE:
          m_blinkin.set(BlinkinPattern.SHOT_BLUE);
          break;

        case LEDoption.SHOT_WHITE:
          m_blinkin.set(BlinkinPattern.SHOT_WHITE);
          break;

        case LEDoption.SINELON_RAINBOW_PALETTE:
          m_blinkin.set(BlinkinPattern.SINELON_RAINBOW_PALETTE);
          break;

        case LEDoption.SINELON_PARTY_PALETTE:
          m_blinkin.set(BlinkinPattern.SINELON_PARTY_PALETTE);
          break;

        case LEDoption.SINELON_OCEAN_PALETTE:
          m_blinkin.set(BlinkinPattern.SINELON_OCEAN_PALETTE);
          break;

        case LEDoption.SINELON_LAVA_PALETTE:
          m_blinkin.set(BlinkinPattern.SINELON_LAVA_PALETTE);
          break;

        case LEDoption.SINELON_FOREST_PALETTE:
          m_blinkin.set(BlinkinPattern.SINELON_FOREST_PALETTE);
          break;

        case LEDoption.BEATS_PER_MINUTE_RAINBOW_PALETTE:
          m_blinkin.set(BlinkinPattern.BEATS_PER_MINUTE_RAINBOW_PALETTE);
          break;

        case LEDoption.BEATS_PER_MINUTE_PARTY_PALETTE:
          m_blinkin.set(BlinkinPattern.BEATS_PER_MINUTE_PARTY_PALETTE);
          break;

        case LEDoption.BEATS_PER_MINUTE_OCEAN_PALETTE:
          m_blinkin.set(BlinkinPattern.BEATS_PER_MINUTE_OCEAN_PALETTE);
          break;

        case LEDoption.BEATS_PER_MINUTE_LAVA_PALETTE:
          m_blinkin.set(BlinkinPattern.BEATS_PER_MINUTE_LAVA_PALETTE);
          break;

        case LEDoption.BEATS_PER_MINUTE_FOREST_PALETTE:
          m_blinkin.set(BlinkinPattern.BEATS_PER_MINUTE_FOREST_PALETTE);
          break;

        case LEDoption.FIRE_MEDIUM:
          m_blinkin.set(BlinkinPattern.FIRE_MEDIUM);
          break;

        case LEDoption.FIRE_LARGE:
          m_blinkin.set(BlinkinPattern.FIRE_LARGE);
          break;

        case LEDoption.TWINKLES_RAINBOW_PALETTE:
          m_blinkin.set(BlinkinPattern.TWINKLES_RAINBOW_PALETTE);
          break;

        case LEDoption.TWINKLES_PARTY_PALETTE:
          m_blinkin.set(BlinkinPattern.TWINKLES_PARTY_PALETTE);
          break;

        case LEDoption.TWINKLES_OCEAN_PALETTE:
          m_blinkin.set(BlinkinPattern.TWINKLES_OCEAN_PALETTE);
          break;

        case LEDoption.TWINKLES_LAVA_PALETTE:
          m_blinkin.set(BlinkinPattern.TWINKLES_LAVA_PALETTE);
          break;

        case LEDoption.TWINKLES_FOREST_PALETTE:
          m_blinkin.set(BlinkinPattern.TWINKLES_FOREST_PALETTE);
          break;

        case LEDoption.COLOR_WAVES_RAINBOW_PALETTE:
          m_blinkin.set(BlinkinPattern.COLOR_WAVES_RAINBOW_PALETTE);
          break;

        case LEDoption.COLOR_WAVES_PARTY_PALETTE:
          m_blinkin.set(BlinkinPattern.COLOR_WAVES_PARTY_PALETTE);
          break;

        case LEDoption.COLOR_WAVES_OCEAN_PALETTE:
          m_blinkin.set(BlinkinPattern.COLOR_WAVES_OCEAN_PALETTE);
          break;

        case LEDoption.COLOR_WAVES_LAVA_PALETTE:
          m_blinkin.set(BlinkinPattern.COLOR_WAVES_LAVA_PALETTE);
          break;

        case LEDoption.COLOR_WAVES_FOREST_PALETTE:
          m_blinkin.set(BlinkinPattern.COLOR_WAVES_FOREST_PALETTE);
          break;

        case LEDoption.LARSON_SCANNER_RED:
          m_blinkin.set(BlinkinPattern.LARSON_SCANNER_RED);
          break;

        case LEDoption.LARSON_SCANNER_GRAY:
          m_blinkin.set(BlinkinPattern.LARSON_SCANNER_GRAY);
          break;

        case LEDoption.LIGHT_CHASE_RED:
          m_blinkin.set(BlinkinPattern.LIGHT_CHASE_RED);
          break;

        case LEDoption.LIGHT_CHASE_BLUE:
          m_blinkin.set(BlinkinPattern.LIGHT_CHASE_BLUE);
          break;

        case LEDoption.LIGHT_CHASE_GRAY:
          m_blinkin.set(BlinkinPattern.LIGHT_CHASE_GRAY);
          break;

        case LEDoption.HEARTBEAT_RED:
          m_blinkin.set(BlinkinPattern.HEARTBEAT_RED);
          break;

        case LEDoption.HEARTBEAT_BLUE:
          m_blinkin.set(BlinkinPattern.HEARTBEAT_BLUE);
          break;

        case LEDoption.HEARTBEAT_WHITE:
          m_blinkin.set(BlinkinPattern.HEARTBEAT_WHITE);
          break;

        case LEDoption.HEARTBEAT_GRAY:
          m_blinkin.set(BlinkinPattern.HEARTBEAT_GRAY);
          break;

        case LEDoption.BREATH_RED:
          m_blinkin.set(BlinkinPattern.BREATH_RED);
          break;

        case LEDoption.BREATH_BLUE:
          m_blinkin.set(BlinkinPattern.BREATH_BLUE);
          break;

        case LEDoption.BREATH_GRAY:
          m_blinkin.set(BlinkinPattern.BREATH_GRAY);
          break;

        case LEDoption.STROBE_RED:
          m_blinkin.set(BlinkinPattern.STROBE_RED);
          break;

        case LEDoption.STROBE_BLUE:
          m_blinkin.set(BlinkinPattern.STROBE_BLUE);
          break;

        case LEDoption.STROBE_GOLD:
          m_blinkin.set(BlinkinPattern.STROBE_GOLD);
          break;

        case LEDoption.STROBE_WHITE:
          m_blinkin.set(BlinkinPattern.STROBE_WHITE);
          break;
        //CP1: Color 1 Pattern

        //CP2: Color 2 Pattern

        //CP1_2: Color 1 and 2 Pattern

        //Solid color
        case LEDoption.HOT_PINK:
          m_blinkin.set(BlinkinPattern.HOT_PINK);
          break;

        case LEDoption.DARK_RED:
          m_blinkin.set(BlinkinPattern.DARK_RED);
          break;

        case LEDoption.RED:
          m_blinkin.set(BlinkinPattern.RED);
          break;

        case LEDoption.RED_ORANGE:
          m_blinkin.set(BlinkinPattern.RED_ORANGE);
          break;

        case LEDoption.ORANGE:
          m_blinkin.set(BlinkinPattern.ORANGE);
          break;

        case LEDoption.GOLD:
          m_blinkin.set(BlinkinPattern.GOLD);
          break;

        case LEDoption.YELLOW:
          m_blinkin.set(BlinkinPattern.YELLOW);
          break;

        case LEDoption.LAWN_GREEN:
          m_blinkin.set(BlinkinPattern.LAWN_GREEN);
          break;

        case LEDoption.LIME:
          m_blinkin.set(BlinkinPattern.LIME);
          break;

        case LEDoption.DARK_GREEN:
          m_blinkin.set(BlinkinPattern.DARK_GREEN);
          break;

        case LEDoption.GREEN:
          m_blinkin.set(BlinkinPattern.GREEN);
          break;

        case LEDoption.BLUE_GREEN:
          m_blinkin.set(BlinkinPattern.BLUE_GREEN);
          break;

        case LEDoption.AQUA:
          m_blinkin.set(BlinkinPattern.AQUA);
          break;

        case LEDoption.SKY_BLUE:
          m_blinkin.set(BlinkinPattern.SKY_BLUE);
          break;
        
        case LEDoption.DARK_BLUE:
          m_blinkin.set(BlinkinPattern.DARK_BLUE);
          break;

        case LEDoption.BLUE:
          m_blinkin.set(BlinkinPattern.BLUE);
          break;

        case LEDoption.BLUE_VIOLET:
          m_blinkin.set(BlinkinPattern.BLUE_VIOLET);
          break;

        case LEDoption.VIOLET:
          m_blinkin.set(BlinkinPattern.VIOLET);
          break;

        case LEDoption.WHITE:
          m_blinkin.set(BlinkinPattern.WHITE);
          break;

        case LEDoption.GRAY:
          m_blinkin.set(BlinkinPattern.GRAY);
          break;

        case LEDoption.DARK_GRAY:
          m_blinkin.set(BlinkinPattern.DARK_GRAY);
          break;

        case LEDoption.BLACK:
          m_blinkin.set(BlinkinPattern.BLACK);
          break;

        //Team Color Options
        case LEDoption.TeamColor:
        default:
          //The default led color
          m_blinkin.set(BlinkinPattern.WHITE);
          break;

        case LEDoption.FunTeamColor:
          m_blinkin.set(BlinkinPattern.WHITE);
          break;

      }

      m_ledSelected = m_chooser.getSelected();

  }

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}