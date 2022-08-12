package com.streams.games;

public class LamdaDemo {

	public static void main(String[] args) {
		
		IGames igames = (gamesList)->
		{
			for(String gameName: gamesList)
			{
			 System.out.println(gameName);
			}
		
	};
       String games[]= {"bakestball","football","hockey"
	};
       igames.printGames(games);

}
}
