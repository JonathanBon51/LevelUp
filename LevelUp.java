public class LevelUp {
    public static void main(String[] args)
    {
        final int XP_NEEDED = 1000;
        int currentXp = 0;

        while (currentXp < XP_NEEDED) {
            currentXp += 150;
            System.out.println(currentXp);
        }

        System.out.println("LEVEL UP! FINAL XP total: " + currentXp);
    }
}