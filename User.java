public class User {

    private String name;
    private double weight;
    private double height;
    private String activity;
    private String goal;
    private double bodyFat_percentage;
    private double protein_multiplier;
    private int current_protein;
    private int protein_goal;

    private String MET_GOAL = "Congratulations! You've met your goal";
    private String ADDED_PROTEIN = "Protein Added:";

    public User() {}

    public User(String name) {
        this.name = name;
        current_protein = 0;
    }

    public User(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        current_protein = 0;
    }

    public int calculate_goal() {
        int weightKg = (int) (weight / 2.2);
        protein_multiplier = 2.0;

        protein_goal = (int) (weightKg * protein_multiplier);
        return protein_goal;
    }
    
    public String addProtein(int protein) {
        current_protein += protein;

        if (current_protein > protein_goal)
            return MET_GOAL;
        else {
            return ADDED_PROTEIN + protein;
        }
    }

    public static void main(String[] args) {
        
        User tony = new User("tony", 200.5, 182.88);
        System.out.println(tony.calculate_goal());

        System.out.println(tony.addProtein(20));

    }
}