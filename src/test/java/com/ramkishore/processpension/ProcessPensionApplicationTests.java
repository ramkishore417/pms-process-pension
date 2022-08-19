package com.ramkishore.processpension;

import com.ramkishore.processpension.controller.ProcessPensionControllerTest;
import com.ramkishore.processpension.model.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ProcessPensionControllerTest.class, BankDetailTest.class, PensionerDetailTest.class,
		ProcessPensionInputTest.class, ProcessPensionResponseTest.class, TransactionDetailTest.class})
class ProcessPensionApplicationTests {


}
