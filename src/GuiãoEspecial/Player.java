package GuiãoEspecial;

public class Player {
    private String name;
    private int ID;
    private String team;
    private int Elo;

    public Player(String name, int ID, String team, int Elo){
        this.name = name;
        this.ID = ID;
        this.team = team;
        this.Elo = Elo;
        
    }
    public String getName() {
        return name;
    }
    public int getELo() {
        return Elo;
    }
    public int getID() {
        return ID;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player [Elo=" + Elo + ", ID=" + ID + ", Name=" + name + ", Team=" + team + "]";
    }
}




