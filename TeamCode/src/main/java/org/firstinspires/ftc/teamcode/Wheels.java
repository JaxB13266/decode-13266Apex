/*
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Wheels {
    public final Servo wheelLeft;
    public final Servo wheelRight;

    public final HardwareMap hardwareMap;
    public final Gamepad Driver2;
    public final Gamepad Driver1;
    public final Telemetry telemetry;
    public static double POWER = .5;
    public static double NOPOWER = 0;

    public Wheels (OpMode opMode) {

        Driver2 = opMode.gamepad2;
        Driver1 = opMode.gamepad1;
        hardwareMap = opMode.hardwareMap;
        telemetry = opMode.telemetry;

        wheelLeft = hardwareMap.get(Servo.class,"wheelLeft" );
        wheelRight = hardwareMap.get(Servo.class,"wheelRight" );

        wheelLeft.setDirection(Servo.Direction.REVERSE);
        wheelRight.setDirection(Servo.Direction.REVERSE);
    }

    public void rightServo(double position) {wheelRight.setPosition(position);}
    public void leftServo(double position) {wheelLeft.setPosition(position);}
    public void miniWheelsTeleOp() {
        if (Driver2.a) gearUp();
        else gearDown();

    }
    public void gearUp(){
        rightServo(POWER);
        leftServo(POWER);
    }
    public void gearDown(){
        rightServo(NOPOWER);
        leftServo(NOPOWER);
    }

}
*/
