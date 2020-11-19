import java.util.ArrayList;

public class leetcode31 {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem( 1,1,0 );
        System.out.println(parkingSystem.addCar( 1 ));
        System.out.println(parkingSystem.addCar( 2 ));
        System.out.println(parkingSystem.addCar( 3 ));
        System.out.println(parkingSystem.addCar( 1 ));

    }
}

class ParkingSystem {

    private int big;
    private int medium;
    private int small;
    private  int  countBig;
    private  int  countMedium;
    private  int  countSmall;

    public ParkingSystem(int big, int medium, int small) {

      this.big = big;
      this.medium = medium;
      this.small = small;
      countBig = 0;
      countMedium = 0;
      countSmall = 0;

    }

    public boolean addCar(int carType) {

       switch (carType){
           case 1:
               countBig++;

               if (countBig > big){
                   return false;
               }
               break;
           case 2:
               countMedium++;
               if (countMedium > medium){
                   return false;
               }
               break;
           case 3:
               countSmall++;
               if (countSmall > small){
                   return false;
               }
               break;
       }


       return true;
    }
}


