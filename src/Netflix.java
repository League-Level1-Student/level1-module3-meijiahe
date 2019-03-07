
public class Netflix {
public static void main(String[] args) {
Movie Spiderman= new Movie("Spiderman", 8);
Movie Paddington= new Movie("Paddington", 8);
Movie A_Quiet_Place= new Movie("A_Quiet_Place", 8);
Movie Crazy_Rich_Asians= new Movie("Crazy_Rich_Asians", 7);
Movie Incredibles_2= new Movie("Incredibles_2", 8);
NetflixQueue bnbb= new NetflixQueue();
bnbb.addMovie(Spiderman);
bnbb.addMovie(Paddington);
bnbb.addMovie(A_Quiet_Place);
bnbb.addMovie(Crazy_Rich_Asians);
bnbb.addMovie(Incredibles_2);
bnbb.printMovies();
System.out.println(bnbb.getBestMovie());
bnbb.sortMoviesByRating();
System.out.println(bnbb.getMovie(1));

}
}
