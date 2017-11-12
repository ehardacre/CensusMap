package census;

public interface VersionInterface {
	
	/**
	 * @pre - the parameters passed are within the overall grid
	 * @param west - The westernmost column of the search
	 * @param south - The southernmost column of the search
	 * @param east - the easternmost column of the search
	 * @param north - the norhternmost column of the search
	 * @return - the population of the area specified
	 */
	int getPopulation(int west, int south, int east, int north);
}
