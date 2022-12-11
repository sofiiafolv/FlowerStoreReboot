package ucu.edu.ua.demo.flower;

import ucu.edu.ua.demo.item.Item;

public class ItemDiscount extends Item {
    private Item item;
    public ItemDiscount(Item item){
        this.item = item;
    }
    @Override
    public double price() {
        return item.price()*0.2;
    }
}
