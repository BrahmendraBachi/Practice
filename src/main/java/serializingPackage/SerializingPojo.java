package serializingPackage;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SerializingPojo {

    private int id;

    private String name;

    private String gender;

}


class serializing{

    public static void main(String[] args) throws JsonProcessingException {

        SerializingPojo serializingPojo = new SerializingPojo();

        serializingPojo.setId(1);
        serializingPojo.setName("Bachi");
        serializingPojo.setGender("Male");

        System.out.println("  ***Original Object");
        System.out.println(serializingPojo);
        System.out.println("     Class");
        System.out.println(serializingPojo.getClass().getName());

        //Object Mapper is used to serialise objects
        ObjectMapper mapper = new ObjectMapper();

        //method is used to convert string from object
        String jsonString = mapper.writeValueAsString(serializingPojo);

        System.out.println("\n*** after modification");
        System.out.println(jsonString);

        System.out.println("     Class");
        System.out.println(jsonString.getClass().getName());


        SerializingPojo retrievedPojo = mapper.readValue(jsonString, SerializingPojo.class);

        System.out.println("\n*** after retrieving to original Serializing object");
        System.out.println(retrievedPojo);

        System.out.println("     Class");
        System.out.println(retrievedPojo.getClass().getName());


    }

}


