public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(10000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
         SimMonty m = new SimMonty();
         int countRuns = 0;
         myWinTotal = 0;
         int x = 0;
         //0 for stay, 1 for switch, 2 for random
         //you write this...
         for (x=0; x<3;x++){
            myWinTotal = 0;
            for (countRuns = 0;countRuns<numGames;countRuns++){
                myWinTotal+=m.playGame(x);
         }
         System.out.println("Your win rate with the " + (1 + x) + " strategy is " + (myWinTotal * 1.0)/numGames);
         }
         //stop here...
        //  System.out.println("Your win rate is " + (myWinTotal * 1.0)/numGames);
        
    }

}
