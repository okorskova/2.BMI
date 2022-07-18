public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 66.5; //вес в кг
        double bodyHeight = 1.7; //рост в м
        double index = service.calculate(bodyMass, bodyHeight);
        System.out.println(index);
    }
}
