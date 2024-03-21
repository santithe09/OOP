package newbank;

public class StakeHolder {
    
    private String name;
    private int nuip;
    private String address;
    private String mail;
    private double money;

    public StakeHolder(String name, int nuip, String address, String mail, double money) {
        this.name = name;
        this.nuip = nuip;
        this.address = address;
        this.mail = mail;
        this.money = money;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getNuip() { return nuip; }
    public String getAddress() { return address; }
    public String getMail() { return mail; }
    public double getMoney() { return money; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setMail(String mail) { this.mail = mail; }
    public void setMoney(double money) { this.money = money; }
}