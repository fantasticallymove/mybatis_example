package mybatis.example;

import com.alibaba.fastjson.JSONObject;
import mybatis.example.entity.Car;
import mybatis.example.mapper.CarMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class MybatisExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CarMapper carMapper) {
        return args -> {
            List<Car> cars = Arrays.asList(new Car("Civic", "Honda", 120L),
                    new Car("S5", "Luxgen", 180L));
            cars.forEach(carMapper::insert);

            Collection<Car> cars1 = carMapper.selectAll();
            cars1.forEach(car -> System.out.println(car.getBrand()));

            System.out.println(JSONObject.toJSONString(carMapper.getAll()));
        };
    }
}
