import java.io.File;
import java.io.IOException;
import com.example.jack.model.Person;
import com.example.jack.util.Deserializable;
import com.example.jack.util.DeserializableImpl;


public class JacksonTester {
    public static void main(String args[]) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        Person person = new Person(1L,"Jon","Doe",24,new City("Tehran"),new Street("ValiAsr"),new ArrayList<>());
//        objectMapper.writeValueAsString(person);
//
//        objectMapper.writeValue(new File("target/person.json"),person);


        String json = "{\"type\":\"Person\",\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"age\":24,\"city\":{\"name\":\"Tehran\"},\"street\":{\"name\":\"ValiAsr\"},\"emails\":[]}";
        Deserializable deserializable = new DeserializableImpl();
        Person person = deserializable.convertJsonByteToObject(json);
        System.out.println(person.toString());
    }
}