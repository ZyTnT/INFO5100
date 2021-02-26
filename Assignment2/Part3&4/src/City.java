import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class City {
    private String cityName;
    private List<Community> communityList = new ArrayList<>();

    public City(){}

    public City(List<Community> l){this.communityList = l;}

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(List<Community> communityList) {
        this.communityList = communityList;
    }

    public void addCommunity(Community coummunity){
        communityList.add(coummunity);
    }

    public void countCommunityPatient(String attribute, PersonDirectory personDirectory){
        for (Community community : this.communityList){
                community.countPatient(personDirectory,attribute);
                community.printCount(attribute);
        }
    }

}
