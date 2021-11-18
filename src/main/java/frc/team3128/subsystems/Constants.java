package frc.team3128.subsystems;

public class Constants {
    public static class ShooterConstants {
        public static final double SHOOTER_PID_kP = 0;
        public static final double SHOOTER_PID_kI = 0;
        public static final double SHOOTER_PID_kD = 0;
        public static final double SHOOTER_PID_kF = 0;
        public static final int LEFT_SHOOTER_ID = 4; //Left Shooter Motor
        public static final int RIGHT_SHOOTER_ID = 5; //Right Shooter Motor
        public static final int PLATEAU_COUNT = 0; //Number of checks at correct RPM to shoot
        public static final double THRESHOLD_PERCENT = 0.05; //Maximum Percent Error in RPM to still shoot
        public static final int SHOOTER_KS = 0; //Static gain in PID Feed Forward
        public static final int SHOOTER_KV = 0; //Velocity gain in PID Feed Forward
        public static final int SHOOTER_KA = 0; //Acceleration gain PID Feed Forward
        public static final double RPM_THRESHOLD_PERCENT = 0.05;
        public static final double RPM_THRESHOLD_PERCENT_MAX = 0.1;
        public static final double TIME_TO_MAX_THRESHOLD = 5;
    }

    public static class SidekickConstants {
        public static final float SIDEKICK_PID_kP = 0;
        public static final float SIDEKICK_PID_kI = 0;
        public static final float SIDEKICK_PID_kD = 0;
        public static final int SIDEKICK_RPM_THRESHOLD_PERCENT = 0;
        public static final int SIDEKICK_ID = 0;
        public static final int CAN_TIMEOUT = 0;
        public static final double SIDEKICK_kS = 0;
        public static final double SIDEKICK_kV = 0;
    }

    public static class ConversionConstants {
        public static final double ENCODER_TO_RPM = 10*60/Constants.MechanismConstants.ENCODER_RESOLUTION_PER_ROTATION; // (sensor units per 100 ms to rpm)
        public static final double SIDEKICK_ENCODER_TO_RPM = 10*60/MechanismConstants.SIDEKICK_UNITS_PER_ROTATION;
    }
    public static class MechanismConstants {
        public static final double ENCODER_RESOLUTION_PER_ROTATION = 2048;
        public static final double SIDEKICK_UNITS_PER_ROTATION = 4096;
    }
}
