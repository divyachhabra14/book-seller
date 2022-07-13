package com.bookstore.service;

import com.bookstore.model.PurchaseHistory;
import com.bookstore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistory {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsofUser(Long userid);
}
