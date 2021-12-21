package pt.up.fe.ldts.example6;

public class Location {
    public String locationLatitude;
    public String locationLongitude;
    public String locationName;
    public Location(String lat, String lon, String name){
        this.locationLatitude=lat;
        this.locationLongitude=lon;
        this.locationName=name;
    }
    public String getLocationLatitude() {
        return locationLatitude;
    }
    public String getLocationLongitude() {
        return locationLongitude;
    }
    public String getLocationName() {
        return locationName;
    }
    public void setLocation(String locationLatitude, String locationLongitude, String locationName){
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.locationName = locationName;
    }

}
