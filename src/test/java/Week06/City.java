package Week06;

public class City {
    private String name;
    private double latitude;
    private double longitude;

    public City() {
    }

    public City(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * 获取
     * @return name
     *
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * 设置
     * @param latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * 设置
     * @param longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String toString() {
        return "City{name = " + name + ", latitude = " + latitude + ", longitude = " + longitude + "}";
    }
}
