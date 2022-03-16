public class Flycompetition{

        public interface Fly{
                final int players = 5; // Define the number of players in a single contest.
                final double distance = 1000.0; // Define the distance each player flies.
                double calTime(double s); // Calculate number of time consumption of each player.
                double sumTime(double one, double two, double three, double four, double five); // Calculate the total time finishing the test.
                void declare(); // Print out a declaration.
        }

        public static abstract class Thingsfly implements Fly{ // An abstract class that implements the interface Fly
                public double calTime(double s){
                        double time = distance/s;
                        return time;
                }

                public double sumTime(double one, double two, double three, double four, double five){
                        double total = one + two + three + four + five;
                        return total;
                }

                public void declare(){
                        System.out.println("Something is flying!");
                }
        }

        public static class Bird extends Thingsfly{ // A class extends the abstract class Thingsfly
                private double speed = 10;
                @Override
                public void declare(){
                        System.out.println("A bird is flying!");
                }

                public double getSpeed() {
                        return this.speed;
                }

                public void setSpeed(double in) {
                        this.speed = in;
                }
        }

        public static class Plane extends Bird{ // A class extends the class Bird
                private double speed = 1000;
                @Override
                public void declare(){
                        System.out.println("A plane is flying!");
                }
        }

        // A competition starts here
        public static void main(String args[]){

                Bird swan = new Bird();
                swan.setSpeed(50.0);
                double swanTime = swan.calTime(swan.getSpeed());
                swan.declare();

                Bird dove = new Bird();
                dove.setSpeed(80.0);
                double doveTime = dove.calTime(dove.getSpeed());
                dove.declare();

                Bird goose = new Bird();
                goose.setSpeed(20.0);
                double gooseTime = goose.calTime(goose.getSpeed());
                goose.declare();

                Plane bowing = new Plane();
                bowing.setSpeed(5000.0);
                double bowingTime = bowing.calTime(bowing.getSpeed());
                bowing.declare();

                Bird eagle = new Bird();
                eagle.setSpeed(200.0);
                double eagleTime = eagle.calTime(eagle.getSpeed());
                eagle.declare();

                double sum = swan.sumTime(swanTime, doveTime, gooseTime, bowingTime, eagleTime);
                System.out.println("Competetion finished!" + "\n" + "Total time consumption is:" + sum);
                
        }
}
