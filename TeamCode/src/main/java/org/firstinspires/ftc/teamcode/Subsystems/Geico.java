package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Geico {
    public final DcMotor Geicowheel;
    public final CRServo wheelLeft;
    public final CRServo wheelRight;
    public final HardwareMap hardwareMap;
    public final Gamepad Driver2;
    public final Gamepad Driver1;
    public final Telemetry telemetry;


    public static double POWER = .5;
    public static double NOPOWER = 0;


    public Geico (OpMode opMode) {

        Driver2 = opMode.gamepad2;
        Driver1 = opMode.gamepad1;
        hardwareMap = opMode.hardwareMap;
        telemetry = opMode.telemetry;

        Geicowheel = hardwareMap.get(DcMotor.class,"Geicowheel" );
        Geicowheel.setDirection(DcMotorSimple.Direction.REVERSE);
        Geicowheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        wheelLeft = hardwareMap.get(CRServo.class,"wheelLeft" );
        wheelRight = hardwareMap.get(CRServo.class,"wheelRight" );

        wheelLeft.setDirection(CRServo.Direction.REVERSE);
        wheelRight.setDirection(CRServo.Direction.REVERSE);

    }
    public void flyWheeelTeleOp() {
        if (Driver2.a) go();
        else stop();
        telemetry.addData("wheel position", Geicowheel.getCurrentPosition());
        telemetry.update();
    }
    public void GeckoWheel() {
        if (Driver2.b){
            Geicowheel.setPower(POWER);
        }
        else {
            Geicowheel.setPower(NOPOWER);
        }
    }
    public void go(){

        Geicowheel.setPower(POWER);
        wheelRight.setPower(POWER);
        wheelLeft.setPower(POWER);
    }
    public void stop(){

        Geicowheel.setPower(NOPOWER);
        wheelRight.setPower(NOPOWER);
        wheelLeft.setPower(NOPOWER);

    }
    public  void setPOWER( ) {
        Geicowheel.setPower(POWER);

    }
}
