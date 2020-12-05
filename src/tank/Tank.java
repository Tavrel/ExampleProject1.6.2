package tank;

public class Tank {
    static final String NAME = "T34-";
    static int tankCount;

    private int xPosition;
    private int yPosition;
    private String view = "up";
    private int fuel;
    private int tankNumber;

    public Tank(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.view = "up";
        this.fuel = 100;
        tankNumber = ++tankCount;
    }
    public Tank(int xPosition, int yPosition, int fuel) {
        this(xPosition, yPosition);
        this.fuel = fuel;
    }
    public Tank() {
        xPosition = 0;
        yPosition = 0;
        fuel = 100;
        tankNumber = ++tankCount;
    }

    public void goForward(int newPosition) {
        if (newPosition < 0) {
            goBackward(newPosition * -1);
        } else {
            if (fuel < newPosition) {
                newPosition = fuel;
            }

            if (view.equals("up")) {
                xPosition = xPosition + newPosition;
            } else if (view.equals("right")) {
                yPosition = yPosition + newPosition;
            } else if (view.equals("down")) {
                xPosition = xPosition - newPosition;
            } else {
                yPosition = yPosition - newPosition;
            }
            fuel = fuel - newPosition;
        }
    }
    public void goBackward(int newPosition) {
        if (newPosition < 0) {
            goForward(newPosition * -1);
        } else {
            if (fuel < newPosition) {
                newPosition = fuel;
            }
            if (view.equals("up")) {
                xPosition = xPosition - newPosition;
            } else if (view.equals("right")) {
                yPosition = yPosition - newPosition;
            } else if (view.equals("down")) {
                xPosition = xPosition + newPosition;
            } else {
                yPosition = yPosition + newPosition;
            }
            fuel = fuel - newPosition;
        }
    }
    public void printPosition() {
        System.out.println("The Tank " + NAME + tankNumber + " is at " + xPosition + ", " + yPosition + " now.");
    }

    public void turnRight() {
        if (view.equals("up")) {
            view = "right";
        } else if (view.equals("right")) {
            view = "down";
        } else if (view.equals("down")) {
            view = "left";
        } else {
            view = "up";
        }
    }

    public void turnLeft() {
        if (view.equals("up")) {
            view = "left";
        } else if (view.equals("right")) {
            view = "up";
        } else if (view.equals("down")) {
            view = "right";
        } else {
            view = "down";
        }
    }
}
