package springrestexample.springpost.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springrestexample.springpost.entity.TransactionEntity;
import springrestexample.springpost.service.TransactionService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")


public class TransactionController {
    // inject Transaction dao
    @Autowired
    private final TransactionService transactionService;
    public TransactionController(TransactionService transactionService){
        this.transactionService= transactionService;

    }
    // expose "/Transactions" and return list of Transactions


    @GetMapping("/transactions")
    public List<TransactionEntity> findAllTransaction() {

        return transactionService.findAllTransaction();
    }

    @GetMapping("/transactions/{id}")
    public Optional<TransactionEntity> findTransactionById(@PathVariable Long id) {


        return transactionService.findById(id);
    }


    @PutMapping("/transactions/{id}")
    public TransactionEntity updateTransaction(@RequestBody TransactionEntity transaction, @PathVariable String id) {

        return transactionService.saveTransaction(transaction);


    }

    @PostMapping("/transactions")
    public TransactionEntity saveTransaction(@RequestBody TransactionEntity transaction) {

        return transactionService.saveTransaction(transaction);


    }

    @DeleteMapping("/transactions/{id}")
    public void deleteTransaction(@PathVariable("id") Long id) {

        transactionService.deleteTransaction(id);



    }
}
