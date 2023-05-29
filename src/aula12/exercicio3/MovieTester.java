package aula12.exercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MovieTester {
    
    public static void printMovies(TreeSet<Movie> movies) {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    public static TreeSet<Movie> sortMoviesByScore(TreeSet<Movie> movies) {
        TreeSet<Movie> sortedMoviesByScore = new TreeSet<Movie>(Comparator.comparing(Movie::getScore).reversed());
        sortedMoviesByScore.addAll(movies);
        return sortedMoviesByScore;
    }

    public static TreeSet<Movie> sortMoviesByDuration(TreeSet<Movie> movies) {
        TreeSet<Movie> sortedMoviesByDuration = new TreeSet<Movie>(Comparator.comparing(Movie::getDuration));
        sortedMoviesByDuration.addAll(movies);
        return sortedMoviesByDuration;
    }

    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Movie> movies = new TreeSet<Movie>();
        HashMap<String, Integer> genreCount = new HashMap<>();

        try {
            Scanner file = new Scanner(new File("movies.txt"));
            file.nextLine();

            while (file.hasNextLine()) {
                String[] line = file.nextLine().split("\t");
                Movie movie = new Movie(line[0], Double.parseDouble(line[1]), line[2], line[3], Integer.parseInt(line[4]));
                movies.add(movie);

                String genre = movie.getGenre();
                genreCount.put(genre, genreCount.getOrDefault(genre, 0) + 1);
            }

            printMovies(movies);

            System.out.println();
            for (Movie m : sortMoviesByScore(movies)) {
                System.out.println(m);
            }

            System.out.println();
            for (Movie m : sortMoviesByDuration(movies)) {
                System.out.println(m);
            }

            System.out.println();

            System.out.println("Gêneros distintos:");
            for (String genre : genreCount.keySet()) {
                int count = genreCount.get(genre);
                System.out.println(genre + ": " + count + " filmes");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("myselection.txt"))) {
                double scoreThreshold = 60.0;
                Scanner sc = new Scanner(System.in);
                System.out.println();
                System.out.print("Insira o gênero- ");
                String selectedGenre = sc.nextLine();
                sc.close(); 
                // Exemplo: "ação". Aqui você pode solicitar o gênero ao usuário se desejar.
        
                for (Movie m : movies) {
                    if (m.getScore() > scoreThreshold && m.getGenre().equalsIgnoreCase(selectedGenre)) {
                        writer.write(m.toString());
                        writer.newLine();
                    }
                }
        
                System.out.println("Filmes com score superior a 60 e do gênero " + selectedGenre + " foram escritos em 'myselection.txt'.");
            } catch (IOException e) {
                System.out.println("Erro ao escrever em 'myselection.txt': " + e);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
