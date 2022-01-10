public class Base {
    private int id;
    private String name;
    private String driver;
    private String state;
//    private Driver driverinfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        if(driver.equals("")){
            this.driver = "";
        }
        else{
            this.driver = driver;
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
//
//    public Driver getDriverinfo() {
//        return driverinfo;
//    }
//
//    public void setDriverinfo(Driver driverinfo) {
//        this.driverinfo = driverinfo;
//    }

    public static Base outobase(int id, String name, String driver, String state,Driver driverinfo){
        Base outo = new Base();
        outo.id=id;
        outo.name=name;
        outo.driver=driver;
        outo.state=state;
//        outo.driverinfo=driverinfo;
        return outo;
    }
}
