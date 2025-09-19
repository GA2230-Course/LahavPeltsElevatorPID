package frc.robot.subsystems.Elevator;

public interface ElevatorIO{
    default void setHeight (double height) { }

    default void updateInputs(ElevatorIOInputs inputs) {}
    public class ElevatorIOInputs{
        public double height;
    }
}