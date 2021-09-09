package org.art.Repository;

import org.art.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {

	Payment findByOrderId(int orderId);

}
