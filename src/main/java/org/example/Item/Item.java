package org.example.Item;

import org.example.Character.Player;

public abstract class Item {
    protected String name;
    protected String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void use(Player player);

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
