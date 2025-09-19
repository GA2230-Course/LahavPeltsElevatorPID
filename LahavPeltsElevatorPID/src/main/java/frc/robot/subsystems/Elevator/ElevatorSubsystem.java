package frc.robot.subsystems.Elevator;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.Elevator.ElevatorIO.ElevatorIOInputs;

public class ElevatorSubsystem extends SubsystemBase{
    public enum SystemState{
        Idle,
        L1,
        L2,
        L3,
        L4
    }
    
    private ElevatorIO io;
    private ElevatorIOInputs inputs;
    private SystemState currentState = SystemState.Idle;
    public ElevatorSubsystem(ElevatorIO io){
        this.io = io;
        inputs = new ElevatorIOInputs();
    }

    @Override
    public void periodic() {
        io.updateInputs(inputs);
        System.out.println(inputs.height);

        switch (currentState) {
            case L1:
                io.setHeight(Constants.L1Height);
                break;

            case L2:
                io.setHeight(Constants.L2Height);
                break;

            case L3:
                io.setHeight(Constants.L3Height);
                break;
                
            case L4:
                io.setHeight(Constants.L4Height);
                break;

            case Idle:
                io.setHeight(Constants.IdleHeight);
                break;
            
            default:
                io.setHeight(Constants.IdleHeight);
                break;
        }
    }
    
    public void setState(SystemState state){
        currentState = state;
    }
}