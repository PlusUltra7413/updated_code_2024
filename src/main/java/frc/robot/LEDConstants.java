// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import java.util.HashMap;

//import edu.wpi.first.wpilibj.DriverStation;
//import edu.wpi.first.wpilibj.DriverStation.Alliance;
//import edu.wpi.first.wpilibj.motorcontrol.Spark;
//import frc.robot.Constants;
/** Add your docs here. */
final public class LEDConstants {

  public static final class BlinkinPattern {
        /*
         * Fixed Palette Pattern
         */
        public static final double RAINBOW_RAINBOW_PALETTE = -0.99;
        public static final double RAINBOW_PARTY_PALETTE = -0.97;
        public static final double RAINBOW_OCEAN_PALETTE = -0.95;
        public static final double RAINBOW_LAVA_PALETTE = -0.93;
        public static final double RAINBOW_FOREST_PALETTE = -0.91;
        public static final double RAINBOW_WITH_GLITTER = -0.89;
        public static final double CONFETTI = -0.87;
        public static final double SHOT_RED = -0.85;
        public static final double SHOT_BLUE = -0.83;
        public static final double SHOT_WHITE = -0.81;
        public static final double SINELON_RAINBOW_PALETTE = -0.79;
        public static final double SINELON_PARTY_PALETTE = -0.77;
        public static final double SINELON_OCEAN_PALETTE = -0.75;
        public static final double SINELON_LAVA_PALETTE = -0.73;
        public static final double SINELON_FOREST_PALETTE = -0.71;
        public static final double BEATS_PER_MINUTE_RAINBOW_PALETTE = -0.69;
        public static final double BEATS_PER_MINUTE_PARTY_PALETTE = -0.67;
        public static final double BEATS_PER_MINUTE_OCEAN_PALETTE = -0.65;
        public static final double BEATS_PER_MINUTE_LAVA_PALETTE = -0.63;
        public static final double BEATS_PER_MINUTE_FOREST_PALETTE = -0.61;
        public static final double FIRE_MEDIUM = -0.59;
        public static final double FIRE_LARGE = -0.57;
        public static final double TWINKLES_RAINBOW_PALETTE = -0.55;
        public static final double TWINKLES_PARTY_PALETTE = -0.53;
        public static final double TWINKLES_OCEAN_PALETTE = -0.51;
        public static final double TWINKLES_LAVA_PALETTE = -0.49;
        public static final double TWINKLES_FOREST_PALETTE = -0.47;
        public static final double COLOR_WAVES_RAINBOW_PALETTE = -0.45;
        public static final double COLOR_WAVES_PARTY_PALETTE = -0.43;
        public static final double COLOR_WAVES_OCEAN_PALETTE = -0.41;
        public static final double COLOR_WAVES_LAVA_PALETTE = -0.39;
        public static final double COLOR_WAVES_FOREST_PALETTE = -0.37;
        public static final double LARSON_SCANNER_RED = -0.35;
        public static final double LARSON_SCANNER_GRAY = -0.33;
        public static final double LIGHT_CHASE_RED = -0.31; 
        public static final double LIGHT_CHASE_BLUE = -0.29; 
        public static final double LIGHT_CHASE_GRAY = -0.27;
        public static final double HEARTBEAT_RED = -0.25;
        public static final double HEARTBEAT_BLUE = -0.23;
        public static final double HEARTBEAT_WHITE = -0.21;
        public static final double HEARTBEAT_GRAY = -0.19; 
        public static final double BREATH_RED = -0.17;
        public static final double BREATH_BLUE = -0.15;
        public static final double BREATH_GRAY = -0.13;
        public static final double STROBE_RED = -0.11;
        public static final double STROBE_BLUE = -0.09;
        public static final double STROBE_GOLD = -0.07;
        public static final double STROBE_WHITE = -0.05;
        /*
         * CP1: Color 1 Pattern
         */
        public static final double CP1_END_TO_END_BLEND_TO_BLACK = -0.03;
        public static final double CP1_LARSON_SCANNER = -0.01;
        public static final double CP1_LIGHT_CHASE = +0.01;
        public static final double CP1_HEARTBEAT_SLOW = +0.03;
        public static final double CP1_HEARTBEAT_MEDIUM = +0.05;
        public static final double CP1_HEARTBEAT_FAST = +0.07;
        public static final double CP1_BREATH_SLOW = +0.09;
        public static final double CP1_BREATH_FAST = +0.11;
        public static final double CP1_SHOT = +0.13;
        public static final double CP1_STROBE = +0.15;
        /*
         * CP2: Color 2 Pattern
         */
        public static final double CP2_END_TO_END_BLEND_TO_BLACK = +0.17;
        public static final double CP2_LARSON_SCANNER = +0.19;
        public static final double CP2_LIGHT_CHASE = +0.21;
        public static final double CP2_HEARTBEAT_SLOW = +0.23;
        public static final double CP2_HEARTBEAT_MEDIUM = +0.25;
        public static final double CP2_HEARTBEAT_FAST = +0.27;
        public static final double CP2_BREATH_SLOW = +0.29;
        public static final double CP2_BREATH_FAST = +0.31;
        public static final double CP2_SHOT = +0.33;
        public static final double CP2_STROBE = +0.35;
        /*
         * CP1_2: Color 1 and 2 Pattern
         */
        public static final double CP1_2_SPARKLE_1_ON_2 = +0.37;
        public static final double CP1_2_SPARKLE_2_ON_1 = +0.39; 
        public static final double CP1_2_COLOR_GRADIENT = +0.41;
        public static final double CP1_2_BEATS_PER_MINUTE = +0.43;
        public static final double CP1_2_END_TO_END_BLEND_1_TO_2 = +0.45;
        public static final double CP1_2_END_TO_END_BLEND = +0.47;
        public static final double CP1_2_NO_BLENDING = +0.49;
        public static final double CP1_2_TWINKLES = +0.51;
        public static final double CP1_2_COLOR_WAVES = +0.53;
        public static final double CP1_2_SINELON = +0.55;
        /*
         * Solid color
         */
        public static final double HOT_PINK = +0.57;
        public static final double DARK_RED = +0.59;
        public static final double RED = +0.61;
        public static final double RED_ORANGE = +0.63;
        public static final double ORANGE = +0.65;
        public static final double GOLD = +0.67;
        public static final double YELLOW = +0.69;
        public static final double LAWN_GREEN = +0.71;
        public static final double LIME = +0.73;
        public static final double DARK_GREEN = +0.75;
        public static final double GREEN = +0.77;
        public static final double BLUE_GREEN = +0.79;
        public static final double AQUA = +0.81;
        public static final double SKY_BLUE = +0.83;
        public static final double DARK_BLUE = +0.85;
        public static final double BLUE = +0.87;
        public static final double BLUE_VIOLET = +0.89;
        public static final double VIOLET = +0.91;
        public static final double WHITE = +0.93;
        public static final double GRAY = +0.95;
        public static final double DARK_GRAY = +0.97;
        public static final double BLACK = +0.99;
    }

    public static final class LEDoption {

        /*
         * Fixed Palette Pattern
         */
        public static final String RAINBOW_RAINBOW_PALETTE = "RAINBOW_RAINBOW_PALETTE";
        public static final String RAINBOW_PARTY_PALETTE = "RAINBOW_PARTY_PALETTE";
        public static final String RAINBOW_OCEAN_PALETTE = "RAINBOW_OCEAN_PALETTE";
        public static final String RAINBOW_LAVA_PALETTE = "RAINBOW_LAVA_PALETTE";
        public static final String RAINBOW_FOREST_PALETTE = "RAINBOW_FOREST_PALETTE";
        public static final String RAINBOW_WITH_GLITTER = "RAINBOW_WITH_GLITTER";
        public static final String CONFETTI = "CONFETTI";
        public static final String SHOT_RED = "SHOT_RED";
        public static final String SHOT_BLUE = "SHOT_BLUE";
        public static final String SHOT_WHITE = "SHOT_WHITE";
        public static final String SINELON_RAINBOW_PALETTE = "SINELON_RAINBOW_PALETTE";
        public static final String SINELON_PARTY_PALETTE = "SINELON_PARTY_PALETTE";
        public static final String SINELON_OCEAN_PALETTE = "SINELON_OCEAN_PALETTE";
        public static final String SINELON_LAVA_PALETTE = "SINELON_LAVA_PALETTE";
        public static final String SINELON_FOREST_PALETTE = "SINELON_FOREST_PALETTE";
        public static final String BEATS_PER_MINUTE_RAINBOW_PALETTE = "BEATS_PER_MINUTE_RAINBOW_PALETTE";
        public static final String BEATS_PER_MINUTE_PARTY_PALETTE = "BEATS_PER_MINUTE_PARTY_PALETTE";
        public static final String BEATS_PER_MINUTE_OCEAN_PALETTE = "BEATS_PER_MINUTE_OCEAN_PALETTE";
        public static final String BEATS_PER_MINUTE_LAVA_PALETTE = "BEATS_PER_MINUTE_LAVA_PALETTE";
        public static final String BEATS_PER_MINUTE_FOREST_PALETTE = "BEATS_PER_MINUTE_FOREST_PALETTE";
        public static final String FIRE_MEDIUM = "FIRE_MEDIUM";
        public static final String FIRE_LARGE = "FIRE_LARGE";
        public static final String TWINKLES_RAINBOW_PALETTE = "TWINKLES_RAINBOW_PALETTE";
        public static final String TWINKLES_PARTY_PALETTE = "TWINKLES_PARTY_PALETTE";
        public static final String TWINKLES_OCEAN_PALETTE = "TWINKLES_OCEAN_PALETTE";
        public static final String TWINKLES_LAVA_PALETTE = "TWINKLES_LAVA_PALETTE";
        public static final String TWINKLES_FOREST_PALETTE = "TWINKLES_FOREST_PALETTE";
        public static final String COLOR_WAVES_RAINBOW_PALETTE = "COLOR_WAVES_RAINBOW_PALETTE";
        public static final String COLOR_WAVES_PARTY_PALETTE = "COLOR_WAVES_PARTY_PALETTE";
        public static final String COLOR_WAVES_OCEAN_PALETTE = "COLOR_WAVES_OCEAN_PALETTE";
        public static final String COLOR_WAVES_LAVA_PALETTE = "COLOR_WAVES_LAVA_PALETTE";
        public static final String COLOR_WAVES_FOREST_PALETTE = "COLOR_WAVES_FOREST_PALETTE";
        public static final String LARSON_SCANNER_RED = "LARSON_SCANNER_RED";
        public static final String LARSON_SCANNER_GRAY = "LARSON_SCANNER_GRAY";
        public static final String LIGHT_CHASE_RED = "LIGHT_CHASE_RED"; 
        public static final String LIGHT_CHASE_BLUE = "LIGHT_CHASE_BLUE"; 
        public static final String LIGHT_CHASE_GRAY = "LIGHT_CHASE_GRAY";
        public static final String HEARTBEAT_RED = "HEARTBEAT_RED";
        public static final String HEARTBEAT_BLUE = "HEARTBEAT_BLUE";
        public static final String HEARTBEAT_WHITE = "HEARTBEAT_WHITE";
        public static final String HEARTBEAT_GRAY = "HEARTBEAT_GRAY"; 
        public static final String BREATH_RED = "BREATH_RED";
        public static final String BREATH_BLUE = "BREATH_BLUE";
        public static final String BREATH_GRAY = "BREATH_GRAY";
        public static final String STROBE_RED = "STROBE_RED";
        public static final String STROBE_BLUE = "STROBE_BLUE";
        public static final String STROBE_GOLD = "STROBE_GOLD";
        public static final String STROBE_WHITE = "STROBE_WHITE";
        /*
         * CP1: Color 1 Pattern
         */
        public static final String CP1_END_TO_END_BLEND_TO_BLACK = "CP1_END_TO_END_BLEND_TO_BLACK";
        public static final String CP1_LARSON_SCANNER = "CP1_LARSON_SCANNER";
        public static final String CP1_LIGHT_CHASE = "CP1_LIGHT_CHASE";
        public static final String CP1_HEARTBEAT_SLOW = "CP1_HEARTBEAT_SLOW";
        public static final String CP1_HEARTBEAT_MEDIUM = "CP1_HEARTBEAT_MEDIUM";
        public static final String CP1_HEARTBEAT_FAST = "CP1_HEARTBEAT_FAST";
        public static final String CP1_BREATH_SLOW = "CP1_BREATH_SLOW";
        public static final String CP1_BREATH_FAST = "CP1_BREATH_FAST";
        public static final String CP1_SHOT = "CP1_SHOT";
        public static final String CP1_STROBE = "CP1_STROBE";
        /*
         * CP2: Color 2 Pattern
         */
        public static final String CP2_END_TO_END_BLEND_TO_BLACK = "CP2_END_TO_END_BLEND_TO_BLACK";
        public static final String CP2_LARSON_SCANNER = "CP2_LARSON_SCANNER";
        public static final String CP2_LIGHT_CHASE = "CP2_LIGHT_CHASE";
        public static final String CP2_HEARTBEAT_SLOW = "CP2_HEARTBEAT_SLOW";
        public static final String CP2_HEARTBEAT_MEDIUM = "CP2_HEARTBEAT_MEDIUM";
        public static final String CP2_HEARTBEAT_FAST = "CP2_HEARTBEAT_FAST";
        public static final String CP2_BREATH_SLOW = "CP2_BREATH_SLOW";
        public static final String CP2_BREATH_FAST = "CP2_BREATH_FAST";
        public static final String CP2_SHOT = "CP2_SHOT";
        public static final String CP2_STROBE = "CP2_STROBE";
        /*
         * CP1_2: Color 1 and 2 Pattern
         */
        public static final String CP1_2_SPARKLE_1_ON_2 = "CP1_2_SPARKLE_1_ON_2";
        public static final String CP1_2_SPARKLE_2_ON_1 = "CP1_2_SPARKLE_2_ON_1"; 
        public static final String CP1_2_COLOR_GRADIENT = "CP1_2_COLOR_GRADIENT";
        public static final String CP1_2_BEATS_PER_MINUTE = "CP1_2_BEATS_PER_MINUTE";
        public static final String CP1_2_END_TO_END_BLEND_1_TO_2 = "CP1_2_END_TO_END_BLEND_1_TO_2";
        public static final String CP1_2_END_TO_END_BLEND = "CP1_2_END_TO_END_BLEND";
        public static final String CP1_2_NO_BLENDING = "CP1_2_NO_BLENDING";
        public static final String CP1_2_TWINKLES = "CP1_2_TWINKLES";
        public static final String CP1_2_COLOR_WAVES = "CP1_2_COLOR_WAVES";
        public static final String CP1_2_SINELON = "CP1_2_SINELON";
        /*
         * Solid color
         */
        public static final String HOT_PINK = "HOT_PINK";
        public static final String DARK_RED = "DARK_RED";
        public static final String RED = "RED";
        public static final String RED_ORANGE = "RED_ORANGE";
        public static final String ORANGE = "ORANGE";
        public static final String GOLD = "GOLD";
        public static final String YELLOW = "YELLOW";
        public static final String LAWN_GREEN = "LAWN_GREEN";
        public static final String LIME = "LIME";
        public static final String DARK_GREEN = "DARK_GREEN";
        public static final String GREEN = "GREEN";
        public static final String BLUE_GREEN = "BLUE_GREEN";
        public static final String AQUA = "AQUA";
        public static final String SKY_BLUE = "SKY_BLUE";
        public static final String DARK_BLUE = "DARK_BLUE";
        public static final String BLUE = "BLUE";
        public static final String BLUE_VIOLET = "BLUE_VIOLET";
        public static final String VIOLET = "VIOLET";
        public static final String WHITE = "WHITE"; 
        public static final String GRAY = "GRAY";
        public static final String DARK_GRAY = "DARK_GRAY";
        public static final String BLACK = "BLACK";

        /*
         * Team Color Options
         */
        public static final String TeamColor = "Team Color"; //DefaultOption
        public static final String FunTeamColor = "Fun Team Color";
    }

}

