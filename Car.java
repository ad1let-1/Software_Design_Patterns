public class Car {
    private final String model;
    private final int year;
    private final String power;
    private final int weight;


    private Car(Builder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.power = builder.power;
        this.weight = builder.weight;

    }
    
    public static class Builder {
        private String model;
        private int year;
        private String power;
        private int weight;
        private int number;

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder power(String power) {
            this.power = power;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }


        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power='" + power + '\'' +
                ", weight=" + weight +
                '}';
    }
}
