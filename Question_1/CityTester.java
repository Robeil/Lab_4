package CS203Course.Lab_4.Question_1;

import java.util.ArrayList;
import java.util.Collections;

public class CityTester {

    public static void main(String[] args) {

        ArrayList<City> cities = new ArrayList<>();

        City asmara = new City("Asmara",56);
        City london = new City("London",34);
        City seattle = new City("Seattle",45);
        City israel = new City("Israel",56);

        cities.add(asmara);
        cities.add(london);
        cities.add(seattle);
        cities.add(israel);


        //comparing cities HERE
        System.out.println("The answer is : "+asmara.equals(london));

        Collections.sort(cities);

        System.out.println("Printing ascending");

        for(City c: cities){
            System.out.println(c.getTemperature());
        }


    }
}
