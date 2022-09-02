package com.example.lambda;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.example.lambda.handlers.LaunchRequestHandler;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class HelloWorldStreamHandler extends SkillStreamHandler {

    @ConfigProperty(name = "skill.id")
    static
    Optional<String> skillId;
    public static void main(String[] args) {

    }
    private static Skill getSkill() {
        return Skills.standard().addRequestHandlers(new LaunchRequestHandler()).withSkillId(String.valueOf(skillId)).build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}