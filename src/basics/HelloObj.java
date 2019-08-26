package basics;
//every float is a double so you have to force it to be a float by typing capital F at the end of the number
public class HelloObj {

    public static void main(String[] x){

      /*  Hello run = new Hello();
        int results =  run.calc(24,13);
        System.out.println(results);

        float results1 =  run.calc(24.25F,13.25F);
        System.out.println(results1);

        double results3 =  run.calc(24.55,13.55, 55 );
        System.out.println(results3);

        CarWrong probo = new CarWrong();
        probo.make = "toyota";
        probo.model = "probox";

        System.out.println(probo.make);

        CarEnc runner = new CarEnc();
        runner.setMake("vitz");

        System.out.println(runner.getMake());*/

        Train go = new Train();

        go.setTopspeed(3);
        go.setModel("gavanchi");
        go.accelarate();
        System.out.println(go.speed());
        go.accelarate();
        System.out.println(go.distance(11) +"km");
        System.out.println(go.speed());
        go.accelarate();
        System.out.println(go.speed());
       System.out.println(go.distance(12) +"km");
        go.palaLila();



    }
}
