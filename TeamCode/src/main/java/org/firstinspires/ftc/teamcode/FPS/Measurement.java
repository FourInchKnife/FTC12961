package org.firstinspires.ftc.teamcode.FPS;
import org.firstinspires.ftc.teamcode.FPS.Inumeration.*;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.JustLoggingAccelerationIntegrator;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.teamcode.FPS.Inumeration.AngleResult;

public class Measurement {
    public BNO055IMU revIMU;
    AngleResult results = new AngleResult();

    public Measurement(BNO055IMU imu, HardwareMap hardwareMap){
        revIMU = imu;
        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;
        parameters.accelUnit = BNO055IMU.AccelUnit.METERS_PERSEC_PERSEC;
        parameters.calibrationDataFile = "BNO055IMUCalibration.json";
        parameters.loggingEnabled = true;
        parameters.loggingTag = "IMU";
        parameters.accelerationIntegrationAlgorithm = new JustLoggingAccelerationIntegrator();
        revIMU = hardwareMap.get(BNO055IMU.class, "imu");
        revIMU.initialize(parameters);
        //startaccelrationintegrations???
    }
    public AngleResult getAngle(){
        revIMU.getPosition();
        results.angle1 = revIMU.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES).firstAngle;
        results.angle2 = revIMU.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES).secondAngle;
        results.angle3 = revIMU.getAngularOrientation(AxesReference.INTRINSIC, AxesOrder.ZYX, AngleUnit.DEGREES).thirdAngle;
        return results;
    }
}