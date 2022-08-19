package com.ramkishore.processpension.exception;

import com.ramkishore.processpension.model.ProcessPensionResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProcessPensionException extends RuntimeException
{
    private String message;
}
