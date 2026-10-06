package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Chassi {

DcMotor FrontLeft, FrontRight, BackLeft, BackRight;

 public Chassi(HardwareMap map){
     FrontLeft = map.get(DcMotorEx.class,"motor0");
     FrontRight = map.get(DcMotorEx.class,"motor1");
     BackLeft = map.get(DcMotorEx.class,"motor2");
     BackRight = map.get(DcMotorEx.class,"motor3");
 }

    public void andarfrente(int potencia){
     FrontLeft.setPower(potencia);
     FrontRight.setPower(potencia);
     BackLeft.setPower(potencia);
     BackRight.setPower(potencia);
    }
}


