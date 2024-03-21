package newbank;

public class NewBank {
    
    private String name;
    private String address;
    private int nit;
    private StakeHolder[] Stakeholders;

    public NewBank(String name, String address, int nit, int numHolders) {
        this.name = name;
        this.address = address;
        this.nit = nit;
        this.Stakeholders = new StakeHolder[numHolders];
    }

    // Getters and setters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getNit() { return nit; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }

    public void addStakeHolder(int index, String name, int nuip, String address, String mail, double money) {
        if (index >= 0 && index < Stakeholders.length) {
            Stakeholders[index] = new StakeHolder(name, nuip, address, mail, money);
        }
    }

    public double calculateFunds() {
        double funds = 0;
        for (StakeHolder stakeholder : Stakeholders) {
            if (stakeholder != null) {
                funds += stakeholder.getMoney();
            }
        }
        return funds;
    }

    public void removeStakeHolder(int index) {
        if (index >= 0 && index < Stakeholders.length) {
            Stakeholders[index] = null;
        }
    }
}