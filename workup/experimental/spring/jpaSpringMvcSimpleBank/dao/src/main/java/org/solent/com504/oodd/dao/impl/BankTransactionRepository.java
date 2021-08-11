/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.dao.impl;

import org.solent.com504.oodd.bank.model.dto.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.solent.com504.oodd.bank.model.dao.BankTransactionDAO;

/**
 *
 * @author cgallen
 */
@Repository
public interface BankTransactionRepository extends BankTransactionDAO,  JpaRepository<BankTransaction,Long>{
    
}