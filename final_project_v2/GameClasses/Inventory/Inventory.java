package GameClasses.Inventory;

public final class Inventory {
    private String[] itemNames;
    private int[] itemCounts;
    private int size;

    public Inventory() {
        itemNames = new String[10];
        itemCounts = new int[10];
        size = 0;
    }

    // Adds a new item to the inventory
    public void addItem(String itemName, int itemCount) {
        for (int i = 0; i < size; i++) {
            if (itemNames[i].equals(itemName)) {
                itemCounts[i] += itemCount;
                return;
            }
        }
        itemNames[size] = itemName;
        itemCounts[size] = itemCount;
        size++;
    }

    // Removes an item from the inventory
    public void removeItem(String itemName, int itemCount) {
        for (int i = 0; i < size; i++) {
            if (itemNames[i].equals(itemName)) {
                if (itemCounts[i] - itemCount < 0) {
                    System.out.println("Error: Not enough " + itemName + " to remove.");
                } else {
                    itemCounts[i] -= itemCount;
                }
                return;
            }
        }
        System.out.println("Error: " + itemName + " not found in inventory.");
    }

    // Prints the current items and their count in the inventory
    public void printInventory() {
        for (int i = 0; i < size; i++) {
            System.out.println(itemNames[i] + ": " + itemCounts[i]);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem("Sword", 1);
        inventory.addItem("Shield", 2);
        inventory.addItem("Potion", 5);
        inventory.printInventory();
        inventory.removeItem("Potion", 2);
        inventory.printInventory();
    }
}

