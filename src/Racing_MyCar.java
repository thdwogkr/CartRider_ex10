import java.util.Scanner;

public class Racing_MyCar implements Racing {

    String CarNumber;
    Scanner sc = new Scanner(System.in);

    int controlNumber = 0;
    int distance = 0;
    int NORMALSPEED = 10;

    Racing_MyCar(String CarNumber){
        this.CarNumber = CarNumber;

    }

    @Override
    public void start() {
        System.out.printf("%s님, 환영합니다.",CarNumber);
    }

    @Override
    public void accelerate() {
        System.out.println("가속합니다.");
        controlNumber++;
        System.out.print("컨트롤 횟수 : ");
        System.out.println(controlNumber);
        distance += NORMALSPEED;
        System.out.print("주행 거리 : ");
        System.out.print(distance);
        System.out.println("km");
        System.out.println();

    }

    @Override
    public void accelerate_booster(int speed_lv) {
        controlNumber++;
        System.out.println("부스터 가속 " + speed_lv + " 단계");
        System.out.print("컨트롤 횟수 : ");
        System.out.println(controlNumber);
        distance += (speed_lv+1)*NORMALSPEED;
        System.out.print("주행 거리 : ");
        System.out.print(distance);
        System.out.println("km");
        System.out.println();
    }

    @Override
    public void drift() {
        controlNumber++;
        System.out.println("드리프트를 합니다.");
        boolean a = true;`
        while(a) {
            System.out.print("회전 방향 입력 [<] [>] : ");
            String direc = sc.nextLine();
            if( direc.equals("<") ) {
                System.out.println("[왼쪽] 으로 회전합니다.");
                a = false;
            } else if ( direc.equals(">") ) {
                System.out.println("[오른쪽] 으로 회전합니다.");
                a = false;
            } else {
                System.out.println("올바른 키를 입력해주세요.");
            }
        }

        System.out.print("컨트롤 횟수 : ");
        System.out.println(controlNumber);
        distance += 0.5*NORMALSPEED;
        System.out.print("주행 거리 : ");
        System.out.print(distance);
        System.out.println("km");
        System.out.println();
    }

    @Override
    public void decelerate() {
        controlNumber++;
        System.out.println("후진");
        System.out.print("컨트롤 횟수 : ");
        System.out.println(controlNumber);
        distance += (-0.5)*NORMALSPEED;
        System.out.print("주행 거리 : ");
        System.out.print(distance);
        System.out.println("km");
        System.out.println();
    }
}
