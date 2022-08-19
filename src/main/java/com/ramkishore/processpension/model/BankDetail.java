package com.ramkishore.processpension.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankDetail {

    private String bankName;		// Bank-Name of Pensioner
    private String accountNumber;	// Account Number of Pensioner
    private String bankType;		// Bank Type of pensioner Example: Private or Public
}
