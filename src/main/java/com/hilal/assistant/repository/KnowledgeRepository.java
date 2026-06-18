package com.hilal.assistant.repository;

import java.io.InputStream;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hilal.assistant.domain.About;
import com.hilal.assistant.domain.Career;
import com.hilal.assistant.domain.Contact;
import com.hilal.assistant.domain.Profile;
import com.hilal.assistant.domain.Skills;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class KnowledgeRepository {
private final ObjectMapper objectMapper;
private Profile profile;
public KnowledgeRepository(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
}
@PostConstruct
public void load(){
      try {
    InputStream stream=new ClassPathResource("knowledge.json").getInputStream();
 // Read the JSON as a raw Map first
Map<String,Object>  raw=objectMapper.readValue(stream, Map.class);

            // Map each section into your domain objects
              About about = objectMapper.convertValue(raw.get("about"), About.class);
            Skills skills = objectMapper.convertValue(raw.get("skills"), Skills.class);
            Career career = objectMapper.convertValue(raw.get("career"), Career.class);
            Contact contact=objectMapper.convertValue(raw.get("contact"), Contact.class);
       
            profile = Profile.builder()
                    .about(about)
                    .skills(skills)
                    .career(career)
                    .contact(contact)
                    .build();
            
                    log.info("knowledge.json loaded successfully");


         } catch (Exception e) {
        log.error("Failed to load knowledge.json", e);
            throw new RuntimeException("Cannot start without knowledge.json", e);}

}


          public Profile getProfile() {
        return profile;
    }
}
