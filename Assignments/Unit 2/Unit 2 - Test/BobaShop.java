public class BobaShop {
    private String shopName;
    private BobaShopMember[] registeredMembers;

    // constructors
    public BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    public BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        this.registeredMembers = new BobaShopMember[initialCapacity];
    }

    // getters and setters
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    // methods
    public boolean isFull() {
        int amount = registeredMembers.length;
        int count = 0;
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                count += 1;
            }
        }
        return amount == count;
    }

    public void increaseCapacity() {
        BobaShopMember[] registeredMembers2 = new BobaShopMember[(registeredMembers.length) * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            registeredMembers2[i] = registeredMembers[i];
        }
        setRegisteredMembers(registeredMembers2);
    }

    public void registerMember(BobaShopMember member) {
        int original = registeredMembers.length;
        boolean registered = false;
        int count = 0;
        if (!isFull()) {
            while (!registered && count < registeredMembers.length) {
                if (registeredMembers[count] != null) {
                    registeredMembers[count] = member;
                    registered = true;
                } else {
                    count += 1;
                }
            }
        } else {
            increaseCapacity();
            registeredMembers[original] = member;
        }
    }

    public String toString() {
        String part1 = "== Boba Bliss Members ==\n";
        String part2 = "";
        for (int i = 0; i < registeredMembers.length; i++) {
            part2 += i + ".) " + registeredMembers[i].toString() + "\n";
        }
        return part1 + part2;
    }

    public boolean deleteMember(BobaShopMember member) {
        boolean deleted = false;
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                deleted = true;
            }
        }
        return deleted;
    }
}
