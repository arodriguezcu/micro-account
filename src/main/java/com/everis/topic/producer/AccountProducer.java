package com.everis.topic.producer;

import com.everis.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Clase Productor del Account.
 */
@Component
public class AccountProducer {

  @Autowired
  private KafkaTemplate<String, Object> kafkaTemplate;

  private String createdAccountTopic = "created-account-topic";

  /** Envia datos del account al topico. */
  public void sendCreatedAccount(Account account) {

    kafkaTemplate.send(createdAccountTopic, account);

  }

}
