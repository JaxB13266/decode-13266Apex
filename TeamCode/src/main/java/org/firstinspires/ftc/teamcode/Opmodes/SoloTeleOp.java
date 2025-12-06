package org.firstinspires.ftc.teamcode.Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Drive.FieldCentric;
import org.firstinspires.ftc.teamcode.Subsystems.Geico;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;
@TeleOp
public class SoloTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        FieldCentric fieldCentricDrive = new FieldCentric(this);
        Geico geico = new Geico(this);
        Intake intake = new Intake(this);
        waitForStart();
        while (opModeIsActive()) {
            fieldCentricDrive.fieldCentricDrive();
            geico.flyWheelSoloTeleOp();
            intake.IntakeTeleOpSolo();
        }
    }
}
