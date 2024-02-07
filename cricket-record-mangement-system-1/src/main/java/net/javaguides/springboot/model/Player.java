
package net.javaguides.springboot.model;

import org.hibernate.annotations.ColumnDefault;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "players")
public class Player {
	


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(name = "player_name")
	    private String playerName;
	    
	    @Column(name = "player_last_name")
	    private String lastName;
	    
	    @Column(name = "player_age")
	    private String playerAge;

	    @Column(name = "country_name")
	    private String country;

	    @Column(name = "player_role")
	    private String role;
	    
	    @Column(name = "player_batting_sytle")
	    private String playerBattingSytle;
	    
	    
	    @Column(name = "player_bowling_sytle")
	    private String playerBowlingSytle;
	    
	    
	    
	    
	    @Column(name = "player_batting_innings")
	    @ColumnDefault(value="0")
	    private int playerBattingInnings;
	    
	    @Column(name = "batting_runs")
	    @ColumnDefault(value="0")
	    private int battingRuns;
	    
	    @Column(name = "batting_balls")
	    @ColumnDefault(value="0")
	    private int battingBalls;
	    
	    @Column(name = "batting_highest")
	    @ColumnDefault(value="0")
	    private int battingHighest;
	    
	    @Column(columnDefinition= "decimal(13,2) default 0.00" , name = "batting_average")
	    private float battingAverage;
	    
	    @Column(columnDefinition= "decimal(13,2) default 0.00", name = "batting_stikerate")
	    private float battingSR;
	    
	    @Column(name = "batting_notout")
	    @ColumnDefault(value="0")
	    private int battingNotOut;
	    
	    @Column(name = "batting_sixes")
	    @ColumnDefault(value="0")
	    private int battingSixes;
	    
	    @Column(name = "batting_fours")
	    @ColumnDefault(value="0")
	    private int battingFours;
	    
	    @Column(name = "batting_50s")
	    @ColumnDefault(value="0")
	    private int batting50s;
	    
	    @Column(name = "batting_100s")
	   	@ColumnDefault(value="0")
	    private int batting100s;

	   	
	    
	        @Column(name = "player_bowling_innings")
		    @ColumnDefault(value="0")
		    private int playerBowlingInnings;
	   		

		    @Column(name = "bowling_wickets")
		    @ColumnDefault(value="0")
		    private int bowlingWickets;
		    
		    

		    @Column(columnDefinition= "decimal(10,1) default 0.00", name = "bowling_overs")
		    @ColumnDefault(value="0")
		    private float bowlingOvers;
	   	   
		    @Column(name = "bowling_runs")
		    @ColumnDefault(value="0")
		    private int bowlingRuns;
		    
		    @Column(name = "bowling_balls")
		    @ColumnDefault(value="0")
		    private int bowlingBalls;
		    
		    @Column(columnDefinition=" decimal(13,2) default 0.00",name = "bowling_economy")
		    private float bowlingEconomy;
		    
		    @Column(columnDefinition= "decimal(13,2) default 0.00",name = "bowling_average")
		    private float bowlingAverage;
		    
		    
		    @Column(columnDefinition= "decimal(13,2) default 0.00",name = "bowling_SR")
		    private float bowlingSR;
		    
		    @Column(name = "bowling_Maidens")
		    @ColumnDefault(value="0")
		    private int bowlingMaidens;
		    
		    @Column(name = "bowling_BBI")
		    @ColumnDefault(value="0")
		    private int bowlingBBI;
		    
		    @Column(name = "bowling_BBI_Runs")
		    @ColumnDefault(value="0")
		    private int bowlingBBIRuns;
		    
		    
		    
		    
		    

			   //batting innings

		        @Column(name = "inning_runs")
			    @ColumnDefault(value="0")
			    private int inningsRuns;


		        @Column(name = "innings_balls")
			    @ColumnDefault(value="0")
			    private int inningsBalls;
		         

		        @Column(name = "innings_out_notout")
			    private String inningsNotOut;

		        @Column(name = "innings_sixers")
			    @ColumnDefault(value="0")
			    private int inningsSixes;
		         
		        @Column(name = "innings_fours")
			    @ColumnDefault(value="0")
			    private int inningsFours;
		         
		           
		          ///bowling innings

		        @Column(name = "innings_overs")
			    @ColumnDefault(value="0")
			    private int inningsOvers;
		         
		        @Column(name = "innings_over_balls")
			    @ColumnDefault(value="0")
			    private int inningsOverBalls;
		           
		        @Column(name = "innings_over_runs")
				@ColumnDefault(value="0")
				private int inningsOverruns;

		         
		        @Column(name = "innings_wickets")
			    @ColumnDefault(value="0")
			    private int inningsWickets;

		          
		       
		        @Column(name = "innings_maidens")
			    @ColumnDefault(value="0")
			    private int inningsMaiidens;
		         
		    
		    
		    
		    
		    
		    
		    
		    
		    public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getPlayerName() {
				return playerName;
			}

			public void setPlayerName(String playerName) {
				this.playerName = playerName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getPlayerAge() {
				return playerAge;
			}

			public void setPlayerAge(String playerAge) {
				this.playerAge = playerAge;
			}

			public String getCountry() {
				return country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getRole() {
				return role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getPlayerBattingSytle() {
				return playerBattingSytle;
			}

			public void setPlayerBattingSytle(String playerBattingSytle) {
				this.playerBattingSytle = playerBattingSytle;
			}

			public String getPlayerBowlingSytle() {
				return playerBowlingSytle;
			}

			public void setPlayerBowlingSytle(String playerBowlingSytle) {
				this.playerBowlingSytle = playerBowlingSytle;
			}
			
			
			
			
			

			public int getPlayerBattingInnings() {
				return playerBattingInnings;
			}

			public void setPlayerBattingInnings(int playerBattingInnings) {
				this.playerBattingInnings = playerBattingInnings;
			}

			public int getBattingRuns() {
				return battingRuns;
			}

			public void setBattingRuns(int battingRuns) {
				this.battingRuns = battingRuns;
			}

			public int getBattingBalls() {
				return battingBalls;
			}

			public void setBattingBalls(int battingBalls) {
				this.battingBalls = battingBalls;
			}

			public int getBattingHighest() {
				return battingHighest;
			}

			public void setBattingHighest(int battingHighest) {
				this.battingHighest = battingHighest;
			}

			public float getBattingAverage() {
				return battingAverage;
			}

			public void setBattingAverage(float battingAverage) {
				this.battingAverage = battingAverage;
			}

			public float getBattingSR() {
				return battingSR;
			}

			public void setBattingSR(float battingSR) {
				this.battingSR = battingSR;
			}

			public int getBattingNotOut() {
				return battingNotOut;
			}

			public void setBattingNotOut(int battingNotOut) {
				this.battingNotOut = battingNotOut;
			}

			public int getBattingSixes() {
				return battingSixes;
			}

			public void setBattingSixes(int battingSixes) {
				this.battingSixes = battingSixes;
			}

			public int getBattingFours() {
				return battingFours;
			}

			public void setBattingFours(int battingFours) {
				this.battingFours = battingFours;
			}

			public int getBatting50s() {
				return batting50s;
			}

			public void setBatting50s(int batting50s) {
				this.batting50s = batting50s;
			}

			public int getBatting100s() {
				return batting100s;
			}

			public void setBatting100s(int batting100s) {
				this.batting100s = batting100s;
			}
			
			
			
			
			

			public int getPlayerBowlingInnings() {
				return playerBowlingInnings;
			}

			public void setPlayerBowlingInnings(int playerBowlingInnings) {
				this.playerBowlingInnings = playerBowlingInnings;
			}

			public int getBowlingWickets() {
				return bowlingWickets;
			}

			public void setBowlingWickets(int bowlingWickets) {
				this.bowlingWickets = bowlingWickets;
			}

			public float getBowlingOvers() {
				return bowlingOvers;
			}

			public void setBowlingOvers(float bowlingOvers) {
				this.bowlingOvers = bowlingOvers;
			}

			public int getBowlingRuns() {
				return bowlingRuns;
			}

			public void setBowlingRuns(int bowlingRuns) {
				this.bowlingRuns = bowlingRuns;
			}

			public int getBowlingBalls() {
				return bowlingBalls;
			}

			public void setBowlingBalls(int bowlingBalls) {
				this.bowlingBalls = bowlingBalls;
			}

			public float getBowlingEconomy() {
				return bowlingEconomy;
			}

			public void setBowlingEconomy(float bowlingEconomy) {
				this.bowlingEconomy = bowlingEconomy;
			}

			public float getBowlingAverage() {
				return bowlingAverage;
			}

			public void setBowlingAverage(float bowlingAverage) {
				this.bowlingAverage = bowlingAverage;
			}

			public float getBowlingSR() {
				return bowlingSR;
			}

			public void setBowlingSR(float bowlingSR) {
				this.bowlingSR = bowlingSR;
			}

			public int getBowlingMaidens() {
				return bowlingMaidens;
			}

			public void setBowlingMaidens(int bowlingMaidens) {
				this.bowlingMaidens = bowlingMaidens;
			}

			public int getBowlingBBI() {
				return bowlingBBI;
			}

			public void setBowlingBBI(int bowlingBBI) {
				this.bowlingBBI = bowlingBBI;
			}

			public int getBowlingBBIRuns() {
				return bowlingBBIRuns;
			}

			public void setBowlingBBIRuns(int bowlingBBIRuns) {
				this.bowlingBBIRuns = bowlingBBIRuns;
			}
			
			
			
			
			
			
			
			
			
			
			
			

			public int getInningsRuns() {
				return inningsRuns;
			}

			public void setInningsRuns(int inningsRuns) {
				this.inningsRuns = inningsRuns;
			}

			public int getInningsBalls() {
				return inningsBalls;
			}

			public void setInningsBalls(int inningsBalls) {
				this.inningsBalls = inningsBalls;
			}

			public String getInningsNotOut() {
				return inningsNotOut;
			}

			public void setInningsNotOut(String inningsNotOut) {
				this.inningsNotOut = inningsNotOut;
			}

			public int getInningsSixes() {
				return inningsSixes;
			}

			public void setInningsSixes(int inningsSixes) {
				this.inningsSixes = inningsSixes;
			}

			public int getInningsFours() {
				return inningsFours;
			}

			public void setInningsFours(int inningsFours) {
				this.inningsFours = inningsFours;
			}
			
			
			
			
			
			
			
			
			

			public int getInningsOvers() {
				return inningsOvers;
			}

			public void setInningsOvers(int inningsOvers) {
				this.inningsOvers = inningsOvers;
			}

			public int getInningsOverBalls() {
				return inningsOverBalls;
			}

			public void setInningsOverBalls(int inningsOverBalls) {
				this.inningsOverBalls = inningsOverBalls;
			}

			public int getInningsWickets() {
				return inningsWickets;
			}

			public void setInningsWickets(int inningsWickets) {
				this.inningsWickets = inningsWickets;
			}

			public int getInningsMaiidens() {
				return inningsMaiidens;
			}

			public void setInningsMaiidens(int inningsMaiidens) {
				this.inningsMaiidens = inningsMaiidens;
			}

			public int getInningsOverruns() {
				return inningsOverruns;
			}

			public void setInningsOverruns(int inningsOverruns) {
				this.inningsOverruns = inningsOverruns;
			}
		    
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		    
		    
}