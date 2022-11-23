import java.util.List;

public class HotDrinkMachine extends Machine {
    private final List<Product> products;

    public HotDrinkMachine(List<Product> products) {
        super(products);
        this.products = products;
    }

    @Override
    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("%s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temp) throws IllegalStateException {
        for(Product product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemp() == temp && ((HotDrink) product).getVolume() == volume){
                    return (HotDrink) product;
                }
            }
        }
        throw new IllegalStateException(String.format("%s не найден.", name));
    }
}