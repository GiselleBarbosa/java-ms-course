package com.giselle.hrpayroll.services;

import com.giselle.hrpayroll.entities.Payment;
import com.giselle.hrpayroll.entities.Worker;
import com.giselle.hrpayroll.feingClients.WorkerFeingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeingClient workerFeingClient;

    public Payment getPayment(Long workerId, int days) {

        Worker worker = workerFeingClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
