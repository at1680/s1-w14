public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(1000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
         SimMonty m = new SimMonty();
         int countRuns = 0;
         myWinTotal = 0;
         int strategy = 1;
         //0 for stay, 1 for switch, 2 for random
         //you write this...
         for (countRuns = 0;countRuns<numGames;countRuns++){
            myWinTotal+=m.playGame(strategy);
         }
         //stop here...
         System.out.println("Your win rate is " + (myWinTotal * 1.0)/numGames);
        
    }

}
