package SerializingPackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializingArrayList {

    public static void main(String[] args) throws IOException {

//        List<Integer> values = new ArrayList<>();
//
//        values.add(1);
//        values.add(2);

        //Object Mrapper is a class change
        ObjectMapper mapper = new ObjectMapper();

//        String jsonString = mapper.writeValueAsString(values);
//
//        System.out.println(jsonString);
//
//        List<Integer> newValues = mapper.readValue(jsonString, List.class);
//
//        System.out.println(newValues);

        List<SimplePojo> simplePojos = new ArrayList<>();

        SimplePojo simplePojo = new SimplePojo();

        simplePojo.setId(1);
        simplePojo.setName("Bachi");
        simplePojo.setAge(22);

        simplePojos.add(simplePojo);

        SimplePojo simplePojo1 = new SimplePojo();

        simplePojo1.setId(2);
        simplePojo1.setName("Hari");
        simplePojo.setAge(23);

        simplePojos.add(simplePojo1);

        String json = mapper.writeValueAsString(simplePojos);

        List<SimplePojo> users = mapper.readValue(json, List.class);

        System.out.println(users);




    }

}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class SimplePojo{

    private int id;

    private String name;

    private int age;
}
