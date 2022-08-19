package com.ramkishore.processpension.service;

import com.ramkishore.processpension.model.PensionerDetail;
import com.ramkishore.processpension.model.ProcessPensionResponse;
import org.springframework.stereotype.Service;

@Service
public class ProcessPensionService {
    public ProcessPensionResponse getPensionDetails(PensionerDetail pensionerDetail) {

        ProcessPensionResponse processPensionResponse = new ProcessPensionResponse(

            // Pensioner Details
            pensionerDetail,

            // Pension Amount
            pensionerDetail.getPensionType().equalsIgnoreCase("self")?
                    80*(pensionerDetail.getSalaryEarned())/100 + pensionerDetail.getAllowances():
                    50*(pensionerDetail.getSalaryEarned())/100 + pensionerDetail.getAllowances(),

            // Bank Charge
            pensionerDetail.getBankDetail().getBankType().equalsIgnoreCase("private")?550:500
        );

        return processPensionResponse;
    }
}
