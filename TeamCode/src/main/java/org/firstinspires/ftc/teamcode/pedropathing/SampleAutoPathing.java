/*
package org.firstinspires.ftc.teamcode.pedropathing;


import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierLine;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.pedropathing.util.Timer;

import org.firstinspires.ftc.teamcode.pedropathing.Constants;


@Autonomous
class    SampleAutoPathing extends OpMode {

    private Follower follower;
    private Timer pathTimer, opModeTimer;

    public PathChain getDriveStartPosShootPos() {
        return driveStartPosShootPos;
    }

    public void setDriveStartPosShootPos(PathChain driveStartPosShootPos) {
        this.driveStartPosShootPos = driveStartPosShootPos;
    }

    public enum PathState {
        //START POSITON_END POSITON
        //DRIVE > MOVEMENT STATE
        //SHOOTING > ATTEMPT TO SCORE BALL THINGY
        DRIVE_STARTPOS_ShootPOS,
        SHOOT_PRELOAD
    }
    PathState pathState;
    private final Pose startPose = new Pose(21.6,123.14018691588785, Math.toRadians(138));
    private final Pose shootingPose = new Pose (59.4392523364486,84.11214953271028, Math.toRadians(180));

    private PathChain driveStartPosShootPos;

    public void buildPaths(){
        // put in cords for starting pose > ending pose
        driveStartPosShootPos = follower . pathBuilder()
                .addPath(new BezierLine(startPose, shootingPose))
                .setLinearHeadingInterpolation(startPose.getHeading(), shootingPose.getHeading())
                .build();
    }

    public void statePathUpdate() {
        switch(pathState) {
            case DRIVE_STARTPOS_ShootPOS:
                follower.followPath(driveStartPosShootPos,true);
               setPathState(PathState.SHOOT_PRELOAD); // reset the timer and make new state
                break;
            case SHOOT_PRELOAD:
                // TODO add logic to flywheel shooter
                // check is follower done it's path?
                if (!follower.isBusy()) {
                    telemetry.addLine("Done Path 1 ");
                    // transition to next state
                }
                break;
            default:
               telemetry.addLine("No State Commanded");




               break;

        }
    }
    public void setPathState(PathState newState){
        pathState = newState;
        pathTimer.resetTimer();
    }


    @Override
    public void init() {
        pathState = PathState.DRIVE_STARTPOS_ShootPOS;
        pathTimer = new Timer();
        opModeTimer = new Timer();
        opModeTimer.resetTimer();
        follower = Constants.createFollower(hardwareMap);
        //TODO add in any other init mechanisms (like our lime light)

        buildPaths();
        follower.setPose(startPose);

    }

    public void start (){
        opModeTimer.resetTimer();
        setPathState(pathState);

    }
    @Override
    public void loop() {

        follower.update();
        statePathUpdate();

       telemetry.addData("path State", pathState.toString());
       telemetry.addData("x", follower.getPose().getX());
       telemetry.addData("y",follower.getPose().getY());
       telemetry.addData("Heading",follower.getPose().getHeading());
       telemetry.addData("Path time",pathTimer.getElapsedTimeSeconds());


    }


}
*/
