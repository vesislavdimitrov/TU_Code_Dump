import java.util.SortedMap;

public class Firm
{
    String name;
    String founding_date;
    String bulstat;


    /*GETTERS AND SETTERS*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFounding_date() {return founding_date;}
    public void setFounding_date(String founding_date) {
        this.founding_date = founding_date;
    }
    public String getBulstat()
    {
        return bulstat;
    }

    public void setBulstat(String bulstat)
    {

        if(bulstat.length() == 10){
            this.bulstat = bulstat;
        }
        else{
            this.bulstat = "Invalid Bulstat";
        }
    }

}
