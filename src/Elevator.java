public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.currentFloor = 1;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor == minFloor ? currentFloor : currentFloor - 1;
    }

    public void moveUp() {
        currentFloor = currentFloor == maxFloor ? currentFloor : currentFloor + 1;
    }

    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor && floor != currentFloor) {
            while (floor != currentFloor) {

                if (floor < currentFloor) {
                    currentFloor -= 1;
                    System.out.println("etag = " + currentFloor);
                } else if (floor > currentFloor) {
                    currentFloor += 1;
                    System.out.println("etag = " + currentFloor);
                }
            }

        } else {
            System.out.println("oSHIBKA");
        }
    }

}


