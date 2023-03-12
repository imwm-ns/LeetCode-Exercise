class ParkingSystems {
    int big = 0;
    int medium = 0;
    int small = 0;

    public ParkingSystems (int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar (int carType) {
        if (carType == 1 && this.big > 0) {
            big--;
            return true;
        }
        else if (carType == 2 && this.medium > 0) {
            medium--;
            return true;
        }
        else if (carType == 3 && this.small > 0) {
            small--;
            return true;
        }
        return false;
    }
}

public class ParkingSystem {
    public static void main(String[] args) {
        ParkingSystems parkingSystem = new ParkingSystems(0, 0, 2);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
    }
}