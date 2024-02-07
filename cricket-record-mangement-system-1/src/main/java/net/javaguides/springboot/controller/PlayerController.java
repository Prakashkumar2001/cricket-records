
package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.model.Player;
import net.javaguides.springboot.service.PlayerService;


@Controller
public class PlayerController {
	
	
	@Autowired
	 private PlayerService playerService;

	    // display list of employees
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("listplayers", playerService.getAllPlayers());
	        return "index";
	        
	    }
	    
	    
	    
	     @GetMapping("/batingperformance")
		 public String batingperformancepage(Model model) {
		 model.addAttribute("listplayers", playerService.getAllPlayers());
		 return "batingperformance";
		        
	     }
	     
	     
	      @GetMapping("/bowlingperformance")
		  public String bowlingformancepage(Model model) {
		  model.addAttribute("listplayers", playerService.getAllPlayers());
		  return "bowlingperformance";
		        
	      }
	      
	      
	      
	   @GetMapping("/showNewPlayerForm")
	    public String showNewPlayerForm(Model model) {
	    	Player player=new Player();
	    	model.addAttribute("player",player);
	    	return "new_player";
	    }
	   
	   
	   
	   
	   @GetMapping("/showFormForUpdate/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

	        // get employee from the service
	        Player player = playerService.getPlayerByID(id);

	        // set employee as a model attribute to pre-populate the form
	        model.addAttribute("player", player);
	        return "update_player";
	   
	   }
	   
	   
	   
	   
	   @PostMapping("/savePlayer")
	    public String savePlayer(@ModelAttribute("player") Player player) {
	    
	    playerService.savePlayer(player);
	    	return "redirect:/";
	    }
	   
	   
	   
	    @GetMapping("/deletePlayer/{id}")
	    public String deletePlayer(@PathVariable (value="id") long id) {
	    	this.playerService.deletePlayerByID(id);
	    	return "redirect:/";
	    }
	    
	    
	   
	    @GetMapping("/playerDetails/{id}")
	    public String playerDetails(@PathVariable(value = "id") long id, Model model) {

	        // get employee from the service
	        Player player = playerService.getPlayerByID(id);

	        // set employee as a model attribute to pre-populate the form
	        model.addAttribute("player", player);
	        return "Player_details";
	   
	   }
	    
	   
	    @GetMapping("/battingStat")
	    public String viewBattingstat() {
	      
	        return "Battingstats";
	    }
	    
	    
	    
	    @GetMapping("/bowlingStat")
	    public String viewBowlingstat() {
	        
	        return "Bowlingstats";
	    }
	    
	    

        @GetMapping("/mostrun")
	    public String mostrunbatting(Model model) {
	        model.addAttribute("listplayers", playerService.getmostrun());
	        return "1MostRun";
	        
        } 
	    
	    
       @GetMapping("/HighestScores")
	    public String HighestScoresbat	(Model model) {
	        model.addAttribute("listplayers", playerService.HighestScores());
	        return "2HighestScores";
	        
      }
       
       
       
        @GetMapping("/BestBattingAverage")
	    public String BestBattingAveragebat	(Model model) {
	        model.addAttribute("listplayers", playerService.BestBattingAverage());
	   
	        return "3BestBattingAverage";
	        
       } 
	    
	    
        @GetMapping("/BestBattingStrikeRate")
	    public String BestBattingStrikeRatebat	(Model model) {
	        model.addAttribute("listplayers", playerService.BestBattingStrikeRate());
	        return "4BestBattingStrikeRate";
	        
      } 
        

        @GetMapping("/MostHundreds")
	    public String MostHundredsbat	(Model model) {
	        model.addAttribute("listplayers", playerService.MostHundreds());
	        return "5MostHundreds";
	        
        } 
	    
	    
        @GetMapping("/MostFifties")
	    public String MostFiftiesbat	(Model model) {
	        model.addAttribute("listplayers", playerService.MostFifties());
	        return "6MostFifties";
	        
       } 
        

        @GetMapping("/MostFours")
	    public String MostFoursbat(Model model) {
	        model.addAttribute("listplayers", playerService.MostFours());
	        return "7MostFours";
	        
          } 
	    
	    
        @GetMapping("/MostSixes")
	    public String MostSixesbat(Model model) {
	        model.addAttribute("listplayers", playerService.MostSixes());
	        return "8MostSixes";
	        
        } 
        
        
        

        @GetMapping("/MostWickets")
	    public String MostWicketsbowl	(Model model) {
	        model.addAttribute("listplayers", playerService.MostWickets());
	        return "9MostWickets";
	        
    } 
	    
	    
        @GetMapping("/BestBowlingAverage")
	    public String BestBowlingAveragebowl	(Model model) {
	        model.addAttribute("listplayers", playerService.BestBowlingAverage());
	        return "9BestBowlingAverage";
	        
    } 
        
        
        

        @GetMapping("/BestBowling")
	    public String BestBowlingbowl	(Model model) {
	        model.addAttribute("listplayers", playerService.BestBowling());
	        return "9BestBowling";
	        
    } 
	    
	    
        @GetMapping("/BestEconomy")
	    public String BestEconomybowl	(Model model) {
	        model.addAttribute("listplayers", playerService.BestEconomy());
	        return "9BestEconomy";
	        
    } 
        
        

        @GetMapping("/BestBowlingStrikeRate")
	    public String BestBowlingStrikeRatebowl(Model model) {
	        model.addAttribute("listplayers", playerService.BestBowlingStrikeRate());
	        return "9BestBowlingStrikeRate";
	        
     } 
	    
	    
       

}



