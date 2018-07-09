import java.util.List;

import db.DBGolfer;
import models.Golfer;

import java.util.List;



public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Tiger", "Woods", 37);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Donald", "Trump", 72);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("Sean", "Connery", 76);
        DBGolfer.save(golfer3);

        Golfer golfer4 = new Golfer("Rory", "McIlroy", 29);
        DBGolfer.save(golfer4);

        Golfer golfer5 = new Golfer("Jack", "Nicklaus", 78);
        DBGolfer.save(golfer5);



//        This query will return ALL pirates in an Array of pirates:

        List<Golfer> golfers = DBGolfer.getAll();

        Golfer davey = DBGolfer.find(pirate5.getId());

        System.out.println(jack.getFirstName());

        System.exit(0);
    }
}
