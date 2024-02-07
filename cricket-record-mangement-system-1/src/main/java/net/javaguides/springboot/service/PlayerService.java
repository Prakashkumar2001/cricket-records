

package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.model.Player;

public interface PlayerService {
  List < Player > getAllPlayers();

	 void savePlayer(Player player);
	
 Player getPlayerByID(long id);
	
    void deletePlayerByID(long id);
     
    List < Player > getmostrun();
   List < Player > HighestScores();
   List < Player > BestBattingAverage	();
 List < Player > BestBattingStrikeRate	();
    List <Player > MostHundreds();
    List < Player > MostFifties();
    List < Player > MostFours();
     List < Player > MostSixes();
   List < Player > MostWickets();

      List < Player > BestBowlingAverage();
      List < Player > BestBowling();
    List < Player > BestEconomy();
  List < Player > BestBowlingStrikeRate();

 
    

     
     
}