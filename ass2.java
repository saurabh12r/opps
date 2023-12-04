//java Assignment no-2


//____________________________POLYMORPHISM_________________________________



 class Publication{
    private String title;//public makes a member accessible from any class 
    protected double price;//protected permits access inside the same pakage and by subclass and
    private int copies;//private restricts access to only within the declaring class
    

    public String gettitle(){//get keyword to written the value
        return this.title;
    }
    public void settitle(String title){//set keyword to take the input
        this.title=title;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        if(price>0){
        this.price=price;


    }
    else{
        System.out.println("Invalid price");
    }
    }
    public int getCopies(){
        return this.copies;
    }
    public void setCopies(int copies){
        this.copies=copies;
    }
    //Method Overriding 
    public void sellCopy(int qty){
        System.out.println("Total publication sell:"+(qty*price));
    }
    
}//publication class end
 class Book extends Publication{
    //author of book
    private String author;
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void orderCopies(int pcopies){
        setCopies(getCopies()+pcopies);
    }
    public void sellCopy(int qty){
        System.out.println("Total Book sell:"+(qty*price));
    }
}//class Book end
 class Magazine extends Publication{
    private int orderqty;
    private String currIssue;  
    public String getcurrIssue(){
        return this.currIssue;
    }
    public void setcurrIssue(String Issue){
        this.currIssue=Issue;
    }
    public int getOrderQty(){
        return this.orderqty;
    }
    public void setOrderQty(int copies){
        this.orderqty=copies;
    }
    //Method overriding
    public void sellCopy(int qty){
        System.out.println("Total Magazine sell:"+(qty*price));
    }
    //user defined method given in problem statment
    public void recvNewIssue(String pNewIssue){
        setCopies(orderqty);
        currIssue=pNewIssue;
    }

}//ends Magazine class
class Main{
    public static void main(String[]args){
        Book obj1=new Book();//or Publication obj1=new Book();
          //Accept all detils of book to be order such as title author,price and copies,order and sell.
          obj1.settitle("Java");
          obj1.setPrice(500);//take dynamic input from user for each set method
          obj1.setCopies(20);
          obj1.setAuthor("Herbert Schildt");
          obj1.orderCopies(50);
          //display all details of look to be order such as title,author,price and copies,order and sell.
          System.out.println(obj1.gettitle());
           System.out.println(obj1.getPrice());
            System.out.println(obj1.getCopies());
             System.out.println(obj1.getAuthor());
             obj1.sellCopy(10);
            
    }
}

