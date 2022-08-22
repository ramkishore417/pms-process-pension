package com.ramkishore.processpension.restClient;

import com.ramkishore.processpension.model.PensionerDetail;
import com.ramkishore.processpension.model.PensionTransactionDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="pensioner-detail", url = "${PENSIONER_DETAIL_URI : http://localhost:8002}")
public interface PensionerDetailClient {

	@GetMapping("/api/pensionerdetail/PensionerDetailByAadhaar/{aadhaarNumber}")
	public PensionerDetail findByAadhaarNumber(@RequestHeader("Authorization") String token,
											   @PathVariable String aadhaarNumber);

	@PostMapping("/api/pensionerdetail/saveTransactionDetail")
	public boolean savePensionTransactionDetail(@RequestHeader("Authorization") String token,
												@RequestBody PensionTransactionDetail transactionDetail);

}
