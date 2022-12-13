package SerializingPackage;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.json.JSONObject;

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

        ObjectMapper mapper = new ObjectMapper();

        String jsonString = mapper.writeValueAsString(serializingPojo);

        System.out.println(jsonString);



//        var jsonValues = new JSONObject(jsonString);
////
//        System.out.println(jsonValues);

//        System.out.println(serializingPojo.);

    }

}


