package com.example.lambda;

import com.amazon.ask.request.SkillRequest;

import javax.inject.Inject;
import javax.inject.Named;

@Named("test")
public class AWSLambdaHandler implements SkillRequest {
    @Override
    public byte[] getRawRequest() {
        return new byte[0];
    }


}
