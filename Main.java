import java.util.Scanner;
class Main {
	
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Scanner AAAAAAAAAAA = new Scanner(System.in);
        String move;
        String shipToPlace;
        String direction;
		int row;
		char colum;
		//10 x 10 board
  	    String[][] player1Attack = {{" "," "," "," "," "," "," "," "," "," "}, 
								{" "," "," "," "," "," "," "," "," "," "}, 
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "}};
	    String[][] player1Fleet = {{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
							    {" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
							    {" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "},
								{" "," "," "," "," "," "," "," "," "," "}};
		//Player 2
        String[][] player2Attack = {{" "," "," "," "," "," "," "," "," "," "},
								    {" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "}};
	    String[][] player2Fleet = {{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "},
									{" "," "," "," "," "," "," "," "," "," "}};	

		//colum = input.next().charAt(0);

        //Place peices
        for(int i = 0; i < 5; i++){
        Functions.board(player1Attack, player1Fleet, 1);
        Functions.placeShipsText(1);
        shipToPlace = input.nextLine();
        System.out.println("\nWhat row do you want to start the ship?");
        row = input.nextInt();
        row--;
        System.out.println("What colum do you want to start the ship?");
        //input.next();
        colum = input.next().charAt(0);
        System.out.println("What direction do you want it to go?  (form this point)");
        input.nextLine();
        direction = input.nextLine();
        Functions.placeShips(row, colum, player1Fleet, direction, shipToPlace);
        
        }
        
        Functions.resetShips();
        System.out.println("\n\t\tPASS \nType and press enter to continue");
        input.next();
        move = input.nextLine();
        
        System.out.println("Player 2 place ships:\n");
        for(int i = 0; i < 5; i++){
            Functions.board(player1Attack, player2Fleet, 2);
            Functions.placeShipsText(2);
            shipToPlace = input.nextLine();
            System.out.println("What row do you want to start the ship?");
            row = input.nextInt();
            row--;
            System.out.println("What colum do you want to start the ship?");
            //input.next();
            colum = input.next().charAt(0);
            System.out.println("What direction do you want it to go?  (form this point)");
            input.next();
            direction = AAAAAAAAAAA.nextLine();
            Functions.placeShips(row, colum, player1Fleet, direction, shipToPlace);
            }

            try{//Sleep
                Thread.sleep(3000);}
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();}
            
            //Pass
            System.out.print("\033[H\033[2J"); //Clear
            System.out.flush();
            System.out.println("\t\tPASS \nType and press enter to continue");
            input.next();
            move = input.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

        //Attacks
        while( true/*(Functions.hasWon(player1Fleet) != true) && (Functions.hasWon(player2Fleet) != true)*/){
            //Player 1 turn
            Functions.board(player1Attack, player1Fleet, 1); //Print
            System.out.println("What row do you want to attack?"); //Get  row
            row = input.nextInt();
            row--;//Makes in array mode
            System.out.println("What colum do you want to attack?");//Get colum
            colum = input.next().charAt(0);
            Functions.shoot(row, colum, player2Fleet, player1Attack);//Shoot
            Functions.board(player1Attack, player1Fleet, 1);//Get board

            try{//Sleep
                Thread.sleep(3000);}
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();}
            
            //Pass
            System.out.print("\033[H\033[2J"); //Clear
            System.out.flush();
            System.out.println("\t\tPASS \nType and press enter to continue");
            input.next();
            move = input.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            //Player 2 turn
            Functions.board(player2Attack, player2Fleet, 2);
            System.out.println("What row do you want to attack?");
            row = input.nextInt();
            row--;
            System.out.println("What colum do you want to attack?");
            colum = input.next().charAt(0);
            Functions.shoot(row, colum, player2Fleet, player1Attack);
            Functions.board(player2Attack, player2Fleet, 2);
            
            try{//Sleep
                Thread.sleep(3000);}
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();}
            
            //Pass
            System.out.print("\033[H\033[2J"); //Clear
            System.out.flush();
            System.out.println("\t\tPASS \nType and press enter to continue");
            input.next();
            move = input.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
		
  }
}