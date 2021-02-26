import java.util.ArrayList;
import java.util.List;

public class PersonDirectory {
    private List<Person> personArrayList = new ArrayList<>();

    public PersonDirectory(){}

    public PersonDirectory(List<Person> l){
        this.personArrayList = l;
    }

    public List<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void addPersonInfo (Person person){
        this.personArrayList.add(person);
    }

}
