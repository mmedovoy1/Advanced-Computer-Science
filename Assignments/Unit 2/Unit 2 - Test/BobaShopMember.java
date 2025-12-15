public class BobaShopMember {
    private String name;
    private boolean[] loyaltyCredits;

    // constructors
    public BobaShopMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] newCredits) {
        this.loyaltyCredits = newCredits;
    }

    // methods
    public void grantLoyaltyCredit() {
        boolean first = false;
        int spot = 0;
        while (first != true && spot < loyaltyCredits.length) {
            if (loyaltyCredits[spot] == false) {
                loyaltyCredits[spot] = true;
                first = true;
            } else {
                spot += 1;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count += 1;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int numCredits = countLoyaltyCredits();
        if (numCredits >= 6) {
            return "Gold Member";
        } else if (numCredits >= 3 && numCredits <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String part1 = "Loyalty History: [";
        String part2 = "";
        String part3 = "]";
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                part2 += "X";
            } else if (loyaltyCredits[i] == false) {
                part2 += "-";
            }
            if (i != loyaltyCredits.length - 1) {
                part2 += ", ";
            }
        }
        return part1 + part2 + part3;
    }

    public String toString() {
        return name + " (" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        boolean sameName = false;
        boolean sameCredits = false;
        int countSame = 0;
        if (this.name.equals(other.getName())) {
            sameName = true;
        }
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (this.loyaltyCredits[i] == other.loyaltyCredits[i]) {
                countSame += 1;
            }
        }
        if (countSame == 10) {
            sameCredits = true;
        }
        if (sameName && sameCredits) {
            return true;
        } else {
            return false;
        }

    }



}
