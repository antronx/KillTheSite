public class DotCom {

    private int[] locationCells;
    private int numberOfHits = 0;

    void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    String checkTheHit(String hit) {
        String hitResult = "Мимо";
        int hitInt = Integer.parseInt(hit);
        for (int cell : locationCells) {
            if (hitInt == cell) {
                numberOfHits++;
                if (numberOfHits == locationCells.length) {
                    hitResult = "Сайт потоплен";
                } else hitResult = "Попал";
            }
        }
        return hitResult;
    }
}
