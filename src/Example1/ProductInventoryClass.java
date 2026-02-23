package Example1;

public class ProductInventoryClass {
//    item's name, unit price, and the current stock quantity
    String itemName;
    double UnitPrice;
    int quantity;
    public ProductInventoryClass(String name, double unitPrice, int quantity)
    {
        this.itemName = name;
        this.UnitPrice = unitPrice;
        this.quantity = quantity;
    }
    public double calculatetotal() // method
    {

        return UnitPrice * quantity;
    }
    public static void main(String[] args)
    {
        // here we need to create object
        // classname obj = new class name()
        ProductInventoryClass product = new ProductInventoryClass("laptop", 73.55, 5); // object
        double Karthik = product.calculatetotal(); // var intalized then calling method with object
        System.out.println("Total value is: "  + Karthik);
        ProductInventoryClass item = new ProductInventoryClass("SAI", 55.35, 10);
        double Sai = item.calculatetotal(); // local var
        System.out.println("Total value is: "  + Sai);


    }

}
