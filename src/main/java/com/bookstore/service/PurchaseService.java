package com.bookstore.service;

import com.bookstore.model.PurchaseHistory;
import com.bookstore.repository.IPurchaseHistoryRepository;
import com.bookstore.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseService implements IPurchaseHistory {
    @Autowired
    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseService(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsofUser(Long userid) {
        return purchaseHistoryRepository.findAllPurchasesOfUser(userid);
    }
}
