package springrestexample.springpost.service;
import springrestexample.springpost.entity.TransactionEntity;

import java.util.List;
import java.util.Optional;

public interface TransactionService {

    List<TransactionEntity> findAllTransaction();
    Optional<TransactionEntity> findById(Long id) ;


    TransactionEntity saveTransaction(TransactionEntity TransactionEntity);
    TransactionEntity updateTransaction(TransactionEntity TransactionEntity, Long id) ;
    void deleteTransaction(Long id);
}
