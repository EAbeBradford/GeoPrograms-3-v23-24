

public class A4_howITurn extends World {

    public void house() {
        tri();

    }
    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(0);
        plane.pausetime  = 0;
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);

        house();

        plane.isTrail = false;
        plane.move(200);
        plane.isTrail = true;

       house();

        plane.teleport(900, 10);
        house();

    }

    public void tri(){
        plane.move(100);
        plane.turn(120);
        plane.setColor(255, 50, 255);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
    }




}
