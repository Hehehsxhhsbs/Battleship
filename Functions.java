class Functions{
	public static final String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
	public static final int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    public static final String[] ships = {"Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"};
    public static final int[] shipLength = {5,4,3,3,2};

	public static void board (String[][] top, String[][] bottom, int player){
		//Top
		System.out.println("\t\t\t Player " + player);
		System.out.print(" ");
		for(int i = 0; i < letters.length; i++){
			System.out.print("    " + letters[i]);
		}
		for(int i = 0; i < numbers.length; i++){
			System.out.println("");
			System.out.print(numbers[i]);
			for(int j = 0; j < top[i].length; j++){
				System.out.print("    " + top[i][j]);
			}	
			System.out.println();
		}
		System.out.println("\n");

		System.out.print(" ");
		for(int i = 0; i < letters.length; i++){
			System.out.print("    " + letters[i]);
		}
		for(int i = 0; i < numbers.length; i++){
			System.out.println("");
			System.out.print(numbers[i]);
			for(int j = 0; j < bottom[i].length; j++){
				System.out.print("    " + bottom[i][j]);
			}	
			System.out.println();
		}
		System.out.println();		
	}

    public static void placeShipsText(int player){
        System.out.println("Player " + player + " place ships:");
        System.out.println("Which ship do you want to place?");
        for(String ship : ships){
            System.out.print(ship + " ");
        }
    }

	public static void placeShips(int row, char colums, String[][] boardToPlace, String dir, String shipType){
        String north = "North";
        String east = "East";
        String south = "South";
        String west = "West";

		int ship;
        //North 1, East 2, South 3, West 4
        /* Ships
         * Carrier 5
         * Battle ship 4
         * cruiser 3
         * Submarine 3
         * Destroyer 2
         */
        int colum = (int)colums - 65;
        if(shipType.equalsIgnoreCase(ships[0])){
            ship = 0;
            boardToPlace[row][colum] = "I";
            if(dir.equalsIgnoreCase(north)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row--;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(east)){
                for(int i = 0; i < shipLength[ship]; i++){
                     
                    colum++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(south)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(west)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum--;
                    boardToPlace[row][colum] = "I";
                }
            }
            ships[ship] = " ";
        }
        else if(shipType.equalsIgnoreCase(ships[1])){
            ship = 1;
            boardToPlace[row][colum] = "I";
            if(dir.equalsIgnoreCase(north)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row--;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(east)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(south)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(west)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum--;
                    boardToPlace[row][colum] = "I";
                }
            }
            ships[ship] = " ";
        }
        else if(shipType.equalsIgnoreCase(ships[2])){
            ship = 2;
            boardToPlace[row][colum] = "I";
            if(dir.equalsIgnoreCase(north)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row--;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(east)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(south)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(west)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum--;
                    boardToPlace[row][colum] = "I";
                }
            }
            ships[ship] = " ";
        }
        else if(shipType.equalsIgnoreCase(ships[3])){
            ship = 3;
            boardToPlace[row][colum] = "I";
            if(dir.equalsIgnoreCase(north)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row--;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(east)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(south)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(west)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum--;
                    boardToPlace[row][colum] = "I";
                }
            }
            ships[ship] = " ";
        }
        else if(shipType.equalsIgnoreCase(ships[4])){
            ship = 4;
            boardToPlace[row][colum] = "I";
           if(dir.equalsIgnoreCase(north)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row--;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(east)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(south)){
                for(int i = 0; i < shipLength[ship]; i++){
                    row++;
                    boardToPlace[row][colum] = "I";
                }
            }
            else if(dir.equalsIgnoreCase(west)){
                for(int i = 0; i < shipLength[ship]; i++){
                    colum--;
                    boardToPlace[row][colum] = "I";
                }
            }
            ships[ship] = " ";
        }  
	}

	public static void shoot(int row, char colums, String[][] target, String[][] map){
			if(checkHit(row, colums, target) == true){
				int colum = (int)colums - 65;
				target[row][colum] = "X";
                map[row][colum] = "X";
			}
			else{
				int colum = (int)colums - 65;
				target[row][colum] = "O";
                map[row][colum] = "O";
			}
	}
	
    private static boolean checkHit(int row, char colums, String[][] target){
		boolean hit = false;
		int colum = (int)colums - 65;
		if(target[row][colum].equals("I")){//I is a ship
			hit = true;
		}
		return hit;
	}
    
    public static boolean hasWon(String[][] fleet){
        boolean hasWon = true;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(fleet[i][j].equals("I")){
                    hasWon = false;
                    break;
                }
            }
        }
        return hasWon;
    }

    public static void resetShips(){
        ships[0] = "Carrier";
        ships[1] = "Battleship";
        ships[2] = "Cruiser";
        ships[3] = "Submarine";
        ships[4] = "Destroyer";
    }
}