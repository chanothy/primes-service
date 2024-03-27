package edu.iu.harriowe.primesservice.service;

import org.junit.jupiter.api.Test;

import edu.iu.harriowe.primesservice.service.PrimesService;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {

    PrimesService primesService = new PrimesService();

    @Test
    void _45IsNotPrime() {
        assertFalse(primesService.isPrime(45));
    }

    @Test
    void _47IsPrime() {
        assertTrue(primesService.isPrime(47));
    }

    @Test
    void _549274982374972IsNotPrime() {
        assertFalse(primesService.isPrime(549274982374972L));
    }

    @Test
    void _285191IsPrime() {
        assertTrue(primesService.isPrime(285191));
    }

}