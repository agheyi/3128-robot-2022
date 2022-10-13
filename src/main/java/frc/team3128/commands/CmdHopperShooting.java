package frc.team3128.commands;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team3128.subsystems.Hopper;
import frc.team3128.subsystems.LimelightSubsystem;
import frc.team3128.subsystems.Shooter;

public class CmdHopperShooting extends CommandBase {

    private Hopper m_hopper;
    private LimelightSubsystem limelights;
    private BooleanSupplier isReady;
    private BooleanSupplier hasValidTarget;
    private BooleanSupplier isAligned;

    public CmdHopperShooting() {
        m_hopper = Hopper.getInstance();
        limelights = LimelightSubsystem.getInstance();

        isReady = Shooter.getInstance()::isReady;
        hasValidTarget = limelights::getShooterHasValidTarget;
        isAligned = limelights::isAligned;

        addRequirements(m_hopper);
    }

    @Override
    public void execute() {
        
        // if limelight on & aligned & ready to shoot (normal shot)
        if ((isAligned.getAsBoolean() && isReady.getAsBoolean())) {
            m_hopper.runHopper();
        // if limelight not on & ready to shoot (ram shot)
        } else if (!hasValidTarget.getAsBoolean() && isReady.getAsBoolean()) {
            m_hopper.runHopper();
        // else, don't shoot yet, and keep balls back
        } else {
            m_hopper.runHopper(-0.1);
        }

    }

    @Override
    public void end(boolean interrupted) {
        m_hopper.stopHopper();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}