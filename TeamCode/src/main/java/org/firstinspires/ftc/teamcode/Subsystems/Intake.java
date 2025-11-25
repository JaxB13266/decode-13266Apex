package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Intake {
    public final DcMotor IntakeWheel;
    public final HardwareMap hardwareMap;
    public final Gamepad Driver2;
    public final Gamepad Driver1;
    public final Telemetry telemetry;
    public static double POWER = 1;
    public static double NOPOWER = 0;

    public Intake (OpMode opMode){
        Driver2 = opMode.gamepad2;
        Driver1 = opMode.gamepad1;
        hardwareMap = opMode.hardwareMap;
        telemetry = opMode.telemetry;

        IntakeWheel = hardwareMap.get(DcMotor.class,"IntakeWheel" );
        IntakeWheel.setDirection(DcMotorSimple.Direction.REVERSE);
        IntakeWheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void IntakeTeleOp() {
        if (Driver2.dpad_up) in();
        else if (Driver2.dpad_down) out();
        else stop();
        telemetry.addData("intake position", IntakeWheel.getCurrentPosition());
        telemetry.update();
    }
    public void in(){
        IntakeWheel.setPower(POWER);
    }
    public void out(){
        IntakeWheel.setPower(-POWER);
    }
    public void stop(){
        IntakeWheel.setPower(NOPOWER);
    }
}
