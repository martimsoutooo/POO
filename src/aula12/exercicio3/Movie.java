package aula12.exercicio3;

public class Movie {
    private String name;
    private String score;
    private String rating;
    private String duration;
    private String genre;

    public Movie(String name, String score, String rating, String duration, String genre) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public String getRating() {
        return rating;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score='" + score + '\'' +
                ", rating='" + rating + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

}
