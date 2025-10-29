package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Geico {
    public static double GEICO = 1;
    public final DcMotor Geicowheel;

    public final HardwareMap hardwareMap;
    public final Gamepad Driver2;
    public final Gamepad Driver1;
    public final Telemetry telemetry;


    public static double POWER = 1;
    public static double NOPOWER = 0;


    public Geico (OpMode opMode) {

        Driver2 = opMode.gamepad2;
        Driver1 = opMode.gamepad1;
        hardwareMap = opMode.hardwareMap;
        telemetry = opMode.telemetry;

        Geicowheel = hardwareMap.get(DcMotor.class,"Geicowheel" );
        Geicowheel.setDirection(DcMotorSimple.Direction.REVERSE);
        Geicowheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void flyWheeelTeleOp() {
        if (Driver2.a) go();
        else stop();
        telemetry.addData("wheel position", Geicowheel.getCurrentPosition());
        telemetry.update();
    }
    public void go(){
        Geicowheel.setPower(POWER);
    }
    public void stop(){
        Geicowheel.setPower(NOPOWER);
    }
    public  void setPOWER( ) {
        Geicowheel.setPower(POWER);

    }
}
