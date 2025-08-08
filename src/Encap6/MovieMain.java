package Encap6;

public class MovieMain {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		
		movie.setTitle("Arrival");
		movie.setDirector("Cristopher Nolan");
		movie.setDuration(461);
		
		System.out.println(movie.getMovieDetails());
	}
	
}
