package codegym.oop.nested.clazz;

public class Address {
    String line1;
    String street;
    String city;
    Location location;

    Address(String line1, String street, String city, Location location) {
        this.line1 = line1;
        this.street = street;
        this.city = city;
        this.location = location;
    }



    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", location=" + location +
                '}';
    }

    static class Location {
        double _long;
        double _lat;

        Location(double _long, double _lat) {
            this._long = _long;
            this._lat = _lat;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "_long=" + _long +
                    ", _lat=" + _lat +
                    '}';
        }
    }
}
