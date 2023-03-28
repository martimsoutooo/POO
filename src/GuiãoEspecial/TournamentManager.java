package GuiãoEspecial;

import java.util.ArrayList;

public class TournamentManager implements ITournamentManager {
    private ArrayList<Player> players;
    private int currentRound;
    private boolean tournamentEnded;

    public TournamentManager() {
        this.players = new ArrayList<>();
        this.currentRound = 0;
        this.tournamentEnded = false;
    }

    @Override
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    @Override
    public Player searchForPlayer(String nome) {
        for (Player player : this.players) {
            if (player.getName().equals(nome)) {
                return player;
            }
        }
        return null;
    }

    @Override
    public Player searchForPlayer(int ID) {
        for (Player player : this.players) {
            if (player.getID() == ID) {
                return player;
            }
        }
        return null;
    }

    @Override
    public void printTournaments() {
        System.out.println("Current Round: " + this.currentRound);
        for (Player player : this.players) {
            System.out.println(player.getName() + " - Score: " + player.getScore());
        }
    }

    @Override
    public boolean nextRound() {
        if (this.tournamentEnded) {
            return false;
        }

        this.currentRound++;

        //Não consegui implementar o sistema de rondas e scores 

        if (this.currentRound == 3) { 
            this.tournamentEnded = true;
            return false;
        }

        return true;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    
    public boolean tournamentEnded() {
        return this.tournamentEnded;
    }
    
    public double getSCore() {
        return score;
    }//não ficou implementado
    
}
