package mybatis.example;

import com.alibaba.fastjson.JSONObject;
import mybatis.example.entity.BaseRequest;
import mybatis.example.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis")
public class MyBatisController {

    private final CarMapper carMapper;

    @Autowired
    public MyBatisController(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

    @RequestMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(JSONObject.toJSONString(carMapper.getAll()));
    }

    @RequestMapping("/target")
    public ResponseEntity<String> testTarget(@RequestBody BaseRequest request) {
        System.out.println(request.getContent());
        return ResponseEntity.ok(JSONObject.toJSONString(carMapper.getTargetBrand(request.getContent())));
    }
}
