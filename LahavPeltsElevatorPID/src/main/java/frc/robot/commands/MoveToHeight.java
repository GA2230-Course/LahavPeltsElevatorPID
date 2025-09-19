
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Elevator.ElevatorSubsystem;

public class MoveToHeight extends Command{
    private final ElevatorSubsystem elevator;
    private final ElevatorSubsystem.SystemState state;
    public MoveToHeight(ElevatorSubsystem elevator, ElevatorSubsystem.SystemState state){
        this.elevator = elevator;
        this.state = state;
        addRequirements(elevator);
    }
    
    @Override
    public void initialize(){
        this.elevator.setState(state);
    }
}