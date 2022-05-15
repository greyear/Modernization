public class BonusMilesService {

    public int calculate(int cost) {
        int rublesForAMile = 20;
        int miles = cost / rublesForAMile;

        return miles;
    }
}
