import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImErik{

    private final Integer age = 20;
    private final String myDogName = "Steve";
    private final String myLinkedIn = "imerik1";

    public static void main(String[] args){
        System.out.println(myProfile());
        System.out.println(myProfessionalExperience());
        System.out.println(myFavoriteLanguagesAndTechnologies());
    };

    public static String myProfile(){
        return "Hi, my name is Erik and I am a technology enthusiast, study lover and passionate about learning.";
    };

    public static Map<String, String> myProfessionalExperience(){
        Map<String, String> experiences = new HashMap<String, String>();

        experiences.put("Código Fonte TV", "Front-End Developer");
        experiences.put("IBM", "Devolper Intern");
        experiences.put("Código Fonte TV", "Front-End ScreenWriter");
        experiences.put("IBM", "Software Engineer");

        return experiences;
    };

    public static List<String> myFavoriteLanguagesAndTechnologies(){
        List<String> languages = new ArrayList<String>();

        languages.add("JavaScript");
        languages.add("TypeScript");
        languages.add("Java");
        languages.add("SpringBoot");
        languages.add("SQL");
        languages.add("Python");
        languages.add("ReactJs");
        languages.add("VueJs");
        languages.add("C++");
        languages.add("Go");
        languages.add("C");
        languages.add("NodeJs");
        languages.add("MongoDB");
        languages.add("Git");
        languages.add("NextJs");
        languages.add("HTML");
        languages.add("CSS");

        return languages;
    }

}