package frc.robot.subsystems.Elevator;

import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;

public class ElevatorIOPheonix6 implements ElevatorIO{
    private final TalonFX motor;
    private final PositionVoltage positionRequest = new PositionVoltage(0).withSlot(0);

    public ElevatorIOPheonix6(){
        motor = new TalonFX(Constants.MotorId);
        motor.getConfigurator().apply(Constants.TalonFxConfig());
    }

    @Override
    public void setHeight(double height) {
        positionRequest.withPosition(height * Constants.ratio);
        motor.setControl(positionRequest);
    }

    @Override
    public void updateInputs(ElevatorIOInputs inputs) {
        inputs.height = motor.getRotorPosition().getValueAsDouble() / Constants.ratio;
    }
}