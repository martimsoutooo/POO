package GuiãoEspecial;

import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class TournamentManagerMain {
    public static void main(String[] args) {
        TournamentManager chessTournament = new TournamentManager();
        TournamentManager checkersTournament = new TournamentManager();
        boolean  tournamentStarted = false;
     
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("7")) {
            System.out.println("TournamentManager Menu:");
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. Start game");           
            System.out.println("4. New round");
            System.out.println("5. Search player");
            System.out.println("6. Print tournament(s) info");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter player name: ");
                    String playerName = scanner.nextLine();
                    System.out.print("Enter player team: ");
                    String team = scanner.nextLine();
                    System.out.print("Enter tournament (1 for chess, 2 for checkers): ");
                    int tournamentID = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    
                    if(tournamentID == 1){
                        int Elo = new Random().nextInt(100)+1;
                        int id = 0;                    
                        Player newPlayer = new Player(playerName, id++ , team, Elo);
                        chessTournament.addPlayer(newPlayer);
                    }
                    else if(tournamentID == 2){
                        int Elo = new Random().nextInt(50)+1;
                        int id = 0;                    
                        Player newPlayer = new Player(playerName, id++ , team, Elo);
                        checkersTournament.addPlayer(newPlayer);
                    }
                    else {
                        System.out.println("Invalid tournament ID.");
                    }
                    break;
                case "2":
                    System.out.print("Enter player ID: ");
                    int removePlayerID = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    Player removePlayer = null;
                    for (Player player : chessTournament.getPlayers()) {
                        if (player.getID() == removePlayerID) {
                            removePlayer = player;
                            break;
                        }
                    }
                    if (removePlayer != null) {
                        chessTournament.removePlayer(removePlayer);
                    } else {
                        for (Player player : checkersTournament.getPlayers()) {
                            if (player.getID() == removePlayerID) {
                                removePlayer = player;
                                break;
                            }
                        }
                        if (removePlayer != null) {
                            checkersTournament.removePlayer(removePlayer);
                        } else {
                            System.out.println("Player not found.");
                        }
                    }
                    break;
                case "3":
                    
                    if (!tournamentStarted) {
                        System.out.println("Starting tournaments...");
                        tournamentStarted = true;
                    } else {
                        System.out.println("Tournaments already started.");
                    }
                    break;
                case "4":
                    
                    if (chessTournament.tournamentEnded() && checkersTournament.tournamentEnded()) {
                        System.out.println("All tournaments ended.");
                    } else {
                        if (!chessTournament.tournamentEnded()) {
                            System.out.println("Starting new round for chess tournament...");
                            chessTournament.nextRound();
                        }
                        if (!checkersTournament.tournamentEnded()) {
                            System.out.println("Starting new round for checkers tournament...");
                            checkersTournament.nextRound();
                        }
                    }
                    //Não consegui implementar ossistema de rondas e de scores
                    break;
                case "5":
                    
                    System.out.print("Enter player name or ID: ");
                    String searchInput = scanner.nextLine();
                    
                    Player searchResult = null;
                    try {
                        int searchID = Integer.parseInt(searchInput);
                        searchResult = chessTournament.searchForPlayer(searchID);
                        if (searchResult == null) {
                            searchResult = checkersTournament.searchForPlayer(searchID);
                        }
                    } catch (NumberFormatException e) {
                        searchResult = chessTournament.searchForPlayer(searchInput);
                        if (searchResult == null) {
                            searchResult = checkersTournament.searchForPlayer(searchInput);
                        }
                    }
                    if (searchResult != null) {
                        System.out.println("Player found:");
                        System.out.println(searchResult);
                    } else {
                        System.out.println("Player not found.");
                    }
                    break;
                case "6":
                    
                    System.out.println("Chess tournament:");
                    chessTournament.printTournaments();
                    System.out.println("Checkers tournament:");
                    checkersTournament.printTournaments();
                    break;
                case "7":
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice."); 
                    
            } 
           
        }
       scanner.close();
    }
}
