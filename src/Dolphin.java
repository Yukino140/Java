public class Dolphin  {

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    private float swimmingSpeed;



    public Dolphin( float swimmingSpeed) {

        this.swimmingSpeed = swimmingSpeed;
    }



    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed:" + swimmingSpeed;
    }


}
