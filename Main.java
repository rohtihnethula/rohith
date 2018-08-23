import java.util.*;
class Ecom
{
    Scanner s=new Scanner(System.in);
    private List<String> pname;
    private List<float> price;
    private List<String>Category;
    private List<Integer>Quantity;
    private List<String> purchase;
    private List<String> Expiry;
    public Ecom()
    {
        pname=new ArrayList<String>();
        price=new ArrayList<float>();
        Category=new ArrayList<String>();
        Quantity=new ArrayList<Integer>();
        purchase=new ArrayList<String>();
        Expiry=new ArrayList<String>();
    }
    public void setPname(String s)
    {
        pname.add(s);
    }
    public void setPrice(float f)
    {
        price.add(f);
    }
    public void setCategory(String s)
    {
        Category.add(s);
    }
    public void setQuantity(Integer i)
    {
        Quantity.add(i);
    }
    public void setPurchase(String s)
    {
        purchase.add(s);
    }
    public void setExpiry(String s)
    {
        expiry.add(s);
    }
    public String getPname(int f)
    {   
            return pname.get(f);
    }
    public float getPrice(int f)
    {
        return price.get(f);
    }
    public String getCategory(int f)
    {
        return Category.get(f);
    }
    public Integer Quantity(int f)
    {
        return Quantity.get(f);
    }
    public String getPurchase(int f)
    {
        return purchase.get(f);
    }
    public String getExpiry(int f)
    {
        return expiry.get(int f);
    }
    public int addProduct()
    {
        int f=0;
        System.out.println("Enter the details");
        System.out.println("Category:\n1.A\n2.B\n3.C\n4.D");
        System.out.println("Enter one of the above Category\n");
        char a=s.nextChar();
        switch(a)
        {
            case 'A':   this.setCategory('A');
                        System.out.println("Enter product name\n");
                        this.setPname(s.next());
                        System.out.println("Enter price\n");
                        this.setPrice(s.nextFloat());
                        System.out.println("Enter Quantity in terms of units");
                        this.setQuantity(s.nextInt());
                        System.out.println("Enter purchase date\n");
                        this.setPurchase(s.next());
                        System.out.println("Enter Expiry date\n");
                        this.setPurchase(s.next());
                        f=0;
                        break;
            case 'B':
                        this.setCategory('B');
                        System.out.println("Enter product name\n");
                        this.setPname(s.next());
                        System.out.println("Enter price\n");
                        this.setPrice(s.nextFloat());
                        System.out.println("Enter Quantity in terms of units");
                        this.setQuantity(s.nextInt());
                        System.out.println("Enter purchase date\n");
                        this.setPurchase(s.next());
                        System.out.println("Enter Expiry date\n");
                        this.setPurchase(s.next());
                        f=0;
                        break;
            case 'C':
                        this.setCategory('C');
                        System.out.println("Enter product name\n");
                        this.setPname(s.next());
                        System.out.println("Enter price\n");
                        this.setPrice(s.nextFloat());
                        System.out.println("Enter Quantity in terms of units");
                        this.setQuantity(s.nextInt());
                        System.out.println("Enter purchase date\n");
                        this.setPurchase(s.next());
                        System.out.println("Enter Expiry date\n");
                        this.setPurchase(s.next());
                        f=0;
                        break;
            case 'D':
                        this.setCategory('D');
                        System.out.println("Enter product name\n");
                        this.setPname(s.next());
                        System.out.println("Enter price\n");
                        this.setPrice(s.nextFloat());
                        System.out.println("Enter Quantity in terms of units");
                        this.setQuantity(s.nextInt());
                        System.out.println("Enter purchase date in the format dd-mm-yyyy\n");
                        this.setPurchase(s.next());
                        System.out.println("Enter Expiry date in the format dd-mm-yyyy\n");
                        this.setPurchase(s.next());
                        f=0;
                        break;
            default:    f=1;
                        System.out.println("Invlaid Input");
                        break;
        }
        return f;
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    Ecom e=new Ecom();
	    int i;
	    int count;
	    int f,sno;
	    while(true)
	    {
	        System.out.println("1.add product\n2.show product details\n3.show all products");
	        System.out.println("Enter your choice");
	        i=s.nextInt();
	        switch(i)
	        {
	            case 1:count=0;
	                    f=1;
	                    while(f==1)
	                    {
	                        if(count>4)
	                        {
	                            break;
	                        }
	                        f=e.addProduct();
	                        count++;
	                    }
	                    break;
	           case 2:System.out.println("Enter the serial no of product to be displayed\n");
	                    sno=s.nextInt();
	                    System.out.println("product details are");
	                    System.out.println("product Category: "+e.Category.getCategory(sno-1));
	                    System.out.println("product name: "+e.pname.getPname(sno-1));
	                    System.out.println("product price: "+e.price.getPrice(sno-1));
	                    break;
	           case 3: System.out.println("The details of all the products are: ");
	                    for(j=0;j<e.pname.size();j++)
	                    {
	                        System.out.println("Product"+j+" details: ");
	                        System.out.println("product"+j+" Category: "+e.Category.getCategory());
	                        System.out.println("Product"+j+" name: "+e.pname.getPname(i));
	                        System.out.println("Product"+j+" price: "+e.price.getPrice(i));
	                        System.out.println("Quantity of product purchased is: "+e.Quantity.getQuantity(i));
	                        System.out.println("Date of purchase is: "+e.purchase.getPurchase(i));
	                        System.out.println("Date of expiry is: "+e.expiry.getExpiry(i));
	                    }
	        }
	    }
	}
}
