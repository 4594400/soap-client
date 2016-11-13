package com.ws.app.client;


import com.ws.app.Person;
import com.ws.app.ProcessorImpl;
import com.ws.app.ProcessorImplService;

public class Main {
    public static void main(String[] args) {
        ProcessorImplService processorImplService = new ProcessorImplService();
        ProcessorImpl processor = processorImplService.getProcessorImplPort();
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setName("Name" + i);
            person.setAge(i);
            processor.save(person);

        }
    }
}
