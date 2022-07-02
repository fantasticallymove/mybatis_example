package mybatis.example.mapper;

import mybatis.example.entity.Car;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 這邊加上 @Repository 是因為防止IDE報錯
 *
 * @Mapper標籤用來自動化配置 可以利用namespace映射此處的function 也可以直接使用Annotation直接實作
 */
@Repository
@Mapper
public interface CarMapper {

    List<Map<String,Object>> getAll();

    List<Map<String,Object>> getTargetBrand(String brand);

    @Select("select * from car")
    Collection<Car> selectAll();

    @Options(useGeneratedKeys = true)
    @Insert("insert into car(name,brand,performance) values(#{name} , #{brand} , #{performance})")
    void insert(Car car);
}
