
package net.javaguides.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Player;
import net.javaguides.springboot.repository.PlayerRepository;
@Service
public  class PlayerServiceImpl implements PlayerService {
  @Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("playerName"));
	}

	@Override
	public void savePlayer(Player player) {
		
		int irun=player.getInningsRuns();
		int iball=player.getInningsBalls();
		String inotout=player.getInningsNotOut();
		int ifours=player.getInningsFours();
		int isixes=player.getInningsSixes();
		

		int c=0;
		
		int f=0;
		
		if(iball>0) {
			f=1;
			
			
			player.setInningsBalls(0);
	         player.setInningsFours(0);
	        
	         player.setInningsRuns(0);
	 		player.setInningsSixes(0);	
		
        }
		
		
		
		if(iball>0 && inotout.equals("notout")) {
			 c=1;
			 
		}
		
		
        int run=player.getBattingRuns()+irun;
		int in=player.getPlayerBattingInnings()+f;
		int no=player.getBattingNotOut()+c;
		int ball=player.getBattingBalls()+iball;
		int fours=player.getBattingFours()+ifours;
		int sixes=player.getBattingSixes()+isixes;
		int high=player.getBattingHighest();
		
		
		if(high>=irun) {
			player.setBattingHighest(high);
			
		}
		
		else {
			
			player.setBattingHighest(irun);
		}

          
              int b100=player.getBatting100s();
		int b50=player.getBatting50s();
		int h=0;
		int p=0;
		if(irun>99 && irun<200) {
			h=b100+1;
			player.setBatting100s(h);
			
		}
		else if(irun>49 && irun<100) {
			p=b50+1;
			player.setBatting50s(p);
			
		}



		
		
		int out=in-no;
		if(out==0) {
			player.setBattingAverage(run);

		}
		
		if(out>0 ) {
		float avg=(float)run/out;
		player.setBattingAverage(avg);
		}
		
		
		if(ball>0) {
	    float sr=(float)run*100/ball;
	
	     player.setBattingSR(sr);
		}
		
		
	        player.setBattingRuns(run);
	 	    player.setPlayerBattingInnings(in);
	 		player.setBattingNotOut(no);
	 		player.setBattingBalls(ball);
	 		player.setBattingFours(fours);
	 		player.setBattingSixes(sixes);
	     	
		
		
		int iover=player.getInningsOvers();
		int ioverball=player.getInningsOverBalls();
		int iruns=player.getInningsOverruns();
		int iwkt=player.getInningsWickets();
		int imai=player.getInningsMaiidens();
		
		int itball=(iover*6)+ioverball;
		
		int bbir=player.getBowlingBBIRuns();
		int bbiw=player.getBowlingBBI();
		
		if(bbiw>iwkt) {
			player.setBowlingBBI(bbiw);
			player.setBowlingBBIRuns(bbir);
			
	    }
		
		
		else if(iwkt>bbiw){
			player.setBowlingBBI(iwkt);
			player.setBowlingBBIRuns(iruns);
			
		}
		
		else {
			if(bbir>=iruns) {
				player.setBowlingBBI(bbiw);
				player.setBowlingBBIRuns(bbir);
				
				}
			else {
				player.setBowlingBBI(iwkt);
				player.setBowlingBBIRuns(iruns);
				
			}
              			
		}
		
		
		
		int bball=player.getBowlingBalls()+itball;
		int bwt  =player.getBowlingWickets()+iwkt;
		int brun  =player.getBowlingRuns()+iruns;
		int bmai =player.getBowlingMaidens()+imai;
		
	
		
		if(bwt==0) {
			float a=0.0f;
			player.setBowlingAverage(a);
			player.setBowlingSR(a);

		}
		if(brun==0) {
			float a=0.0f;
			player.setBowlingAverage(a);
			player.setBowlingSR(a);

		}
		if(bball==0) {
			float a=0.0f;
			player.setBowlingAverage(a);
			player.setBowlingSR(a);

		}
		
		
		
		if(bwt>0 && bball>0 ) {
			float bsr=(float)bball/bwt;
		    player.setBowlingSR(bsr);
			int over=brun/6;
			int oball=brun%6;
			float ooball=(float)oball/10;
			float overr=(float) over+ooball;
			player.setBowlingOvers(overr);
	
          }
	
		
		
		
		
		if(bwt>0 && brun>0) {
			float bavg=(float)brun/bwt;
			player.setBowlingAverage(bavg);
			float beco=(float)brun*6/bball;
		     player.setBowlingEconomy(beco);
		     
		}
		
		


		player.setBowlingBalls(bball);
		player.setBowlingMaidens(bmai);
		player.setBowlingRuns(brun);
		player.setBowlingWickets(bwt);
		
	

		
		
		player.setInningsOvers(0);
		player.setInningsOverBalls(0);
		player.setInningsOverruns(0);
		player.setInningsWickets(0);
		player.setInningsMaiidens(0);
		
		
		// TODO Auto-generated method stub
	this.playerRepository.save(player);	
	}

	
	
	@Override
	public void deletePlayerByID(long id) {
		// TODO Auto-generated method stub
		this.playerRepository.deleteById(id);	
	}
	
	

	@Override
	public Player getPlayerByID(long id) {
		// TODO Auto-generated method stub
	Optional<Player> optional=playerRepository.findById(id);


		Player player=null;
		   if (optional.isPresent()) {
	            player = optional.get();
	        } else {
	            throw new RuntimeException(" Player not found for id :: " + id);
	        }
	        return player;
		}
	

	@Override
	public List<Player> getmostrun() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("battingRuns").descending());

	}
	

	@Override
	public List<Player> HighestScores() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("battingHighest").descending());

	}

	@Override
	public List<Player> BestBattingAverage() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("battingAverage").descending());

	}

	@Override
	public List<Player> BestBattingStrikeRate() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("battingSR").descending());

	}

	@Override
	public List<Player> MostHundreds() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("batting100s").descending());

	}

	@Override
	public List<Player> MostFifties() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("batting50s").descending());

	}

	@Override
	public List<Player> MostFours() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("battingFours").descending());

	}

	@Override
	public List<Player> MostSixes() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("battingSixes").descending());

	}

	@Override
	public List<Player> MostWickets() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("bowlingWickets").descending());

	}

	@Override
	public List<Player> BestBowlingAverage() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("bowlingAverage"));

	}

	@Override
	public List<Player> BestBowling() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("bowlingBBI").descending().and (Sort.by("bowlingBBIRuns")));

	}

	@Override
	public List<Player> BestEconomy() {
		// TODO Auto-generated method stub
		Player kp=new Player();
	
		return playerRepository.findAll(Sort.by("bowlingEconomy"));

	}

	@Override
	public List<Player> BestBowlingStrikeRate() {
		// TODO Auto-generated method stub
		return playerRepository.findAll(Sort.by("bowlingSR"));

	}


}



