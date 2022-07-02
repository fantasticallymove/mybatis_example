package mybatis.example.entity;

public class Car {
    private Long id;
    private String name;
    private String brand;
    private Long performance;

    public Car() {
    }

    public Car(String name, String brand, Long performance) {
        this.name = name;
        this.brand = brand;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerformance() {
        return performance;
    }

    public void setPerformance(Long performance) {
        this.performance = performance;
    }
}
