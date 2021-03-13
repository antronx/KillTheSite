import java.util.ArrayList;

public class DotCom {

    /**
     * Updated method. Arraylist is used
     */
    private ArrayList<String> boat;

    void setLocationCells(ArrayList<String> locationCells) {
        this.boat = locationCells;
    }

    private boolean isAlive = true;

    public boolean getIsAlive() {
        return !(this.boat.isEmpty());
    }


    String checkTheHit(String hit) {
        int index = boat.indexOf(hit);
        String result = "Мимо";
        if (index >= 0) {
            boat.remove(index);
            if (boat.isEmpty()) {
                result = "Корабль потоплен";
            } else result = "Попал";
        }
        return result;
    }


}
