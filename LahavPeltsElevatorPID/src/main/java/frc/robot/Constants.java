// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final int MotorId = 1;
  public static final int ControllerId = 1;
  
  public static final double ratio = 10/(Math.PI*3.23342);

  public static final double IdleHeight = 0;
  public static final double L1Height = 40;
  public static final double L2Height = 60;
  public static final double L3Height = 100;
  public static final double L4Height = 120;

  public static TalonFXConfiguration TalonFxConfig(){
    TalonFXConfiguration config = new TalonFXConfiguration();
    config.Slot0.kP = 3;
    config.Slot0.kI = 0.001;
    config.Slot0.kD = 0.2;
    config.Slot0.kG = 0.17;

    return config;
  }


  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}