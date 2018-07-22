package j_24;

import java.util.ArrayList;
import java.util.List;

public class AutoFactory {

    List<Auto> autoList = new ArrayList<Auto>();

    public void addAuto(Auto auto) {
        autoList.add(auto);
    }

    public void showAllCars() {

        for (Auto auto :autoList) {
            System.out.println(auto);
        }

    }

    public Auto getAuto (Auto auto) {

        Auto candidateAuto = null;
        for (Auto auto1: autoList) {
            if (auto1 == auto) {
                candidateAuto = auto1;
            }
        }
        return  candidateAuto;
    }

    public void  priceUp (int price, Auto auto) {
        auto.price += price;
    }

    public Auto takeAuto(Auto auto) {
        int index = autoList.indexOf(auto);
        return autoList.remove(index);
    }



}
