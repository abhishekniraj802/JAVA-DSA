public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // p1.setColor="Yellow";
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Laddu Singh";
        // myAcc.setPassword("abcdefg");
    }

}

class BankAccount {
    public String username;
    // private
    public String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    // public:
    private String color;
    private int tip;

    // getter and setter method

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
    // setter method

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
    /*
     * void setColor(String newColor) {
     * color = newColor;
     * 
     * }
     * 
     * void setTip(int newTip) {
     * tip = newTip;
     * }
     */
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
