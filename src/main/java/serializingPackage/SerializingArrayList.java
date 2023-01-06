package serializingPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerializingArrayList {

    public static void main(String[] args) throws IOException {

//        List<Integer> values = new ArrayList<>();
//
//        values.add(1);
//        values.add(2);

        //Object Mapper is a class which changes objects to string and vice versa
        ObjectMapper mapper = new ObjectMapper();

//        String jsonString = mapper.writeValueAsString(values);
//
//        System.out.println(jsonString);
//
//        List<Integer> newValues = mapper.readValue(jsonString, List.class);
//
//        System.out.println(newValues);

        // declaring list of objects
        List<SimplePojo> simplePojos = new ArrayList<>();

        SimplePojo simplePojo = new SimplePojo();

        simplePojo.setId(1);
        simplePojo.setName("Bachi");
        simplePojo.setAge(22);

        // adding an object simplePojo to list
        simplePojos.add(simplePojo);

        SimplePojo simplePojo1 = new SimplePojo();

        simplePojo1.setId(2);
        simplePojo1.setName("Hari");
        simplePojo1.setAge(23);

        // adding an object simplePojo to list
        simplePojos.add(simplePojo1);

        //this method tries to convert List<Objects> to string
        String json = mapper.writeValueAsString(simplePojos);

        System.out.println("\n *** after converting List<Object> into string");
        System.out.println(json);
        System.out.println("\n ***Class is");
        System.out.println(json.getClass().getName());

        //and can retrieve back to original i.e., List<Object>
        List<SimplePojo> users = mapper.readValue(json, List.class);

        System.out.println("\n *** after retrieving back from String to List<Object>");
        System.out.println(users);
        System.out.println("\n ***Class is");
        System.out.println(users.getClass().getName());




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
