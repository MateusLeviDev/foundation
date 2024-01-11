package com.levi.oops.concepts.service;

import com.levi.oops.concepts.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {

    ClassB addItem(Item item);

    Item addItem(List<Item> items);

    void removeItem(Item item);

    void removeItem(int itemId);

    Item searchItem(String itemName);

    Item searchItem(int itemId);

    Item searchItem(String itemName, String color);

    Item searchItem(String itemName, String color, double price);
}
