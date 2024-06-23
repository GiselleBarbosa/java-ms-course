package com.giselle.hrpayroll.services;

import com.giselle.hrpayroll.entities.Payment;
import com.giselle.hrpayroll.entities.Worker;
import com.giselle.hrpayroll.feingClients.WorkerFeingClient;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final WorkerFeingClient workerFeingClient;

    public PaymentService(WorkerFeingClient workerFeingClient) {
        this.workerFeingClient = workerFeingClient;
    }

    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeingClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
