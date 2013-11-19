package nl.floddyfosh.myserverplugin.customitems;

public enum MyCustomItem {
    HW_PUMPKIN("MHF_Pumpkin", "Halloween Pumpkin", "Pumpkin for Halloween 2013");

    private String skin;
    private String displayName;
    private String lore;

    private MyCustomItem(String skin, String displayName, String lore) {
        this.skin = skin;
        this.displayName = displayName;
        this.lore = lore;
    }

    public String getSkinName() {
        return this.skin;
    }

    public String getDisplayName() {
        return this.displayName;
    }
    
    public String getLore() {
        return this.lore;
    }

    public static MyCustomItem forSkinName(String skinName) {
        for (MyCustomItem t : values())
            if (t.getSkinName().equalsIgnoreCase(skinName))
                return t;
        return null;
    }
}
