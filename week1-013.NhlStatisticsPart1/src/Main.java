import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Top then by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Statistics of Sidney Crosby");
        NHLStatistics.searchByPlayer("Crosby"); //pabaigti
        System.out.println("Statistics of Philadephia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("Top players by points in Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
       
        
        
    }
}
