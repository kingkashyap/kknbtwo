package com.objectfrontier.training.jdbc.pojo;

public class Address {

    private long id;
    private String street;
    private String city;
    private int postalCode;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public Address(String street, String city, int postalCode) {
        super();

        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
    public Address(long id, String street, String city, int postalCode) {
        super();
        this.id = id;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
    public Address() {
        super();
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((city == null) ? 0 : city.hashCode());
//        result = prime * result + (int) (id ^ (id >>> 32));
//        result = prime * result + postalCode;
//        result = prime * result + ((street == null) ? 0 : street.hashCode());
//        return result;
//    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
//        if (id != other.id)
//            return false;
        if (postalCode != other.postalCode)
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        return true;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Address [id=");
        builder.append(id);
        builder.append(", street=");
        builder.append(street);
        builder.append(", city=");
        builder.append(city);
        builder.append(", postalCode=");
        builder.append(postalCode);
        builder.append("]");
        return builder.toString();
    }



    


}
