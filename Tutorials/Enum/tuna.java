package Tutorials.Enum;

public enum tuna {

    //numeration are constants
    bucky("Nice","22"),
    mary("cuties","10"),
    julie("Mistake","12");
  //  nicole("","")

    private final String desc;
    private final String year;

    //constructor
    tuna(String description, String birthday){
    desc=description;
    year=birthday;

    }

    public String getDesc() {
        return desc;
    }

    public String getYear() {
        return year;
    }



}
