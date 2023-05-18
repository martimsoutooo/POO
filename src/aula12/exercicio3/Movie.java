package aula12.exercicio3;

public class Movie implements Comparable{
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int duration;

    public Movie(String name, double score, String rating, String genre, int duration) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.duration = duration;
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }
    
    public double getScore() {
        return this.score;
    }

    public String getRating() {
        return this.rating;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return "Movie{" + "name='" + name + '\'' + ", score=" + score + ", rating='" + rating + '\'' + ", genre='" + genre + '\'' + ", duration=" + duration + '}';
    }

    @Override
    public int compareTo(Object otherMovie) {
        Movie movie = (Movie) otherMovie;
        return this.name.toLowerCase().compareTo(movie.getName().toLowerCase());
    }
}
