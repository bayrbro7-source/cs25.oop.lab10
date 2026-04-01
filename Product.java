package dl4;

class Product {
    private String name;
    private String category;
    private int price;

    public Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() { return category; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}

