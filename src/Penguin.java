public class Penguin {

        private float swimmingDepth;



    public Penguin( float swimmingDepth) {

        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }
    public float getSwimmingDepth(){
        return this.swimmingDepth;
    }


    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}