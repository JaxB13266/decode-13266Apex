package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class FieldCentric {
    private final DcMotor leftFront,leftBack,rightFront,rightBack;
    private final HardwareMap hardwareMap;
    private final Gamepad Driver1;
    private final IMU imu;
    double speed= .85;
            public FieldCentric(OpMode opMode) {
                Driver1 = opMode.gamepad1;
                hardwareMap = opMode.hardwareMap;
                imu = hardwareMap.get(IMU.class, "imu");

                leftFront = hardwareMap.get(DcMotor.class, "frontLeft");
                leftBack = hardwareMap.get(DcMotor.class, "backLeft");
                rightFront = hardwareMap.get(DcMotor.class, "frontRight");
                rightBack = hardwareMap.get(DcMotor.class, "backRight");
            }
}
