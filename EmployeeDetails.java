//1-WAP to print employee details and area of trapizoid by usin single method single class access between non static to ststic

class EmployeeDetails
{
    static void areaOfTrapezoid(int a, int b, int h){
        double area = 0.5*(a + b)*h;
        System.out.println("Area of Trapezoid: " + area);
    }
    void employee(){
        int id = 401;
        String name = "Bharath";
        double salary = 150056.50;
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        areaOfTrapezoid(10,12,5);
    }
    public static void main(String[] args)
    {
        EmployeeDetails E1 = new EmployeeDetails();
        E1.employee();
    }
}



//2- by taking one real time example explain about ststic and non static

/*class EmployeeDetails
{
    static void areaOfTrapezoid(int a, int b, int h) // Static method
    {
        double area = 0.5 * (a + b) * h;
        System.out.println("Area of Trapezoid: " + area);
    }
    void employee() // Non-static method
    {
        int id = 402;
        String name = "Sharath";
        double salary = 158765.50;

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        areaOfTrapezoid(10, 20, 5); // Calling static method from non-static method
    }
    public static void main(String[] args)
    {
        EmployeeDetails E1 = new EmployeeDetails();
        E1.employee();
    }
}*/



//3-WAP to print employee details and area of sector with method and paramete and return type access b/w non ststic to ststic

/*class EmployeeDetails
{
    static double areaOfSector(double r, int rad)
    {
        return 0.5 * r * r * rad;
    }

    void mobileDetails()
    {
        String brand = "Samsung";
        int price = 25000;

        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: " + price);

        double area = areaOfSector(7, 8);
        System.out.println("Area of Sector: " + area);
    }

    public static void main(String[] args)
    {
        Mobile m1 = new Mobile();
        m1.mobileDetails();
    }
}*/



//4- by taking one real time example method overloading

/*class EmployeeDetails
{
    
    void calculatePrice(int price)// Method 1
    {
        System.out.println("Mobile Price: " + price);
    }

    
    void calculatePrice(int price, int discount)// Method 2
    {
        int finalPrice = price - discount;
        System.out.println("Price after discount: " + finalPrice);
    }

    
    void calculatePrice(int price, int discount, int tax)// Method 3
    {
        int finalPrice = price - discount + tax;
        System.out.println("Final Price after discount and tax: " + finalPrice);
    }

    public static void main(String[] args)
    {
        MobileShop m = new MobileShop();

        m.calculatePrice(25000);
        m.calculatePrice(25000, 2000);
        m.calculatePrice(25000, 2000, 500);
    }
}*/