package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleopMain extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        FieldCentric fieldCentricDrive = new FieldCentric(this);
        waitForStart();
        while (opModeIsActive()) {
            fieldCentricDrive.fieldCentric();
        }
    }
}

