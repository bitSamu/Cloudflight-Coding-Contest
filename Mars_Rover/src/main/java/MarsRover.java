/**
 * Mars rover
 */
public class MarsRover {

    //Input
    private float WheelBase;
    private float SteeringAngle;

    //Output
    private float TurnRadius;

    public MarsRover(float WheelBase, float SteeringAngle){
        setWheelBase(WheelBase);
        setSteeringAngle(SteeringAngle);
    }

    /**
     * calculates and puts out the turnradius
     */
    public void calcTurnRadius(){
        //Math.sin() provides a double value, thats why the typecast is there

        TurnRadius = (float) (WheelBase / Math.sin(SteeringAngle));
        roundTurnRadiusOnTwoDigits();
        System.out.println(TurnRadius);
    }

    private void roundTurnRadiusOnTwoDigits(){
        TurnRadius = (float) (Math. round(TurnRadius * 100.0) / 100.0);
    }

    public void setWheelBase(float wheelBase) {
        WheelBase = wheelBase;
    }

    public void setSteeringAngle(float steeringAngle) {
        SteeringAngle = (float) (steeringAngle * Math.PI / 180) ;
    }
}
