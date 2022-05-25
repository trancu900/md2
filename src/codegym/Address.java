package codegym;

public class Address {
    private String line1;
    private String line2;
    private String street;
    private String city;
    private Location location;

    public Address(String line1, String line2, String street, String city, Location location) {
        this.line1 = line1;
        this.line2 = line2;
        this.street = street;
        this.city = city;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", location=" + location +
                '}';
    }

    public static class Location {
        private double lat;
        private double log;

        public Location(double lat, double log) {
            this.lat = lat;
            this.log = log;
        }

        public double getLat() {
            return lat;
        }

        public double getLog() {
            return log;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "lat=" + lat +
                    ", log=" + log +
                    '}';
        }
    }
}
