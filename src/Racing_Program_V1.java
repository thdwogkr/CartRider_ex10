public class Racing_Program_V1 {

    public static void main(String[] args) {

        Racing racing = new Racing_MyCar("춘식이");
        Racing_Upgrade racingUpgrade = new Racing_Upgrade("춘식이유료버전");

        racing.start();

        racing.accelerate();
        racing.accelerate_booster(2);
        racing.drift();
        racing.decelerate();

        racingUpgrade.start();

        racingUpgrade.accelerate();
        racingUpgrade.accelerate_booster(2);
        racingUpgrade.drift();
        racingUpgrade.decelerate();


    }



}
