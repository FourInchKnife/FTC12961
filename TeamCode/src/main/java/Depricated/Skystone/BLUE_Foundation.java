////Imports:
//package Depricated.Skystone;
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.util.ElapsedTime;
//import org.firstinspires.ftc.teamcode.FPS.Hardware;
//
///**
// * This program is Checkmate Robotics' Autonomous Program Template.
// */
//
//@Autonomous(name="BLUE_Foundation", group="State")
////@Disabled
//public class BLUE_Foundation extends LinearOpMode {
//
//    /*
//     *  Declare OpMode Members: */
//    Hardware robot = new Hardware();
//
//    private ElapsedTime runtime = new ElapsedTime();
//
//
//    @Override
//    public void runOpMode() {
//        robot.map(hardwareMap);
//
//        waitForStart(); /** START THE PROGRAM */
//        runtime.reset();
//
//
//        robot.leftHook.setPosition(.4);
//        robot.rightHook.setPosition(.6); // up
//        sleep(1200);
//
//        robot.reverse(5000, telemetry);
//        sleep(300);
//
//        robot.strafeRight(9500, telemetry);//, telemetry
//        sleep(300);
//
//        robot.reverse(4500);
//        sleep(300);
//
//        robot.leftHook.setPosition(1);
//        robot.rightHook.setPosition(0); //grab
//        sleep(1200);
//
//        robot.forward(6700); // pull foundation
//        sleep(300);
//
//        robot.rotate(100, telemetry);
//        sleep(300);
//
//        robot.reverse(3000);
//        sleep(1000);
//
//        robot.leftHook.setPosition(.4);
//        robot.rightHook.setPosition(.6); // let go
//        sleep(1200);
//
//        robot.strafeLeft(1300, telemetry); //THIS is where it isn't strafing
//        sleep(300);
//
//        robot.forward(13000, telemetry);
//        sleep(300);
//
//        sleep(999999);
//
//    }
//
//}
