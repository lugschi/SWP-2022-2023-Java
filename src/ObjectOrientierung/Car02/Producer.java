package ObjectOrientierung.Car02;

public class Producer {

    private String name;
    private String homeCountry;
    private double discount;


    public Producer(String name, String homeCountry, double discount) {
        this.name = name;
        this.homeCountry = homeCountry;
        this.discount = discount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


}
