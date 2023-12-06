package com.company.base.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

@RestController
public class PrimeController {
  @GetMapping(value = "/new-prime")
  public BigInteger newPrime() {
    return BigInteger.probablePrime(1000, new Random());
  }
}