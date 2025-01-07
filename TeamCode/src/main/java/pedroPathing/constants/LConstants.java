package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        ThreeWheelConstants.forwardTicksToInches = .001989436789;
        ThreeWheelConstants.strafeTicksToInches = .001989436789;
        ThreeWheelConstants.turnTicksToInches = .001989436789;
        ThreeWheelConstants.leftY = 6.125;
        ThreeWheelConstants.rightY = -6.125;
        ThreeWheelConstants.strafeX = -4.4;
        ThreeWheelConstants.leftEncoder_HardwareMapName = "rightFront";
        ThreeWheelConstants.rightEncoder_HardwareMapName = "leftRear";
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "rightRear";
        ThreeWheelConstants.leftEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.rightEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
    }
}




