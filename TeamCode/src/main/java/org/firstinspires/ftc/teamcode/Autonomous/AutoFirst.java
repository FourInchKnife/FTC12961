//Imports:
package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.FPS.AutoMovement;


/**
 * This program is Checkmate Robotics' Autonomous Program Template.
 */

@Autonomous(name="Auto 2019/10/19", group="Sky")
//@Disabled
public class AutoFirst extends LinearOpMode {

    /*
     *  Declare OpMode Members: */
    //Ex: private DcMotor exampleMotor = null;
    private DcMotor leftFront, leftBack, rightFront, rightBack, winchTop, winchBottom, intakeLeft, intakeRight = null;
    private Servo leftHook, rightHook, grab, turn;

    private ElapsedTime runtime = new ElapsedTime();

    private AutoMovement robot = new AutoMovement();

    @Override
    public void runOpMode() {

        /**
         * Hardware Variables: */
        //Ex: exampleMotor  = hardwareMap.get(DcMotor.class, "motor");
        leftFront  = hardwareMap.get(DcMotor.class, "LF");
        leftBack = hardwareMap.get(DcMotor.class, "LB");
        rightFront  = hardwareMap.get(DcMotor.class, "RF");
        rightBack = hardwareMap.get(DcMotor.class, "RB");
        intakeLeft = hardwareMap.get(DcMotor.class, "intakeLeft");
        intakeRight = hardwareMap.get(DcMotor.class, "intakeRight");
        winchBottom = hardwareMap.get(DcMotor.class, "winchBottom");
        winchTop = hardwareMap.get(DcMotor.class, "winchTop");
        leftHook = hardwareMap.get(Servo.class, "leftHook");
        rightHook = hardwareMap.get(Servo.class, "rightHook");
        grab = hardwareMap.get(Servo.class, "grab");
        turn = hardwareMap.get(Servo.class, "turn");



        leftFront.setDirection(DcMotor.Direction.FORWARD);
        leftBack.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.REVERSE); // Change to forward after unswitching polarity
        rightBack.setDirection(DcMotor.Direction.REVERSE); // Change to forward after unswitching polarity


        /**
         * Telemetry */
        telemetry.addData("Status", "Ready to run");
        telemetry.update();
        /*
        Wait for driver to hit the start button on the controller:
         */
        waitForStart();
        leftFront.setPower(0.3);
        leftBack.setPower(0.3);
        rightFront.setPower(0.3);
        rightBack.setPower(0.3);
        sleep(2600);
        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);
        sleep(100);
        //intake system succ up block

        leftFront.setPower(-0.25);
        leftBack.setPower(-0.25);
        rightFront.setPower(-0.25);
        rightBack.setPower(-0.25);
        sleep(2000);
        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);
        sleep(100);
        leftFront.setPower(-0.5);
        leftBack.setPower(0.5);
        rightFront.setPower(0.5);
        rightBack.setPower(-0.5);
        sleep(2100);
        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);
        sleep(100);



         sleep(9999999);
         //robot.turn(90, .5);
//         telemetry.addData("2", "2");
//         sleep(30000);
        /**
         * : */


        /**
         * Stop OpMode */

        telemetry.addData("Path", "Complete");
        telemetry.update();
    }
}