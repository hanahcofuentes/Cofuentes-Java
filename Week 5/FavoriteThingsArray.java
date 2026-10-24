public class FavoriteThingsArray {
    public static void main(String[] args) {

        String[] favorites = {
            "Music",
            "Traveling",
            "Reading",
            "Coffee",
            "Watching Movies"
        };

        System.out.println("=== MY FAVORITE THINGS ===");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total Favorites: " + favorites.length);
    }
}
