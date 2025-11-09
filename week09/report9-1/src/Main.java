public class Main {
    public static void main(String[] args) {

        final int total_legs=102;
        final int total=37;
        final int chicken_leg=2;
        final int dog_leg=4;
        int chicken=0, dog;

        for( ;chicken<=total;chicken++) {
            dog=total-chicken;
            if(dog*dog_leg + chicken*chicken_leg == total_legs) {
                System.out.printf("닭 %d마리, 개 %d마리입니다.\n",chicken,dog);
                break;
            }
        }

        while(chicken<=total) {
            dog=total-chicken;
            if(dog*dog_leg + chicken*chicken_leg == total_legs) {
                System.out.printf("닭 %d마리, 개 %d마리입니다.\n",chicken,dog);
                break;
            }
            chicken++;
        }

        do {
            dog=total-chicken;
            if(chicken_leg*chicken + dog*dog_leg == total_legs) {
                System.out.printf("닭 %d마리, 개 %d마리입니다.\n",chicken,dog);
                break;
            }
            chicken++;
        } while (chicken<=total);
    }
}