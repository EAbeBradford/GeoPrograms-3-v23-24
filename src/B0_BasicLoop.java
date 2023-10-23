public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.trailWidth = 10;
        plane.pausetime = 0;

        for(int a = 10; a>0; a--) { //a is controlling x values left and right
            for (int z = 10; z > 0; z--) { //z is conbtroling y vals so up and down

                plane.setColor(a*15, 0, 255 / z);
                //  plane.startingAngle(360);
                plane.teleport(z * 80,a * 80);//tells me what is x and y

                plane.square(70);
                // plane.move(70);
            }
        }


        for(int i = 0; i < 5; i++){ //number of spprints
            for(int h = 0; h < 15; h++){ // number of pushups
                System.out.println("pushyup " + h);

            }
            System.out.println("sprint " + i);

        }
//        for(int x=0;x<=5;x=x+1) {
//            System.out.println(x);
//            plane.setColor(100 + x * 25, 0, 0);
//            plane.teleport(335,x*110 );
//            plane.square(100);
//
//
//          //  plane.isTrail = true;
//
//        }
    }
}
