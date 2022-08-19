package com.ramkishore.processpension.controller;

import com.ramkishore.processpension.exception.ProcessPensionException;
import com.ramkishore.processpension.model.ProcessPensionInput;
import com.ramkishore.processpension.model.ProcessPensionResponse;
import com.ramkishore.processpension.model.PensionTransactionDetail;
import com.ramkishore.processpension.restClient.PensionerDetailClient;
import com.ramkishore.processpension.service.ProcessPensionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProcessPensionController {

    private  final ProcessPensionService processPensionService;
    private final PensionerDetailClient pensionerDetailClient;

    @GetMapping("/")
    public String processPension() {
        return "process pension working";
    }

    //Generating ProcessPensionResponse of Pension Amount and Bank charge based on Aadhaar Number Input
    @PostMapping("/ProcessPension")
    public ProcessPensionResponse calculatePension(@RequestHeader(name= "Authorization") String token,
                                                   @RequestBody ProcessPensionInput processPensionInput){
        log.info("START: calculatePension");
        ProcessPensionResponse processPensionResponse=null;
        try {
            processPensionResponse = processPensionService.getPensionDetails(
                    pensionerDetailClient.findByAadhaarNumber(token, processPensionInput.getAadhaarNumber()));
        } catch (Exception e) {
            log.info("EXCEPTION: calculatePension");
            throw new ProcessPensionException("Pensioner details are not correct");
        }
        log.info("END: calculatePension");
        return processPensionResponse;
    }

    //Saving Pension Transaction details
    @PostMapping("/ProcessPensionTransaction")
    public boolean saveTransactionDetail(@RequestHeader(name = "Authorization") String token,
                                         @RequestBody PensionTransactionDetail pensionTransactionDetail) {
        log.info("START: savePensionTransactionDetail");
        boolean pensionTransactionStatus = false;
        try {
            pensionTransactionStatus = pensionerDetailClient.savePensionTransactionDetail(
                    token, pensionTransactionDetail);
        } catch (Exception e) {
            log.info("EXCEPTION: savePensionTransactionDetail");
            throw new ProcessPensionException("Pensioner details are not correct");
        }
        log.info("END: savePensionTransactionDetail");
        return pensionTransactionStatus;
    }
}
