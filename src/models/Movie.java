package models;

public class Movie {
    private String name, format;
    private double rating, sellingPrice, rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.isAvailable = true;
        this.sellingPrice = (format.equals("Blue-Ray") ? 4.25 : 2.25);
        this.rentalPrice = (format.equals("Blue-Ray") ? 1.99 : 0.99);

    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.isAvailable = source.isAvailable;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString() {
        return "\tName: " + name + "\n" + "\tFormat: " + format
                + "\n" + "\tRating: " + rating + "\n" + "\tSelling Price: "
                + sellingPrice + "\n" + "\tRental Price: " + rentalPrice + "\n"
                + "\tAvailability: " + (isAvailable ? "in-stock " : " rented") + "\n";
    }
}
