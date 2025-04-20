public class User {

    private String name;
    private double weight;
    private double height;
    private String activity;
    private String goal;
    private double bodyFat_percentage;
    private double protein_multiplier;
    private int protein_goal;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public User(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public int calculate_Intake() {
        int weightKg = (int) (weight / 2.2);
        protein_multiplier = 2.0;

        return (int) (weightKg * protein_multiplier);
    }
    

    public static void main(String[] args) {
        
        User tony = new User("tony", 200.5, 182.88);
        System.out.println(tony.calculate_Intake());
    }
}