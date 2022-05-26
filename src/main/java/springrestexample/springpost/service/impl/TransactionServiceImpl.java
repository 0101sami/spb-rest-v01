package springrestexample.springpost.service.impl;

import org.springframework.stereotype.Service;
import springrestexample.springpost.repository.TransactionRepository;
import springrestexample.springpost.service.TransactionService;
import java.util.List;
import java.util.Optional;

import springrestexample.springpost.entity.TransactionEntity;


@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository TransactionRepository;
    public TransactionServiceImpl(TransactionRepository TransactionRepository){
        this.TransactionRepository=TransactionRepository;

    }
    @Override
    public List<TransactionEntity> findAllTransaction() {
        return TransactionRepository.findAll();
    }

    @Override
    public Optional<TransactionEntity> findById(Long id) {
        return TransactionRepository.findById(id);
    }

    @Override
    public TransactionEntity saveTransaction(TransactionEntity TransactionEntity) {
        return TransactionRepository.saveAndFlush(TransactionEntity);
    }

    @Override
    public TransactionEntity updateTransaction(TransactionEntity TransactionEntity, Long id) {
        return TransactionRepository.saveAndFlush(TransactionEntity);
    }

    @Override
    public void deleteTransaction(Long id) {
        TransactionRepository.deleteById(id);
    }
}
