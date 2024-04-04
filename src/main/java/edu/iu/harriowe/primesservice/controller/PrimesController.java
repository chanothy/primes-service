package edu.iu.harriowe.primesservice.controller;

import edu.iu.harriowe.primesservice.rabbitmq.MQSender;
import edu.iu.harriowe.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    IPrimesService primesService;

    private final MQSender mqSender;
    public PrimesController(IPrimesService primesService, MQSender mqSender) {
        this.primesService = primesService;
        this.mqSender = mqSender;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        boolean result = primesService.isPrime(n);
        mqSender.sendMessage(n, result);
        return result;
    }
}
