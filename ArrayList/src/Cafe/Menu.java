package Cafe;

public class Menu {
    private String code;
    private String name;
    private String  price ;
    private String Size;

    public Menu(String code, String name, String price, String size) {

        this.code = code;
        this.name = name;
        this.price = price;
        Size = size;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return Size;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Size='" + Size + '\'' +
                '}';
    }
}
