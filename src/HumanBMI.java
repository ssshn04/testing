public class HumanBMI {
    private double weight; // вага у кілограмах
    private double height; // зріст у метрах

    // Константи для категорій
    private static final double DEFICIT_THRESHOLD = 18.5;
    private static final double NORMAL_THRESHOLD = 25.0;
    private static final double WARNING_THRESHOLD = 30.0;

    // Конструктор
    public HumanBMI(double weight, double height) {
        this.weight = validateWeight(weight);
        this.height = validateAndConvertHeight(height);
    }

    // Геттери та сеттери
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = validateWeight(weight);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = validateAndConvertHeight(height);
    }

    // Метод для обчислення індексу маси тіла (BMI) з округленням до 2 знаків
    public double calculateBMI() {
        double bmi = weight / (height * height);
        return Math.round(bmi * 100.0) / 100.0;
    }

    // Метод для визначення категорії BMI
    public String getBMICategory() {
        double bmi = calculateBMI();

        if (bmi < DEFICIT_THRESHOLD) {
            return "Deficit";
        } else if (bmi < NORMAL_THRESHOLD) {
            return "Normal";
        } else if (bmi < WARNING_THRESHOLD) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }

    // Приватний метод для перевірки та конвертації зросту
    private double validateAndConvertHeight(double h) {
        if (h <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        // Якщо зріст > 3 м, вважаємо, що користувач ввів см
        if (h > 3) {
            System.out.println("Height seems too large, assuming it's in cm. Converting to meters.");
            h = h / 100.0;
        }
        this.height = h;
        return h;
    }

    // Приватний метод для перевірки ваги
    private double validateWeight(double w) {
        if (w <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0");
        }
        return w;
    }
}
